package typingsSlinky.googleapis.dlpV2Mod.dlpV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Message defining a list of words or phrases to search for in the data.
  */
@js.native
trait SchemaGooglePrivacyDlpV2WordList extends js.Object {
  /**
    * Words or phrases defining the dictionary. The dictionary must contain at
    * least one phrase and every phrase must contain at least 2 characters that
    * are letters or digits. [required]
    */
  var words: js.UndefOr[js.Array[String]] = js.native
}

object SchemaGooglePrivacyDlpV2WordList {
  @scala.inline
  def apply(): SchemaGooglePrivacyDlpV2WordList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGooglePrivacyDlpV2WordList]
  }
  @scala.inline
  implicit class SchemaGooglePrivacyDlpV2WordListOps[Self <: SchemaGooglePrivacyDlpV2WordList] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withWords(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("words")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWords: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("words")(js.undefined)
        ret
    }
  }
  
}

