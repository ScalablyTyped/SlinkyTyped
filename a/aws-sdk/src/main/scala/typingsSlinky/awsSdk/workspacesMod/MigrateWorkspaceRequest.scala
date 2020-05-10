package typingsSlinky.awsSdk.workspacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MigrateWorkspaceRequest extends js.Object {
  /**
    * The identifier of the target bundle type to migrate the WorkSpace to.
    */
  var BundleId: typingsSlinky.awsSdk.workspacesMod.BundleId = js.native
  /**
    * The identifier of the WorkSpace to migrate from.
    */
  var SourceWorkspaceId: WorkspaceId = js.native
}

object MigrateWorkspaceRequest {
  @scala.inline
  def apply(BundleId: BundleId, SourceWorkspaceId: WorkspaceId): MigrateWorkspaceRequest = {
    val __obj = js.Dynamic.literal(BundleId = BundleId.asInstanceOf[js.Any], SourceWorkspaceId = SourceWorkspaceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[MigrateWorkspaceRequest]
  }
  @scala.inline
  implicit class MigrateWorkspaceRequestOps[Self <: MigrateWorkspaceRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBundleId(value: BundleId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BundleId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSourceWorkspaceId(value: WorkspaceId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SourceWorkspaceId")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

