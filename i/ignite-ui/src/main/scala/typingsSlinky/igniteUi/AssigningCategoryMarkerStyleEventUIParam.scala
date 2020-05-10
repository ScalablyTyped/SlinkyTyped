package typingsSlinky.igniteUi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AssigningCategoryMarkerStyleEventUIParam extends js.Object {
  /**
  	 * Used to get reference to chart object.
  	 */
  var chart: js.UndefOr[js.Any] = js.native
  var endDate: js.UndefOr[js.Any] = js.native
  /**
  	 * Used to get the end index for the current items.
  	 */
  var endIndex: js.UndefOr[js.Any] = js.native
  /**
  	 * Used to get or set the fill to use for the current item.
  	 */
  var fill: js.UndefOr[js.Any] = js.native
  /**
  	 * Used to get all the items associated with the event (only if necessary).
  	 */
  var getItems: js.UndefOr[js.Any] = js.native
  /**
  	 * Used to tell if you should use the startDate and endDate to know the current items instead of startIndex/endIndex.
  	 */
  var hasDateRange: js.UndefOr[js.Any] = js.native
  /**
  	 * Used to set if the default highlighting behavior should not run, given that you are handling it in this event.
  	 */
  var highlightingHandled: js.UndefOr[js.Any] = js.native
  /**
  	 * Used to get the maximum highlighted progress across all series.
  	 */
  var maxAllSeriesHighlightingProgress: js.UndefOr[js.Any] = js.native
  /**
  	 * Used to get or set the opacity to use for the current item.
  	 */
  var opacity: js.UndefOr[js.Any] = js.native
  /**
  	 * Used to get reference to current series object.
  	 */
  var series: js.UndefOr[js.Any] = js.native
  var startDate: js.UndefOr[js.Any] = js.native
  /**
  	 * Used to get the start index for the current items.
  	 */
  var startIndex: js.UndefOr[js.Any] = js.native
  /**
  	 * Used to get or set the stroke to use for the current item.
  	 */
  var stroke: js.UndefOr[js.Any] = js.native
  /**
  	 * Used to get the sum of highlighting progtess across all series.
  	 */
  var sumAllSeriesHighlightingProgress: js.UndefOr[js.Any] = js.native
}

object AssigningCategoryMarkerStyleEventUIParam {
  @scala.inline
  def apply(): AssigningCategoryMarkerStyleEventUIParam = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AssigningCategoryMarkerStyleEventUIParam]
  }
  @scala.inline
  implicit class AssigningCategoryMarkerStyleEventUIParamOps[Self <: AssigningCategoryMarkerStyleEventUIParam] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withChart(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("chart")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChart: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("chart")(js.undefined)
        ret
    }
    @scala.inline
    def withEndDate(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEndDate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endDate")(js.undefined)
        ret
    }
    @scala.inline
    def withEndIndex(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEndIndex: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endIndex")(js.undefined)
        ret
    }
    @scala.inline
    def withFill(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fill")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFill: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fill")(js.undefined)
        ret
    }
    @scala.inline
    def withGetItems(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getItems")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGetItems: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getItems")(js.undefined)
        ret
    }
    @scala.inline
    def withHasDateRange(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasDateRange")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHasDateRange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasDateRange")(js.undefined)
        ret
    }
    @scala.inline
    def withHighlightingHandled(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("highlightingHandled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHighlightingHandled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("highlightingHandled")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxAllSeriesHighlightingProgress(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxAllSeriesHighlightingProgress")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxAllSeriesHighlightingProgress: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxAllSeriesHighlightingProgress")(js.undefined)
        ret
    }
    @scala.inline
    def withOpacity(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("opacity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOpacity: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("opacity")(js.undefined)
        ret
    }
    @scala.inline
    def withSeries(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("series")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSeries: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("series")(js.undefined)
        ret
    }
    @scala.inline
    def withStartDate(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStartDate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startDate")(js.undefined)
        ret
    }
    @scala.inline
    def withStartIndex(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStartIndex: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startIndex")(js.undefined)
        ret
    }
    @scala.inline
    def withStroke(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stroke")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStroke: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stroke")(js.undefined)
        ret
    }
    @scala.inline
    def withSumAllSeriesHighlightingProgress(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sumAllSeriesHighlightingProgress")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSumAllSeriesHighlightingProgress: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sumAllSeriesHighlightingProgress")(js.undefined)
        ret
    }
  }
  
}

