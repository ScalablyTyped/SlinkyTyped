package typingsSlinky.awsSdk.ssmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SendCommandResult extends StObject {
  
  /**
    * The request as it was received by Systems Manager. Also provides the command ID which can be used future references to this request.
    */
  var Command: js.UndefOr[typingsSlinky.awsSdk.ssmMod.Command] = js.native
}
object SendCommandResult {
  
  @scala.inline
  def apply(): SendCommandResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SendCommandResult]
  }
  
  @scala.inline
  implicit class SendCommandResultMutableBuilder[Self <: SendCommandResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCommand(value: Command): Self = StObject.set(x, "Command", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCommandUndefined: Self = StObject.set(x, "Command", js.undefined)
  }
}
