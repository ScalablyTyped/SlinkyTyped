package typingsSlinky.arcgisJsApi.esri

import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.attachments
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.list
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.preview
import typingsSlinky.arcgisJsApi.esri.content.Content
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AttachmentsContent
  extends Content_
     with Content
     with contentContent {
  
  /**
    * A string value indicating how to display the attachment.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-popup-content-AttachmentsContent.html#displayType)
    */
  var displayType: preview | list = js.native
  
  /**
    * The type of popup element displayed.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-popup-content-AttachmentsContent.html#type)
    */
  @JSName("type")
  val type_AttachmentsContent: attachments = js.native
}
