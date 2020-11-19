package typingsSlinky.esriLeaflet.mod.leafletAugmentingMod.esri

import typingsSlinky.leaflet.mod.PopupOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Render and visualize Map Services from ArcGIS Online and ArcGIS Server. `L.esri.DynamicMapLayer` also
  * supports custom popups and identification of features.
  *
  * Map Services are used when its preferable to ask the server to draw layers at a particular location and scale
  * and pass back the image which was generated on the fly. They also expose capabilities for querying and
  * identifying individual features.
  */
@JSImport("leaflet", "esri.DynamicMapLayer")
@js.native
class DynamicMapLayer_ protected () extends RasterLayer {
  def this(options: DynamicMapLayerOptions) = this()
  
  /**
    * Uses the provided function to create a popup that will identify features whenever the map is clicked.
    * Your function will be passed a GeoJSON FeatureCollection of the features at the clicked location and
    * should return the appropriate HTML. If you do not want to open the popup when there are no results,
    * return false.
    */
  def bindPopup(fn: FeatureCallbackHandler): this.type = js.native
  def bindPopup(fn: FeatureCallbackHandler, popupOptions: PopupOptions): this.type = js.native
  
  /**
    * Returns a new `L.esri.services.Find` object that can be used to find features. Your callback function
    * will be passed a GeoJSON FeatureCollection with the results or an error.
    */
  def find(): Find_ = js.native
  
  /**
    * Returns a JSON object representing the modified layer symbology being requested from the map service.
    */
  def getDynamicLayers(): js.Any = js.native
  
  /**
    * Returns the current layer definition(s) being used for rendering.
    */
  def getLayerDefs(): js.Any = js.native
  
  /**
    * Returns the array of visible layers specified in the layer constructor.
    */
  def getLayers(): js.Array[_] = js.native
  
  /**
    * Returns the current time options being used for rendering.
    */
  def getTimeOptions(): js.Any = js.native
  
  /**
    * Returns a new `L.esri.services.IdentifyFeatures` object that can be used to identify features on this
    * layer. Your callback function will be passed a GeoJSON FeatureCollection with the results or an error.
    */
  def identify(): IdentifyFeatures_ = js.native
  
  /**
    * Returns a new `L.esri.Query` object that can be used to query this service.
    */
  def query(): Query_ = js.native
  
  /**
    * Used to insert raw dynamicLayers JSON in situations where you'd like to modify layer symbology defined in
    * the service itself.
    */
  def setDynamicLayers(layers: js.Any): this.type = js.native
  
  /**
    * Redraws the layer with the new layer definitions. Corresponds to the layerDefs option on the export API.
    */
  def setLayerDefs(layerDefs: js.Any): this.type = js.native
  
  /**
    * Redraws the layer to show the passed array of layer ids.
    */
  def setLayers(layers: js.Array[_]): this.type = js.native
  
  /**
    * Sets the current time options being used to render the layer. Corresponds to the layerTimeOptions option
    * on the export API.
    */
  def setTimeOptions(timeOptions: js.Any): this.type = js.native
}
