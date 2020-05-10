package typingsSlinky.googlemaps.google.maps

import org.scalajs.dom.raw.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InfoWindowOptions extends js.Object {
  /**
    * Content to display in the InfoWindow. This can be an HTML element, a
    * plain-text string, or a string containing HTML. The InfoWindow will be
    * sized according to the content. To set an explicit size for the content,
    * set content to be a HTML element with that size.
    */
  var content: js.UndefOr[String | Node] = js.native
  /**
    * Disable auto-pan on open. By default, the info window will pan the map so
    * that it is fully visible when it opens.
    */
  var disableAutoPan: js.UndefOr[Boolean] = js.native
  /**
    * Maximum width of the infowindow, regardless of content's width.
    * This value is only considered if it is set before a call to open.
    * To change the maximum width when changing content, call close,
    * setOptions, and then open.
    */
  var maxWidth: js.UndefOr[Double] = js.native
  /**
    * The offset, in pixels, of the tip of the info window from the point on
    * the map at whose geographical coordinates the info window is anchored. If
    * an InfoWindow is opened with an anchor, the pixelOffset will be
    * calculated from the anchor's anchorPoint property.
    */
  var pixelOffset: js.UndefOr[Size] = js.native
  /**
    * The LatLng at which to display this InfoWindow. If the InfoWindow is
    * opened with an anchor, the anchor's position will be used instead.
    */
  var position: js.UndefOr[LatLng | LatLngLiteral] = js.native
  /**
    * All InfoWindows are displayed on the map in order of their zIndex,
    * with higher values displaying in front of InfoWindows with lower values.
    * By default, InfoWindows are displayed according to their latitude,
    * with InfoWindows of lower latitudes appearing in front of InfoWindows at
    * higher latitudes. InfoWindows are always displayed in front of markers.
    */
  var zIndex: js.UndefOr[Double] = js.native
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
    def withContentNode(value: Node): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("content")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withContent(value: String | Node): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("content")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("content")(js.undefined)
        ret
    }
    @scala.inline
    def withDisableAutoPan(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableAutoPan")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisableAutoPan: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableAutoPan")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withPixelOffset(value: Size): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pixelOffset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPixelOffset: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pixelOffset")(js.undefined)
        ret
    }
    @scala.inline
    def withPosition(value: LatLng | LatLngLiteral): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("position")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPosition: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("position")(js.undefined)
        ret
    }
    @scala.inline
    def withZIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutZIndex: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zIndex")(js.undefined)
        ret
    }
  }
  
}

