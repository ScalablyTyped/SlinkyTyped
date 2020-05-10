package typingsSlinky.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MonitoringBaselineConfig extends js.Object {
  /**
    * The baseline constraint file in Amazon S3 that the current monitoring job should validated against.
    */
  var ConstraintsResource: js.UndefOr[MonitoringConstraintsResource] = js.native
  /**
    * The baseline statistics file in Amazon S3 that the current monitoring job should be validated against.
    */
  var StatisticsResource: js.UndefOr[MonitoringStatisticsResource] = js.native
}

object MonitoringBaselineConfig {
  @scala.inline
  def apply(): MonitoringBaselineConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MonitoringBaselineConfig]
  }
  @scala.inline
  implicit class MonitoringBaselineConfigOps[Self <: MonitoringBaselineConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withConstraintsResource(value: MonitoringConstraintsResource): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ConstraintsResource")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConstraintsResource: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ConstraintsResource")(js.undefined)
        ret
    }
    @scala.inline
    def withStatisticsResource(value: MonitoringStatisticsResource): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StatisticsResource")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStatisticsResource: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StatisticsResource")(js.undefined)
        ret
    }
  }
  
}

