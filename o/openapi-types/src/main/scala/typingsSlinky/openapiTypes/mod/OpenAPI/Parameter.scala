package typingsSlinky.openapiTypes.mod.OpenAPI

import typingsSlinky.openapiTypes.mod.OpenAPIV2.ReferenceObject
import typingsSlinky.openapiTypes.mod.OpenAPIV3.ParameterObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.openapiTypes.mod.OpenAPIV3.ReferenceObject
  - typingsSlinky.openapiTypes.mod.OpenAPIV3.ParameterObject
  - typingsSlinky.openapiTypes.mod.OpenAPIV2.ReferenceObject
  - typingsSlinky.openapiTypes.mod.OpenAPIV2.Parameter
*/
trait Parameter extends js.Object

object Parameter {
  @scala.inline
  implicit def apply(value: typingsSlinky.openapiTypes.mod.OpenAPIV2.Parameter): Parameter = value.asInstanceOf[Parameter]
  @scala.inline
  implicit def apply(value: ParameterObject): Parameter = value.asInstanceOf[Parameter]
  @scala.inline
  implicit def apply(value: ReferenceObject): Parameter = value.asInstanceOf[Parameter]
  @scala.inline
  implicit def apply(value: typingsSlinky.openapiTypes.mod.OpenAPIV3.ReferenceObject): Parameter = value.asInstanceOf[Parameter]
}

