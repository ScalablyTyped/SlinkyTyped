package typingsSlinky.googleapis.dlpV2Mod.dlpV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Message defining a custom regular expression.
  */
@js.native
trait SchemaGooglePrivacyDlpV2Regex extends js.Object {
  /**
    * The index of the submatch to extract as findings. When not specified, the
    * entire match is returned. No more than 3 may be included.
    */
  var groupIndexes: js.UndefOr[js.Array[Double]] = js.native
  /**
    * Pattern defining the regular expression. Its syntax
    * (https://github.com/google/re2/wiki/Syntax) can be found under the
    * google/re2 repository on GitHub.
    */
  var pattern: js.UndefOr[String] = js.native
}

object SchemaGooglePrivacyDlpV2Regex {
  @scala.inline
  def apply(): SchemaGooglePrivacyDlpV2Regex = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGooglePrivacyDlpV2Regex]
  }
  @scala.inline
  implicit class SchemaGooglePrivacyDlpV2RegexOps[Self <: SchemaGooglePrivacyDlpV2Regex] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGroupIndexes(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groupIndexes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGroupIndexes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groupIndexes")(js.undefined)
        ret
    }
    @scala.inline
    def withPattern(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pattern")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPattern: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pattern")(js.undefined)
        ret
    }
  }
  
}

