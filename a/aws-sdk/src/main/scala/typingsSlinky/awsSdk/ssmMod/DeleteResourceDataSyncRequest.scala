package typingsSlinky.awsSdk.ssmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteResourceDataSyncRequest extends js.Object {
  /**
    * The name of the configuration to delete.
    */
  var SyncName: ResourceDataSyncName = js.native
  /**
    * Specify the type of resource data sync to delete.
    */
  var SyncType: js.UndefOr[ResourceDataSyncType] = js.native
}

object DeleteResourceDataSyncRequest {
  @scala.inline
  def apply(SyncName: ResourceDataSyncName): DeleteResourceDataSyncRequest = {
    val __obj = js.Dynamic.literal(SyncName = SyncName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteResourceDataSyncRequest]
  }
  @scala.inline
  implicit class DeleteResourceDataSyncRequestOps[Self <: DeleteResourceDataSyncRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSyncName(value: ResourceDataSyncName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SyncName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSyncType(value: ResourceDataSyncType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SyncType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSyncType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SyncType")(js.undefined)
        ret
    }
  }
  
}

