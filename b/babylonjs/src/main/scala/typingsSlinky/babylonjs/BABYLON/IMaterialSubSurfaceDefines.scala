package typingsSlinky.babylonjs.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IMaterialSubSurfaceDefines extends js.Object {
  var SS_GAMMAREFRACTION: Boolean = js.native
  var SS_LINEARSPECULARREFRACTION: Boolean = js.native
  var SS_LINKREFRACTIONTOTRANSPARENCY: Boolean = js.native
  var SS_LODINREFRACTIONALPHA: Boolean = js.native
  var SS_MASK_FROM_THICKNESS_TEXTURE: Boolean = js.native
  var SS_REFRACTION: Boolean = js.native
  var SS_REFRACTIONMAP_3D: Boolean = js.native
  var SS_REFRACTIONMAP_OPPOSITEZ: Boolean = js.native
  var SS_RGBDREFRACTION: Boolean = js.native
  var SS_SCATERRING: Boolean = js.native
  var SS_THICKNESSANDMASK_TEXTURE: Boolean = js.native
  var SS_THICKNESSANDMASK_TEXTUREDIRECTUV: Double = js.native
  var SS_TRANSLUCENCY: Boolean = js.native
  var SUBSURFACE: Boolean = js.native
  /** @hidden */
  var _areTexturesDirty: Boolean = js.native
}

object IMaterialSubSurfaceDefines {
  @scala.inline
  def apply(
    SS_GAMMAREFRACTION: Boolean,
    SS_LINEARSPECULARREFRACTION: Boolean,
    SS_LINKREFRACTIONTOTRANSPARENCY: Boolean,
    SS_LODINREFRACTIONALPHA: Boolean,
    SS_MASK_FROM_THICKNESS_TEXTURE: Boolean,
    SS_REFRACTION: Boolean,
    SS_REFRACTIONMAP_3D: Boolean,
    SS_REFRACTIONMAP_OPPOSITEZ: Boolean,
    SS_RGBDREFRACTION: Boolean,
    SS_SCATERRING: Boolean,
    SS_THICKNESSANDMASK_TEXTURE: Boolean,
    SS_THICKNESSANDMASK_TEXTUREDIRECTUV: Double,
    SS_TRANSLUCENCY: Boolean,
    SUBSURFACE: Boolean,
    _areTexturesDirty: Boolean
  ): IMaterialSubSurfaceDefines = {
    val __obj = js.Dynamic.literal(SS_GAMMAREFRACTION = SS_GAMMAREFRACTION.asInstanceOf[js.Any], SS_LINEARSPECULARREFRACTION = SS_LINEARSPECULARREFRACTION.asInstanceOf[js.Any], SS_LINKREFRACTIONTOTRANSPARENCY = SS_LINKREFRACTIONTOTRANSPARENCY.asInstanceOf[js.Any], SS_LODINREFRACTIONALPHA = SS_LODINREFRACTIONALPHA.asInstanceOf[js.Any], SS_MASK_FROM_THICKNESS_TEXTURE = SS_MASK_FROM_THICKNESS_TEXTURE.asInstanceOf[js.Any], SS_REFRACTION = SS_REFRACTION.asInstanceOf[js.Any], SS_REFRACTIONMAP_3D = SS_REFRACTIONMAP_3D.asInstanceOf[js.Any], SS_REFRACTIONMAP_OPPOSITEZ = SS_REFRACTIONMAP_OPPOSITEZ.asInstanceOf[js.Any], SS_RGBDREFRACTION = SS_RGBDREFRACTION.asInstanceOf[js.Any], SS_SCATERRING = SS_SCATERRING.asInstanceOf[js.Any], SS_THICKNESSANDMASK_TEXTURE = SS_THICKNESSANDMASK_TEXTURE.asInstanceOf[js.Any], SS_THICKNESSANDMASK_TEXTUREDIRECTUV = SS_THICKNESSANDMASK_TEXTUREDIRECTUV.asInstanceOf[js.Any], SS_TRANSLUCENCY = SS_TRANSLUCENCY.asInstanceOf[js.Any], SUBSURFACE = SUBSURFACE.asInstanceOf[js.Any], _areTexturesDirty = _areTexturesDirty.asInstanceOf[js.Any])
    __obj.asInstanceOf[IMaterialSubSurfaceDefines]
  }
  @scala.inline
  implicit class IMaterialSubSurfaceDefinesOps[Self <: IMaterialSubSurfaceDefines] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSS_GAMMAREFRACTION(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SS_GAMMAREFRACTION")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSS_LINEARSPECULARREFRACTION(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SS_LINEARSPECULARREFRACTION")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSS_LINKREFRACTIONTOTRANSPARENCY(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SS_LINKREFRACTIONTOTRANSPARENCY")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSS_LODINREFRACTIONALPHA(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SS_LODINREFRACTIONALPHA")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSS_MASK_FROM_THICKNESS_TEXTURE(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SS_MASK_FROM_THICKNESS_TEXTURE")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSS_REFRACTION(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SS_REFRACTION")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSS_REFRACTIONMAP_3D(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SS_REFRACTIONMAP_3D")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSS_REFRACTIONMAP_OPPOSITEZ(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SS_REFRACTIONMAP_OPPOSITEZ")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSS_RGBDREFRACTION(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SS_RGBDREFRACTION")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSS_SCATERRING(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SS_SCATERRING")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSS_THICKNESSANDMASK_TEXTURE(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SS_THICKNESSANDMASK_TEXTURE")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSS_THICKNESSANDMASK_TEXTUREDIRECTUV(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SS_THICKNESSANDMASK_TEXTUREDIRECTUV")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSS_TRANSLUCENCY(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SS_TRANSLUCENCY")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSUBSURFACE(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SUBSURFACE")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_areTexturesDirty(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_areTexturesDirty")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

