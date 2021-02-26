package typingsSlinky.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for the client ASPxClientControlCollection.ControlsInitialized event.
  */
@js.native
trait ASPxClientControlsInitializedEventArgs extends ASPxClientEventArgs {
  
  /**
    * Gets a value that specifies whether a callback is sent during a controls initialization.
    */
  var isCallback: Boolean = js.native
}
object ASPxClientControlsInitializedEventArgs {
  
  @scala.inline
  def apply(isCallback: Boolean): ASPxClientControlsInitializedEventArgs = {
    val __obj = js.Dynamic.literal(isCallback = isCallback.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientControlsInitializedEventArgs]
  }
  
  @scala.inline
  implicit class ASPxClientControlsInitializedEventArgsMutableBuilder[Self <: ASPxClientControlsInitializedEventArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIsCallback(value: Boolean): Self = StObject.set(x, "isCallback", value.asInstanceOf[js.Any])
  }
}
