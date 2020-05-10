package typingsSlinky.activexOffice

import typingsSlinky.activexOffice.Office.CommandBarButton
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonCancelDefault extends js.Object {
  var CancelDefault: Boolean = js.native
  val Ctrl: CommandBarButton = js.native
}

object AnonCancelDefault {
  @scala.inline
  def apply(CancelDefault: Boolean, Ctrl: CommandBarButton): AnonCancelDefault = {
    val __obj = js.Dynamic.literal(CancelDefault = CancelDefault.asInstanceOf[js.Any], Ctrl = Ctrl.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCancelDefault]
  }
  @scala.inline
  implicit class AnonCancelDefaultOps[Self <: AnonCancelDefault] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCancelDefault(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CancelDefault")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCtrl(value: CommandBarButton): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Ctrl")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

