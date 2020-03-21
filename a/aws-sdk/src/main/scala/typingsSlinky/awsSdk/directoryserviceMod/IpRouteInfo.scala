package typingsSlinky.awsSdk.directoryserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IpRouteInfo extends js.Object {
  /**
    * The date and time the address block was added to the directory.
    */
  var AddedDateTime: js.UndefOr[js.Date] = js.native
  /**
    * IP address block in the IpRoute.
    */
  var CidrIp: js.UndefOr[typingsSlinky.awsSdk.directoryserviceMod.CidrIp] = js.native
  /**
    * Description of the IpRouteInfo.
    */
  var Description: js.UndefOr[typingsSlinky.awsSdk.directoryserviceMod.Description] = js.native
  /**
    * Identifier (ID) of the directory associated with the IP addresses.
    */
  var DirectoryId: js.UndefOr[typingsSlinky.awsSdk.directoryserviceMod.DirectoryId] = js.native
  /**
    * The status of the IP address block.
    */
  var IpRouteStatusMsg: js.UndefOr[typingsSlinky.awsSdk.directoryserviceMod.IpRouteStatusMsg] = js.native
  /**
    * The reason for the IpRouteStatusMsg.
    */
  var IpRouteStatusReason: js.UndefOr[typingsSlinky.awsSdk.directoryserviceMod.IpRouteStatusReason] = js.native
}

object IpRouteInfo {
  @scala.inline
  def apply(
    AddedDateTime: js.Date = null,
    CidrIp: CidrIp = null,
    Description: Description = null,
    DirectoryId: DirectoryId = null,
    IpRouteStatusMsg: IpRouteStatusMsg = null,
    IpRouteStatusReason: IpRouteStatusReason = null
  ): IpRouteInfo = {
    val __obj = js.Dynamic.literal()
    if (AddedDateTime != null) __obj.updateDynamic("AddedDateTime")(AddedDateTime.asInstanceOf[js.Any])
    if (CidrIp != null) __obj.updateDynamic("CidrIp")(CidrIp.asInstanceOf[js.Any])
    if (Description != null) __obj.updateDynamic("Description")(Description.asInstanceOf[js.Any])
    if (DirectoryId != null) __obj.updateDynamic("DirectoryId")(DirectoryId.asInstanceOf[js.Any])
    if (IpRouteStatusMsg != null) __obj.updateDynamic("IpRouteStatusMsg")(IpRouteStatusMsg.asInstanceOf[js.Any])
    if (IpRouteStatusReason != null) __obj.updateDynamic("IpRouteStatusReason")(IpRouteStatusReason.asInstanceOf[js.Any])
    __obj.asInstanceOf[IpRouteInfo]
  }
}

