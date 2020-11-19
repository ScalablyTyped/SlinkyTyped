package typingsSlinky.awsSdk.globalacceleratorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteListenerRequest extends js.Object {
  
  /**
    * The Amazon Resource Name (ARN) of the listener.
    */
  var ListenerArn: GenericString = js.native
}
object DeleteListenerRequest {
  
  @scala.inline
  def apply(ListenerArn: GenericString): DeleteListenerRequest = {
    val __obj = js.Dynamic.literal(ListenerArn = ListenerArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteListenerRequest]
  }
  
  @scala.inline
  implicit class DeleteListenerRequestOps[Self <: DeleteListenerRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setListenerArn(value: GenericString): Self = this.set("ListenerArn", value.asInstanceOf[js.Any])
  }
}
