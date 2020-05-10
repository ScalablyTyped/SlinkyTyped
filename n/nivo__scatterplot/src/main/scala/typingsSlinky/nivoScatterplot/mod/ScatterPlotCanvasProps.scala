package typingsSlinky.nivoScatterplot.mod

import org.scalajs.dom.raw.CanvasRenderingContext2D
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ScatterPlotCanvasProps extends ScatterPlotProps {
  var layers: js.UndefOr[js.Array[CustomLayerId | CustomCanvasLayer]] = js.native
  var pixelRatio: js.UndefOr[Double] = js.native
  var renderNode: js.UndefOr[NodeCanvasComponent] = js.native
}

object ScatterPlotCanvasProps {
  @scala.inline
  def apply(data: js.Array[Serie]): ScatterPlotCanvasProps = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScatterPlotCanvasProps]
  }
  @scala.inline
  implicit class ScatterPlotCanvasPropsOps[Self <: ScatterPlotCanvasProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLayers(value: js.Array[CustomLayerId | CustomCanvasLayer]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("layers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLayers: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("layers")(js.undefined)
        ret
    }
    @scala.inline
    def withPixelRatio(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pixelRatio")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPixelRatio: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pixelRatio")(js.undefined)
        ret
    }
    @scala.inline
    def withRenderNode(value: (/* ctx */ CanvasRenderingContext2D, /* props */ NodeProps) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderNode")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutRenderNode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderNode")(js.undefined)
        ret
    }
  }
  
}

