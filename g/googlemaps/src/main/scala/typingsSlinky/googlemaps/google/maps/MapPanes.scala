package typingsSlinky.googlemaps.google.maps

import org.scalajs.dom.raw.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** @see {@link https://developers.google.com/maps/documentation/javascript/reference/overlay-view#MapPanes Maps JavaScript API} */
@js.native
trait MapPanes extends js.Object {
  /**
    * This pane contains the info window. (Pane 4).
    * It is above all map overlays.
    * @see {@link overlayMouseTarget pane below}
    * @see {@link https://developers.google.com/maps/documentation/javascript/reference/overlay-view#MapPanes.floatPane Maps JavaScript API}
    */
  val floatPane: Element = js.native
  /**
    * This pane is the lowest pane and is above the tiles. (Pane 0).
    * It may not receive DOM events.
    * @see {@link overlayLayer pane above}
    * @see {@link https://developers.google.com/maps/documentation/javascript/reference/overlay-view#MapPanes.mapPane Maps JavaScript API}
    */
  val mapPane: Element = js.native
  /**
    * This pane contains markers. (Pane 2).
    * It may not receive DOM events.
    * @see {@link floatPane pane above}
    * @see {@link overlayLayer pane below}
    * @see {@link https://developers.google.com/maps/documentation/javascript/reference/overlay-view#MapPanes.markerLayer Maps JavaScript API}
    */
  val markerLayer: Element = js.native
  /**
    * This pane contains polylines, polygons, ground overlays and tile layer overlays. (Pane 1).
    * It may not receive DOM events.
    * @see {@link markerLayer pane above}
    * @see {@link mapPane pane below}
    * @see {@link https://developers.google.com/maps/documentation/javascript/reference/overlay-view#MapPanes.overlayLayer Maps JavaScript API}
    */
  val overlayLayer: Element = js.native
  /**
    * This pane contains elements that receive DOM events. (Pane 3).
    * @see {@link floatPane pane above}
    * @see {@link markerLayer pane below}
    * @see {@link https://developers.google.com/maps/documentation/javascript/reference/overlay-view#MapPanes.overlayMouseTarget Maps JavaScript API}
    */
  val overlayMouseTarget: Element = js.native
}

object MapPanes {
  @scala.inline
  def apply(
    floatPane: Element,
    mapPane: Element,
    markerLayer: Element,
    overlayLayer: Element,
    overlayMouseTarget: Element
  ): MapPanes = {
    val __obj = js.Dynamic.literal(floatPane = floatPane.asInstanceOf[js.Any], mapPane = mapPane.asInstanceOf[js.Any], markerLayer = markerLayer.asInstanceOf[js.Any], overlayLayer = overlayLayer.asInstanceOf[js.Any], overlayMouseTarget = overlayMouseTarget.asInstanceOf[js.Any])
    __obj.asInstanceOf[MapPanes]
  }
  @scala.inline
  implicit class MapPanesOps[Self <: MapPanes] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFloatPane(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("floatPane")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMapPane(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mapPane")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMarkerLayer(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("markerLayer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOverlayLayer(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overlayLayer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOverlayMouseTarget(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overlayMouseTarget")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

