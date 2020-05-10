package typingsSlinky.ol.sourceTileMod

import typingsSlinky.ol.pluggableMapMod.FrameState
import typingsSlinky.ol.projMod.ProjectionLike
import typingsSlinky.ol.sourceSourceMod.AttributionLike
import typingsSlinky.ol.stateMod.State
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends js.Object {
  var attributions: js.UndefOr[AttributionLike] = js.native
  var attributionsCollapsible: js.UndefOr[Boolean] = js.native
  var cacheSize: js.UndefOr[Double] = js.native
  var key: js.UndefOr[String] = js.native
  var opaque: js.UndefOr[Boolean] = js.native
  var projection: js.UndefOr[ProjectionLike] = js.native
  var state: js.UndefOr[State] = js.native
  var tileGrid: js.UndefOr[typingsSlinky.ol.tilegridTileGridMod.default] = js.native
  var tilePixelRatio: js.UndefOr[Double] = js.native
  var transition: js.UndefOr[Double] = js.native
  var wrapX: js.UndefOr[Boolean] = js.native
  var zDirection: js.UndefOr[Double] = js.native
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
    def withAttributionsFunction1(value: /* p0 */ FrameState => String | js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attributions")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withAttributions(value: AttributionLike): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attributions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAttributions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attributions")(js.undefined)
        ret
    }
    @scala.inline
    def withAttributionsCollapsible(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attributionsCollapsible")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAttributionsCollapsible: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attributionsCollapsible")(js.undefined)
        ret
    }
    @scala.inline
    def withCacheSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cacheSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCacheSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cacheSize")(js.undefined)
        ret
    }
    @scala.inline
    def withKey(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("key")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("key")(js.undefined)
        ret
    }
    @scala.inline
    def withOpaque(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("opaque")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOpaque: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("opaque")(js.undefined)
        ret
    }
    @scala.inline
    def withProjection(value: ProjectionLike): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("projection")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProjection: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("projection")(js.undefined)
        ret
    }
    @scala.inline
    def withState(value: State): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("state")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutState: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("state")(js.undefined)
        ret
    }
    @scala.inline
    def withTileGrid(value: typingsSlinky.ol.tilegridTileGridMod.default): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tileGrid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTileGrid: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tileGrid")(js.undefined)
        ret
    }
    @scala.inline
    def withTilePixelRatio(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tilePixelRatio")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTilePixelRatio: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tilePixelRatio")(js.undefined)
        ret
    }
    @scala.inline
    def withTransition(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTransition: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transition")(js.undefined)
        ret
    }
    @scala.inline
    def withWrapX(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wrapX")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWrapX: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wrapX")(js.undefined)
        ret
    }
    @scala.inline
    def withZDirection(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zDirection")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutZDirection: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zDirection")(js.undefined)
        ret
    }
  }
  
}

