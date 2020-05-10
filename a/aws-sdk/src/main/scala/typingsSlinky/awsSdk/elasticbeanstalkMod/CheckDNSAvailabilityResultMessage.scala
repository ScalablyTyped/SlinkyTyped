package typingsSlinky.awsSdk.elasticbeanstalkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CheckDNSAvailabilityResultMessage extends js.Object {
  /**
    * Indicates if the specified CNAME is available:    true : The CNAME is available.    false : The CNAME is not available.  
    */
  var Available: js.UndefOr[CnameAvailability] = js.native
  /**
    * The fully qualified CNAME to reserve when CreateEnvironment is called with the provided prefix.
    */
  var FullyQualifiedCNAME: js.UndefOr[DNSCname] = js.native
}

object CheckDNSAvailabilityResultMessage {
  @scala.inline
  def apply(): CheckDNSAvailabilityResultMessage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CheckDNSAvailabilityResultMessage]
  }
  @scala.inline
  implicit class CheckDNSAvailabilityResultMessageOps[Self <: CheckDNSAvailabilityResultMessage] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAvailable(value: CnameAvailability): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Available")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAvailable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Available")(js.undefined)
        ret
    }
    @scala.inline
    def withFullyQualifiedCNAME(value: DNSCname): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FullyQualifiedCNAME")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFullyQualifiedCNAME: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FullyQualifiedCNAME")(js.undefined)
        ret
    }
  }
  
}

