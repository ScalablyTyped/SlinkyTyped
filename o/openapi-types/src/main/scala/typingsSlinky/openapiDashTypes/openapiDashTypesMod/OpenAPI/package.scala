package typingsSlinky.openapiDashTypes.openapiDashTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object OpenAPI {
  import typingsSlinky.openapiDashTypes.openapiDashTypesMod.OpenAPIV3.ParameterObject
  import typingsSlinky.openapiDashTypes.openapiDashTypesMod.OpenAPIV3.ReferenceObject

  type Parameters = js.Array[
    typingsSlinky.openapiDashTypes.openapiDashTypesMod.OpenAPIV2.Parameter | ParameterObject | ReferenceObject | typingsSlinky.openapiDashTypes.openapiDashTypesMod.OpenAPIV2.ReferenceObject
  ]
}
