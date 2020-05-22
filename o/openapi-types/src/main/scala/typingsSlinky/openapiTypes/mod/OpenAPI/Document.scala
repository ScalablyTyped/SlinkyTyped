package typingsSlinky.openapiTypes.mod.OpenAPI

import typingsSlinky.openapiTypes.mod.OpenAPIV3.ComponentsObject
import typingsSlinky.openapiTypes.mod.OpenAPIV3.ExternalDocumentationObject
import typingsSlinky.openapiTypes.mod.OpenAPIV3.InfoObject
import typingsSlinky.openapiTypes.mod.OpenAPIV3.PathsObject
import typingsSlinky.openapiTypes.mod.OpenAPIV3.SecurityRequirementObject
import typingsSlinky.openapiTypes.mod.OpenAPIV3.ServerObject
import typingsSlinky.openapiTypes.mod.OpenAPIV3.TagObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.openapiTypes.mod.OpenAPIV2.Document
  - typingsSlinky.openapiTypes.mod.OpenAPIV3.Document
*/
trait Document extends js.Object

object Document {
  @scala.inline
  def apply(
    info: InfoObject,
    openapi: String,
    paths: PathsObject,
    components: ComponentsObject = null,
    externalDocs: ExternalDocumentationObject = null,
    security: js.Array[SecurityRequirementObject] = null,
    servers: js.Array[ServerObject] = null,
    tags: js.Array[TagObject] = null
  ): Document = {
    val __obj = js.Dynamic.literal(info = info.asInstanceOf[js.Any], openapi = openapi.asInstanceOf[js.Any], paths = paths.asInstanceOf[js.Any])
    if (components != null) __obj.updateDynamic("components")(components.asInstanceOf[js.Any])
    if (externalDocs != null) __obj.updateDynamic("externalDocs")(externalDocs.asInstanceOf[js.Any])
    if (security != null) __obj.updateDynamic("security")(security.asInstanceOf[js.Any])
    if (servers != null) __obj.updateDynamic("servers")(servers.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[Document]
  }
}

