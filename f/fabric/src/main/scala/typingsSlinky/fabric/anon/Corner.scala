package typingsSlinky.fabric.anon

import typingsSlinky.fabric.fabricImplMod.Object
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Corner extends StObject {
  
  var corner: String = js.native
  
  var originX: String = js.native
  
  var originY: String = js.native
  
  var original: Object = js.native
  
  var width: Double = js.native
}
object Corner {
  
  @scala.inline
  def apply(corner: String, originX: String, originY: String, original: Object, width: Double): Corner = {
    val __obj = js.Dynamic.literal(corner = corner.asInstanceOf[js.Any], originX = originX.asInstanceOf[js.Any], originY = originY.asInstanceOf[js.Any], original = original.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[Corner]
  }
  
  @scala.inline
  implicit class CornerMutableBuilder[Self <: Corner] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCorner(value: String): Self = StObject.set(x, "corner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOriginX(value: String): Self = StObject.set(x, "originX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOriginY(value: String): Self = StObject.set(x, "originY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOriginal(value: Object): Self = StObject.set(x, "original", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
  }
}
