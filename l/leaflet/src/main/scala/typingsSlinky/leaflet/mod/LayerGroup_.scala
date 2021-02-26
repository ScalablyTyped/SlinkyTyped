package typingsSlinky.leaflet.mod

import typingsSlinky.geojson.mod.Feature
import typingsSlinky.geojson.mod.FeatureCollection
import typingsSlinky.geojson.mod.GeometryCollection
import typingsSlinky.geojson.mod.GeometryObject
import typingsSlinky.geojson.mod.MultiPoint
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("leaflet", "LayerGroup")
@js.native
class LayerGroup_[P] () extends Layer {
  def this(layers: js.Array[Layer]) = this()
  def this(layers: js.UndefOr[scala.Nothing], options: LayerOptions) = this()
  def this(layers: js.Array[Layer], options: LayerOptions) = this()
  
  /**
    * Adds the given layer to the group.
    */
  def addLayer(layer: Layer): this.type = js.native
  
  /**
    * Removes all the layers from the group.
    */
  def clearLayers(): this.type = js.native
  
  /**
    * Iterates over the layers of the group,
    * optionally specifying context of the iterator function.
    */
  def eachLayer(fn: js.Function1[/* layer */ Layer, Unit]): this.type = js.native
  def eachLayer(fn: js.Function1[/* layer */ Layer, Unit], context: js.Any): this.type = js.native
  
  var feature: js.UndefOr[
    (FeatureCollection[GeometryObject, P]) | (Feature[MultiPoint, P]) | GeometryCollection
  ] = js.native
  
  /**
    * Returns the layer with the given internal ID.
    */
  def getLayer(id: Double): js.UndefOr[Layer] = js.native
  
  /**
    * Returns the internal ID for a layer
    */
  def getLayerId(layer: Layer): Double = js.native
  
  /**
    * Returns an array of all the layers added to the group.
    */
  def getLayers(): js.Array[Layer] = js.native
  
  /**
    * Returns true if the given layer is currently added to the group.
    */
  def hasLayer(layer: Layer): Boolean = js.native
  
  /**
    * Calls methodName on every layer contained in this group, passing any additional parameters.
    * Has no effect if the layers contained do not implement methodName.
    */
  def invoke(methodName: String, params: js.Any*): this.type = js.native
  
  /**
    * Removes the layer with the given internal ID or the given layer from the group.
    */
  def removeLayer(layer: Double): this.type = js.native
  def removeLayer(layer: Layer): this.type = js.native
  
  /**
    * Calls setZIndex on every layer contained in this group, passing the z-index.
    */
  def setZIndex(zIndex: Double): this.type = js.native
  
  /**
    * Returns a GeoJSON representation of the layer group (as a GeoJSON GeometryCollection, GeoJSONFeatureCollection or Multipoint).
    */
  def toGeoJSON(): (FeatureCollection[GeometryObject, P]) | (Feature[MultiPoint, P]) | GeometryCollection = js.native
}
