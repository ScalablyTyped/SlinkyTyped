package typingsSlinky.arcgisJsApi.global.esri

import typingsSlinky.arcgisJsApi.esri.AttachmentInfoProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("__esri.AttachmentInfo")
@js.native
/**
  * The `AttachmentInfo` class returns information about attachments associated with a feature. The contents of the attachment are streamed to the client. Attachments are available if the [FeatureLayer.capabilities.data.supportsAttachment](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#capabilities) is `true`.
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-AttachmentInfo.html)
  */
class AttachmentInfoCls ()
  extends typingsSlinky.arcgisJsApi.esri.AttachmentInfo {
  def this(properties: AttachmentInfoProperties) = this()
}
