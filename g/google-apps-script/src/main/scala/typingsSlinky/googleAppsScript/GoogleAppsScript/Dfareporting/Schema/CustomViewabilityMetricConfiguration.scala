package typingsSlinky.googleAppsScript.GoogleAppsScript.Dfareporting.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CustomViewabilityMetricConfiguration extends js.Object {
  var audible: js.UndefOr[Boolean] = js.native
  var timeMillis: js.UndefOr[Double] = js.native
  var timePercent: js.UndefOr[Double] = js.native
  var viewabilityPercent: js.UndefOr[Double] = js.native
}

object CustomViewabilityMetricConfiguration {
  @scala.inline
  def apply(): CustomViewabilityMetricConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CustomViewabilityMetricConfiguration]
  }
  @scala.inline
  implicit class CustomViewabilityMetricConfigurationOps[Self <: CustomViewabilityMetricConfiguration] (val x: Self) extends AnyVal {
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

