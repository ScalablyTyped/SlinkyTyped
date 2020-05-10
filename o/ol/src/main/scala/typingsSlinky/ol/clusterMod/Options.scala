package typingsSlinky.ol.clusterMod

import typingsSlinky.ol.pluggableMapMod.FrameState
import typingsSlinky.ol.sourceSourceMod.AttributionLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends js.Object {
  var attributions: js.UndefOr[AttributionLike] = js.native
  var distance: js.UndefOr[Double] = js.native
  var geometryFunction: js.UndefOr[
    js.Function1[
      /* p0 */ typingsSlinky.ol.olFeatureMod.default[typingsSlinky.ol.geometryMod.default], 
      typingsSlinky.ol.pointMod.default
    ]
  ] = js.native
  var source: js.UndefOr[typingsSlinky.ol.sourceVectorMod.default[typingsSlinky.ol.geometryMod.default]] = js.native
  var wrapX: js.UndefOr[Boolean] = js.native
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
    def withDistance(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("distance")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDistance: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("distance")(js.undefined)
        ret
    }
    @scala.inline
    def withGeometryFunction(
      value: /* p0 */ typingsSlinky.ol.olFeatureMod.default[typingsSlinky.ol.geometryMod.default] => typingsSlinky.ol.pointMod.default
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("geometryFunction")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutGeometryFunction: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("geometryFunction")(js.undefined)
        ret
    }
    @scala.inline
    def withSource(value: typingsSlinky.ol.sourceVectorMod.default[typingsSlinky.ol.geometryMod.default]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("source")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSource: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("source")(js.undefined)
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
  }
  
}

