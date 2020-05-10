package typingsSlinky.awsSdk.cognitoidentityserviceproviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AdminListDevicesResponse extends js.Object {
  /**
    * The devices in the list of devices response.
    */
  var Devices: js.UndefOr[DeviceListType] = js.native
  /**
    * The pagination token.
    */
  var PaginationToken: js.UndefOr[SearchPaginationTokenType] = js.native
}

object AdminListDevicesResponse {
  @scala.inline
  def apply(): AdminListDevicesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AdminListDevicesResponse]
  }
  @scala.inline
  implicit class AdminListDevicesResponseOps[Self <: AdminListDevicesResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDevices(value: DeviceListType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Devices")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDevices: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Devices")(js.undefined)
        ret
    }
    @scala.inline
    def withPaginationToken(value: SearchPaginationTokenType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PaginationToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPaginationToken: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PaginationToken")(js.undefined)
        ret
    }
  }
  
}

