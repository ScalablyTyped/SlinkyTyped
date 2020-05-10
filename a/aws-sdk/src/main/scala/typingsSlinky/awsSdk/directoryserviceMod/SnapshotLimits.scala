package typingsSlinky.awsSdk.directoryserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SnapshotLimits extends js.Object {
  /**
    * The current number of manual snapshots of the directory.
    */
  var ManualSnapshotsCurrentCount: js.UndefOr[Limit] = js.native
  /**
    * The maximum number of manual snapshots allowed.
    */
  var ManualSnapshotsLimit: js.UndefOr[Limit] = js.native
  /**
    * Indicates if the manual snapshot limit has been reached.
    */
  var ManualSnapshotsLimitReached: js.UndefOr[typingsSlinky.awsSdk.directoryserviceMod.ManualSnapshotsLimitReached] = js.native
}

object SnapshotLimits {
  @scala.inline
  def apply(): SnapshotLimits = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SnapshotLimits]
  }
  @scala.inline
  implicit class SnapshotLimitsOps[Self <: SnapshotLimits] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withManualSnapshotsCurrentCount(value: Limit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ManualSnapshotsCurrentCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutManualSnapshotsCurrentCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ManualSnapshotsCurrentCount")(js.undefined)
        ret
    }
    @scala.inline
    def withManualSnapshotsLimit(value: Limit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ManualSnapshotsLimit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutManualSnapshotsLimit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ManualSnapshotsLimit")(js.undefined)
        ret
    }
    @scala.inline
    def withManualSnapshotsLimitReached(value: ManualSnapshotsLimitReached): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ManualSnapshotsLimitReached")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutManualSnapshotsLimitReached: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ManualSnapshotsLimitReached")(js.undefined)
        ret
    }
  }
  
}

