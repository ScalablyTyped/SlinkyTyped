package typingsSlinky.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RegisterThingRequest extends js.Object {
  /**
    * The parameters for provisioning a thing. See Programmatic Provisioning for more information.
    */
  var parameters: js.UndefOr[Parameters] = js.native
  /**
    * The provisioning template. See Provisioning Devices That Have Device Certificates for more information.
    */
  var templateBody: TemplateBody = js.native
}

object RegisterThingRequest {
  @scala.inline
  def apply(templateBody: TemplateBody): RegisterThingRequest = {
    val __obj = js.Dynamic.literal(templateBody = templateBody.asInstanceOf[js.Any])
    __obj.asInstanceOf[RegisterThingRequest]
  }
  @scala.inline
  implicit class RegisterThingRequestOps[Self <: RegisterThingRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTemplateBody(value: TemplateBody): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("templateBody")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withParameters(value: Parameters): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parameters")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutParameters: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parameters")(js.undefined)
        ret
    }
  }
  
}

