package typingsSlinky.iobroker.mod.global.ioBroker

import typingsSlinky.iobroker.iobrokerStrings.execute
import typingsSlinky.iobroker.iobrokerStrings.http
import typingsSlinky.iobroker.iobrokerStrings.other
import typingsSlinky.iobroker.iobrokerStrings.sendto
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OtherPermission extends Permission {
  @JSName("operation")
  var operation_OtherPermission: execute | http | sendto = js.native
  @JSName("type")
  var type_OtherPermission: other = js.native
}

object OtherPermission {
  @scala.inline
  def apply(operation: execute | http | sendto, `type`: other): OtherPermission = {
    val __obj = js.Dynamic.literal(operation = operation.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[OtherPermission]
  }
  @scala.inline
  implicit class OtherPermissionOps[Self <: OtherPermission] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOperation(value: execute | http | sendto): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("operation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: other): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

