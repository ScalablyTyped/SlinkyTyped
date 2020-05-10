package typingsSlinky.googleapis.appengineV1Mod.appengineV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Target scaling by CPU usage.
  */
@js.native
trait SchemaCpuUtilization extends js.Object {
  /**
    * Period of time over which CPU utilization is calculated.
    */
  var aggregationWindowLength: js.UndefOr[String] = js.native
  /**
    * Target CPU utilization ratio to maintain when scaling. Must be between 0
    * and 1.
    */
  var targetUtilization: js.UndefOr[Double] = js.native
}

object SchemaCpuUtilization {
  @scala.inline
  def apply(): SchemaCpuUtilization = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCpuUtilization]
  }
  @scala.inline
  implicit class SchemaCpuUtilizationOps[Self <: SchemaCpuUtilization] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAggregationWindowLength(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aggregationWindowLength")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAggregationWindowLength: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aggregationWindowLength")(js.undefined)
        ret
    }
    @scala.inline
    def withTargetUtilization(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("targetUtilization")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTargetUtilization: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("targetUtilization")(js.undefined)
        ret
    }
  }
  
}

