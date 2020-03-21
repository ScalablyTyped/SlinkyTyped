package typingsSlinky.openapiTypes.mod.OpenAPIV2

import typingsSlinky.openapiTypes.openapiTypesStrings.`implicit`
import typingsSlinky.openapiTypes.openapiTypesStrings.accessCode
import typingsSlinky.openapiTypes.openapiTypesStrings.apiKey
import typingsSlinky.openapiTypes.openapiTypesStrings.application
import typingsSlinky.openapiTypes.openapiTypesStrings.basic
import typingsSlinky.openapiTypes.openapiTypesStrings.oauth2
import typingsSlinky.openapiTypes.openapiTypesStrings.password
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SecuritySchemeOauth2Base extends SecuritySchemeObjectBase {
  var flow: `implicit` | password | application | accessCode
  var scopes: ScopesObject
}

object SecuritySchemeOauth2Base {
  @scala.inline
  def apply(
    flow: `implicit` | password | application | accessCode,
    scopes: ScopesObject,
    `type`: basic | apiKey | oauth2,
    description: String = null
  ): SecuritySchemeOauth2Base = {
    val __obj = js.Dynamic.literal(flow = flow.asInstanceOf[js.Any], scopes = scopes.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    __obj.asInstanceOf[SecuritySchemeOauth2Base]
  }
}

