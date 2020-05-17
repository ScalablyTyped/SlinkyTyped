package typingsSlinky.openapiTypes.mod.OpenAPIV3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.openapiTypes.mod.OpenAPIV3.HttpSecurityScheme
  - typingsSlinky.openapiTypes.mod.OpenAPIV3.ApiKeySecurityScheme
  - typingsSlinky.openapiTypes.mod.OpenAPIV3.OAuth2SecurityScheme
  - typingsSlinky.openapiTypes.mod.OpenAPIV3.OpenIdSecurityScheme
*/
trait SecuritySchemeObject extends js.Object

object SecuritySchemeObject {
  @scala.inline
  implicit def apply(value: ApiKeySecurityScheme): SecuritySchemeObject = value.asInstanceOf[SecuritySchemeObject]
  @scala.inline
  implicit def apply(value: HttpSecurityScheme): SecuritySchemeObject = value.asInstanceOf[SecuritySchemeObject]
  @scala.inline
  implicit def apply(value: OAuth2SecurityScheme): SecuritySchemeObject = value.asInstanceOf[SecuritySchemeObject]
  @scala.inline
  implicit def apply(value: OpenIdSecurityScheme): SecuritySchemeObject = value.asInstanceOf[SecuritySchemeObject]
}

