package typingsSlinky.node.perfHooksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PerformanceEntry extends js.Object {
  /**
    * The total number of milliseconds elapsed for this entry.
    * This value will not be meaningful for all Performance Entry types.
    */
  val duration: Double = js.native
  /**
    * The type of the performance entry.
    * Currently it may be one of: 'node', 'mark', 'measure', 'gc', or 'function'.
    */
  val entryType: EntryType = js.native
  /**
    * When `performanceEntry.entryType` is equal to 'gc', the `performance.flags`
    * property contains additional information about garbage collection operation.
    * See perf_hooks.constants for valid values.
    */
  val flags: js.UndefOr[Double] = js.native
  /**
    * When `performanceEntry.entryType` is equal to 'gc', `the performance.kind` property identifies
    * the type of garbage collection operation that occurred.
    * See perf_hooks.constants for valid values.
    */
  val kind: js.UndefOr[Double] = js.native
  /**
    * The name of the performance entry.
    */
  val name: String = js.native
  /**
    * The high resolution millisecond timestamp marking the starting time of the Performance Entry.
    */
  val startTime: Double = js.native
}

object PerformanceEntry {
  @scala.inline
  def apply(duration: Double, entryType: EntryType, name: String, startTime: Double): PerformanceEntry = {
    val __obj = js.Dynamic.literal(duration = duration.asInstanceOf[js.Any], entryType = entryType.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], startTime = startTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[PerformanceEntry]
  }
  @scala.inline
  implicit class PerformanceEntryOps[Self <: PerformanceEntry] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDuration(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("duration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEntryType(value: EntryType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("entryType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStartTime(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFlags(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flags")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFlags: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flags")(js.undefined)
        ret
    }
    @scala.inline
    def withKind(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKind: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(js.undefined)
        ret
    }
  }
  
}

