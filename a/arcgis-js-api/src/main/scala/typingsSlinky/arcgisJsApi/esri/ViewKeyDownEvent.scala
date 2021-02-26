package typingsSlinky.arcgisJsApi.esri

import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.`key-down`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ViewKeyDownEvent extends StObject {
  
  var key: String = js.native
  
  var native: js.Any = js.native
  
  var repeat: Boolean = js.native
  
  var stopPropagation: js.Function = js.native
  
  var timestamp: Double = js.native
  
  var `type`: `key-down` = js.native
}
object ViewKeyDownEvent {
  
  @scala.inline
  def apply(
    key: String,
    native: js.Any,
    repeat: Boolean,
    stopPropagation: js.Function,
    timestamp: Double,
    `type`: `key-down`
  ): ViewKeyDownEvent = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], native = native.asInstanceOf[js.Any], repeat = repeat.asInstanceOf[js.Any], stopPropagation = stopPropagation.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ViewKeyDownEvent]
  }
  
  @scala.inline
  implicit class ViewKeyDownEventMutableBuilder[Self <: ViewKeyDownEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNative(value: js.Any): Self = StObject.set(x, "native", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRepeat(value: Boolean): Self = StObject.set(x, "repeat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStopPropagation(value: js.Function): Self = StObject.set(x, "stopPropagation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimestamp(value: Double): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: `key-down`): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
