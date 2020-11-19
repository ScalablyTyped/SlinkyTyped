package typingsSlinky.bingmaps.Microsoft.Maps.Directions

import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.bingmaps.Microsoft.Maps.IPolylineOptions
import typingsSlinky.bingmaps.Microsoft.Maps.IPushpinOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IDirectionsRenderOptions extends js.Object {
  
  /** A boolean indicating whether to automatically set the map view to the best map view of the calculated route. Default: true */
  var autoUpdateMapView: js.UndefOr[Boolean] = js.native
  
  /** A boolean indicating whether to display the disclaimer about the accuracy of the directions. Default: true */
  var displayDisclaimer: js.UndefOr[Boolean] = js.native
  
  /** A boolean indicating whether to display the icons for each direction maneuver. Default: true */
  var displayManeuverIcons: js.UndefOr[Boolean] = js.native
  
  /** A boolean indicating whether to display direction hints that describe when a direction step was missed. Default: true */
  var displayPostItineraryItemHints: js.UndefOr[Boolean] = js.native
  
  /**
    * A boolean indicating whether to display direction hints that describe what to look for before you come to the next
    * direction step. The default value is true.
    */
  var displayPreItineraryItemHints: js.UndefOr[Boolean] = js.native
  
  /** A boolean indicating whether to display the route selector control. Default: true */
  var displayRouteSelector: js.UndefOr[Boolean] = js.native
  
  /** A boolean indicating whether to display direction warnings. Default: true */
  var displayStepWarnings: js.UndefOr[Boolean] = js.native
  
  /** A boolean indicating whether to display a warning about walking directions. Default: true */
  var displayWalkingWarning: js.UndefOr[Boolean] = js.native
  
  /** The polyline options that define how to draw the route line on the map, if the RouteMode is driving. */
  var drivingPolylineOptions: js.UndefOr[IPolylineOptions] = js.native
  
  /** The pushpin options that define how the first waypoint should be rendered. */
  var firstWaypointPushpinOptions: js.UndefOr[IPushpinOptions] = js.native
  
  /** The DOM element inside which the directions itinerary will be rendered. */
  var itineraryContainer: js.UndefOr[HTMLElement] = js.native
  
  /** The pushpin options that define how the last waypoint should be rendered. */
  var lastWaypointPushpinOptions: js.UndefOr[IPushpinOptions] = js.native
  
  /** A boolean indicating whether to show the input panel. Default: false */
  var showInputPanel: js.UndefOr[Boolean] = js.native
  
  /** The options that define how to draw the route line on the map, if the RouteMode is transit. */
  var transitPolylineOptions: js.UndefOr[IPolylineOptions] = js.native
  
  /** The options that define how to draw the route line on the map, if the RouteMode is walking. */
  var walkingPolylineOptions: js.UndefOr[IPolylineOptions] = js.native
  
  /** The options that define the pushpin to use for all route waypoints by default. The first and last waypoints in the route will be overriden by firstWaypointPushpinOptions and lastWaypointPushpinOptions if set.  */
  var waypointPushpinOptions: js.UndefOr[IPushpinOptions] = js.native
}
object IDirectionsRenderOptions {
  
  @scala.inline
  def apply(): IDirectionsRenderOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IDirectionsRenderOptions]
  }
  
  @scala.inline
  implicit class IDirectionsRenderOptionsOps[Self <: IDirectionsRenderOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAutoUpdateMapView(value: Boolean): Self = this.set("autoUpdateMapView", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutoUpdateMapView: Self = this.set("autoUpdateMapView", js.undefined)
    
    @scala.inline
    def setDisplayDisclaimer(value: Boolean): Self = this.set("displayDisclaimer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisplayDisclaimer: Self = this.set("displayDisclaimer", js.undefined)
    
    @scala.inline
    def setDisplayManeuverIcons(value: Boolean): Self = this.set("displayManeuverIcons", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisplayManeuverIcons: Self = this.set("displayManeuverIcons", js.undefined)
    
    @scala.inline
    def setDisplayPostItineraryItemHints(value: Boolean): Self = this.set("displayPostItineraryItemHints", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisplayPostItineraryItemHints: Self = this.set("displayPostItineraryItemHints", js.undefined)
    
    @scala.inline
    def setDisplayPreItineraryItemHints(value: Boolean): Self = this.set("displayPreItineraryItemHints", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisplayPreItineraryItemHints: Self = this.set("displayPreItineraryItemHints", js.undefined)
    
    @scala.inline
    def setDisplayRouteSelector(value: Boolean): Self = this.set("displayRouteSelector", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisplayRouteSelector: Self = this.set("displayRouteSelector", js.undefined)
    
    @scala.inline
    def setDisplayStepWarnings(value: Boolean): Self = this.set("displayStepWarnings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisplayStepWarnings: Self = this.set("displayStepWarnings", js.undefined)
    
    @scala.inline
    def setDisplayWalkingWarning(value: Boolean): Self = this.set("displayWalkingWarning", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisplayWalkingWarning: Self = this.set("displayWalkingWarning", js.undefined)
    
    @scala.inline
    def setDrivingPolylineOptions(value: IPolylineOptions): Self = this.set("drivingPolylineOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDrivingPolylineOptions: Self = this.set("drivingPolylineOptions", js.undefined)
    
    @scala.inline
    def setFirstWaypointPushpinOptions(value: IPushpinOptions): Self = this.set("firstWaypointPushpinOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFirstWaypointPushpinOptions: Self = this.set("firstWaypointPushpinOptions", js.undefined)
    
    @scala.inline
    def setItineraryContainer(value: HTMLElement): Self = this.set("itineraryContainer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteItineraryContainer: Self = this.set("itineraryContainer", js.undefined)
    
    @scala.inline
    def setLastWaypointPushpinOptions(value: IPushpinOptions): Self = this.set("lastWaypointPushpinOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLastWaypointPushpinOptions: Self = this.set("lastWaypointPushpinOptions", js.undefined)
    
    @scala.inline
    def setShowInputPanel(value: Boolean): Self = this.set("showInputPanel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowInputPanel: Self = this.set("showInputPanel", js.undefined)
    
    @scala.inline
    def setTransitPolylineOptions(value: IPolylineOptions): Self = this.set("transitPolylineOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTransitPolylineOptions: Self = this.set("transitPolylineOptions", js.undefined)
    
    @scala.inline
    def setWalkingPolylineOptions(value: IPolylineOptions): Self = this.set("walkingPolylineOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWalkingPolylineOptions: Self = this.set("walkingPolylineOptions", js.undefined)
    
    @scala.inline
    def setWaypointPushpinOptions(value: IPushpinOptions): Self = this.set("waypointPushpinOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWaypointPushpinOptions: Self = this.set("waypointPushpinOptions", js.undefined)
  }
}
