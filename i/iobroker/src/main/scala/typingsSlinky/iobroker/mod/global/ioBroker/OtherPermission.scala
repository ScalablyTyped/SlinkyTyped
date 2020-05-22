package typingsSlinky.iobroker.mod.global.ioBroker

import typingsSlinky.iobroker.iobrokerStrings.execute
import typingsSlinky.iobroker.iobrokerStrings.http
import typingsSlinky.iobroker.iobrokerStrings.other
import typingsSlinky.iobroker.iobrokerStrings.sendto
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OtherPermission extends Permission {
  @JSName("operation")
  var operation_OtherPermission: execute | http | sendto
  @JSName("type")
  var type_OtherPermission: other
}

object OtherPermission {
  @scala.inline
  def apply(operation: execute | http | sendto, `type`: other): OtherPermission = {
    val __obj = js.Dynamic.literal(operation = operation.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[OtherPermission]
  }
}

