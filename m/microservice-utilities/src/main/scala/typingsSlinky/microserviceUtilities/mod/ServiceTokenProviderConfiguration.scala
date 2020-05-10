package typingsSlinky.microserviceUtilities.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ServiceTokenProviderConfiguration extends js.Object {
  var audience: String = js.native
  var clientId: String = js.native
  var encryptedClientSecret: String = js.native
  var tokenEndpoint: String = js.native
}

object ServiceTokenProviderConfiguration {
  @scala.inline
  def apply(audience: String, clientId: String, encryptedClientSecret: String, tokenEndpoint: String): ServiceTokenProviderConfiguration = {
    val __obj = js.Dynamic.literal(audience = audience.asInstanceOf[js.Any], clientId = clientId.asInstanceOf[js.Any], encryptedClientSecret = encryptedClientSecret.asInstanceOf[js.Any], tokenEndpoint = tokenEndpoint.asInstanceOf[js.Any])
    __obj.asInstanceOf[ServiceTokenProviderConfiguration]
  }
  @scala.inline
  implicit class ServiceTokenProviderConfigurationOps[Self <: ServiceTokenProviderConfiguration] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAudience(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("audience")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withClientId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clientId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEncryptedClientSecret(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("encryptedClientSecret")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTokenEndpoint(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tokenEndpoint")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

