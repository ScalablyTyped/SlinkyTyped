package typingsSlinky.appleMapkitJs.mapkit

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An overlay that covers an area of the map with bitmap tiles.
  */
@js.native
trait TileOverlay extends js.Object {
  /**
    * Custom data used to populate the URL template.
    */
  var data: js.Object = js.native
  /**
    * Maximum zoom level of the overlay.
    */
  var maximumZ: Double = js.native
  /**
    * Minimum zoom level of the overlay.
    */
  var minimumZ: Double = js.native
  /**
    * Opacity level of the overlay.
    */
  var opacity: Double = js.native
  /**
    * A string, or callback function that returns a string, with a URL that
    * provides the requested tile.
    */
  var urlTemplate: String | URLTemplateCallback = js.native
  /**
    * Reloads the tile overlay for the displayed map region with the latest
    * data values.
    */
  def reload(): Unit = js.native
}

object TileOverlay {
  @scala.inline
  def apply(
    data: js.Object,
    maximumZ: Double,
    minimumZ: Double,
    opacity: Double,
    reload: () => Unit,
    urlTemplate: String | URLTemplateCallback
  ): TileOverlay = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], maximumZ = maximumZ.asInstanceOf[js.Any], minimumZ = minimumZ.asInstanceOf[js.Any], opacity = opacity.asInstanceOf[js.Any], reload = js.Any.fromFunction0(reload), urlTemplate = urlTemplate.asInstanceOf[js.Any])
    __obj.asInstanceOf[TileOverlay]
  }
  @scala.inline
  implicit class TileOverlayOps[Self <: TileOverlay] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withData(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMaximumZ(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maximumZ")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMinimumZ(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minimumZ")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOpacity(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("opacity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReload(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reload")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withUrlTemplateFunction5(
      value: (/* x */ Double, /* y */ Double, /* z */ Double, /* scale */ Double, /* data */ js.Object) => String
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("urlTemplate")(js.Any.fromFunction5(value))
        ret
    }
    @scala.inline
    def withUrlTemplate(value: String | URLTemplateCallback): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("urlTemplate")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

