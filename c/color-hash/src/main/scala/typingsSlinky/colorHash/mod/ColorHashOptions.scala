package typingsSlinky.colorHash.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ColorHashOptions extends js.Object {
  var hash: js.UndefOr[HashFunction] = js.native
  var hue: js.UndefOr[Hue] = js.native
  var lightness: js.UndefOr[Lightness] = js.native
  var saturation: js.UndefOr[Saturation] = js.native
}

object ColorHashOptions {
  @scala.inline
  def apply(): ColorHashOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ColorHashOptions]
  }
  @scala.inline
  implicit class ColorHashOptionsOps[Self <: ColorHashOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHash(value: /* input */ String => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hash")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutHash: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hash")(js.undefined)
        ret
    }
    @scala.inline
    def withHue(value: Hue): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hue")(js.undefined)
        ret
    }
    @scala.inline
    def withLightness(value: Lightness): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lightness")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLightness: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lightness")(js.undefined)
        ret
    }
    @scala.inline
    def withSaturation(value: Saturation): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("saturation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSaturation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("saturation")(js.undefined)
        ret
    }
  }
  
}

