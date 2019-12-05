package typingsSlinky.arcgisDashJsDashApi.__esri

import org.scalablytyped.runtime.TopLevel
import typingsSlinky.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.attachments
import typingsSlinky.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.list
import typingsSlinky.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.preview
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AttachmentsContent
  extends Content
     with typingsSlinky.arcgisDashJsDashApi.__esri.content.Content
     with contentContent {
  /**
    * An array of [AttachmentInfo](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-AttachmentInfo.html) objects used to display within the popup's content.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-popup-content-AttachmentsContent.html#attachmentInfos)
    */
  var attachmentInfos: AttachmentInfo = js.native
  /**
    * A string value indicating how to display the attachment.  If `list` is specified, attachments show as links.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-popup-content-AttachmentsContent.html#displayType)
    */
  var displayType: preview | list = js.native
  /**
    * The type of popup element displayed.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-popup-content-AttachmentsContent.html#type)
    *
    * @default attachments
    */
  @JSName("type")
  val type_AttachmentsContent: attachments = js.native
}

@JSGlobal("__esri.AttachmentsContent")
@js.native
object AttachmentsContent extends TopLevel[AttachmentsContentConstructor]

