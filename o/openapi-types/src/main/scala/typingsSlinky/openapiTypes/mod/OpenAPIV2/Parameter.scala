package typingsSlinky.openapiTypes.mod.OpenAPIV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.openapiTypes.mod.OpenAPIV2.InBodyParameterObject
  - typingsSlinky.openapiTypes.mod.OpenAPIV2.GeneralParameterObject
*/
trait Parameter
  extends typingsSlinky.openapiTypes.mod.OpenAPI.Parameter

object Parameter {
  @scala.inline
  implicit def apply(value: GeneralParameterObject): Parameter = value.asInstanceOf[Parameter]
  @scala.inline
  implicit def apply(value: InBodyParameterObject): Parameter = value.asInstanceOf[Parameter]
}

