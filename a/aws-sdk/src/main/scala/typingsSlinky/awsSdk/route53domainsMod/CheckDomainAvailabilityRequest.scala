package typingsSlinky.awsSdk.route53domainsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CheckDomainAvailabilityRequest extends js.Object {
  /**
    * The name of the domain that you want to get availability for. Constraints: The domain name can contain only the letters a through z, the numbers 0 through 9, and hyphen (-). Internationalized Domain Names are not supported.
    */
  var DomainName: typingsSlinky.awsSdk.route53domainsMod.DomainName = js.native
  /**
    * Reserved for future use.
    */
  var IdnLangCode: js.UndefOr[LangCode] = js.native
}

object CheckDomainAvailabilityRequest {
  @scala.inline
  def apply(DomainName: DomainName): CheckDomainAvailabilityRequest = {
    val __obj = js.Dynamic.literal(DomainName = DomainName.asInstanceOf[js.Any])
    __obj.asInstanceOf[CheckDomainAvailabilityRequest]
  }
  @scala.inline
  implicit class CheckDomainAvailabilityRequestOps[Self <: CheckDomainAvailabilityRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDomainName(value: DomainName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DomainName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIdnLangCode(value: LangCode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IdnLangCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIdnLangCode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IdnLangCode")(js.undefined)
        ret
    }
  }
  
}

