package typingsSlinky.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetRegistrationCodeResponse extends js.Object {
  /**
    * The CA certificate registration code.
    */
  var registrationCode: js.UndefOr[RegistrationCode] = js.native
}

object GetRegistrationCodeResponse {
  @scala.inline
  def apply(): GetRegistrationCodeResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetRegistrationCodeResponse]
  }
  @scala.inline
  implicit class GetRegistrationCodeResponseOps[Self <: GetRegistrationCodeResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRegistrationCode(value: RegistrationCode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("registrationCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRegistrationCode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("registrationCode")(js.undefined)
        ret
    }
  }
  
}

