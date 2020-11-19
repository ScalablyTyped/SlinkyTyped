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
    * The 3D symbol layer type. See the table below for a list of possible values.
    *
    * Value | Description
    * ------|------------
    * icon | ![s3d-icon](https://developers.arcgis.com/javascript/assets/img/apiref/symbols/symbols3d-icon-circle.png)
    * object | ![s3d-object](https://developers.arcgis.com/javascript/assets/img/apiref/symbols/symbols3d-object-sphere.png)
    * line | ![s3d-line](https://developers.arcgis.com/javascript/assets/img/apiref/symbols/symbols3d-line-line.png)
    * path | ![s3d-path](https://developers.arcgis.com/javascript/assets/img/apiref/symbols/symbols3d-path-tube.png)
    * fill | ![s3d-fill](https://developers.arcgis.com/javascript/assets/img/apiref/symbols/symbols3d-fill-solid.png)
    * water | ![s3d-water](https://developers.arcgis.com/javascript/assets/img/apiref/symbols/symbols3d-water-solid.png)
    * extrude | ![s3d-extrusion](https://developers.arcgis.com/javascript/assets/img/apiref/symbols/symbols3d-extrude-solid.png)
    * text | ![s3d-text](https://developers.arcgis.com/javascript/assets/img/apiref/symbols/symbols3d-label-text.png)
    *
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-Symbol3DLayer.html#type)
    */
  val `type`: icon | `object` | line | path | fill | water | extrude | text = js.native
}
