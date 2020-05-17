package typingsSlinky.activexLibreoffice.com_.sun.star.form

import typingsSlinky.activexLibreoffice.com_.sun.star.lang.EventObject
import typingsSlinky.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * occurs in case of fired database exceptions triggered by a database form.
  *
  * Please do **not** use anymore, this struct is deprecated.
  * @deprecated Deprecated
  */
@js.native
trait ErrorEvent extends EventObject {
  var Reason: js.Any = js.native
}

object ErrorEvent {
  @scala.inline
  def apply(Reason: js.Any, Source: XInterface): ErrorEvent = {
    val __obj = js.Dynamic.literal(Reason = Reason.asInstanceOf[js.Any], Source = Source.asInstanceOf[js.Any])
    __obj.asInstanceOf[ErrorEvent]
  }
  @scala.inline
  implicit class ErrorEventOps[Self <: ErrorEvent] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withReason(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Reason")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

