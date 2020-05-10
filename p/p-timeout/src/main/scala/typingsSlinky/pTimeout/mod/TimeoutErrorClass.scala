package typingsSlinky.pTimeout.mod

import typingsSlinky.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TimeoutErrorClass extends Error {
  @JSName("name")
  val name_TimeoutErrorClass: typingsSlinky.pTimeout.pTimeoutStrings.TimeoutError = js.native
}

object TimeoutErrorClass {
  @scala.inline
  def apply(message: String, name: typingsSlinky.pTimeout.pTimeoutStrings.TimeoutError): TimeoutErrorClass = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[TimeoutErrorClass]
  }
  @scala.inline
  implicit class TimeoutErrorClassOps[Self <: TimeoutErrorClass] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withName(value: typingsSlinky.pTimeout.pTimeoutStrings.TimeoutError): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

