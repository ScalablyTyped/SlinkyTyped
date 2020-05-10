package typingsSlinky.heremaps.H.map.provider.TileProvider

import typingsSlinky.heremaps.H.geo.Rect
import typingsSlinky.heremaps.H.map.ICopyright
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @property uri {string=} - The provider&#x27;s unique resource identifier which must not contain an underscore &quot;_&quot;. If omitted an auto-generated unique Session ID is used.
  * If a cross sessions consistent IDs is needed (e.g. for storing provider data) this property must be specified.
  * @property min {number=} - The minimal supported zoom level, default is 0
  * @property max {number=} - The maximal supported zoom level, default is 22
  * @property getCopyrights {(function(H.geo.Rect, number): Array<H.map.ICopyright>)=} - A function to replace the default implememtation of H.map.provider.Provider#getCopyrights
  * @property tileSize {number=} - The size of a tile as edge length in pixels. It must be 2^n where n is in range [0 ... 30], default is 256
  */
@js.native
trait Options extends js.Object {
  var getCopyrights: js.UndefOr[js.Function2[/* rect */ Rect, /* number */ Double, js.Array[ICopyright]]] = js.native
  var max: js.UndefOr[Double] = js.native
  var min: js.UndefOr[Double] = js.native
  var tileSize: js.UndefOr[Double] = js.native
  var uri: js.UndefOr[String] = js.native
}

object Options {
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGetCopyrights(value: (/* rect */ Rect, /* number */ Double) => js.Array[ICopyright]): Self = {
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

