package typingsSlinky.arcgisDashJsDashApi.__esri

import org.scalablytyped.runtime.TopLevel
import typingsSlinky.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.`object`
import typingsSlinky.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.extrude
import typingsSlinky.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.fill
import typingsSlinky.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.icon
import typingsSlinky.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.line
import typingsSlinky.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.path
import typingsSlinky.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.text
import typingsSlinky.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.water
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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

@JSGlobal("__esri.Symbol3DLayer")
@js.native
object Symbol3DLayer extends TopLevel[Symbol3DLayerConstructor]

