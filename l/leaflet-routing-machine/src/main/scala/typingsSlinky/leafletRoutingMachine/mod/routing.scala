package typingsSlinky.leafletRoutingMachine.mod

import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.leaflet.mod.LatLng_
import typingsSlinky.leafletRoutingMachine.mod.Routing_.AutoCompleteOptions
import typingsSlinky.leafletRoutingMachine.mod.Routing_.AutoComplete_
import typingsSlinky.leafletRoutingMachine.mod.Routing_.Control_
import typingsSlinky.leafletRoutingMachine.mod.Routing_.ErrorControlOptions
import typingsSlinky.leafletRoutingMachine.mod.Routing_.ErrorControl_
import typingsSlinky.leafletRoutingMachine.mod.Routing_.FormatterOptions
import typingsSlinky.leafletRoutingMachine.mod.Routing_.Formatter_
import typingsSlinky.leafletRoutingMachine.mod.Routing_.GeocoderElementOptions
import typingsSlinky.leafletRoutingMachine.mod.Routing_.GeocoderElement_
import typingsSlinky.leafletRoutingMachine.mod.Routing_.IRoute
import typingsSlinky.leafletRoutingMachine.mod.Routing_.ItineraryBuilderOptions
import typingsSlinky.leafletRoutingMachine.mod.Routing_.ItineraryBuilder_
import typingsSlinky.leafletRoutingMachine.mod.Routing_.ItineraryOptions
import typingsSlinky.leafletRoutingMachine.mod.Routing_.Itinerary_
import typingsSlinky.leafletRoutingMachine.mod.Routing_.LineOptions
import typingsSlinky.leafletRoutingMachine.mod.Routing_.Line_
import typingsSlinky.leafletRoutingMachine.mod.Routing_.LocalizationOptions
import typingsSlinky.leafletRoutingMachine.mod.Routing_.Localization_
import typingsSlinky.leafletRoutingMachine.mod.Routing_.MapBox_
import typingsSlinky.leafletRoutingMachine.mod.Routing_.OSRMOptions
import typingsSlinky.leafletRoutingMachine.mod.Routing_.OSRMv1_
import typingsSlinky.leafletRoutingMachine.mod.Routing_.PlanOptions
import typingsSlinky.leafletRoutingMachine.mod.Routing_.Plan_
import typingsSlinky.leafletRoutingMachine.mod.Routing_.RoutingControlOptions
import typingsSlinky.leafletRoutingMachine.mod.Routing_.WaypointOptions
import typingsSlinky.leafletRoutingMachine.mod.Routing_.Waypoint_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("leaflet", "routing")
@js.native
object routing extends js.Object {
  def autocomplete(element: HTMLElement, callback: js.Any, context: js.Any, options: AutoCompleteOptions): AutoComplete_ = js.native
  def control(): Control_ = js.native
  def control(options: RoutingControlOptions): Control_ = js.native
  def errorControl(routingControl: Control_, options: ErrorControlOptions): ErrorControl_ = js.native
  def formatter(): Formatter_ = js.native
  def formatter(options: FormatterOptions): Formatter_ = js.native
  def geocoderElement(waypoint: Waypoint_, i: Double, numberWaypoints: Double, options: GeocoderElementOptions): GeocoderElement_ = js.native
  def itinerary(): Itinerary_ = js.native
  def itinerary(options: ItineraryOptions): Itinerary_ = js.native
  def itineraryBuilder(): ItineraryBuilder_ = js.native
  def itineraryBuilder(options: ItineraryBuilderOptions): ItineraryBuilder_ = js.native
  def line(route: IRoute): Line_ = js.native
  def line(route: IRoute, options: LineOptions): Line_ = js.native
  def localization(): Localization_ = js.native
  def localization(options: LocalizationOptions): Localization_ = js.native
  def mapbox(accessToken: String, options: OSRMOptions): MapBox_ = js.native
  def osrmv1(): OSRMv1_ = js.native
  def osrmv1(options: OSRMOptions): OSRMv1_ = js.native
  def plan(waypoints: js.Array[LatLng_ | Waypoint_]): Plan_ = js.native
  def plan(waypoints: js.Array[LatLng_ | Waypoint_], options: PlanOptions): Plan_ = js.native
  def waypoint(latLng: LatLng_): Waypoint_ = js.native
  def waypoint(latLng: LatLng_, name: js.UndefOr[scala.Nothing], options: WaypointOptions): Waypoint_ = js.native
  def waypoint(latLng: LatLng_, name: String): Waypoint_ = js.native
  def waypoint(latLng: LatLng_, name: String, options: WaypointOptions): Waypoint_ = js.native
}

