package typingsSlinky.facebookJsSdk.facebook

import typingsSlinky.facebookJsSdk.facebookJsSdkStrings.canvas_editor
import typingsSlinky.facebookJsSdk.facebookJsSdkStrings.popup
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InstantExperiencesAdsDialogParams extends DialogParams {
  var business_id: String = js.native
  var canvas_id: js.UndefOr[String] = js.native
  @JSName("display")
  var display_InstantExperiencesAdsDialogParams: popup = js.native
  var method: canvas_editor = js.native
  var page_id: String = js.native
}

object InstantExperiencesAdsDialogParams {
  @scala.inline
  def apply(business_id: String, display: popup, method: canvas_editor, page_id: String): InstantExperiencesAdsDialogParams = {
    val __obj = js.Dynamic.literal(business_id = business_id.asInstanceOf[js.Any], display = display.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], page_id = page_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[InstantExperiencesAdsDialogParams]
  }
  @scala.inline
  implicit class InstantExperiencesAdsDialogParamsOps[Self <: InstantExperiencesAdsDialogParams] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBusiness_id(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("business_id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDisplay(value: popup): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("display")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMethod(value: canvas_editor): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("method")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPage_id(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("page_id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCanvas_id(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("canvas_id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCanvas_id: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("canvas_id")(js.undefined)
        ret
    }
  }
  
}

