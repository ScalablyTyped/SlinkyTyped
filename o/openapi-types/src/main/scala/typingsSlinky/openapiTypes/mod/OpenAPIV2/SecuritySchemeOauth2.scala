package typingsSlinky.openapiTypes.mod.OpenAPIV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.openapiTypes.mod.OpenAPIV2.SecuritySchemeOauth2Implicit
  - typingsSlinky.openapiTypes.mod.OpenAPIV2.SecuritySchemeOauth2AccessCode
  - typingsSlinky.openapiTypes.mod.OpenAPIV2.SecuritySchemeOauth2Password
  - typingsSlinky.openapiTypes.mod.OpenAPIV2.SecuritySchemeOauth2Application
*/
trait SecuritySchemeOauth2 extends SecuritySchemeObject

object SecuritySchemeOauth2 {
  @scala.inline
  implicit def apply(value: SecuritySchemeOauth2AccessCode): SecuritySchemeOauth2 = value.asInstanceOf[SecuritySchemeOauth2]
  @scala.inline
  implicit def apply(value: SecuritySchemeOauth2Application): SecuritySchemeOauth2 = value.asInstanceOf[SecuritySchemeOauth2]
  @scala.inline
  implicit def apply(value: SecuritySchemeOauth2Implicit): SecuritySchemeOauth2 = value.asInstanceOf[SecuritySchemeOauth2]
  @scala.inline
  implicit def apply(value: SecuritySchemeOauth2Password): SecuritySchemeOauth2 = value.asInstanceOf[SecuritySchemeOauth2]
}

