package typingsSlinky.awsSdk.cloudhsmv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Hsm extends js.Object {
  /**
    * The Availability Zone that contains the HSM.
    */
  var AvailabilityZone: js.UndefOr[ExternalAz] = js.native
  /**
    * The identifier (ID) of the cluster that contains the HSM.
    */
  var ClusterId: js.UndefOr[typingsSlinky.awsSdk.cloudhsmv2Mod.ClusterId] = js.native
  /**
    * The identifier (ID) of the HSM's elastic network interface (ENI).
    */
  var EniId: js.UndefOr[typingsSlinky.awsSdk.cloudhsmv2Mod.EniId] = js.native
  /**
    * The IP address of the HSM's elastic network interface (ENI).
    */
  var EniIp: js.UndefOr[IpAddress] = js.native
  /**
    * The HSM's identifier (ID).
    */
  var HsmId: typingsSlinky.awsSdk.cloudhsmv2Mod.HsmId = js.native
  /**
    * The HSM's state.
    */
  var State: js.UndefOr[HsmState] = js.native
  /**
    * A description of the HSM's state.
    */
  var StateMessage: js.UndefOr[String] = js.native
  /**
    * The subnet that contains the HSM's elastic network interface (ENI).
    */
  var SubnetId: js.UndefOr[typingsSlinky.awsSdk.cloudhsmv2Mod.SubnetId] = js.native
}

object Hsm {
  @scala.inline
  def apply(HsmId: HsmId): Hsm = {
    val __obj = js.Dynamic.literal(HsmId = HsmId.asInstanceOf[js.Any])
    __obj.asInstanceOf[Hsm]
  }
  @scala.inline
  implicit class HsmOps[Self <: Hsm] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHsmId(value: HsmId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HsmId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAvailabilityZone(value: ExternalAz): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AvailabilityZone")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAvailabilityZone: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AvailabilityZone")(js.undefined)
        ret
    }
    @scala.inline
    def withClusterId(value: ClusterId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ClusterId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClusterId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ClusterId")(js.undefined)
        ret
    }
    @scala.inline
    def withEniId(value: EniId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EniId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEniId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EniId")(js.undefined)
        ret
    }
    @scala.inline
    def withEniIp(value: IpAddress): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EniIp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEniIp: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EniIp")(js.undefined)
        ret
    }
    @scala.inline
    def withState(value: HsmState): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("State")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutState: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("State")(js.undefined)
        ret
    }
    @scala.inline
    def withStateMessage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StateMessage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStateMessage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StateMessage")(js.undefined)
        ret
    }
    @scala.inline
    def withSubnetId(value: SubnetId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SubnetId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSubnetId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SubnetId")(js.undefined)
        ret
    }
  }
  
}

