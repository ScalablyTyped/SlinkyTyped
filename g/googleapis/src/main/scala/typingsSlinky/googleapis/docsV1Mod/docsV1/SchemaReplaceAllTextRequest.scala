package typingsSlinky.googleapis.docsV1Mod.docsV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Replaces all instances of text matching a criteria with replace text.
  */
@js.native
trait SchemaReplaceAllTextRequest extends js.Object {
  /**
    * Finds text in the document matching this substring.
    */
  var containsText: js.UndefOr[SchemaSubstringMatchCriteria] = js.native
  /**
    * The text that will replace the matched text.
    */
  var replaceText: js.UndefOr[String] = js.native
}

object SchemaReplaceAllTextRequest {
  @scala.inline
  def apply(): SchemaReplaceAllTextRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaReplaceAllTextRequest]
  }
  @scala.inline
  implicit class SchemaReplaceAllTextRequestOps[Self <: SchemaReplaceAllTextRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withContainsText(value: SchemaSubstringMatchCriteria): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("containsText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContainsText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("containsText")(js.undefined)
        ret
    }
    @scala.inline
    def withReplaceText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("replaceText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReplaceText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("replaceText")(js.undefined)
        ret
    }
  }
  
}

