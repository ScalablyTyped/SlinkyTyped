package typingsSlinky.awsSdk.elbv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateListenerOutput extends StObject {
  
  /**
    * Information about the listener.
    */
  var Listeners: js.UndefOr[typingsSlinky.awsSdk.elbv2Mod.Listeners] = js.native
}
object CreateListenerOutput {
  
  @scala.inline
  def apply(): CreateListenerOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateListenerOutput]
  }
  
  @scala.inline
  implicit class CreateListenerOutputMutableBuilder[Self <: CreateListenerOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setListeners(value: Listeners): Self = StObject.set(x, "Listeners", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setListenersUndefined: Self = StObject.set(x, "Listeners", js.undefined)
    
    @scala.inline
    def setListenersVarargs(value: Listener*): Self = StObject.set(x, "Listeners", js.Array(value :_*))
  }
}
