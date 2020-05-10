package typingsSlinky.googleapis.v33Mod.dfareportingV33

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The attributes, like playtime and percent onscreen, that define the Custom
  * Viewability Metric.
  */
@js.native
trait SchemaCustomViewabilityMetricConfiguration extends js.Object {
  /**
    * Whether the video must be audible to count an impression.
    */
  var audible: js.UndefOr[Boolean] = js.native
  /**
    * The time in milliseconds the video must play for the Custom Viewability
    * Metric to count an impression. If both this and timePercent are
    * specified, the earlier of the two will be used.
    */
  var timeMillis: js.UndefOr[Double] = js.native
  /**
    * The percentage of video that must play for the Custom Viewability Metric
    * to count an impression. If both this and timeMillis are specified, the
    * earlier of the two will be used.
    */
  var timePercent: js.UndefOr[Double] = js.native
  /**
    * The percentage of video that must be on screen for the Custom Viewability
    * Metric to count an impression.
    */
  var viewabilityPercent: js.UndefOr[Double] = js.native
}

object SchemaCustomViewabilityMetricConfiguration {
  @scala.inline
  def apply(): SchemaCustomViewabilityMetricConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCustomViewabilityMetricConfiguration]
  }
  @scala.inline
  implicit class SchemaCustomViewabilityMetricConfigurationOps[Self <: SchemaCustomViewabilityMetricConfiguration] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAudible(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("audible")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAudible: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("audible")(js.undefined)
        ret
    }
    @scala.inline
    def withTimeMillis(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeMillis")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTimeMillis: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeMillis")(js.undefined)
        ret
    }
    @scala.inline
    def withTimePercent(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timePercent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTimePercent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timePercent")(js.undefined)
        ret
    }
    @scala.inline
    def withViewabilityPercent(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("viewabilityPercent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutViewabilityPercent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("viewabilityPercent")(js.undefined)
        ret
    }
  }
  
}

