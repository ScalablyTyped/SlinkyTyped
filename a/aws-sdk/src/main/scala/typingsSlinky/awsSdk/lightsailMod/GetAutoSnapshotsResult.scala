package typingsSlinky.awsSdk.lightsailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetAutoSnapshotsResult extends js.Object {
  /**
    * An array of objects that describe the automatic snapshots that are available for the specified source instance or disk.
    */
  var autoSnapshots: js.UndefOr[AutoSnapshotDetailsList] = js.native
  /**
    * The name of the source instance or disk for the automatic snapshots.
    */
  var resourceName: js.UndefOr[ResourceName] = js.native
  /**
    * The resource type (e.g., Instance or Disk).
    */
  var resourceType: js.UndefOr[ResourceType] = js.native
}

object GetAutoSnapshotsResult {
  @scala.inline
  def apply(): GetAutoSnapshotsResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetAutoSnapshotsResult]
  }
  @scala.inline
  implicit class GetAutoSnapshotsResultOps[Self <: GetAutoSnapshotsResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAutoSnapshots(value: AutoSnapshotDetailsList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoSnapshots")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoSnapshots: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoSnapshots")(js.undefined)
        ret
    }
    @scala.inline
    def withResourceName(value: ResourceName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resourceName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResourceName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resourceName")(js.undefined)
        ret
    }
    @scala.inline
    def withResourceType(value: ResourceType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resourceType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResourceType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resourceType")(js.undefined)
        ret
    }
  }
  
}

