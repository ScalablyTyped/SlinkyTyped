package typingsSlinky.awsSdk.storagegatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeviceiSCSIAttributes extends js.Object {
  /**
    * Indicates whether mutual CHAP is enabled for the iSCSI target.
    */
  var ChapEnabled: js.UndefOr[scala.Boolean] = js.native
  /**
    * The network interface identifier of the VTL device.
    */
  var NetworkInterfaceId: js.UndefOr[typingsSlinky.awsSdk.storagegatewayMod.NetworkInterfaceId] = js.native
  /**
    * The port used to communicate with iSCSI VTL device targets.
    */
  var NetworkInterfacePort: js.UndefOr[integer] = js.native
  /**
    * Specifies the unique Amazon Resource Name (ARN) that encodes the iSCSI qualified name(iqn) of a tape drive or media changer target.
    */
  var TargetARN: js.UndefOr[typingsSlinky.awsSdk.storagegatewayMod.TargetARN] = js.native
}

object DeviceiSCSIAttributes {
  @scala.inline
  def apply(): DeviceiSCSIAttributes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeviceiSCSIAttributes]
  }
  @scala.inline
  implicit class DeviceiSCSIAttributesOps[Self <: DeviceiSCSIAttributes] (val x: Self) extends AnyVal {
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

