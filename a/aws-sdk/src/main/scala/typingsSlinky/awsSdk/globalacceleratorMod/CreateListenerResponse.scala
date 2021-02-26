package typingsSlinky.awsSdk.globalacceleratorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateListenerResponse extends StObject {
  
  /**
    * The listener that you've created.
    */
  var Listener: js.UndefOr[typingsSlinky.awsSdk.globalacceleratorMod.Listener] = js.native
}
object CreateListenerResponse {
  
  @scala.inline
  def apply(): CreateListenerResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateListenerResponse]
  }
  
  @scala.inline
  implicit class CreateListenerResponseMutableBuilder[Self <: CreateListenerResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setListener(value: Listener): Self = StObject.set(x, "Listener", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setListenerUndefined: Self = StObject.set(x, "Listener", js.undefined)
  }
}
