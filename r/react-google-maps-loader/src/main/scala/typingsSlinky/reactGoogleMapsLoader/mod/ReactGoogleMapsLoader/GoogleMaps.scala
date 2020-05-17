package typingsSlinky.reactGoogleMapsLoader.mod.ReactGoogleMapsLoader

import typingsSlinky.reactGoogleMapsLoader.anon.Typeofgeometry
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GoogleMaps extends js.Object {
  val Data: js.Any = js.native
  /***** AdSense Library *****/
  val adsense: js.Any = js.native
  /***** Drawing Library *****/
  val drawing: js.Any = js.native
  val event: js.Any = js.native
  /***** Geometry Library *****/
  val geometry: Typeofgeometry = js.native
  /***** Places Library *****/
  val places: js.Any = js.native
  /***** Visualization Library *****/
  val visualization: js.Any = js.native
}

object GoogleMaps {
  @scala.inline
  def apply(
    Data: js.Any,
    adsense: js.Any,
    drawing: js.Any,
    event: js.Any,
    geometry: Typeofgeometry,
    places: js.Any,
    visualization: js.Any
  ): GoogleMaps = {
    val __obj = js.Dynamic.literal(Data = Data.asInstanceOf[js.Any], adsense = adsense.asInstanceOf[js.Any], drawing = drawing.asInstanceOf[js.Any], event = event.asInstanceOf[js.Any], geometry = geometry.asInstanceOf[js.Any], places = places.asInstanceOf[js.Any], visualization = visualization.asInstanceOf[js.Any])
    __obj.asInstanceOf[GoogleMaps]
  }
  @scala.inline
  implicit class GoogleMapsOps[Self <: GoogleMaps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withData(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Data")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAdsense(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("adsense")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDrawing(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("drawing")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEvent(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("event")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGeometry(value: Typeofgeometry): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("geometry")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPlaces(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("places")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVisualization(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visualization")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

