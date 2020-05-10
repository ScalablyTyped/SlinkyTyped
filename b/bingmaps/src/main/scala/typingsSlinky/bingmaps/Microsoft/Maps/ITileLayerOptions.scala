package typingsSlinky.bingmaps.Microsoft.Maps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ITileLayerOptions extends js.Object {
  /**
    * The number of milliseconds allowed for the tile layer image download. If the timeout occurs before the image is fully
    * downloaded, the map control considers the download a failure. The default value is 10000.
    */
  var downloadTimeout: js.UndefOr[Double] = js.native
  /** Allow retrieving data from CORS supported server. */
  var enableCORS: js.UndefOr[Boolean] = js.native
  /** The tile source for the tile layer. */
  var mercator: js.UndefOr[TileSource] = js.native
  /** The opacity of the tile layer, defined by a number between 0 (not visible) and 1. */
  var opacity: js.UndefOr[Double] = js.native
  /** Specifies that CORS should be made with the "use-credentials" flag instead of "anonymous". */
  var useCredentialsForCORS: js.UndefOr[Boolean] = js.native
  /**
    * A boolean indicating whether to show or hide the tile layer. The default value is true. A value of false indicates that
    * the tile layer is hidden, although it is still an entity on the map.
    */
  var visible: js.UndefOr[Boolean] = js.native
  /** The z-index of the tile layer. */
  var zIndex: js.UndefOr[Double] = js.native
}

object ITileLayerOptions {
  @scala.inline
  def apply(): ITileLayerOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ITileLayerOptions]
  }
  @scala.inline
  implicit class ITileLayerOptionsOps[Self <: ITileLayerOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDownloadTimeout(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("downloadTimeout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDownloadTimeout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("downloadTimeout")(js.undefined)
        ret
    }
    @scala.inline
    def withEnableCORS(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableCORS")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableCORS: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableCORS")(js.undefined)
        ret
    }
    @scala.inline
    def withMercator(value: TileSource): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mercator")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMercator: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mercator")(js.undefined)
        ret
    }
    @scala.inline
    def withOpacity(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("opacity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOpacity: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("opacity")(js.undefined)
        ret
    }
    @scala.inline
    def withUseCredentialsForCORS(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useCredentialsForCORS")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUseCredentialsForCORS: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useCredentialsForCORS")(js.undefined)
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
    @scala.inline
    def withZIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutZIndex: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zIndex")(js.undefined)
        ret
    }
  }
  
}

