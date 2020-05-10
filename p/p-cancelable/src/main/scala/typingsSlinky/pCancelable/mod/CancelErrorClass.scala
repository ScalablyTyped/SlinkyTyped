package typingsSlinky.pCancelable.mod

import typingsSlinky.pCancelable.pCancelableBooleans.`true`
import typingsSlinky.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CancelErrorClass extends Error {
  val isCanceled: `true` = js.native
  @JSName("name")
  val name_CancelErrorClass: typingsSlinky.pCancelable.pCancelableStrings.CancelError = js.native
}

object CancelErrorClass {
  @scala.inline
  def apply(
    isCanceled: `true`,
    message: String,
    name: typingsSlinky.pCancelable.pCancelableStrings.CancelError
  ): CancelErrorClass = {
    val __obj = js.Dynamic.literal(isCanceled = isCanceled.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[CancelErrorClass]
  }
  @scala.inline
  implicit class CancelErrorClassOps[Self <: CancelErrorClass] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIsCanceled(value: `true`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isCanceled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: typingsSlinky.pCancelable.pCancelableStrings.CancelError): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

