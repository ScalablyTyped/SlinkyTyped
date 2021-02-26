package typingsSlinky.phonegap

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CameraMediaTypeObject extends StObject {
  
  var ALLMEDIA: Double = js.native
  
  var PICTURE: Double = js.native
  
  var VIDEO: Double = js.native
}
object CameraMediaTypeObject {
  
  @scala.inline
  def apply(ALLMEDIA: Double, PICTURE: Double, VIDEO: Double): CameraMediaTypeObject = {
    val __obj = js.Dynamic.literal(ALLMEDIA = ALLMEDIA.asInstanceOf[js.Any], PICTURE = PICTURE.asInstanceOf[js.Any], VIDEO = VIDEO.asInstanceOf[js.Any])
    __obj.asInstanceOf[CameraMediaTypeObject]
  }
  
  @scala.inline
  implicit class CameraMediaTypeObjectMutableBuilder[Self <: CameraMediaTypeObject] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setALLMEDIA(value: Double): Self = StObject.set(x, "ALLMEDIA", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPICTURE(value: Double): Self = StObject.set(x, "PICTURE", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVIDEO(value: Double): Self = StObject.set(x, "VIDEO", value.asInstanceOf[js.Any])
  }
}
