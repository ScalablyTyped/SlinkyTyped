package typingsSlinky.awsSdk.elbv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteListenerInput extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the listener.
    */
  var ListenerArn: typingsSlinky.awsSdk.elbv2Mod.ListenerArn = js.native
}
object DeleteListenerInput {
  
  @scala.inline
  def apply(ListenerArn: ListenerArn): DeleteListenerInput = {
    val __obj = js.Dynamic.literal(ListenerArn = ListenerArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteListenerInput]
  }
  
  @scala.inline
  implicit class DeleteListenerInputMutableBuilder[Self <: DeleteListenerInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setListenerArn(value: ListenerArn): Self = StObject.set(x, "ListenerArn", value.asInstanceOf[js.Any])
  }
}
