package typingsSlinky.chromeApps.chrome.fileSystemProvider

import typingsSlinky.chromeApps.chrome.integer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ExecuteActionRequestedEventOptions extends GetActionsRequestedEventOptions {
  
  /** The identifier of the action to be executed. */
  var actionId: String = js.native
}
object ExecuteActionRequestedEventOptions {
  
  @scala.inline
  def apply(actionId: String, entryPaths: js.Array[String], fileSystemId: String, requestId: integer): ExecuteActionRequestedEventOptions = {
    val __obj = js.Dynamic.literal(actionId = actionId.asInstanceOf[js.Any], entryPaths = entryPaths.asInstanceOf[js.Any], fileSystemId = fileSystemId.asInstanceOf[js.Any], requestId = requestId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExecuteActionRequestedEventOptions]
  }
  
  @scala.inline
  implicit class ExecuteActionRequestedEventOptionsMutableBuilder[Self <: ExecuteActionRequestedEventOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActionId(value: String): Self = StObject.set(x, "actionId", value.asInstanceOf[js.Any])
  }
}
