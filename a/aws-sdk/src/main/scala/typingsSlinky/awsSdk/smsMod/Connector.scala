package typingsSlinky.awsSdk.smsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Connector extends js.Object {
  /**
    * The time the connector was associated.
    */
  var associatedOn: js.UndefOr[js.Date] = js.native
  /**
    * The capabilities of the connector.
    */
  var capabilityList: js.UndefOr[ConnectorCapabilityList] = js.native
  /**
    * The identifier of the connector.
    */
  var connectorId: js.UndefOr[ConnectorId] = js.native
  /**
    * The IP address of the connector.
    */
  var ipAddress: js.UndefOr[IpAddress] = js.native
  /**
    * The MAC address of the connector.
    */
  var macAddress: js.UndefOr[MacAddress] = js.native
  /**
    * The status of the connector.
    */
  var status: js.UndefOr[ConnectorStatus] = js.native
  /**
    * The connector version.
    */
  var version: js.UndefOr[ConnectorVersion] = js.native
  /**
    * The identifier of the VM manager.
    */
  var vmManagerId: js.UndefOr[VmManagerId] = js.native
  /**
    * The name of the VM manager.
    */
  var vmManagerName: js.UndefOr[VmManagerName] = js.native
  /**
    * The VM management product.
    */
  var vmManagerType: js.UndefOr[VmManagerType] = js.native
}

object Connector {
  @scala.inline
  def apply(): Connector = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Connector]
  }
  @scala.inline
  implicit class ConnectorOps[Self <: Connector] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAssociatedOn(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("associatedOn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAssociatedOn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("associatedOn")(js.undefined)
        ret
    }
    @scala.inline
    def withCapabilityList(value: ConnectorCapabilityList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("capabilityList")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCapabilityList: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("capabilityList")(js.undefined)
        ret
    }
    @scala.inline
    def withConnectorId(value: ConnectorId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connectorId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConnectorId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connectorId")(js.undefined)
        ret
    }
    @scala.inline
    def withIpAddress(value: IpAddress): Self = {
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
    def withMacAddress(value: MacAddress): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("macAddress")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMacAddress: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("macAddress")(js.undefined)
        ret
    }
    @scala.inline
    def withStatus(value: ConnectorStatus): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(js.undefined)
        ret
    }
    @scala.inline
    def withVersion(value: ConnectorVersion): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("version")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("version")(js.undefined)
        ret
    }
    @scala.inline
    def withVmManagerId(value: VmManagerId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vmManagerId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVmManagerId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vmManagerId")(js.undefined)
        ret
    }
    @scala.inline
    def withVmManagerName(value: VmManagerName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vmManagerName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVmManagerName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vmManagerName")(js.undefined)
        ret
    }
    @scala.inline
    def withVmManagerType(value: VmManagerType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vmManagerType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVmManagerType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vmManagerType")(js.undefined)
        ret
    }
  }
  
}

