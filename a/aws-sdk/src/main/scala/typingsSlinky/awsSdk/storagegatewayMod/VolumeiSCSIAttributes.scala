package typingsSlinky.awsSdk.storagegatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VolumeiSCSIAttributes extends js.Object {
  /**
    * Indicates whether mutual CHAP is enabled for the iSCSI target.
    */
  var ChapEnabled: js.UndefOr[scala.Boolean] = js.native
  /**
    * The logical disk number.
    */
  var LunNumber: js.UndefOr[PositiveIntObject] = js.native
  /**
    * The network interface identifier.
    */
  var NetworkInterfaceId: js.UndefOr[typingsSlinky.awsSdk.storagegatewayMod.NetworkInterfaceId] = js.native
  /**
    * The port used to communicate with iSCSI targets.
    */
  var NetworkInterfacePort: js.UndefOr[integer] = js.native
  /**
    * The Amazon Resource Name (ARN) of the volume target.
    */
  var TargetARN: js.UndefOr[typingsSlinky.awsSdk.storagegatewayMod.TargetARN] = js.native
}

object VolumeiSCSIAttributes {
  @scala.inline
  def apply(): VolumeiSCSIAttributes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VolumeiSCSIAttributes]
  }
  @scala.inline
  implicit class VolumeiSCSIAttributesOps[Self <: VolumeiSCSIAttributes] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withChapEnabled(value: scala.Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ChapEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChapEnabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ChapEnabled")(js.undefined)
        ret
    }
    @scala.inline
    def withLunNumber(value: PositiveIntObject): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LunNumber")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLunNumber: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LunNumber")(js.undefined)
        ret
    }
    @scala.inline
    def withNetworkInterfaceId(value: NetworkInterfaceId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NetworkInterfaceId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNetworkInterfaceId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NetworkInterfaceId")(js.undefined)
        ret
    }
    @scala.inline
    def withNetworkInterfacePort(value: integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NetworkInterfacePort")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNetworkInterfacePort: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NetworkInterfacePort")(js.undefined)
        ret
    }
    @scala.inline
    def withTargetARN(value: TargetARN): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TargetARN")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTargetARN: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TargetARN")(js.undefined)
        ret
    }
  }
  
}

