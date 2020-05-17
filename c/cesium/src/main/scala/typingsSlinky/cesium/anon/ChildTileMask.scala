package typingsSlinky.cesium.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ChildTileMask extends js.Object {
  var buffer: js.typedarray.ArrayBuffer = js.native
  var childTileMask: js.UndefOr[Double] = js.native
  var createdByUpsampling: js.UndefOr[Boolean] = js.native
  var credits: js.UndefOr[js.Array[typingsSlinky.cesium.mod.Credit]] = js.native
  var negativeAltitudeExponentBias: Double = js.native
  var negativeElevationThreshold: Double = js.native
}

object ChildTileMask {
  @scala.inline
  def apply(
    buffer: js.typedarray.ArrayBuffer,
    negativeAltitudeExponentBias: Double,
    negativeElevationThreshold: Double
  ): ChildTileMask = {
    val __obj = js.Dynamic.literal(buffer = buffer.asInstanceOf[js.Any], negativeAltitudeExponentBias = negativeAltitudeExponentBias.asInstanceOf[js.Any], negativeElevationThreshold = negativeElevationThreshold.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChildTileMask]
  }
  @scala.inline
  implicit class ChildTileMaskOps[Self <: ChildTileMask] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBuffer(value: js.typedarray.ArrayBuffer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buffer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNegativeAltitudeExponentBias(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("negativeAltitudeExponentBias")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNegativeElevationThreshold(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("negativeElevationThreshold")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withChildTileMask(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("childTileMask")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChildTileMask: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("childTileMask")(js.undefined)
        ret
    }
    @scala.inline
    def withCreatedByUpsampling(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createdByUpsampling")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCreatedByUpsampling: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createdByUpsampling")(js.undefined)
        ret
    }
    @scala.inline
    def withCredits(value: js.Array[typingsSlinky.cesium.mod.Credit]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("credits")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCredits: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("credits")(js.undefined)
        ret
    }
  }
  
}

