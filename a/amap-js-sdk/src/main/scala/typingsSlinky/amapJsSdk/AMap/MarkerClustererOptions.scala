package typingsSlinky.amapJsSdk.AMap

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MarkerClustererOptions extends js.Object {
  var averageCenter: js.UndefOr[Boolean] = js.native
  var gridSize: js.UndefOr[Double] = js.native
  var maxZoom: js.UndefOr[Double] = js.native
  var minClusterSize: js.UndefOr[Double] = js.native
  var renderCluserMarker: js.UndefOr[js.Function1[/* obj */ js.Any, Unit]] = js.native
  var styles: js.UndefOr[js.Array[_]] = js.native
  var zoomOnClick: js.UndefOr[Boolean] = js.native
}

object MarkerClustererOptions {
  @scala.inline
  def apply(): MarkerClustererOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MarkerClustererOptions]
  }
  @scala.inline
  implicit class MarkerClustererOptionsOps[Self <: MarkerClustererOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAverageCenter(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("averageCenter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAverageCenter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("averageCenter")(js.undefined)
        ret
    }
    @scala.inline
    def withGridSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gridSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGridSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gridSize")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxZoom(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxZoom")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxZoom: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxZoom")(js.undefined)
        ret
    }
    @scala.inline
    def withMinClusterSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minClusterSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinClusterSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minClusterSize")(js.undefined)
        ret
    }
    @scala.inline
    def withRenderCluserMarker(value: /* obj */ js.Any => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderCluserMarker")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutRenderCluserMarker: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderCluserMarker")(js.undefined)
        ret
    }
    @scala.inline
    def withStyles(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("styles")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStyles: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("styles")(js.undefined)
        ret
    }
    @scala.inline
    def withZoomOnClick(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zoomOnClick")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutZoomOnClick: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zoomOnClick")(js.undefined)
        ret
    }
  }
  
}

