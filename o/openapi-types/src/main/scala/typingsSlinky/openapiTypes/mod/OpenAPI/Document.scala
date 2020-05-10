package typingsSlinky.openapiTypes.mod.OpenAPI

import typingsSlinky.openapiTypes.mod.OpenAPIV3.InfoObject
import typingsSlinky.openapiTypes.mod.OpenAPIV3.PathsObject
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
  def Document(info: InfoObject, openapi: String, paths: PathsObject): Document = {
    val __obj = js.Dynamic.literal(info = info.asInstanceOf[js.Any], openapi = openapi.asInstanceOf[js.Any], paths = paths.asInstanceOf[js.Any])
    __obj.asInstanceOf[Document]
  }
}

