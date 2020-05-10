package typingsSlinky.hystrixjs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MetricsProperties extends js.Object {
  var commandGroup: String = js.native
  var commandKey: String = js.native
  var percentileWindowNumberOfBuckets: js.UndefOr[Double] = js.native
  var percentileWindowTimeInMilliSeconds: js.UndefOr[Double] = js.native
  var statisticalWindowNumberOfBuckets: js.UndefOr[Double] = js.native
  var statisticalWindowTimeInMilliSeconds: js.UndefOr[Double] = js.native
}

object MetricsProperties {
  @scala.inline
  def apply(commandGroup: String, commandKey: String): MetricsProperties = {
    val __obj = js.Dynamic.literal(commandGroup = commandGroup.asInstanceOf[js.Any], commandKey = commandKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[MetricsProperties]
  }
  @scala.inline
  implicit class MetricsPropertiesOps[Self <: MetricsProperties] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCommandGroup(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("commandGroup")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCommandKey(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("commandKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPercentileWindowNumberOfBuckets(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("percentileWindowNumberOfBuckets")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPercentileWindowNumberOfBuckets: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("percentileWindowNumberOfBuckets")(js.undefined)
        ret
    }
    @scala.inline
    def withPercentileWindowTimeInMilliSeconds(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("percentileWindowTimeInMilliSeconds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPercentileWindowTimeInMilliSeconds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("percentileWindowTimeInMilliSeconds")(js.undefined)
        ret
    }
    @scala.inline
    def withStatisticalWindowNumberOfBuckets(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("statisticalWindowNumberOfBuckets")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStatisticalWindowNumberOfBuckets: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("statisticalWindowNumberOfBuckets")(js.undefined)
        ret
    }
    @scala.inline
    def withStatisticalWindowTimeInMilliSeconds(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("statisticalWindowTimeInMilliSeconds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStatisticalWindowTimeInMilliSeconds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("statisticalWindowTimeInMilliSeconds")(js.undefined)
        ret
    }
  }
  
}

