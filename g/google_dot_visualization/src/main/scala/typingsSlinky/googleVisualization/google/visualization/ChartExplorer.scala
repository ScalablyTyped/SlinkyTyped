package typingsSlinky.googleVisualization.google.visualization

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ChartExplorer extends js.Object {
  var actions: js.UndefOr[js.Array[String]] = js.native
  var axis: js.UndefOr[String] = js.native
  var keepInBounds: js.UndefOr[Boolean] = js.native
  var maxZoomIn: js.UndefOr[Double] = js.native
  var maxZoomOut: js.UndefOr[Double] = js.native
  var zoomDelta: js.UndefOr[Double] = js.native
}

object ChartExplorer {
  @scala.inline
  def apply(): ChartExplorer = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChartExplorer]
  }
  @scala.inline
  implicit class ChartExplorerOps[Self <: ChartExplorer] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withActions(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("actions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutActions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("actions")(js.undefined)
        ret
    }
    @scala.inline
    def withAxis(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("axis")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAxis: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("axis")(js.undefined)
        ret
    }
    @scala.inline
    def withKeepInBounds(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keepInBounds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKeepInBounds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keepInBounds")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxZoomIn(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxZoomIn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxZoomIn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxZoomIn")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxZoomOut(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxZoomOut")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxZoomOut: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxZoomOut")(js.undefined)
        ret
    }
    @scala.inline
    def withZoomDelta(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zoomDelta")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutZoomDelta: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zoomDelta")(js.undefined)
        ret
    }
  }
  
}

