package typingsSlinky.reactPlotlyJs

import org.scalajs.dom.raw.MouseEvent
import typingsSlinky.plotlyJs.mod.Data
import typingsSlinky.plotlyJs.mod.Frame
import typingsSlinky.plotlyJs.mod.PlotlyHTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Readonly<plotly.js.plotly.js.LegendClickEvent> */
trait ReadonlyLegendClickEvent extends js.Object {
  val config: typingsSlinky.plotlyJs.PartialConfig
  val curveNumber: Double
  val data: js.Array[Data]
  val event: MouseEvent
  val expandedIndex: Double
  val frames: js.Array[Frame]
  val fullData: js.Array[Data]
  val fullLayout: typingsSlinky.plotlyJs.PartialLayout
  val layout: typingsSlinky.plotlyJs.PartialLayout
  val node: PlotlyHTMLElement
}

object ReadonlyLegendClickEvent {
  @scala.inline
  def apply(
    config: typingsSlinky.plotlyJs.PartialConfig,
    curveNumber: Double,
    data: js.Array[Data],
    event: MouseEvent,
    expandedIndex: Double,
    frames: js.Array[Frame],
    fullData: js.Array[Data],
    fullLayout: typingsSlinky.plotlyJs.PartialLayout,
    layout: typingsSlinky.plotlyJs.PartialLayout,
    node: PlotlyHTMLElement
  ): ReadonlyLegendClickEvent = {
    val __obj = js.Dynamic.literal(config = config.asInstanceOf[js.Any], curveNumber = curveNumber.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], event = event.asInstanceOf[js.Any], expandedIndex = expandedIndex.asInstanceOf[js.Any], frames = frames.asInstanceOf[js.Any], fullData = fullData.asInstanceOf[js.Any], fullLayout = fullLayout.asInstanceOf[js.Any], layout = layout.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ReadonlyLegendClickEvent]
  }
}

