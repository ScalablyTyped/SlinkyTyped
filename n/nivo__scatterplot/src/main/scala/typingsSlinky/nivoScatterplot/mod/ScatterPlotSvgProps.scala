package typingsSlinky.nivoScatterplot.mod

import slinky.core.TagMod
import typingsSlinky.nivoCore.mod.CartesianMarkerProps
import typingsSlinky.nivoCore.mod.MotionProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ScatterPlotSvgProps
  extends ScatterPlotProps
     with MotionProps {
  var layers: js.UndefOr[js.Array[CustomLayerId | CustomSvgLayer]] = js.native
  var markers: js.UndefOr[js.Array[CartesianMarkerProps]] = js.native
  var renderNode: js.UndefOr[NodeComponent] = js.native
}

object ScatterPlotSvgProps {
  @scala.inline
  def apply(data: js.Array[Serie]): ScatterPlotSvgProps = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScatterPlotSvgProps]
  }
  @scala.inline
  implicit class ScatterPlotSvgPropsOps[Self <: ScatterPlotSvgProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLayers(value: js.Array[CustomLayerId | CustomSvgLayer]): Self = {
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
    def withMarkers(value: js.Array[CartesianMarkerProps]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("markers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMarkers: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("markers")(js.undefined)
        ret
    }
    @scala.inline
    def withRenderNode(value: /* props */ NodeProps => TagMod[Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderNode")(js.Any.fromFunction1(value))
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

