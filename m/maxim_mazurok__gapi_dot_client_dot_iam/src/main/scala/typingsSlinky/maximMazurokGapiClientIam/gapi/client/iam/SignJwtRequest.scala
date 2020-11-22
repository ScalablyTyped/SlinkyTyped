package typingsSlinky.maximMazurokGapiClientIam.gapi.client.iam

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SignJwtRequest extends js.Object {
  
  /**
    * Required. Deprecated. [Migrate to Service Account Credentials API](https://cloud.google.com/iam/help/credentials/migrate-api). The JWT payload to sign. Must be a serialized JSON
    * object that contains a JWT Claims Set. For example: `{"sub": "user@example.com", "iat": 313435}` If the JWT Claims Set contains an expiration time (`exp`) claim, it must be an
    * integer timestamp that is not in the past and no more than 1 hour in the future. If the JWT Claims Set does not contain an expiration time (`exp`) claim, this claim is added
    * automatically, with a timestamp that is 1 hour in the future.
    */
  var payload: js.UndefOr[String] = js.native
}
object SignJwtRequest {
  
  @scala.inline
  def apply(): SignJwtRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SignJwtRequest]
  }
  
  @scala.inline
  implicit class SignJwtRequestOps[Self <: SignJwtRequest] (val x: Self) extends AnyVal {
    
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
    def setPayload(value: String): Self = this.set("payload", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePayload: Self = this.set("payload", js.undefined)
  }
}
