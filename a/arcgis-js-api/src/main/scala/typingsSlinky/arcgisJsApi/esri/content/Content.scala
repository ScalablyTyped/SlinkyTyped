package typingsSlinky.arcgisJsApi.esri.content

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.arcgisJsApi.esri.TextContent
  - typingsSlinky.arcgisJsApi.esri.MediaContent
  - typingsSlinky.arcgisJsApi.esri.FieldsContent
  - typingsSlinky.arcgisJsApi.esri.AttachmentsContent
*/
trait Content extends js.Object

object Content {
  @scala.inline
  implicit def apply(value: typingsSlinky.arcgisJsApi.esri.AttachmentsContent): Content = value.asInstanceOf[Content]
  @scala.inline
  implicit def apply(value: typingsSlinky.arcgisJsApi.esri.FieldsContent): Content = value.asInstanceOf[Content]
  @scala.inline
  implicit def apply(value: typingsSlinky.arcgisJsApi.esri.MediaContent): Content = value.asInstanceOf[Content]
  @scala.inline
  implicit def apply(value: typingsSlinky.arcgisJsApi.esri.TextContent): Content = value.asInstanceOf[Content]
}

