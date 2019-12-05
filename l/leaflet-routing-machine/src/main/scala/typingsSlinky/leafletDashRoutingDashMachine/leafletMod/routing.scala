package typingsSlinky.leafletDashRoutingDashMachine.leafletMod

import typingsSlinky.leaflet.leafletMod.LatLng
import typingsSlinky.leafletDashRoutingDashMachine.leafletMod.Routing.Control
import typingsSlinky.leafletDashRoutingDashMachine.leafletMod.Routing.Formatter
import typingsSlinky.leafletDashRoutingDashMachine.leafletMod.Routing.FormatterOptions
import typingsSlinky.leafletDashRoutingDashMachine.leafletMod.Routing.IRoute
import typingsSlinky.leafletDashRoutingDashMachine.leafletMod.Routing.Itinerary
import typingsSlinky.leafletDashRoutingDashMachine.leafletMod.Routing.ItineraryOptions
import typingsSlinky.leafletDashRoutingDashMachine.leafletMod.Routing.Line
import typingsSlinky.leafletDashRoutingDashMachine.leafletMod.Routing.LineOptions
import typingsSlinky.leafletDashRoutingDashMachine.leafletMod.Routing.OSRMOptions
import typingsSlinky.leafletDashRoutingDashMachine.leafletMod.Routing.OSRMv1
import typingsSlinky.leafletDashRoutingDashMachine.leafletMod.Routing.Plan
import typingsSlinky.leafletDashRoutingDashMachine.leafletMod.Routing.PlanOptions
import typingsSlinky.leafletDashRoutingDashMachine.leafletMod.Routing.RoutingControlOptions
import typingsSlinky.leafletDashRoutingDashMachine.leafletMod.Routing.Waypoint
import typingsSlinky.leafletDashRoutingDashMachine.leafletMod.Routing.WaypointOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("leaflet", "routing")
@js.native
object routing extends js.Object {
  def control(): Control = js.native
  def control(options: RoutingControlOptions): Control = js.native
  def formatter(): Formatter = js.native
  def formatter(options: FormatterOptions): Formatter = js.native
  def itinerary(): Itinerary = js.native
  def itinerary(options: ItineraryOptions): Itinerary = js.native
  def line(route: IRoute): Line = js.native
  def line(route: IRoute, options: LineOptions): Line = js.native
  def osrmv1(): OSRMv1 = js.native
  def osrmv1(options: OSRMOptions): OSRMv1 = js.native
  def plan(waypoints: js.Array[LatLng | Waypoint]): Plan = js.native
  def plan(waypoints: js.Array[LatLng | Waypoint], options: PlanOptions): Plan = js.native
  def waypoint(latLng: LatLng): Waypoint = js.native
  def waypoint(latLng: LatLng, name: String): Waypoint = js.native
  def waypoint(latLng: LatLng, name: String, options: WaypointOptions): Waypoint = js.native
}

