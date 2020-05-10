package typingsSlinky.pulumiAws.outputMod.worklink

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FleetIdentityProvider extends js.Object {
  /**
    * The SAML metadata document provided by the customer’s identity provider.
    */
  var samlMetadata: String = js.native
  /**
    * The type of identity provider.
    */
  var `type`: String = js.native
}

object FleetIdentityProvider {
  @scala.inline
  def apply(samlMetadata: String, `type`: String): FleetIdentityProvider = {
    val __obj = js.Dynamic.literal(samlMetadata = samlMetadata.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[FleetIdentityProvider]
  }
  @scala.inline
  implicit class FleetIdentityProviderOps[Self <: FleetIdentityProvider] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSamlMetadata(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("samlMetadata")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

