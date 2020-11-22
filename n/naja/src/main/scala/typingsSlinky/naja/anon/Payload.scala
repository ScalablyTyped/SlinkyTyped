package typingsSlinky.naja.anon

import org.scalajs.dom.experimental.Response
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Payload extends js.Object {
  
  var error: js.UndefOr[js.Error] = js.native
  
  var options: typingsSlinky.naja.najaMod.Options = js.native
  
  var payload: js.UndefOr[typingsSlinky.naja.najaMod.Payload] = js.native
  
  var request: org.scalajs.dom.experimental.Request = js.native
  
  var response: js.UndefOr[Response] = js.native
}
object Payload {
  
  @scala.inline
  def apply(options: typingsSlinky.naja.najaMod.Options, request: org.scalajs.dom.experimental.Request): Payload = {
    val __obj = js.Dynamic.literal(options = options.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any])
    __obj.asInstanceOf[Payload]
  }
  
  @scala.inline
  implicit class PayloadOps[Self <: Payload] (val x: Self) extends AnyVal {
    
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
    def setOptions(value: typingsSlinky.naja.najaMod.Options): Self = this.set("options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: org.scalajs.dom.experimental.Request): Self = this.set("request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setError(value: js.Error): Self = this.set("error", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteError: Self = this.set("error", js.undefined)
    
    @scala.inline
    def setPayload(value: typingsSlinky.naja.najaMod.Payload): Self = this.set("payload", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePayload: Self = this.set("payload", js.undefined)
    
    @scala.inline
    def setResponse(value: Response): Self = this.set("response", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResponse: Self = this.set("response", js.undefined)
  }
}
