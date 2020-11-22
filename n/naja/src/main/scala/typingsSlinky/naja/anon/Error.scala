package typingsSlinky.naja.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Error extends js.Object {
  
  var error: js.Error = js.native
  
  var options: typingsSlinky.naja.najaMod.Options = js.native
  
  var request: org.scalajs.dom.experimental.Request = js.native
}
object Error {
  
  @scala.inline
  def apply(
    error: js.Error,
    options: typingsSlinky.naja.najaMod.Options,
    request: org.scalajs.dom.experimental.Request
  ): Error = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any])
    __obj.asInstanceOf[Error]
  }
  
  @scala.inline
  implicit class ErrorOps[Self <: Error] (val x: Self) extends AnyVal {
    
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
    def setError(value: js.Error): Self = this.set("error", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptions(value: typingsSlinky.naja.najaMod.Options): Self = this.set("options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: org.scalajs.dom.experimental.Request): Self = this.set("request", value.asInstanceOf[js.Any])
  }
}
