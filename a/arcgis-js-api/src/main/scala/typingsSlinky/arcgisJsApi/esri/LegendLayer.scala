package typingsSlinky.arcgisJsApi.esri

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LegendLayer extends Accessor {
  
  /**
    * The id of the operational layer to include in the printout's legend.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-LegendLayer.html#layerId)
    */
  var layerId: String = js.native
  
  /**
    * The ids of the sublayers to include in the printout's legend.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-LegendLayer.html#subLayerIds)
    */
  var subLayerIds: js.Array[String] = js.native
  
  /**
    * The title of the feature layer. Use this property to modify feature layer name in the legend for the printout.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-LegendLayer.html#title)
    */
  var title: String = js.native
}
