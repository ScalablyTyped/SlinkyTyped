package typingsSlinky.awsSdk.efsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteMountTargetRequest extends js.Object {
  /**
    * The ID of the mount target to delete (String).
    */
  var MountTargetId: typingsSlinky.awsSdk.efsMod.MountTargetId = js.native
}

object DeleteMountTargetRequest {
  @scala.inline
  def apply(MountTargetId: MountTargetId): DeleteMountTargetRequest = {
    val __obj = js.Dynamic.literal(MountTargetId = MountTargetId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteMountTargetRequest]
  }
  @scala.inline
  implicit class DeleteMountTargetRequestOps[Self <: DeleteMountTargetRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMountTargetId(value: MountTargetId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MountTargetId")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

