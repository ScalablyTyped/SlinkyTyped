package typingsSlinky.awsSdk.dlmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FastRestoreRule extends js.Object {
  /**
    * The Availability Zones in which to enable fast snapshot restore.
    */
  var AvailabilityZones: AvailabilityZoneList = js.native
  /**
    * The number of snapshots to be enabled with fast snapshot restore.
    */
  var Count: js.UndefOr[typingsSlinky.awsSdk.dlmMod.Count] = js.native
  /**
    * The amount of time to enable fast snapshot restore. The maximum is 100 years. This is equivalent to 1200 months, 5200 weeks, or 36500 days.
    */
  var Interval: js.UndefOr[typingsSlinky.awsSdk.dlmMod.Interval] = js.native
  /**
    * The unit of time for enabling fast snapshot restore.
    */
  var IntervalUnit: js.UndefOr[RetentionIntervalUnitValues] = js.native
}

object FastRestoreRule {
  @scala.inline
  def apply(AvailabilityZones: AvailabilityZoneList): FastRestoreRule = {
    val __obj = js.Dynamic.literal(AvailabilityZones = AvailabilityZones.asInstanceOf[js.Any])
    __obj.asInstanceOf[FastRestoreRule]
  }
  @scala.inline
  implicit class FastRestoreRuleOps[Self <: FastRestoreRule] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAvailabilityZones(value: AvailabilityZoneList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AvailabilityZones")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCount(value: Count): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Count")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Count")(js.undefined)
        ret
    }
    @scala.inline
    def withInterval(value: Interval): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Interval")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInterval: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Interval")(js.undefined)
        ret
    }
    @scala.inline
    def withIntervalUnit(value: RetentionIntervalUnitValues): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IntervalUnit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIntervalUnit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IntervalUnit")(js.undefined)
        ret
    }
  }
  
}

