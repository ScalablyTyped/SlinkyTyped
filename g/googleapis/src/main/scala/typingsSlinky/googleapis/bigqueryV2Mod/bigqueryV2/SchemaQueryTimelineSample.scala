package typingsSlinky.googleapis.bigqueryV2Mod.bigqueryV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaQueryTimelineSample extends js.Object {
  /**
    * Total number of units currently being processed by workers. This does not
    * correspond directly to slot usage. This is the largest value observed
    * since the last sample.
    */
  var activeUnits: js.UndefOr[String] = js.native
  /**
    * Total parallel units of work completed by this query.
    */
  var completedUnits: js.UndefOr[String] = js.native
  /**
    * Milliseconds elapsed since the start of query execution.
    */
  var elapsedMs: js.UndefOr[String] = js.native
  /**
    * Total parallel units of work remaining for the active stages.
    */
  var pendingUnits: js.UndefOr[String] = js.native
  /**
    * Cumulative slot-ms consumed by the query.
    */
  var totalSlotMs: js.UndefOr[String] = js.native
}

object SchemaQueryTimelineSample {
  @scala.inline
  def apply(): SchemaQueryTimelineSample = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaQueryTimelineSample]
  }
  @scala.inline
  implicit class SchemaQueryTimelineSampleOps[Self <: SchemaQueryTimelineSample] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withActiveUnits(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("activeUnits")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutActiveUnits: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("activeUnits")(js.undefined)
        ret
    }
    @scala.inline
    def withCompletedUnits(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("completedUnits")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCompletedUnits: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("completedUnits")(js.undefined)
        ret
    }
    @scala.inline
    def withElapsedMs(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("elapsedMs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutElapsedMs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("elapsedMs")(js.undefined)
        ret
    }
    @scala.inline
    def withPendingUnits(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pendingUnits")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPendingUnits: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pendingUnits")(js.undefined)
        ret
    }
    @scala.inline
    def withTotalSlotMs(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("totalSlotMs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTotalSlotMs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("totalSlotMs")(js.undefined)
        ret
    }
  }
  
}

