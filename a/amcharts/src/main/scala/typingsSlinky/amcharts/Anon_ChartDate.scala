package typingsSlinky.amcharts

import typingsSlinky.amcharts.stockEventMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ChartDate extends js.Object {
  var chart: this.type
  var date: js.UndefOr[js.Date] = js.undefined
  var endDate: js.UndefOr[js.Date] = js.undefined
  var eventObject: js.UndefOr[default] = js.undefined
  var graph: js.UndefOr[typingsSlinky.amcharts.stockGraphMod.default] = js.undefined
  var panel: js.UndefOr[typingsSlinky.amcharts.stockPanelMod.default] = js.undefined
  var period: js.UndefOr[String] = js.undefined
  var startDate: js.UndefOr[js.Date] = js.undefined
  var `type`: String
}

object Anon_ChartDate {
  @scala.inline
  def apply(
    chart: Anon_ChartDate,
    `type`: String,
    date: js.Date = null,
    endDate: js.Date = null,
    eventObject: default = null,
    graph: typingsSlinky.amcharts.stockGraphMod.default = null,
    panel: typingsSlinky.amcharts.stockPanelMod.default = null,
    period: String = null,
    startDate: js.Date = null
  ): Anon_ChartDate = {
    val __obj = js.Dynamic.literal(chart = chart.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (date != null) __obj.updateDynamic("date")(date.asInstanceOf[js.Any])
    if (endDate != null) __obj.updateDynamic("endDate")(endDate.asInstanceOf[js.Any])
    if (eventObject != null) __obj.updateDynamic("eventObject")(eventObject.asInstanceOf[js.Any])
    if (graph != null) __obj.updateDynamic("graph")(graph.asInstanceOf[js.Any])
    if (panel != null) __obj.updateDynamic("panel")(panel.asInstanceOf[js.Any])
    if (period != null) __obj.updateDynamic("period")(period.asInstanceOf[js.Any])
    if (startDate != null) __obj.updateDynamic("startDate")(startDate.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_ChartDate]
  }
}

