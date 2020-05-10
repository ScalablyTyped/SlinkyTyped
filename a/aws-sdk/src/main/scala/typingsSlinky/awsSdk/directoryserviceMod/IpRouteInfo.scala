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
  def apply(): IpRouteInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IpRouteInfo]
  }
  @scala.inline
  implicit class IpRouteInfoOps[Self <: IpRouteInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAddedDateTime(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AddedDateTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAddedDateTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AddedDateTime")(js.undefined)
        ret
    }
    @scala.inline
    def withCidrIp(value: CidrIp): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CidrIp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCidrIp: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CidrIp")(js.undefined)
        ret
    }
    @scala.inline
    def withDescription(value: Description): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDescription: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Description")(js.undefined)
        ret
    }
    @scala.inline
    def withDirectoryId(value: DirectoryId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DirectoryId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDirectoryId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DirectoryId")(js.undefined)
        ret
    }
    @scala.inline
    def withIpRouteStatusMsg(value: IpRouteStatusMsg): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IpRouteStatusMsg")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIpRouteStatusMsg: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IpRouteStatusMsg")(js.undefined)
        ret
    }
    @scala.inline
    def withIpRouteStatusReason(value: IpRouteStatusReason): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IpRouteStatusReason")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIpRouteStatusReason: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IpRouteStatusReason")(js.undefined)
        ret
    }
  }
  
}

