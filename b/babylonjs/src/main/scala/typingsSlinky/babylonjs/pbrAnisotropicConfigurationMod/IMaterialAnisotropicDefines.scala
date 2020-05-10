package typingsSlinky.babylonjs.pbrAnisotropicConfigurationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IMaterialAnisotropicDefines extends js.Object {
  var ANISOTROPIC: Boolean = js.native
  var ANISOTROPIC_TEXTURE: Boolean = js.native
  var ANISOTROPIC_TEXTUREDIRECTUV: Double = js.native
  var MAINUV1: Boolean = js.native
  var _areTexturesDirty: Boolean = js.native
  var _needUVs: Boolean = js.native
}

object IMaterialAnisotropicDefines {
  @scala.inline
  def apply(
    ANISOTROPIC: Boolean,
    ANISOTROPIC_TEXTURE: Boolean,
    ANISOTROPIC_TEXTUREDIRECTUV: Double,
    MAINUV1: Boolean,
    _areTexturesDirty: Boolean,
    _needUVs: Boolean
  ): IMaterialAnisotropicDefines = {
    val __obj = js.Dynamic.literal(ANISOTROPIC = ANISOTROPIC.asInstanceOf[js.Any], ANISOTROPIC_TEXTURE = ANISOTROPIC_TEXTURE.asInstanceOf[js.Any], ANISOTROPIC_TEXTUREDIRECTUV = ANISOTROPIC_TEXTUREDIRECTUV.asInstanceOf[js.Any], MAINUV1 = MAINUV1.asInstanceOf[js.Any], _areTexturesDirty = _areTexturesDirty.asInstanceOf[js.Any], _needUVs = _needUVs.asInstanceOf[js.Any])
    __obj.asInstanceOf[IMaterialAnisotropicDefines]
  }
  @scala.inline
  implicit class IMaterialAnisotropicDefinesOps[Self <: IMaterialAnisotropicDefines] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withANISOTROPIC(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ANISOTROPIC")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withANISOTROPIC_TEXTURE(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ANISOTROPIC_TEXTURE")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withANISOTROPIC_TEXTUREDIRECTUV(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ANISOTROPIC_TEXTUREDIRECTUV")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMAINUV1(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MAINUV1")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_areTexturesDirty(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_areTexturesDirty")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_needUVs(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_needUVs")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

