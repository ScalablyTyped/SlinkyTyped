package typingsSlinky.arcgisJsApi.esri

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Map
  extends Accessor
     with LayersMixin
     with TablesMixin {
  
  /**
    * A flattened collection of all [layers](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-Layer.html) in the map.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-Map.html#allLayers)
    */
  val allLayers: Collection[Layer] = js.native
  
  /**
    * A flattened collection of tables anywhere in the map's hierarchy.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-Map.html#allTables)
    */
  val allTables: Collection[Layer] = js.native
  
  /**
    * Specifies a basemap for the map.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-Map.html#basemap)
    */
  var basemap: Basemap = js.native
  
  /**
    * Specifies the surface properties for the map.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-Map.html#ground)
    */
  var ground: Ground = js.native
}
