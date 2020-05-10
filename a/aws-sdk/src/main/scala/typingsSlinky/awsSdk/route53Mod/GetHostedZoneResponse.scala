package typingsSlinky.awsSdk.route53Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetHostedZoneResponse extends js.Object {
  /**
    * A complex type that lists the Amazon Route 53 name servers for the specified hosted zone.
    */
  var DelegationSet: js.UndefOr[typingsSlinky.awsSdk.route53Mod.DelegationSet] = js.native
  /**
    * A complex type that contains general information about the specified hosted zone.
    */
  var HostedZone: typingsSlinky.awsSdk.route53Mod.HostedZone = js.native
  /**
    * A complex type that contains information about the VPCs that are associated with the specified hosted zone.
    */
  var VPCs: js.UndefOr[typingsSlinky.awsSdk.route53Mod.VPCs] = js.native
}

object GetHostedZoneResponse {
  @scala.inline
  def apply(HostedZone: HostedZone): GetHostedZoneResponse = {
    val __obj = js.Dynamic.literal(HostedZone = HostedZone.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetHostedZoneResponse]
  }
  @scala.inline
  implicit class GetHostedZoneResponseOps[Self <: GetHostedZoneResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHostedZone(value: HostedZone): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HostedZone")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDelegationSet(value: DelegationSet): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DelegationSet")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDelegationSet: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DelegationSet")(js.undefined)
        ret
    }
    @scala.inline
    def withVPCs(value: VPCs): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("VPCs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVPCs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("VPCs")(js.undefined)
        ret
    }
  }
  
}

