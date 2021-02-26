package typingsSlinky.actionsOnGoogle.v2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleActionsV2RegisterUpdateValue extends StObject {
  
  /**
    * The status of the registering the update requested by the app.
    */
  var status: js.UndefOr[GoogleActionsV2RegisterUpdateValueStatus] = js.native
}
object GoogleActionsV2RegisterUpdateValue {
  
  @scala.inline
  def apply(): GoogleActionsV2RegisterUpdateValue = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleActionsV2RegisterUpdateValue]
  }
  
  @scala.inline
  implicit class GoogleActionsV2RegisterUpdateValueMutableBuilder[Self <: GoogleActionsV2RegisterUpdateValue] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setStatus(value: GoogleActionsV2RegisterUpdateValueStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
  }
}
