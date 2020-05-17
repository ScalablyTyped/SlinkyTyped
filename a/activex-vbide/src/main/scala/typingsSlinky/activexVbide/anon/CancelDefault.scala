package typingsSlinky.activexVbide.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CancelDefault extends js.Object {
  val CancelDefault: Boolean = js.native
  val CommandBarControl: js.Any = js.native
  val handled: Boolean = js.native
}

object CancelDefault {
  @scala.inline
  def apply(CancelDefault: Boolean, CommandBarControl: js.Any, handled: Boolean): CancelDefault = {
    val __obj = js.Dynamic.literal(CancelDefault = CancelDefault.asInstanceOf[js.Any], CommandBarControl = CommandBarControl.asInstanceOf[js.Any], handled = handled.asInstanceOf[js.Any])
    __obj.asInstanceOf[CancelDefault]
  }
  @scala.inline
  implicit class CancelDefaultOps[Self <: CancelDefault] (val x: Self) extends AnyVal {
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
    def withCommandBarControl(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CommandBarControl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHandled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("handled")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

