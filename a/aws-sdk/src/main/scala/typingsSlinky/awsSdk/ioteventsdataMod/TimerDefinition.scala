package typingsSlinky.awsSdk.ioteventsdataMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TimerDefinition extends StObject {
  
  /**
    * The name of the timer.
    */
  var name: TimerName = js.native
  
  /**
    * The new setting of the timer (the number of seconds before the timer elapses).
    */
  var seconds: Seconds = js.native
}
object TimerDefinition {
  
  @scala.inline
  def apply(name: TimerName, seconds: Seconds): TimerDefinition = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], seconds = seconds.asInstanceOf[js.Any])
    __obj.asInstanceOf[TimerDefinition]
  }
  
  @scala.inline
  implicit class TimerDefinitionMutableBuilder[Self <: TimerDefinition] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: TimerName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSeconds(value: Seconds): Self = StObject.set(x, "seconds", value.asInstanceOf[js.Any])
  }
}
