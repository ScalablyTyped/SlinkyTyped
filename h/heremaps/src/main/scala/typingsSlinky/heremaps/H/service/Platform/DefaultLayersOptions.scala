package typingsSlinky.heremaps.H.service.Platform

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Options used to create default layers
  * @property tileSize {number=} - tile size to be queried from the HERE Map Tile API, default is 256
  * @property ppi {number=} - 'ppi' parameter to use when querying tiles, default is not specified
  * @property lg {string=} - optional primary language parameter, default is not specified
  * @property lg2 {string=} - optional secondary language parameter, default is not specified
  * @property style {string=} - optional 'style' parameter to use when querying map tiles, default is not specified
  * @property pois {boolean=} - indicates if pois are displayed on the map
  * @property crossOrigin {(string | boolean=)} - indicates if CORS headers should be used for default layers, if false is specified, CORS headers are not set, defaults to 'anonymous'.
  * Be aware that storing of content is not possible if crossOrigin is not set to true (see H.Map#storeContent).
  */
@js.native
trait DefaultLayersOptions extends js.Object {
  var crossOrigin: js.UndefOr[String | Boolean] = js.native
  var lg: js.UndefOr[String] = js.native
  var lg2: js.UndefOr[String] = js.native
  var pois: js.UndefOr[Boolean] = js.native
  var ppi: js.UndefOr[Double] = js.native
  var style: js.UndefOr[String] = js.native
  var tileSize: js.UndefOr[Double] = js.native
}

object DefaultLayersOptions {
  @scala.inline
  def apply(): DefaultLayersOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DefaultLayersOptions]
  }
  @scala.inline
  implicit class DefaultLayersOptionsOps[Self <: DefaultLayersOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCrossOrigin(value: String | Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("crossOrigin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCrossOrigin: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("crossOrigin")(js.undefined)
        ret
    }
    @scala.inline
    def withLg(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lg")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLg: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lg")(js.undefined)
        ret
    }
    @scala.inline
    def withLg2(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lg2")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLg2: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lg2")(js.undefined)
        ret
    }
    @scala.inline
    def withPois(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pois")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPois: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pois")(js.undefined)
        ret
    }
    @scala.inline
    def withPpi(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ppi")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPpi: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ppi")(js.undefined)
        ret
    }
    @scala.inline
    def withStyle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("style")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("style")(js.undefined)
        ret
    }
    @scala.inline
    def withTileSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tileSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTileSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tileSize")(js.undefined)
        ret
    }
  }
  
}

