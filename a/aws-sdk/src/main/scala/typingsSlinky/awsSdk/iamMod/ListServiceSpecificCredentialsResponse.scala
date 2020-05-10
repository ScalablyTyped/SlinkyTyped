package typingsSlinky.awsSdk.iamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListServiceSpecificCredentialsResponse extends js.Object {
  /**
    * A list of structures that each contain details about a service-specific credential.
    */
  var ServiceSpecificCredentials: js.UndefOr[ServiceSpecificCredentialsListType] = js.native
}

object ListServiceSpecificCredentialsResponse {
  @scala.inline
  def apply(): ListServiceSpecificCredentialsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListServiceSpecificCredentialsResponse]
  }
  @scala.inline
  implicit class ListServiceSpecificCredentialsResponseOps[Self <: ListServiceSpecificCredentialsResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withServiceSpecificCredentials(value: ServiceSpecificCredentialsListType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ServiceSpecificCredentials")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutServiceSpecificCredentials: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ServiceSpecificCredentials")(js.undefined)
        ret
    }
  }
  
}

