package typingsSlinky.iobroker.iobrokerMod._Global_.ioBroker

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

trait ObjectOrStatePermission extends Permission {
  @JSName("operation")
  var operation_ObjectOrStatePermission: list | read | write | create | delete
  @JSName("type")
  var type_ObjectOrStatePermission: `object` | file | users | state
}

object ObjectOrStatePermission {
  @scala.inline
  def apply(operation: list | read | write | create | delete, `type`: `object` | file | users | state): ObjectOrStatePermission = {
    val __obj = js.Dynamic.literal(operation = operation.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ObjectOrStatePermission]
  }
}

