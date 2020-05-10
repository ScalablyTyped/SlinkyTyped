package typingsSlinky.canvasjs

import typingsSlinky.canvasjs.mod.Chart
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonEntries extends js.Object {
  var chart: Chart = js.native
  var entries: js.Array[AnonDataPoint] = js.native
  var toolTip: this.type = js.native
}

object AnonEntries {
  @scala.inline
  def apply(chart: Chart, entries: js.Array[AnonDataPoint], toolTip: AnonEntries): AnonEntries = {
    val __obj = js.Dynamic.literal(chart = chart.asInstanceOf[js.Any], entries = entries.asInstanceOf[js.Any], toolTip = toolTip.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonEntries]
  }
  @scala.inline
  implicit class AnonEntriesOps[Self <: AnonEntries] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withChart(value: Chart): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("chart")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEntries(value: js.Array[AnonDataPoint]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("entries")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withToolTip(value: AnonEntries): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toolTip")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

