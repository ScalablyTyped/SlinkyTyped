package typingsSlinky.canvasjs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Entries extends js.Object {
  var chart: typingsSlinky.canvasjs.mod.Chart
  var entries: js.Array[DataPoint]
  var toolTip: this.type
}

object Entries {
  @scala.inline
  def apply(chart: typingsSlinky.canvasjs.mod.Chart, entries: js.Array[DataPoint], toolTip: Entries): Entries = {
    val __obj = js.Dynamic.literal(chart = chart.asInstanceOf[js.Any], entries = entries.asInstanceOf[js.Any], toolTip = toolTip.asInstanceOf[js.Any])
    __obj.asInstanceOf[Entries]
  }
}

