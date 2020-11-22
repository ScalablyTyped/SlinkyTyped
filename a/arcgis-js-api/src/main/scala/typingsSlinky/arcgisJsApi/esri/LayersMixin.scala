package typingsSlinky.arcgisJsApi.esri

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LayersMixin extends js.Object {
  
  def add(layer: js.Promise[_]): Unit = js.native
  def add(layer: js.Promise[_], index: Double): Unit = js.native
  /**
    * Adds a layer to the [layers collection](https://developers.arcgis.com/javascript/latest/api-reference/esri-support-LayersMixin.html#layers).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-support-LayersMixin.html#add)
    */
  def add(layer: Layer): Unit = js.native
  def add(layer: Layer, index: Double): Unit = js.native
  
  /**
    * Adds a layer or an array of layers to the [layers collection](https://developers.arcgis.com/javascript/latest/api-reference/esri-support-LayersMixin.html#layers).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-support-LayersMixin.html#addMany)
    */
  def addMany(layers: js.Array[Layer]): Unit = js.native
  def addMany(layers: js.Array[Layer], index: Double): Unit = js.native
  
  /**
    * Returns a layer based on the given layer id.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-support-LayersMixin.html#findLayerById)
    */
  def findLayerById(layerId: String): Layer = js.native
  
  /**
    * A collection of operational [layers](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-Layer.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-support-LayersMixin.html#layers)
    */
  var layers: Collection[Layer] = js.native
  
  /**
    * Removes the specified layer from the layers collection.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-support-LayersMixin.html#remove)
    */
  def remove(layer: Layer): Layer = js.native
  
  /**
    * Removes all layers.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-support-LayersMixin.html#removeAll)
    */
  def removeAll(): js.Array[Layer] = js.native
  
  /**
    * Removes the specified layers.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-support-LayersMixin.html#removeMany)
    */
  def removeMany(layers: js.Array[Layer]): js.Array[Layer] = js.native
  
  /**
    * Changes the layer order.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-support-LayersMixin.html#reorder)
    */
  def reorder(layer: Layer, index: Double): Layer = js.native
}
