package typingsSlinky.pulumiAws.getCredentialsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetCredentialsResult extends js.Object {
  val authorizationToken: String = js.native
  val expiresAt: String = js.native
  /**
    * id is the provider-assigned unique ID for this managed resource.
    */
  val id: String = js.native
  val proxyEndpoint: String = js.native
  val registryId: String = js.native
}

object GetCredentialsResult {
  @scala.inline
  def apply(
    authorizationToken: String,
    expiresAt: String,
    id: String,
    proxyEndpoint: String,
    registryId: String
  ): GetCredentialsResult = {
    val __obj = js.Dynamic.literal(authorizationToken = authorizationToken.asInstanceOf[js.Any], expiresAt = expiresAt.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], proxyEndpoint = proxyEndpoint.asInstanceOf[js.Any], registryId = registryId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetCredentialsResult]
  }
  @scala.inline
  implicit class GetCredentialsResultOps[Self <: GetCredentialsResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAuthorizationToken(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("authorizationToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExpiresAt(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expiresAt")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withProxyEndpoint(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("proxyEndpoint")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRegistryId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("registryId")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

