package typingsSlinky.reactImgix.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RotationParams extends StObject {
  
  var flip: js.UndefOr[ImgixParamType] = js.native
  
  var orient: js.UndefOr[ImgixParamType] = js.native
  
  var rot: js.UndefOr[ImgixParamType] = js.native
}
object RotationParams {
  
  @scala.inline
  def apply(): RotationParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RotationParams]
  }
  
  @scala.inline
  implicit class RotationParamsMutableBuilder[Self <: RotationParams] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFlip(value: ImgixParamType): Self = StObject.set(x, "flip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFlipUndefined: Self = StObject.set(x, "flip", js.undefined)
    
    @scala.inline
    def setOrient(value: ImgixParamType): Self = StObject.set(x, "orient", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrientUndefined: Self = StObject.set(x, "orient", js.undefined)
    
    @scala.inline
    def setRot(value: ImgixParamType): Self = StObject.set(x, "rot", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRotUndefined: Self = StObject.set(x, "rot", js.undefined)
  }
}
