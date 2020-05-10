package typingsSlinky.awsSdk.route53domainsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RetrieveDomainAuthCodeResponse extends js.Object {
  /**
    * The authorization code for the domain.
    */
  var AuthCode: DomainAuthCode = js.native
}

object RetrieveDomainAuthCodeResponse {
  @scala.inline
  def apply(AuthCode: DomainAuthCode): RetrieveDomainAuthCodeResponse = {
    val __obj = js.Dynamic.literal(AuthCode = AuthCode.asInstanceOf[js.Any])
    __obj.asInstanceOf[RetrieveDomainAuthCodeResponse]
  }
  @scala.inline
  implicit class RetrieveDomainAuthCodeResponseOps[Self <: RetrieveDomainAuthCodeResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAuthCode(value: DomainAuthCode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AuthCode")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

