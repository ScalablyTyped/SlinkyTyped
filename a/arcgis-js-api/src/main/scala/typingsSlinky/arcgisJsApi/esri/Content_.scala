package typingsSlinky.arcgisJsApi.esri

import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.attachments
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.custom
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.fields
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.media
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.text
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Content_
  extends Accessor
     with JSONSupport {
  
  /**
    * The type of popup element displayed.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-popup-content-Content.html#type)
    */
  val `type`: text | fields | media | attachments | custom = js.native
}
