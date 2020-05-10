package typingsSlinky.gapiClientSlides.gapi.client.slides

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReplaceAllTextRequest extends js.Object {
  /** Finds text in a shape matching this substring. */
  var containsText: js.UndefOr[SubstringMatchCriteria] = js.native
  /**
    * If non-empty, limits the matches to page elements only on the given pages.
    *
    * Returns a 400 bad request error if given the page object ID of a
    * notes master,
    * or if a page with that object ID doesn't exist in the presentation.
    */
  var pageObjectIds: js.UndefOr[js.Array[String]] = js.native
  /** The text that will replace the matched text. */
  var replaceText: js.UndefOr[String] = js.native
}

object ReplaceAllTextRequest {
  @scala.inline
  def apply(): ReplaceAllTextRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReplaceAllTextRequest]
  }
  @scala.inline
  implicit class ReplaceAllTextRequestOps[Self <: ReplaceAllTextRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withContainsText(value: SubstringMatchCriteria): Self = {
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

