package typingsSlinky.awsSdk.sesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteIdentityRequest extends js.Object {
  /**
    * The identity to be removed from the list of identities for the AWS Account.
    */
  var Identity: typingsSlinky.awsSdk.sesMod.Identity = js.native
}

object DeleteIdentityRequest {
  @scala.inline
  def apply(Identity: Identity): DeleteIdentityRequest = {
    val __obj = js.Dynamic.literal(Identity = Identity.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteIdentityRequest]
  }
  @scala.inline
  implicit class DeleteIdentityRequestOps[Self <: DeleteIdentityRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIdentity(value: Identity): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Identity")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

