package typingsSlinky.minecraftScriptingTypesServer

import typingsSlinky.minecraftScriptingTypesServer.anon.Message
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IExecuteCommandCallback extends js.Object {
  
  var command: String = js.native
  
  var data: Message = js.native
}
object IExecuteCommandCallback {
  
  @scala.inline
  def apply(command: String, data: Message): IExecuteCommandCallback = {
    val __obj = js.Dynamic.literal(command = command.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any])
    __obj.asInstanceOf[IExecuteCommandCallback]
  }
  
  @scala.inline
  implicit class IExecuteCommandCallbackOps[Self <: IExecuteCommandCallback] (val x: Self) extends AnyVal {
    
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
    def setCommand(value: String): Self = this.set("command", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setData(value: Message): Self = this.set("data", value.asInstanceOf[js.Any])
  }
}
