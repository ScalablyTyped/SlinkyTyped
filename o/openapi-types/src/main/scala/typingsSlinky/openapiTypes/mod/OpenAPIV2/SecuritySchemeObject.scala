package typingsSlinky.openapiTypes.mod.OpenAPIV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.openapiTypes.mod.OpenAPIV2.SecuritySchemeBasic
  - typingsSlinky.openapiTypes.mod.OpenAPIV2.SecuritySchemeApiKey
  - typingsSlinky.openapiTypes.mod.OpenAPIV2.SecuritySchemeOauth2
*/
trait SecuritySchemeObject extends js.Object

object SecuritySchemeObject {
  @scala.inline
  implicit def apply(value: SecuritySchemeApiKey): SecuritySchemeObject = value.asInstanceOf[SecuritySchemeObject]
  @scala.inline
  implicit def apply(value: SecuritySchemeBasic): SecuritySchemeObject = value.asInstanceOf[SecuritySchemeObject]
  @scala.inline
  implicit def apply(value: SecuritySchemeOauth2): SecuritySchemeObject = value.asInstanceOf[SecuritySchemeObject]
}

