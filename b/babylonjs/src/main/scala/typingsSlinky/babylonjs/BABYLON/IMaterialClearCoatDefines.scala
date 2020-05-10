package typingsSlinky.babylonjs.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IMaterialClearCoatDefines extends js.Object {
  var CLEARCOAT: Boolean = js.native
  var CLEARCOAT_BUMP: Boolean = js.native
  var CLEARCOAT_BUMPDIRECTUV: Double = js.native
  var CLEARCOAT_DEFAULTIOR: Boolean = js.native
  var CLEARCOAT_TEXTURE: Boolean = js.native
  var CLEARCOAT_TEXTUREDIRECTUV: Double = js.native
  var CLEARCOAT_TINT: Boolean = js.native
  var CLEARCOAT_TINT_TEXTURE: Boolean = js.native
  var CLEARCOAT_TINT_TEXTUREDIRECTUV: Double = js.native
  /** @hidden */
  var _areTexturesDirty: Boolean = js.native
}

object IMaterialClearCoatDefines {
  @scala.inline
  def apply(
    CLEARCOAT: Boolean,
    CLEARCOAT_BUMP: Boolean,
    CLEARCOAT_BUMPDIRECTUV: Double,
    CLEARCOAT_DEFAULTIOR: Boolean,
    CLEARCOAT_TEXTURE: Boolean,
    CLEARCOAT_TEXTUREDIRECTUV: Double,
    CLEARCOAT_TINT: Boolean,
    CLEARCOAT_TINT_TEXTURE: Boolean,
    CLEARCOAT_TINT_TEXTUREDIRECTUV: Double,
    _areTexturesDirty: Boolean
  ): IMaterialClearCoatDefines = {
    val __obj = js.Dynamic.literal(CLEARCOAT = CLEARCOAT.asInstanceOf[js.Any], CLEARCOAT_BUMP = CLEARCOAT_BUMP.asInstanceOf[js.Any], CLEARCOAT_BUMPDIRECTUV = CLEARCOAT_BUMPDIRECTUV.asInstanceOf[js.Any], CLEARCOAT_DEFAULTIOR = CLEARCOAT_DEFAULTIOR.asInstanceOf[js.Any], CLEARCOAT_TEXTURE = CLEARCOAT_TEXTURE.asInstanceOf[js.Any], CLEARCOAT_TEXTUREDIRECTUV = CLEARCOAT_TEXTUREDIRECTUV.asInstanceOf[js.Any], CLEARCOAT_TINT = CLEARCOAT_TINT.asInstanceOf[js.Any], CLEARCOAT_TINT_TEXTURE = CLEARCOAT_TINT_TEXTURE.asInstanceOf[js.Any], CLEARCOAT_TINT_TEXTUREDIRECTUV = CLEARCOAT_TINT_TEXTUREDIRECTUV.asInstanceOf[js.Any], _areTexturesDirty = _areTexturesDirty.asInstanceOf[js.Any])
    __obj.asInstanceOf[IMaterialClearCoatDefines]
  }
  @scala.inline
  implicit class IMaterialClearCoatDefinesOps[Self <: IMaterialClearCoatDefines] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCLEARCOAT(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CLEARCOAT")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCLEARCOAT_BUMP(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CLEARCOAT_BUMP")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCLEARCOAT_BUMPDIRECTUV(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CLEARCOAT_BUMPDIRECTUV")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCLEARCOAT_DEFAULTIOR(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CLEARCOAT_DEFAULTIOR")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCLEARCOAT_TEXTURE(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CLEARCOAT_TEXTURE")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCLEARCOAT_TEXTUREDIRECTUV(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CLEARCOAT_TEXTUREDIRECTUV")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCLEARCOAT_TINT(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CLEARCOAT_TINT")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCLEARCOAT_TINT_TEXTURE(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CLEARCOAT_TINT_TEXTURE")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCLEARCOAT_TINT_TEXTUREDIRECTUV(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CLEARCOAT_TINT_TEXTUREDIRECTUV")(value.asInstanceOf[js.Any])
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

