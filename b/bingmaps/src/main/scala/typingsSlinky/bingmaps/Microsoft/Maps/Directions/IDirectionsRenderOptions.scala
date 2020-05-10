package typingsSlinky.bingmaps.Microsoft.Maps.Directions

import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.bingmaps.Microsoft.Maps.IPolylineOptions
import typingsSlinky.bingmaps.Microsoft.Maps.IPushpinOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
    def withAutoUpdateMapView(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoUpdateMapView")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoUpdateMapView: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoUpdateMapView")(js.undefined)
        ret
    }
    @scala.inline
    def withDisplayDisclaimer(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayDisclaimer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisplayDisclaimer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayDisclaimer")(js.undefined)
        ret
    }
    @scala.inline
    def withDisplayManeuverIcons(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayManeuverIcons")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisplayManeuverIcons: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayManeuverIcons")(js.undefined)
        ret
    }
    @scala.inline
    def withDisplayPostItineraryItemHints(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayPostItineraryItemHints")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisplayPostItineraryItemHints: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayPostItineraryItemHints")(js.undefined)
        ret
    }
    @scala.inline
    def withDisplayPreItineraryItemHints(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayPreItineraryItemHints")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisplayPreItineraryItemHints: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayPreItineraryItemHints")(js.undefined)
        ret
    }
    @scala.inline
    def withDisplayRouteSelector(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayRouteSelector")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisplayRouteSelector: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayRouteSelector")(js.undefined)
        ret
    }
    @scala.inline
    def withDisplayStepWarnings(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayStepWarnings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisplayStepWarnings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayStepWarnings")(js.undefined)
        ret
    }
    @scala.inline
    def withDisplayWalkingWarning(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayWalkingWarning")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisplayWalkingWarning: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayWalkingWarning")(js.undefined)
        ret
    }
    @scala.inline
    def withDrivingPolylineOptions(value: IPolylineOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("drivingPolylineOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDrivingPolylineOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("drivingPolylineOptions")(js.undefined)
        ret
    }
    @scala.inline
    def withFirstWaypointPushpinOptions(value: IPushpinOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("firstWaypointPushpinOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFirstWaypointPushpinOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("firstWaypointPushpinOptions")(js.undefined)
        ret
    }
    @scala.inline
    def withItineraryContainer(value: HTMLElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itineraryContainer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutItineraryContainer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itineraryContainer")(js.undefined)
        ret
    }
    @scala.inline
    def withLastWaypointPushpinOptions(value: IPushpinOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastWaypointPushpinOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLastWaypointPushpinOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastWaypointPushpinOptions")(js.undefined)
        ret
    }
    @scala.inline
    def withShowInputPanel(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showInputPanel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowInputPanel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showInputPanel")(js.undefined)
        ret
    }
    @scala.inline
    def withTransitPolylineOptions(value: IPolylineOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transitPolylineOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTransitPolylineOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transitPolylineOptions")(js.undefined)
        ret
    }
    @scala.inline
    def withWalkingPolylineOptions(value: IPolylineOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("walkingPolylineOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWalkingPolylineOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("walkingPolylineOptions")(js.undefined)
        ret
    }
    @scala.inline
    def withWaypointPushpinOptions(value: IPushpinOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("waypointPushpinOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWaypointPushpinOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("waypointPushpinOptions")(js.undefined)
        ret
    }
  }
  
}

