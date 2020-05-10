package typingsSlinky.plotlyJs.mod

import org.scalajs.dom.raw.MouseEvent
import typingsSlinky.plotlyJs.PartialConfig
import typingsSlinky.plotlyJs.PartialLayout
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LegendClickEvent extends js.Object {
  var config: PartialConfig = js.native
  var curveNumber: Double = js.native
  var data: js.Array[Data] = js.native
  var event: MouseEvent = js.native
  var expandedIndex: Double = js.native
  var frames: js.Array[Frame] = js.native
  var fullData: js.Array[Data] = js.native
  var fullLayout: PartialLayout = js.native
  var layout: PartialLayout = js.native
  var node: PlotlyHTMLElement = js.native
}

object LegendClickEvent {
  @scala.inline
  def apply(
    config: PartialConfig,
    curveNumber: Double,
    data: js.Array[Data],
    event: MouseEvent,
    expandedIndex: Double,
    frames: js.Array[Frame],
    fullData: js.Array[Data],
    fullLayout: PartialLayout,
    layout: PartialLayout,
    node: PlotlyHTMLElement
  ): LegendClickEvent = {
    val __obj = js.Dynamic.literal(config = config.asInstanceOf[js.Any], curveNumber = curveNumber.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], event = event.asInstanceOf[js.Any], expandedIndex = expandedIndex.asInstanceOf[js.Any], frames = frames.asInstanceOf[js.Any], fullData = fullData.asInstanceOf[js.Any], fullLayout = fullLayout.asInstanceOf[js.Any], layout = layout.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any])
    __obj.asInstanceOf[LegendClickEvent]
  }
  @scala.inline
  implicit class LegendClickEventOps[Self <: LegendClickEvent] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withConfig(value: PartialConfig): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("config")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCurveNumber(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("curveNumber")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withData(value: js.Array[Data]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEvent(value: MouseEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("event")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExpandedIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expandedIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFrames(value: js.Array[Frame]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("frames")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFullData(value: js.Array[Data]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fullData")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFullLayout(value: PartialLayout): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fullLayout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLayout(value: PartialLayout): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("layout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNode(value: PlotlyHTMLElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("node")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

