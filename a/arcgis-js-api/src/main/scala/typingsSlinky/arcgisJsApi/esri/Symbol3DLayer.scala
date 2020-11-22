package typingsSlinky.arcgisJsApi.esri

import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.`object`
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.extrude
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.fill
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.icon
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.line
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.path
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.text
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.water
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Symbol3DLayer
  extends Accessor
     with JSONSupport {
  
  /**
    * The 3D symbol layer type.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-Symbol3DLayer.html#type)
    */
  val `type`: icon | `object` | line | path | fill | water | extrude | text = js.native
}
