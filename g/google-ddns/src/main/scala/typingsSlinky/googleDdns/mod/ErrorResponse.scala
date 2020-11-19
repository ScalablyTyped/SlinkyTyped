package typingsSlinky.googleDdns.mod

import typingsSlinky.googleDdns.googleDdnsStrings.`911`
import typingsSlinky.googleDdns.googleDdnsStrings.abuse
import typingsSlinky.googleDdns.googleDdnsStrings.badagent
import typingsSlinky.googleDdns.googleDdnsStrings.badauth
import typingsSlinky.googleDdns.googleDdnsStrings.error
import typingsSlinky.googleDdns.googleDdnsStrings.good
import typingsSlinky.googleDdns.googleDdnsStrings.nochg
import typingsSlinky.googleDdns.googleDdnsStrings.nohost
import typingsSlinky.googleDdns.googleDdnsStrings.notfqdn
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ErrorResponse extends js.Object {
  
  // This definition is here to make it possible to access the `ip`
  // property in the union `SuccessResponse | ErrorResponse`
  // See https://github.com/Microsoft/TypeScript/issues/12815
  var ip: js.UndefOr[scala.Nothing] = js.native
  
  /**
    * A human-readable response message
    */
  var message: String = js.native
  
  /**
    * The response code (may include `good` or `nochg` in edge cases)
    */
  var response: nohost | badauth | notfqdn | badagent | abuse | `911` | good | nochg = js.native
  
  /**
    * The response status
    */
  var status: error = js.native
}
object ErrorResponse {
  
  @scala.inline
  def apply(
    message: String,
    response: nohost | badauth | notfqdn | badagent | abuse | `911` | good | nochg,
    status: error
  ): ErrorResponse = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[ErrorResponse]
  }
  
  @scala.inline
  implicit class ErrorResponseOps[Self <: ErrorResponse] (val x: Self) extends AnyVal {
    
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
    def setMessage(value: String): Self = this.set("message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: nohost | badauth | notfqdn | badagent | abuse | `911` | good | nochg): Self = this.set("response", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatus(value: error): Self = this.set("status", value.asInstanceOf[js.Any])
  }
}
