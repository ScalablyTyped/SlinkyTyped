package typingsSlinky.babylonjs.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IMaterialSheenDefines extends js.Object {
  
  var SHEEN: Boolean = js.native
  
  var SHEEN_LINKWITHALBEDO: Boolean = js.native
  
  var SHEEN_TEXTURE: Boolean = js.native
  
  var SHEEN_TEXTUREDIRECTUV: Double = js.native
  
  /** @hidden */
  var _areTexturesDirty: Boolean = js.native
}
object IMaterialSheenDefines {
  
  @scala.inline
  def apply(
    SHEEN: Boolean,
    SHEEN_LINKWITHALBEDO: Boolean,
    SHEEN_TEXTURE: Boolean,
    SHEEN_TEXTUREDIRECTUV: Double,
    _areTexturesDirty: Boolean
  ): IMaterialSheenDefines = {
    val __obj = js.Dynamic.literal(SHEEN = SHEEN.asInstanceOf[js.Any], SHEEN_LINKWITHALBEDO = SHEEN_LINKWITHALBEDO.asInstanceOf[js.Any], SHEEN_TEXTURE = SHEEN_TEXTURE.asInstanceOf[js.Any], SHEEN_TEXTUREDIRECTUV = SHEEN_TEXTUREDIRECTUV.asInstanceOf[js.Any], _areTexturesDirty = _areTexturesDirty.asInstanceOf[js.Any])
    __obj.asInstanceOf[IMaterialSheenDefines]
  }
  
  @scala.inline
  implicit class IMaterialSheenDefinesOps[Self <: IMaterialSheenDefines] (val x: Self) extends AnyVal {
    
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
    def setSHEEN(value: Boolean): Self = this.set("SHEEN", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSHEEN_LINKWITHALBEDO(value: Boolean): Self = this.set("SHEEN_LINKWITHALBEDO", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSHEEN_TEXTURE(value: Boolean): Self = this.set("SHEEN_TEXTURE", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSHEEN_TEXTUREDIRECTUV(value: Double): Self = this.set("SHEEN_TEXTUREDIRECTUV", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_areTexturesDirty(value: Boolean): Self = this.set("_areTexturesDirty", value.asInstanceOf[js.Any])
  }
}
