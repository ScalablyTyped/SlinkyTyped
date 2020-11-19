package typingsSlinky.leafletGridlayerGooglemutant.mod.gridLayer

import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.leaflet.mod.GridLayer_
import typingsSlinky.leaflet.mod.Point_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleMutant_ extends GridLayer_ {
  
  /**
    * Add additional Google Maps layer.
    *
    * https://developers.google.com/maps/documentation/javascript/trafficlayer
    *
    * @param googleLayerName such as BicyclingLayer, TrafficLayer, or TransitLayer.
    * @param options? constructor arguments to pass through to the google layer.
    * @returns Promise for the native Google Maps Layer instance.
    */
  def addGoogleLayer(googleLayerName: String): js.Promise[js.Object] = js.native
  def addGoogleLayer(googleLayerName: String, options: js.Object): js.Promise[js.Object] = js.native
  
  /**
    * Removes Google Maps layer.
    *
    *  https://developers.google.com/maps/documentation/javascript/trafficlayer
    *
    * @param googleLayerName such as BicyclingLayer, TrafficLayer, or TransitLayer.
    */
  def removeGoogleLayer(googleLayerName: String): Unit = js.native
  
  def setElementSize(e: HTMLElement, size: Point_): Unit = js.native
}
