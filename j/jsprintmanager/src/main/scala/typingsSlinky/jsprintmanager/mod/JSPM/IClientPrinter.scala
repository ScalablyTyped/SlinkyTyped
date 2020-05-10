package typingsSlinky.jsprintmanager.mod.JSPM

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IClientPrinter extends js.Object {
  var Id: js.Any = js.native
  def serialize(): js.Any = js.native
}

object IClientPrinter {
  @scala.inline
  def apply(Id: js.Any, serialize: () => js.Any): IClientPrinter = {
    val __obj = js.Dynamic.literal(Id = Id.asInstanceOf[js.Any], serialize = js.Any.fromFunction0(serialize))
    __obj.asInstanceOf[IClientPrinter]
  }
  @scala.inline
  implicit class IClientPrinterOps[Self <: IClientPrinter] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withId(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSerialize(value: () => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serialize")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

