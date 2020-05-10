package typingsSlinky.awsSdk.ssooidcMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RegisterClientRequest extends js.Object {
  /**
    * The friendly name of the client.
    */
  var clientName: ClientName = js.native
  /**
    * The type of client. The service supports only public as a client type. Anything other than public will be rejected by the service.
    */
  var clientType: ClientType = js.native
  /**
    * The list of scopes that are defined by the client. Upon authorization, this list is used to restrict permissions when granting an access token.
    */
  var scopes: js.UndefOr[Scopes] = js.native
}

object RegisterClientRequest {
  @scala.inline
  def apply(clientName: ClientName, clientType: ClientType): RegisterClientRequest = {
    val __obj = js.Dynamic.literal(clientName = clientName.asInstanceOf[js.Any], clientType = clientType.asInstanceOf[js.Any])
    __obj.asInstanceOf[RegisterClientRequest]
  }
  @scala.inline
  implicit class RegisterClientRequestOps[Self <: RegisterClientRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClientName(value: ClientName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clientName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withClientType(value: ClientType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clientType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withScopes(value: Scopes): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scopes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScopes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scopes")(js.undefined)
        ret
    }
  }
  
}

