package typingsSlinky.arcgisJsApi.attachmentsContentMod

import typingsSlinky.arcgisJsApi.esri.AttachmentsContent
import typingsSlinky.arcgisJsApi.esri.AttachmentsContentProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("esri/popup/content/AttachmentsContent", JSImport.Namespace)
@js.native
/**
  * An `AttachmentsContent` popup element represents an attachment element associated with a feature. This resource is available only if the [FeatureLayer.capabilities.data.supportsAttachment](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#capabilities) is `true`.
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-popup-content-AttachmentsContent.html)
  */
class Class () extends AttachmentsContent {
  def this(properties: AttachmentsContentProperties) = this()
}
