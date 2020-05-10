package typingsSlinky.googleapis.slidesV1Mod.slidesV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Replaces all instances of text matching a criteria with replace text.
  */
@js.native
trait SchemaReplaceAllTextRequest extends js.Object {
  /**
    * Finds text in a shape matching this substring.
    */
  var containsText: js.UndefOr[SchemaSubstringMatchCriteria] = js.native
  /**
    * If non-empty, limits the matches to page elements only on the given
    * pages.  Returns a 400 bad request error if given the page object ID of a
    * notes master, or if a page with that object ID doesn&#39;t exist in the
    * presentation.
    */
  var pageObjectIds: js.UndefOr[js.Array[String]] = js.native
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
    def withPageObjectIds(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pageObjectIds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPageObjectIds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pageObjectIds")(js.undefined)
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

