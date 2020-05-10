package typingsSlinky.awsSdk.iamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateServiceSpecificCredentialResponse extends js.Object {
  /**
    * A structure that contains information about the newly created service-specific credential.  This is the only time that the password for this credential set is available. It cannot be recovered later. Instead, you must reset the password with ResetServiceSpecificCredential. 
    */
  var ServiceSpecificCredential: js.UndefOr[typingsSlinky.awsSdk.iamMod.ServiceSpecificCredential] = js.native
}

object CreateServiceSpecificCredentialResponse {
  @scala.inline
  def apply(): CreateServiceSpecificCredentialResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateServiceSpecificCredentialResponse]
  }
  @scala.inline
  implicit class CreateServiceSpecificCredentialResponseOps[Self <: CreateServiceSpecificCredentialResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withServiceSpecificCredential(value: ServiceSpecificCredential): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ServiceSpecificCredential")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutServiceSpecificCredential: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ServiceSpecificCredential")(js.undefined)
        ret
    }
  }
  
}

