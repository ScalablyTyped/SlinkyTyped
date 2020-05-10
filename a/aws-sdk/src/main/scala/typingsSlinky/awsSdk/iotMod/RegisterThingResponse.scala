package typingsSlinky.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RegisterThingResponse extends js.Object {
  /**
    * .
    */
  var certificatePem: js.UndefOr[CertificatePem] = js.native
  /**
    * ARNs for the generated resources.
    */
  var resourceArns: js.UndefOr[ResourceArns] = js.native
}

object RegisterThingResponse {
  @scala.inline
  def apply(): RegisterThingResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RegisterThingResponse]
  }
  @scala.inline
  implicit class RegisterThingResponseOps[Self <: RegisterThingResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCertificatePem(value: CertificatePem): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("certificatePem")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCertificatePem: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("certificatePem")(js.undefined)
        ret
    }
    @scala.inline
    def withResourceArns(value: ResourceArns): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resourceArns")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResourceArns: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resourceArns")(js.undefined)
        ret
    }
  }
  
}

