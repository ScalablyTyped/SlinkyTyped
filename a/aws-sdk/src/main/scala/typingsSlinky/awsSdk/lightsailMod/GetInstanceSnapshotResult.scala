package typingsSlinky.awsSdk.lightsailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetInstanceSnapshotResult extends js.Object {
  /**
    * An array of key-value pairs containing information about the results of your get instance snapshot request.
    */
  var instanceSnapshot: js.UndefOr[InstanceSnapshot] = js.native
}

object GetInstanceSnapshotResult {
  @scala.inline
  def apply(): GetInstanceSnapshotResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetInstanceSnapshotResult]
  }
  @scala.inline
  implicit class GetInstanceSnapshotResultOps[Self <: GetInstanceSnapshotResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withInstanceSnapshot(value: InstanceSnapshot): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("instanceSnapshot")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInstanceSnapshot: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("instanceSnapshot")(js.undefined)
        ret
    }
  }
  
}

