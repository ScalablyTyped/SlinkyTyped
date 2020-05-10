package typingsSlinky.pulumiAws.hsmMod

import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HsmState extends js.Object {
  /**
    * The IDs of AZ in which HSM module will be located. Do not use together with subnet_id.
    */
  val availabilityZone: js.UndefOr[Input[String]] = js.native
  /**
    * The ID of Cloud HSM v2 cluster to which HSM will be added.
    */
  val clusterId: js.UndefOr[Input[String]] = js.native
  /**
    * The id of the ENI interface allocated for HSM module.
    */
  val hsmEniId: js.UndefOr[Input[String]] = js.native
  /**
    * The id of the HSM module.
    */
  val hsmId: js.UndefOr[Input[String]] = js.native
  /**
    * The state of the HSM module.
    */
  val hsmState: js.UndefOr[Input[String]] = js.native
  /**
    * The IP address of HSM module. Must be within the CIDR of selected subnet.
    */
  val ipAddress: js.UndefOr[Input[String]] = js.native
  /**
    * The ID of subnet in which HSM module will be located.
    */
  val subnetId: js.UndefOr[Input[String]] = js.native
}

object HsmState {
  @scala.inline
  def apply(): HsmState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HsmState]
  }
  @scala.inline
  implicit class HsmStateOps[Self <: HsmState] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAvailabilityZone(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("availabilityZone")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAvailabilityZone: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("availabilityZone")(js.undefined)
        ret
    }
    @scala.inline
    def withClusterId(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clusterId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClusterId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clusterId")(js.undefined)
        ret
    }
    @scala.inline
    def withHsmEniId(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hsmEniId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHsmEniId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hsmEniId")(js.undefined)
        ret
    }
    @scala.inline
    def withHsmId(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hsmId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHsmId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hsmId")(js.undefined)
        ret
    }
    @scala.inline
    def withHsmState(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hsmState")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHsmState: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hsmState")(js.undefined)
        ret
    }
    @scala.inline
    def withIpAddress(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ipAddress")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIpAddress: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ipAddress")(js.undefined)
        ret
    }
    @scala.inline
    def withSubnetId(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subnetId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSubnetId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subnetId")(js.undefined)
        ret
    }
  }
  
}

