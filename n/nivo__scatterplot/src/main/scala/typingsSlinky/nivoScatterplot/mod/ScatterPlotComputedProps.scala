package typingsSlinky.nivoScatterplot.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ScatterPlotComputedProps extends js.Object {
  var innerHeight: Double = js.native
  var innerWidth: Double = js.native
  var nodes: js.Array[Node] = js.native
  var outerHeight: Double = js.native
  var outerWidth: Double = js.native
  var xScale: Scale = js.native
  var yScale: Scale = js.native
}

object ScatterPlotComputedProps {
  @scala.inline
  def apply(
    innerHeight: Double,
    innerWidth: Double,
    nodes: js.Array[Node],
    outerHeight: Double,
    outerWidth: Double,
    xScale: /* value */ Value => Double,
    yScale: /* value */ Value => Double
  ): ScatterPlotComputedProps = {
    val __obj = js.Dynamic.literal(innerHeight = innerHeight.asInstanceOf[js.Any], innerWidth = innerWidth.asInstanceOf[js.Any], nodes = nodes.asInstanceOf[js.Any], outerHeight = outerHeight.asInstanceOf[js.Any], outerWidth = outerWidth.asInstanceOf[js.Any], xScale = js.Any.fromFunction1(xScale), yScale = js.Any.fromFunction1(yScale))
    __obj.asInstanceOf[ScatterPlotComputedProps]
  }
  @scala.inline
  implicit class ScatterPlotComputedPropsOps[Self <: ScatterPlotComputedProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withInnerHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("innerHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInnerWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("innerWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNodes(value: js.Array[Node]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nodes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOuterHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outerHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOuterWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outerWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withXScale(value: /* value */ Value => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xScale")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withYScale(value: /* value */ Value => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("yScale")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

