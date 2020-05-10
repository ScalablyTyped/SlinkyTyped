package typingsSlinky.awsSdk.connectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HistoricalMetricResult extends js.Object {
  /**
    * The set of metrics.
    */
  var Collections: js.UndefOr[HistoricalMetricDataCollections] = js.native
  /**
    * The dimension for the metrics.
    */
  var Dimensions: js.UndefOr[typingsSlinky.awsSdk.connectMod.Dimensions] = js.native
}

object HistoricalMetricResult {
  @scala.inline
  def apply(): HistoricalMetricResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HistoricalMetricResult]
  }
  @scala.inline
  implicit class HistoricalMetricResultOps[Self <: HistoricalMetricResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCollections(value: HistoricalMetricDataCollections): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Collections")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCollections: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Collections")(js.undefined)
        ret
    }
    @scala.inline
    def withDimensions(value: Dimensions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Dimensions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDimensions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Dimensions")(js.undefined)
        ret
    }
  }
  
}

