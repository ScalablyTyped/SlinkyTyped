package typingsSlinky.awsSdk.sesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VerifyDomainIdentityRequest extends js.Object {
  /**
    * The domain to be verified.
    */
  var Domain: typingsSlinky.awsSdk.sesMod.Domain = js.native
}

object VerifyDomainIdentityRequest {
  @scala.inline
  def apply(Domain: Domain): VerifyDomainIdentityRequest = {
    val __obj = js.Dynamic.literal(Domain = Domain.asInstanceOf[js.Any])
    __obj.asInstanceOf[VerifyDomainIdentityRequest]
  }
  @scala.inline
  implicit class VerifyDomainIdentityRequestOps[Self <: VerifyDomainIdentityRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDomain(value: Domain): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Domain")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

