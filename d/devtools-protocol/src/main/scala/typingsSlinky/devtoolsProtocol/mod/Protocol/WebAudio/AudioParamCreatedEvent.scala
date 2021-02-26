package typingsSlinky.devtoolsProtocol.mod.Protocol.WebAudio

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AudioParamCreatedEvent extends StObject {
  
  var param: AudioParam = js.native
}
object AudioParamCreatedEvent {
  
  @scala.inline
  def apply(param: AudioParam): AudioParamCreatedEvent = {
    val __obj = js.Dynamic.literal(param = param.asInstanceOf[js.Any])
    __obj.asInstanceOf[AudioParamCreatedEvent]
  }
  
  @scala.inline
  implicit class AudioParamCreatedEventMutableBuilder[Self <: AudioParamCreatedEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParam(value: AudioParam): Self = StObject.set(x, "param", value.asInstanceOf[js.Any])
  }
}
