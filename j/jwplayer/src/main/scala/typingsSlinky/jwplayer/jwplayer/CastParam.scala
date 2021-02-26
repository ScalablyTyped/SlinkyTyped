package typingsSlinky.jwplayer.jwplayer

import typingsSlinky.jwplayer.jwplayerStrings.cast
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CastParam extends StObject {
  
  var active: Boolean = js.native
  
  var available: Boolean = js.native
  
  var deviceName: String = js.native
  
  var `type`: cast = js.native
}
object CastParam {
  
  @scala.inline
  def apply(active: Boolean, available: Boolean, deviceName: String, `type`: cast): CastParam = {
    val __obj = js.Dynamic.literal(active = active.asInstanceOf[js.Any], available = available.asInstanceOf[js.Any], deviceName = deviceName.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CastParam]
  }
  
  @scala.inline
  implicit class CastParamMutableBuilder[Self <: CastParam] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActive(value: Boolean): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAvailable(value: Boolean): Self = StObject.set(x, "available", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeviceName(value: String): Self = StObject.set(x, "deviceName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: cast): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
