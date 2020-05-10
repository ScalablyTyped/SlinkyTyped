package typingsSlinky.pixiJs

import typingsSlinky.pixiJs.PIXI.ALPHA_MODES
import typingsSlinky.pixiJs.PIXI.FORMATS
import typingsSlinky.pixiJs.PIXI.MIPMAP_MODES
import typingsSlinky.pixiJs.PIXI.SCALE_MODES
import typingsSlinky.pixiJs.PIXI.TARGETS
import typingsSlinky.pixiJs.PIXI.TYPES
import typingsSlinky.pixiJs.PIXI.WRAP_MODES
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonAlphaMode extends js.Object {
  var alphaMode: js.UndefOr[ALPHA_MODES] = js.native
  var anisotropicLevel: js.UndefOr[Double] = js.native
  var format: js.UndefOr[FORMATS] = js.native
  var height: js.UndefOr[Double] = js.native
  var mipmap: js.UndefOr[MIPMAP_MODES] = js.native
  var resolution: js.UndefOr[Double] = js.native
  var resourceOptions: js.UndefOr[js.Any] = js.native
  var scaleMode: js.UndefOr[SCALE_MODES] = js.native
  var target: js.UndefOr[TARGETS] = js.native
  var `type`: js.UndefOr[TYPES] = js.native
  var width: js.UndefOr[Double] = js.native
  var wrapMode: js.UndefOr[WRAP_MODES] = js.native
}

object AnonAlphaMode {
  @scala.inline
  def apply(): AnonAlphaMode = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonAlphaMode]
  }
  @scala.inline
  implicit class AnonAlphaModeOps[Self <: AnonAlphaMode] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAlphaMode(value: ALPHA_MODES): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alphaMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAlphaMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alphaMode")(js.undefined)
        ret
    }
    @scala.inline
    def withAnisotropicLevel(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("anisotropicLevel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAnisotropicLevel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("anisotropicLevel")(js.undefined)
        ret
    }
    @scala.inline
    def withFormat(value: FORMATS): Self = {
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
    def withMipmap(value: MIPMAP_MODES): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mipmap")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMipmap: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mipmap")(js.undefined)
        ret
    }
    @scala.inline
    def withResolution(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resolution")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResolution: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resolution")(js.undefined)
        ret
    }
    @scala.inline
    def withResourceOptions(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resourceOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResourceOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resourceOptions")(js.undefined)
        ret
    }
    @scala.inline
    def withScaleMode(value: SCALE_MODES): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scaleMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScaleMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scaleMode")(js.undefined)
        ret
    }
    @scala.inline
    def withTarget(value: TARGETS): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("target")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTarget: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("target")(js.undefined)
        ret
    }
    @scala.inline
    def withType(value: TYPES): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(js.undefined)
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
    @scala.inline
    def withWrapMode(value: WRAP_MODES): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wrapMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWrapMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wrapMode")(js.undefined)
        ret
    }
  }
  
}

