package typingsSlinky.bingmaps.Microsoft.Maps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IAnimatedTileLayerOptions extends js.Object {
  /** A boolean that specifies whether the animation should auto-start when it is added to the map or not. Default: true **/
  var autoPlay: js.UndefOr[Boolean] = js.native
  /** The number of miliseconds between two layer frames. Default: 1000 **/
  var frameRate: js.UndefOr[Double] = js.native
  /** A custom loading screen to show on the map when the map tiles are being fetched. **/
  var loadingScreen: js.UndefOr[CustomOverlay] = js.native
  /** The max amount of total loading time of all tiles in a viewport in milliseconds. Default: 15000 **/
  var maxTotalLoadTime: js.UndefOr[Double] = js.native
  /** The array of tile layer sources to animate through. **/
  var mercator: js.Array[TileSource] = js.native
  /** A boolean specifying if the animated tile layer is visible or not. **/
  var visible: js.UndefOr[Boolean] = js.native
}

object IAnimatedTileLayerOptions {
  @scala.inline
  def apply(mercator: js.Array[TileSource]): IAnimatedTileLayerOptions = {
    val __obj = js.Dynamic.literal(mercator = mercator.asInstanceOf[js.Any])
    __obj.asInstanceOf[IAnimatedTileLayerOptions]
  }
  @scala.inline
  implicit class IAnimatedTileLayerOptionsOps[Self <: IAnimatedTileLayerOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMercator(value: js.Array[TileSource]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mercator")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAutoPlay(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoPlay")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoPlay: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoPlay")(js.undefined)
        ret
    }
    @scala.inline
    def withFrameRate(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("frameRate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFrameRate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("frameRate")(js.undefined)
        ret
    }
    @scala.inline
    def withLoadingScreen(value: CustomOverlay): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loadingScreen")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLoadingScreen: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loadingScreen")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxTotalLoadTime(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxTotalLoadTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxTotalLoadTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxTotalLoadTime")(js.undefined)
        ret
    }
    @scala.inline
    def withVisible(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visible")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVisible: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visible")(js.undefined)
        ret
    }
  }
  
}

