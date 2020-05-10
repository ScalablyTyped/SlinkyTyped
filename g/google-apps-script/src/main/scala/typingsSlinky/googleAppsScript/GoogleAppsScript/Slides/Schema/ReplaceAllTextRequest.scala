package typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReplaceAllTextRequest extends js.Object {
  var containsText: js.UndefOr[SubstringMatchCriteria] = js.native
  var pageObjectIds: js.UndefOr[js.Array[String]] = js.native
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

