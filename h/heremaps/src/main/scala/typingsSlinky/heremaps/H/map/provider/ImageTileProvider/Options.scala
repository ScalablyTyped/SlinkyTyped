package typingsSlinky.heremaps.H.map.provider.ImageTileProvider

import typingsSlinky.heremaps.H.geo.Rect
import typingsSlinky.heremaps.H.map.ICopyright
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Options to initialize an ImageTileProvider instance
  * @property uri {string=} - The provider's unique resource identifier which must not contain an underscore "_". If omitted an auto-generated unique Session ID is used. If a cross
  * sessions consistent IDs is needed (e.g. for storing provider data) this property must be specified.
  * @property min {number=} - The minimal supported zoom level, default is 0
  * @property max {number=} - The maximal supported zoom level, default is 22
  * @property getCopyrights {(function(H.geo.Rect, number): ?Array<H.map.ICopyright>)=} - A function to replace the default implementation of H.map.provider.Provider#getCopyrights
  * @property tileSize {number=} - The size of a tile as edge length in pixels. It must be 2^n where n is in range [0 ... 30], default is 256
  * @property getURL {function(number, number, number)} - The function to create an URL for the specified tile. If it returns a falsy the tile is not requested.
  * @property crossOrigin {(string | boolean=)} - The CORS settings to use for the crossOrigin attribute for the image, if omitted or if the value evaluates to false no CORS settings
  * are used.
  */
@js.native
trait Options extends js.Object {
  var crossOrigin: js.UndefOr[String | Boolean] = js.native
  var getCopyrights: js.UndefOr[js.Function2[/* rect */ Rect, /* n */ Double, js.Array[ICopyright]]] = js.native
  var max: js.UndefOr[Double] = js.native
  var min: js.UndefOr[Double] = js.native
  var tileSize: js.UndefOr[Double] = js.native
  var uri: js.UndefOr[String] = js.native
  def getURL(n1: Double, n2: Double, n3: Double): String = js.native
}

object Options {
  @scala.inline
  def apply(getURL: (Double, Double, Double) => String): Options = {
    val __obj = js.Dynamic.literal(getURL = js.Any.fromFunction3(getURL))
    __obj.asInstanceOf[Options]
  }
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGetURL(value: (Double, Double, Double) => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getURL")(js.Any.fromFunction3(value))
        ret
    }
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
    def withGetCopyrights(value: (/* rect */ Rect, /* n */ Double) => js.Array[ICopyright]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getCopyrights")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutGetCopyrights: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getCopyrights")(js.undefined)
        ret
    }
    @scala.inline
    def withMax(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("max")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMax: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("max")(js.undefined)
        ret
    }
    @scala.inline
    def withMin(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("min")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMin: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("min")(js.undefined)
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
    @scala.inline
    def withUri(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uri")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUri: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uri")(js.undefined)
        ret
    }
  }
  
}

