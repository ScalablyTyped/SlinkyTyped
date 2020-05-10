package typingsSlinky.openapiTypes.mod.OpenAPIV3

import typingsSlinky.openapiTypes.AnonAuthorizationCode
import typingsSlinky.openapiTypes.openapiTypesStrings.oauth2
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OAuth2SecurityScheme extends SecuritySchemeObject {
  var flows: AnonAuthorizationCode = js.native
  var `type`: oauth2 = js.native
}

object OAuth2SecurityScheme {
  @scala.inline
  def apply(flows: AnonAuthorizationCode, `type`: oauth2): OAuth2SecurityScheme = {
    val __obj = js.Dynamic.literal(flows = flows.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[OAuth2SecurityScheme]
  }
  @scala.inline
  implicit class OAuth2SecuritySchemeOps[Self <: OAuth2SecurityScheme] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFlows(value: AnonAuthorizationCode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flows")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: oauth2): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

