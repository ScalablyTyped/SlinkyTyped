package typingsSlinky.babylonjs.pbrClearCoatConfigurationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCLEARCOAT(value: Boolean): Self = this.set("CLEARCOAT", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCLEARCOAT_BUMP(value: Boolean): Self = this.set("CLEARCOAT_BUMP", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCLEARCOAT_BUMPDIRECTUV(value: Double): Self = this.set("CLEARCOAT_BUMPDIRECTUV", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCLEARCOAT_DEFAULTIOR(value: Boolean): Self = this.set("CLEARCOAT_DEFAULTIOR", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCLEARCOAT_TEXTURE(value: Boolean): Self = this.set("CLEARCOAT_TEXTURE", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCLEARCOAT_TEXTUREDIRECTUV(value: Double): Self = this.set("CLEARCOAT_TEXTUREDIRECTUV", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCLEARCOAT_TINT(value: Boolean): Self = this.set("CLEARCOAT_TINT", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCLEARCOAT_TINT_TEXTURE(value: Boolean): Self = this.set("CLEARCOAT_TINT_TEXTURE", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCLEARCOAT_TINT_TEXTUREDIRECTUV(value: Double): Self = this.set("CLEARCOAT_TINT_TEXTUREDIRECTUV", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_areTexturesDirty(value: Boolean): Self = this.set("_areTexturesDirty", value.asInstanceOf[js.Any])
  }
}
