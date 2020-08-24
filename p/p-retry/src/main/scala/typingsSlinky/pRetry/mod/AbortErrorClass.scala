package typingsSlinky.pRetry.mod

import typingsSlinky.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AbortErrorClass extends Error {
  @JSName("name")
  val name_AbortErrorClass: typingsSlinky.pRetry.pRetryStrings.AbortError = js.native
  val originalError: js.Error = js.native
}

object AbortErrorClass {
  @scala.inline
  def apply(message: String, name: typingsSlinky.pRetry.pRetryStrings.AbortError, originalError: js.Error): AbortErrorClass = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], originalError = originalError.asInstanceOf[js.Any])
    __obj.asInstanceOf[AbortErrorClass]
  }
  @scala.inline
  implicit class AbortErrorClassOps[Self <: AbortErrorClass] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setName(value: typingsSlinky.pRetry.pRetryStrings.AbortError): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setOriginalError(value: js.Error): Self = this.set("originalError", value.asInstanceOf[js.Any])
  }
  
}

