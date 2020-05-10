package typingsSlinky.awsSdk.route53Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateHostedZoneResponse extends js.Object {
  /**
    * A complex type that contains information about the CreateHostedZone request.
    */
  var ChangeInfo: typingsSlinky.awsSdk.route53Mod.ChangeInfo = js.native
  /**
    * A complex type that describes the name servers for this hosted zone.
    */
  var DelegationSet: typingsSlinky.awsSdk.route53Mod.DelegationSet = js.native
  /**
    * A complex type that contains general information about the hosted zone.
    */
  var HostedZone: typingsSlinky.awsSdk.route53Mod.HostedZone = js.native
  /**
    * The unique URL representing the new hosted zone.
    */
  var Location: ResourceURI = js.native
  /**
    * A complex type that contains information about an Amazon VPC that you associated with this hosted zone.
    */
  var VPC: js.UndefOr[typingsSlinky.awsSdk.route53Mod.VPC] = js.native
}

object CreateHostedZoneResponse {
  @scala.inline
  def apply(
    ChangeInfo: ChangeInfo,
    DelegationSet: DelegationSet,
    HostedZone: HostedZone,
    Location: ResourceURI
  ): CreateHostedZoneResponse = {
    val __obj = js.Dynamic.literal(ChangeInfo = ChangeInfo.asInstanceOf[js.Any], DelegationSet = DelegationSet.asInstanceOf[js.Any], HostedZone = HostedZone.asInstanceOf[js.Any], Location = Location.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateHostedZoneResponse]
  }
  @scala.inline
  implicit class CreateHostedZoneResponseOps[Self <: CreateHostedZoneResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withChangeInfo(value: ChangeInfo): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ChangeInfo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDelegationSet(value: DelegationSet): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DelegationSet")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHostedZone(value: HostedZone): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HostedZone")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLocation(value: ResourceURI): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Location")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVPC(value: VPC): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("VPC")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVPC: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("VPC")(js.undefined)
        ret
    }
  }
  
}

