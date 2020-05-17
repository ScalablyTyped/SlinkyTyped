package typingsSlinky.canvasjs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Entries extends js.Object {
  var chart: typingsSlinky.canvasjs.mod.Chart = js.native
  var entries: js.Array[DataPoint] = js.native
  var toolTip: this.type = js.native
}

object Entries {
  @scala.inline
  def apply(chart: typingsSlinky.canvasjs.mod.Chart, entries: js.Array[DataPoint], toolTip: Entries): Entries = {
    val __obj = js.Dynamic.literal(chart = chart.asInstanceOf[js.Any], entries = entries.asInstanceOf[js.Any], toolTip = toolTip.asInstanceOf[js.Any])
    __obj.asInstanceOf[Entries]
  }
  @scala.inline
  implicit class EntriesOps[Self <: Entries] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withChart(value: typingsSlinky.canvasjs.mod.Chart): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("chart")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEntries(value: js.Array[DataPoint]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("entries")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withToolTip(value: Entries): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toolTip")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

