package typingsSlinky.arcgisJsApi.esri

import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.clip
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.mask
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.replace
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SceneModification
  extends Accessor
     with JSONSupport {
  
  /**
    * The geometry representing the location of the modification.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-SceneModification.html#geometry)
    */
  var geometry: Polygon = js.native
  
  /**
    * The type of modification to perform.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-SceneModification.html#type)
    */
  var `type`: clip | mask | replace = js.native
}
