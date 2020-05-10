package typingsSlinky.pulumiAws.inputMod.worklink

import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FleetIdentityProvider extends js.Object {
  /**
    * The SAML metadata document provided by the customer’s identity provider.
    */
  var samlMetadata: Input[String] = js.native
  /**
    * The type of identity provider.
    */
  var `type`: Input[String] = js.native
}

object FleetIdentityProvider {
  @scala.inline
  def apply(samlMetadata: Input[String], `type`: Input[String]): FleetIdentityProvider = {
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
    def withSamlMetadata(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("samlMetadata")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

