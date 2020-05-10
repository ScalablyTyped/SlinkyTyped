package typingsSlinky.iobroker.mod._Global_.ioBroker

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
import scala.scalajs.js.annotation._

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
    def withOperation(value: list | read | write | create | delete): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("operation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: `object` | file | users | state): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

