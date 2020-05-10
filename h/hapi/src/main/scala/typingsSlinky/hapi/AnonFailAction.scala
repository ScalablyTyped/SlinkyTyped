package typingsSlinky.hapi

import typingsSlinky.hapi.mod.Lifecycle.FailAction
import typingsSlinky.hapi.mod.Lifecycle.ReturnValue
import typingsSlinky.hapi.mod.Request
import typingsSlinky.hapi.mod.ResponseToolkit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonFailAction extends js.Object {
  var failAction: js.UndefOr[FailAction] = js.native
  var parse: js.UndefOr[Boolean] = js.native
}

object AnonFailAction {
  @scala.inline
  def apply(): AnonFailAction = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonFailAction]
  }
  @scala.inline
  implicit class AnonFailActionOps[Self <: AnonFailAction] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFailActionFunction3(
      value: (/* request */ Request, /* h */ ResponseToolkit, /* err */ js.UndefOr[js.Error]) => ReturnValue
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("failAction")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withFailAction(value: FailAction): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("failAction")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFailAction: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("failAction")(js.undefined)
        ret
    }
    @scala.inline
    def withParse(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parse")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutParse: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parse")(js.undefined)
        ret
    }
  }
  
}

