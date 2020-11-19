package typingsSlinky.googleCloudTextToSpeech.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ClientOptionsCredentials extends js.Object {
  
  var client_email: String = js.native
  
  var private_key: String = js.native
}
object ClientOptionsCredentials {
  
  @scala.inline
  def apply(client_email: String, private_key: String): ClientOptionsCredentials = {
    val __obj = js.Dynamic.literal(client_email = client_email.asInstanceOf[js.Any], private_key = private_key.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClientOptionsCredentials]
  }
  
  @scala.inline
  implicit class ClientOptionsCredentialsOps[Self <: ClientOptionsCredentials] (val x: Self) extends AnyVal {
    
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
    def setClient_email(value: String): Self = this.set("client_email", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrivate_key(value: String): Self = this.set("private_key", value.asInstanceOf[js.Any])
  }
}
