package typingsSlinky.playcanvas.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AddressU extends js.Object {
  var addressU: js.UndefOr[Double] = js.native
  var addressV: js.UndefOr[Double] = js.native
  var addressW: js.UndefOr[Double] = js.native
  var anisotropy: js.UndefOr[Double] = js.native
  var compareFunc: js.UndefOr[Double] = js.native
  var compareOnRead: js.UndefOr[Boolean] = js.native
  var cubemap: js.UndefOr[Boolean] = js.native
  var depth: js.UndefOr[Double] = js.native
  var fixCubemapSeams: js.UndefOr[Boolean] = js.native
  var flipY: js.UndefOr[Boolean] = js.native
  var format: js.UndefOr[Double] = js.native
  var height: js.UndefOr[Double] = js.native
  var magFilter: js.UndefOr[Double] = js.native
  var minFilter: js.UndefOr[Double] = js.native
  var mipmaps: js.UndefOr[Boolean] = js.native
  var premultiplyAlpha: js.UndefOr[Boolean] = js.native
  var rgbm: js.UndefOr[Boolean] = js.native
  var swizzleGGGR: js.UndefOr[Boolean] = js.native
  var volume: js.UndefOr[Boolean] = js.native
  var width: js.UndefOr[Double] = js.native
}

object AddressU {
  @scala.inline
  def apply(): AddressU = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AddressU]
  }
  @scala.inline
  implicit class AddressUOps[Self <: AddressU] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAddressU(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addressU")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAddressU: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addressU")(js.undefined)
        ret
    }
    @scala.inline
    def withAddressV(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addressV")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAddressV: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addressV")(js.undefined)
        ret
    }
    @scala.inline
    def withAddressW(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addressW")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAddressW: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addressW")(js.undefined)
        ret
    }
    @scala.inline
    def withAnisotropy(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("anisotropy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAnisotropy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("anisotropy")(js.undefined)
        ret
    }
    @scala.inline
    def withCompareFunc(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("compareFunc")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCompareFunc: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("compareFunc")(js.undefined)
        ret
    }
    @scala.inline
    def withCompareOnRead(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("compareOnRead")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCompareOnRead: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("compareOnRead")(js.undefined)
        ret
    }
    @scala.inline
    def withCubemap(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cubemap")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCubemap: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cubemap")(js.undefined)
        ret
    }
    @scala.inline
    def withDepth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("depth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDepth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("depth")(js.undefined)
        ret
    }
    @scala.inline
    def withFixCubemapSeams(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fixCubemapSeams")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFixCubemapSeams: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fixCubemapSeams")(js.undefined)
        ret
    }
    @scala.inline
    def withFlipY(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flipY")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFlipY: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flipY")(js.undefined)
        ret
    }
    @scala.inline
    def withFormat(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("format")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFormat: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("format")(js.undefined)
        ret
    }
    @scala.inline
    def withHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height")(js.undefined)
        ret
    }
    @scala.inline
    def withMagFilter(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("magFilter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMagFilter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("magFilter")(js.undefined)
        ret
    }
    @scala.inline
    def withMinFilter(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minFilter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinFilter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minFilter")(js.undefined)
        ret
    }
    @scala.inline
    def withMipmaps(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mipmaps")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMipmaps: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mipmaps")(js.undefined)
        ret
    }
    @scala.inline
    def withPremultiplyAlpha(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("premultiplyAlpha")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPremultiplyAlpha: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("premultiplyAlpha")(js.undefined)
        ret
    }
    @scala.inline
    def withRgbm(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rgbm")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRgbm: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rgbm")(js.undefined)
        ret
    }
    @scala.inline
    def withSwizzleGGGR(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("swizzleGGGR")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSwizzleGGGR: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("swizzleGGGR")(js.undefined)
        ret
    }
    @scala.inline
    def withVolume(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("volume")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVolume: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("volume")(js.undefined)
        ret
    }
    @scala.inline
    def withWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(js.undefined)
        ret
    }
  }
  
}

