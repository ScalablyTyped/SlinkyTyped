package typingsSlinky.d3Graphviz.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GraphvizOptions extends js.Object {
  var convertEqualSidedPolygons: js.UndefOr[Boolean] = js.native
  var engine: js.UndefOr[Engine] = js.native
  var fade: js.UndefOr[Boolean] = js.native
  var fit: js.UndefOr[Boolean] = js.native
  var growEnteringEdges: js.UndefOr[Boolean] = js.native
  var height: js.UndefOr[Double] = js.native
  var keyMode: js.UndefOr[KeyMode] = js.native
  var scale: js.UndefOr[Double] = js.native
  var totalMemory: js.UndefOr[Double] = js.native
  var tweenPaths: js.UndefOr[Boolean] = js.native
  var tweenPrecision: js.UndefOr[Double | String] = js.native
  var tweenShapes: js.UndefOr[Boolean] = js.native
  var useWorker: js.UndefOr[Boolean] = js.native
  var width: js.UndefOr[Double] = js.native
  var zoom: js.UndefOr[Boolean] = js.native
  var zoomScaleExtent: js.UndefOr[js.Tuple2[Double, Double]] = js.native
  var zoomTranslateExtent: js.UndefOr[js.Tuple2[js.Tuple2[Double, Double], js.Tuple2[Double, Double]]] = js.native
}

object GraphvizOptions {
  @scala.inline
  def apply(): GraphvizOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GraphvizOptions]
  }
  @scala.inline
  implicit class GraphvizOptionsOps[Self <: GraphvizOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withConvertEqualSidedPolygons(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("convertEqualSidedPolygons")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConvertEqualSidedPolygons: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("convertEqualSidedPolygons")(js.undefined)
        ret
    }
    @scala.inline
    def withEngine(value: Engine): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("engine")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEngine: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("engine")(js.undefined)
        ret
    }
    @scala.inline
    def withFade(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fade")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFade: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fade")(js.undefined)
        ret
    }
    @scala.inline
    def withFit(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fit")(js.undefined)
        ret
    }
    @scala.inline
    def withGrowEnteringEdges(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("growEnteringEdges")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGrowEnteringEdges: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("growEnteringEdges")(js.undefined)
        ret
    }
    @scala.inline
    def withHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height")(js.undefined)
        ret
    }
    @scala.inline
    def withKeyMode(value: KeyMode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keyMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKeyMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keyMode")(js.undefined)
        ret
    }
    @scala.inline
    def withScale(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scale")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScale: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scale")(js.undefined)
        ret
    }
    @scala.inline
    def withTotalMemory(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("totalMemory")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTotalMemory: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("totalMemory")(js.undefined)
        ret
    }
    @scala.inline
    def withTweenPaths(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tweenPaths")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTweenPaths: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tweenPaths")(js.undefined)
        ret
    }
    @scala.inline
    def withTweenPrecision(value: Double | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tweenPrecision")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTweenPrecision: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tweenPrecision")(js.undefined)
        ret
    }
    @scala.inline
    def withTweenShapes(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tweenShapes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTweenShapes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tweenShapes")(js.undefined)
        ret
    }
    @scala.inline
    def withUseWorker(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useWorker")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUseWorker: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useWorker")(js.undefined)
        ret
    }
    @scala.inline
    def withWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(js.undefined)
        ret
    }
    @scala.inline
    def withZoom(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zoom")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutZoom: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zoom")(js.undefined)
        ret
    }
    @scala.inline
    def withZoomScaleExtent(value: js.Tuple2[Double, Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zoomScaleExtent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutZoomScaleExtent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zoomScaleExtent")(js.undefined)
        ret
    }
    @scala.inline
    def withZoomTranslateExtent(value: js.Tuple2[js.Tuple2[Double, Double], js.Tuple2[Double, Double]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zoomTranslateExtent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutZoomTranslateExtent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zoomTranslateExtent")(js.undefined)
        ret
    }
  }
  
}

