package typingsSlinky.jsfl

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FlashFilter extends js.Object {
  var angle: Double = js.native
  var blurX: Double = js.native
  var blurY: Double = js.native
  var brightness: Double = js.native
  var color: js.Any = js.native
  var contrast: Double = js.native
  var distance: Double = js.native
  var enabled: Boolean = js.native
  var hideObject: Boolean = js.native
  var highlightColor: js.Any = js.native
  var hue: Double = js.native
  var inner: Boolean = js.native
  var knockout: Boolean = js.native
  var name: String = js.native
  var quality: String = js.native
  var saturation: Double = js.native
  var shadowColor: js.Any = js.native
  var strength: Double = js.native
  var `type`: String = js.native
}

object FlashFilter {
  @scala.inline
  def apply(
    angle: Double,
    blurX: Double,
    blurY: Double,
    brightness: Double,
    color: js.Any,
    contrast: Double,
    distance: Double,
    enabled: Boolean,
    hideObject: Boolean,
    highlightColor: js.Any,
    hue: Double,
    inner: Boolean,
    knockout: Boolean,
    name: String,
    quality: String,
    saturation: Double,
    shadowColor: js.Any,
    strength: Double,
    `type`: String
  ): FlashFilter = {
    val __obj = js.Dynamic.literal(angle = angle.asInstanceOf[js.Any], blurX = blurX.asInstanceOf[js.Any], blurY = blurY.asInstanceOf[js.Any], brightness = brightness.asInstanceOf[js.Any], color = color.asInstanceOf[js.Any], contrast = contrast.asInstanceOf[js.Any], distance = distance.asInstanceOf[js.Any], enabled = enabled.asInstanceOf[js.Any], hideObject = hideObject.asInstanceOf[js.Any], highlightColor = highlightColor.asInstanceOf[js.Any], hue = hue.asInstanceOf[js.Any], inner = inner.asInstanceOf[js.Any], knockout = knockout.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], quality = quality.asInstanceOf[js.Any], saturation = saturation.asInstanceOf[js.Any], shadowColor = shadowColor.asInstanceOf[js.Any], strength = strength.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[FlashFilter]
  }
  @scala.inline
  implicit class FlashFilterOps[Self <: FlashFilter] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAngle(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("angle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBlurX(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("blurX")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBlurY(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("blurY")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBrightness(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("brightness")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withColor(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("color")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withContrast(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contrast")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDistance(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("distance")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHideObject(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hideObject")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHighlightColor(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("highlightColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHue(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInner(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inner")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withKnockout(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("knockout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQuality(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("quality")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSaturation(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("saturation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withShadowColor(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shadowColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStrength(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("strength")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

