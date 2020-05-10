package typingsSlinky.awsSdk.elasticbeanstalkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CheckDNSAvailabilityMessage extends js.Object {
  /**
    * The prefix used when this CNAME is reserved.
    */
  var CNAMEPrefix: DNSCnamePrefix = js.native
}

object CheckDNSAvailabilityMessage {
  @scala.inline
  def apply(CNAMEPrefix: DNSCnamePrefix): CheckDNSAvailabilityMessage = {
    val __obj = js.Dynamic.literal(CNAMEPrefix = CNAMEPrefix.asInstanceOf[js.Any])
    __obj.asInstanceOf[CheckDNSAvailabilityMessage]
  }
  @scala.inline
  implicit class CheckDNSAvailabilityMessageOps[Self <: CheckDNSAvailabilityMessage] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCNAMEPrefix(value: DNSCnamePrefix): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CNAMEPrefix")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

