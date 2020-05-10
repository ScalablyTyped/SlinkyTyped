package typingsSlinky.awsSdk.directoryserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetSnapshotLimitsResult extends js.Object {
  /**
    * A SnapshotLimits object that contains the manual snapshot limits for the specified directory.
    */
  var SnapshotLimits: js.UndefOr[typingsSlinky.awsSdk.directoryserviceMod.SnapshotLimits] = js.native
}

object GetSnapshotLimitsResult {
  @scala.inline
  def apply(): GetSnapshotLimitsResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetSnapshotLimitsResult]
  }
  @scala.inline
  implicit class GetSnapshotLimitsResultOps[Self <: GetSnapshotLimitsResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSnapshotLimits(value: SnapshotLimits): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SnapshotLimits")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSnapshotLimits: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SnapshotLimits")(js.undefined)
        ret
    }
  }
  
}

