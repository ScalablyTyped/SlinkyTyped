package typingsSlinky.awsSdk.securityhubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Network extends js.Object {
  /**
    * The destination domain of network-related information about a finding.
    */
  var DestinationDomain: js.UndefOr[NonEmptyString] = js.native
  /**
    * The destination IPv4 address of network-related information about a finding.
    */
  var DestinationIpV4: js.UndefOr[NonEmptyString] = js.native
  /**
    * The destination IPv6 address of network-related information about a finding.
    */
  var DestinationIpV6: js.UndefOr[NonEmptyString] = js.native
  /**
    * The destination port of network-related information about a finding.
    */
  var DestinationPort: js.UndefOr[Integer] = js.native
  /**
    * The direction of network traffic associated with a finding.
    */
  var Direction: js.UndefOr[NetworkDirection] = js.native
  /**
    * The protocol of network-related information about a finding.
    */
  var Protocol: js.UndefOr[NonEmptyString] = js.native
  /**
    * The source domain of network-related information about a finding.
    */
  var SourceDomain: js.UndefOr[NonEmptyString] = js.native
  /**
    * The source IPv4 address of network-related information about a finding.
    */
  var SourceIpV4: js.UndefOr[NonEmptyString] = js.native
  /**
    * The source IPv6 address of network-related information about a finding.
    */
  var SourceIpV6: js.UndefOr[NonEmptyString] = js.native
  /**
    * The source media access control (MAC) address of network-related information about a finding.
    */
  var SourceMac: js.UndefOr[NonEmptyString] = js.native
  /**
    * The source port of network-related information about a finding.
    */
  var SourcePort: js.UndefOr[Integer] = js.native
}

object Network {
  @scala.inline
  def apply(): Network = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Network]
  }
  @scala.inline
  implicit class NetworkOps[Self <: Network] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDestinationDomain(value: NonEmptyString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DestinationDomain")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDestinationDomain: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DestinationDomain")(js.undefined)
        ret
    }
    @scala.inline
    def withDestinationIpV4(value: NonEmptyString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DestinationIpV4")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDestinationIpV4: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DestinationIpV4")(js.undefined)
        ret
    }
    @scala.inline
    def withDestinationIpV6(value: NonEmptyString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DestinationIpV6")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDestinationIpV6: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DestinationIpV6")(js.undefined)
        ret
    }
    @scala.inline
    def withDestinationPort(value: Integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DestinationPort")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDestinationPort: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DestinationPort")(js.undefined)
        ret
    }
    @scala.inline
    def withDirection(value: NetworkDirection): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Direction")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDirection: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Direction")(js.undefined)
        ret
    }
    @scala.inline
    def withProtocol(value: NonEmptyString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Protocol")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProtocol: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Protocol")(js.undefined)
        ret
    }
    @scala.inline
    def withSourceDomain(value: NonEmptyString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SourceDomain")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSourceDomain: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SourceDomain")(js.undefined)
        ret
    }
    @scala.inline
    def withSourceIpV4(value: NonEmptyString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SourceIpV4")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSourceIpV4: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SourceIpV4")(js.undefined)
        ret
    }
    @scala.inline
    def withSourceIpV6(value: NonEmptyString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SourceIpV6")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSourceIpV6: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SourceIpV6")(js.undefined)
        ret
    }
    @scala.inline
    def withSourceMac(value: NonEmptyString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SourceMac")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSourceMac: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SourceMac")(js.undefined)
        ret
    }
    @scala.inline
    def withSourcePort(value: Integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SourcePort")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSourcePort: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SourcePort")(js.undefined)
        ret
    }
  }
  
}

