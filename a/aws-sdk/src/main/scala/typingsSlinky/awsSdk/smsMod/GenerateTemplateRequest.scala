package typingsSlinky.awsSdk.smsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GenerateTemplateRequest extends js.Object {
  /**
    * ID of the application associated with the Amazon CloudFormation template.
    */
  var appId: js.UndefOr[AppId] = js.native
  /**
    * Format for generating the Amazon CloudFormation template.
    */
  var templateFormat: js.UndefOr[OutputFormat] = js.native
}

object GenerateTemplateRequest {
  @scala.inline
  def apply(): GenerateTemplateRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GenerateTemplateRequest]
  }
  @scala.inline
  implicit class GenerateTemplateRequestOps[Self <: GenerateTemplateRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAppId(value: AppId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAppId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appId")(js.undefined)
        ret
    }
    @scala.inline
    def withTemplateFormat(value: OutputFormat): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("templateFormat")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTemplateFormat: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("templateFormat")(js.undefined)
        ret
    }
  }
  
}

