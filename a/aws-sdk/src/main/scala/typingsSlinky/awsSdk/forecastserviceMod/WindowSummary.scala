package typingsSlinky.awsSdk.forecastserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WindowSummary extends js.Object {
  /**
    * The type of evaluation.    SUMMARY - The average metrics across all windows.    COMPUTED - The metrics for the specified window.  
    */
  var EvaluationType: js.UndefOr[typingsSlinky.awsSdk.forecastserviceMod.EvaluationType] = js.native
  /**
    * The number of data points within the window.
    */
  var ItemCount: js.UndefOr[Integer] = js.native
  /**
    * Provides metrics used to evaluate the performance of a predictor.
    */
  var Metrics: js.UndefOr[typingsSlinky.awsSdk.forecastserviceMod.Metrics] = js.native
  /**
    * The timestamp that defines the end of the window.
    */
  var TestWindowEnd: js.UndefOr[js.Date] = js.native
  /**
    * The timestamp that defines the start of the window.
    */
  var TestWindowStart: js.UndefOr[js.Date] = js.native
}

object WindowSummary {
  @scala.inline
  def apply(): WindowSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WindowSummary]
  }
  @scala.inline
  implicit class WindowSummaryOps[Self <: WindowSummary] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEvaluationType(value: EvaluationType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EvaluationType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEvaluationType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EvaluationType")(js.undefined)
        ret
    }
    @scala.inline
    def withItemCount(value: Integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ItemCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutItemCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ItemCount")(js.undefined)
        ret
    }
    @scala.inline
    def withMetrics(value: Metrics): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Metrics")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMetrics: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Metrics")(js.undefined)
        ret
    }
    @scala.inline
    def withTestWindowEnd(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TestWindowEnd")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTestWindowEnd: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TestWindowEnd")(js.undefined)
        ret
    }
    @scala.inline
    def withTestWindowStart(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TestWindowStart")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTestWindowStart: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TestWindowStart")(js.undefined)
        ret
    }
  }
  
}

