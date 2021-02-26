package typingsSlinky.reactNative.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CameraRollNodeInfo extends StObject {
  
  var group_name: String = js.native
  
  var image: Image = js.native
  
  var location: js.Any = js.native
  
  var timestamp: Double = js.native
}
object CameraRollNodeInfo {
  
  @scala.inline
  def apply(group_name: String, image: Image, location: js.Any, timestamp: Double): CameraRollNodeInfo = {
    val __obj = js.Dynamic.literal(group_name = group_name.asInstanceOf[js.Any], image = image.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[CameraRollNodeInfo]
  }
  
  @scala.inline
  implicit class CameraRollNodeInfoMutableBuilder[Self <: CameraRollNodeInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGroup_name(value: String): Self = StObject.set(x, "group_name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImage(value: Image): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocation(value: js.Any): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimestamp(value: Double): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
  }
}
