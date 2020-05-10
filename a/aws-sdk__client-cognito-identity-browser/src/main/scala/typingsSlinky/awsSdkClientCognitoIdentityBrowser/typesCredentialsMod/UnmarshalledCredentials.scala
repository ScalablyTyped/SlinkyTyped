package typingsSlinky.awsSdkClientCognitoIdentityBrowser.typesCredentialsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UnmarshalledCredentials extends Credentials {
  /**
    * <p>The date at which these credentials will expire.</p>
    */
  @JSName("Expiration")
  var Expiration_UnmarshalledCredentials: js.UndefOr[js.Date] = js.native
}

object UnmarshalledCredentials {
  @scala.inline
  def apply(): UnmarshalledCredentials = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UnmarshalledCredentials]
  }
  @scala.inline
  implicit class UnmarshalledCredentialsOps[Self <: UnmarshalledCredentials] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withExpiration(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Expiration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExpiration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Expiration")(js.undefined)
        ret
    }
  }
  
}

