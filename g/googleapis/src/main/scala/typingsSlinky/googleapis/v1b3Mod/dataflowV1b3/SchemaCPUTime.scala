package typingsSlinky.googleapis.v1b3Mod.dataflowV1b3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Modeled after information exposed by /proc/stat.
  */
@js.native
trait SchemaCPUTime extends js.Object {
  /**
    * Average CPU utilization rate (% non-idle cpu / second) since previous
    * sample.
    */
  var rate: js.UndefOr[Double] = js.native
  /**
    * Timestamp of the measurement.
    */
  var timestamp: js.UndefOr[String] = js.native
  /**
    * Total active CPU time across all cores (ie., non-idle) in milliseconds
    * since start-up.
    */
  var totalMs: js.UndefOr[String] = js.native
}

object SchemaCPUTime {
  @scala.inline
  def apply(): SchemaCPUTime = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCPUTime]
  }
  @scala.inline
  implicit class SchemaCPUTimeOps[Self <: SchemaCPUTime] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRate(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rate")(js.undefined)
        ret
    }
    @scala.inline
    def withTimestamp(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timestamp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTimestamp: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timestamp")(js.undefined)
        ret
    }
    @scala.inline
    def withTotalMs(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("totalMs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTotalMs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("totalMs")(js.undefined)
        ret
    }
  }
  
}

