package typingsSlinky.openapiTypes.mod.OpenAPIV2

import typingsSlinky.openapiTypes.openapiTypesStrings.`implicit`
import typingsSlinky.openapiTypes.openapiTypesStrings.apiKey
import typingsSlinky.openapiTypes.openapiTypesStrings.basic
import typingsSlinky.openapiTypes.openapiTypesStrings.oauth2
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SecuritySchemeOauth2Implicit
  extends SecuritySchemeOauth2Base
     with SecuritySchemeOauth2 {
  var authorizationUrl: String
  @JSName("flow")
  var flow_SecuritySchemeOauth2Implicit: `implicit`
}

object SecuritySchemeOauth2Implicit {
  @scala.inline
  def apply(
    authorizationUrl: String,
    flow: `implicit`,
    scopes: ScopesObject,
    `type`: basic | apiKey | oauth2,
    description: String = null
  ): SecuritySchemeOauth2Implicit = {
    val __obj = js.Dynamic.literal(authorizationUrl = authorizationUrl.asInstanceOf[js.Any], flow = flow.asInstanceOf[js.Any], scopes = scopes.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    __obj.asInstanceOf[SecuritySchemeOauth2Implicit]
  }
}

