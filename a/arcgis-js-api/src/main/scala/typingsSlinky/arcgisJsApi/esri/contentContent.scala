package typingsSlinky.arcgisJsApi.esri

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.arcgisJsApi.esri.TextContent
  - typingsSlinky.arcgisJsApi.esri.MediaContent
  - typingsSlinky.arcgisJsApi.esri.FieldsContent
  - typingsSlinky.arcgisJsApi.esri.AttachmentsContent
*/
trait contentContent extends js.Object

object contentContent {
  @scala.inline
  implicit def apply(value: AttachmentsContent): contentContent = value.asInstanceOf[contentContent]
  @scala.inline
  implicit def apply(value: FieldsContent): contentContent = value.asInstanceOf[contentContent]
  @scala.inline
  implicit def apply(value: MediaContent): contentContent = value.asInstanceOf[contentContent]
  @scala.inline
  implicit def apply(value: TextContent): contentContent = value.asInstanceOf[contentContent]
}

