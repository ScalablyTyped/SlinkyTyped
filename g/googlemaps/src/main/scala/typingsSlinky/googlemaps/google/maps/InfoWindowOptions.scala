package typingsSlinky.googlemaps.google.maps

import org.scalajs.dom.raw.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InfoWindowOptions extends js.Object {
  /**
    * Content to display in the InfoWindow. This can be an HTML element, a
    * plain-text string, or a string containing HTML. The InfoWindow will be
    * sized according to the content. To set an explicit size for the content,
    * set content to be a HTML element with that size.
    */
  var content: js.UndefOr[String | Node] = js.undefined
  /**
    * Disable auto-pan on open. By default, the info window will pan the map so
    * that it is fully visible when it opens.
    */
  var disableAutoPan: js.UndefOr[Boolean] = js.undefined
  /**
    * Maximum width of the infowindow, regardless of content's width.
    * This value is only considered if it is set before a call to open.
    * To change the maximum width when changing content, call close,
    * setOptions, and then open.
    */
  var maxWidth: js.UndefOr[Double] = js.undefined
  /**
    * The offset, in pixels, of the tip of the info window from the point on
    * the map at whose geographical coordinates the info window is anchored. If
    * an InfoWindow is opened with an anchor, the pixelOffset will be
    * calculated from the anchor's anchorPoint property.
    */
  var pixelOffset: js.UndefOr[Size] = js.undefined
  /**
    * The LatLng at which to display this InfoWindow. If the InfoWindow is
    * opened with an anchor, the anchor's position will be used instead.
    */
  var position: js.UndefOr[LatLng | LatLngLiteral] = js.undefined
  /**
    * All InfoWindows are displayed on the map in order of their zIndex,
    * with higher values displaying in front of InfoWindows with lower values.
    * By default, InfoWindows are displayed according to their latitude,
    * with InfoWindows of lower latitudes appearing in front of InfoWindows at
    * higher latitudes. InfoWindows are always displayed in front of markers.
    */
  var zIndex: js.UndefOr[Double] = js.undefined
}

object InfoWindowOptions {
  @scala.inline
  def apply(): InfoWindowOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InfoWindowOptions]
  }
  @scala.inline
  implicit class InfoWindowOptionsOps[Self <: InfoWindowOptions] (val x: Self) extends AnyVal {
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
    def setContentNode(value: Node): Self = this.set("content", value.asInstanceOf[js.Any])
    @scala.inline
    def setContent(value: String | Node): Self = this.set("content", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContent: Self = this.set("content", js.undefined)
    @scala.inline
    def setDisableAutoPan(value: Boolean): Self = this.set("disableAutoPan", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisableAutoPan: Self = this.set("disableAutoPan", js.undefined)
    @scala.inline
    def setMaxWidth(value: Double): Self = this.set("maxWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxWidth: Self = this.set("maxWidth", js.undefined)
    @scala.inline
    def setPixelOffset(value: Size): Self = this.set("pixelOffset", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePixelOffset: Self = this.set("pixelOffset", js.undefined)
    @scala.inline
    def setPosition(value: LatLng | LatLngLiteral): Self = this.set("position", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePosition: Self = this.set("position", js.undefined)
    @scala.inline
    def setZIndex(value: Double): Self = this.set("zIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteZIndex: Self = this.set("zIndex", js.undefined)
  }
  
}

