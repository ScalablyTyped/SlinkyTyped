package typingsSlinky.iobroker.mod.global.ioBroker

import typingsSlinky.iobroker.iobrokerStrings.`object`
import typingsSlinky.iobroker.iobrokerStrings.create
import typingsSlinky.iobroker.iobrokerStrings.delete
import typingsSlinky.iobroker.iobrokerStrings.file
import typingsSlinky.iobroker.iobrokerStrings.list
import typingsSlinky.iobroker.iobrokerStrings.read
import typingsSlinky.iobroker.iobrokerStrings.state
import typingsSlinky.iobroker.iobrokerStrings.users
import typingsSlinky.iobroker.iobrokerStrings.write
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ObjectOrStatePermission extends Permission {
  
  @JSName("operation")
  var operation_ObjectOrStatePermission: list | read | write | create | delete = js.native
  
  @JSName("type")
  var type_ObjectOrStatePermission: `object` | file | users | state = js.native
}
object ObjectOrStatePermission {
  
  @scala.inline
  def apply(operation: list | read | write | create | delete, `type`: `object` | file | users | state): ObjectOrStatePermission = {
    val __obj = js.Dynamic.literal(operation = operation.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ObjectOrStatePermission]
  }
  
  @scala.inline
  implicit class ObjectOrStatePermissionOps[Self <: ObjectOrStatePermission] (val x: Self) extends AnyVal {
    
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
    def setOperation(value: list | read | write | create | delete): Self = this.set("operation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: `object` | file | users | state): Self = this.set("type", value.asInstanceOf[js.Any])
  }
}
