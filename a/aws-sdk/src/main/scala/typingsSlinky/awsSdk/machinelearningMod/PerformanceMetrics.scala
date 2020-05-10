package typingsSlinky.awsSdk.machinelearningMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PerformanceMetrics extends js.Object {
  var Properties: js.UndefOr[PerformanceMetricsProperties] = js.native
}

object PerformanceMetrics {
  @scala.inline
  def apply(): PerformanceMetrics = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PerformanceMetrics]
  }
  @scala.inline
  implicit class PerformanceMetricsOps[Self <: PerformanceMetrics] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withProperties(value: PerformanceMetricsProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Properties")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProperties: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Properties")(js.undefined)
        ret
    }
  }
  
}

