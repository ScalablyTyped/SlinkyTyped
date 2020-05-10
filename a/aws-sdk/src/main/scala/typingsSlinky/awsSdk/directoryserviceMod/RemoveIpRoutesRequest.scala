package typingsSlinky.awsSdk.directoryserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RemoveIpRoutesRequest extends js.Object {
  /**
    * IP address blocks that you want to remove.
    */
  var CidrIps: typingsSlinky.awsSdk.directoryserviceMod.CidrIps = js.native
  /**
    * Identifier (ID) of the directory from which you want to remove the IP addresses.
    */
  var DirectoryId: typingsSlinky.awsSdk.directoryserviceMod.DirectoryId = js.native
}

object RemoveIpRoutesRequest {
  @scala.inline
  def apply(CidrIps: CidrIps, DirectoryId: DirectoryId): RemoveIpRoutesRequest = {
    val __obj = js.Dynamic.literal(CidrIps = CidrIps.asInstanceOf[js.Any], DirectoryId = DirectoryId.asInstanceOf[js.Any])
    __obj.asInstanceOf[RemoveIpRoutesRequest]
  }
  @scala.inline
  implicit class RemoveIpRoutesRequestOps[Self <: RemoveIpRoutesRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCidrIps(value: CidrIps): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CidrIps")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDirectoryId(value: DirectoryId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DirectoryId")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

