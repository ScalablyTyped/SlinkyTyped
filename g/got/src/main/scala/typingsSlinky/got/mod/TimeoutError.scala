package typingsSlinky.got.mod

import typingsSlinky.got.gotStrings.connect
import typingsSlinky.got.gotStrings.lookup
import typingsSlinky.got.gotStrings.request
import typingsSlinky.got.gotStrings.response
import typingsSlinky.got.gotStrings.secureConnect
import typingsSlinky.got.gotStrings.send
import typingsSlinky.got.gotStrings.socket
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TimeoutError
  extends StdError
     with GotError {
  
  var event: lookup | connect | secureConnect | socket | response | send | request = js.native
  
  @JSName("name")
  var name_TimeoutError: typingsSlinky.got.gotStrings.TimeoutError = js.native
}
object TimeoutError {
  
  @scala.inline
  def apply(
    event: lookup | connect | secureConnect | socket | response | send | request,
    message: String,
    name: typingsSlinky.got.gotStrings.TimeoutError
  ): TimeoutError = {
    val __obj = js.Dynamic.literal(event = event.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[TimeoutError]
  }
  
  @scala.inline
  implicit class TimeoutErrorOps[Self <: TimeoutError] (val x: Self) extends AnyVal {
    
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
    def setEvent(value: lookup | connect | secureConnect | socket | response | send | request): Self = this.set("event", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: typingsSlinky.got.gotStrings.TimeoutError): Self = this.set("name", value.asInstanceOf[js.Any])
  }
}
