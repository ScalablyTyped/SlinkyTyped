package typingsSlinky.esriDashLeafletDashGeocoder.leafletMod.esri.Geocoding

import typingsSlinky.esriDashLeaflet.esriDashLeafletMod.Service
import typingsSlinky.esriDashLeaflet.esriDashLeafletMod.Task
import typingsSlinky.esriDashLeaflet.esriDashLeafletMod.leafletMod.esri.TaskOptions
import typingsSlinky.esriDashLeafletDashGeocoder.Anon_Address
import typingsSlinky.leaflet.leafletMod.LatLngExpression
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("leaflet", "esri.Geocoding.ReverseGeocode")
@js.native
class ReverseGeocode () extends Task {
  def this(options: Service) = this()
  def this(options: TaskOptions) = this()
  def distance(distance: Double): this.type = js.native
  def language(language: String): this.type = js.native
  def latlng(latlng: LatLngExpression): this.type = js.native
  def run(
    callback: js.Function3[
      /* error */ js.UndefOr[js.Any], 
      /* results */ Anon_Address, 
      /* response */ js.Any, 
      Unit
    ]
  ): this.type = js.native
  def run(
    callback: js.Function3[
      /* error */ js.UndefOr[js.Any], 
      /* results */ Anon_Address, 
      /* response */ js.Any, 
      Unit
    ],
    context: js.Any
  ): this.type = js.native
}

@JSImport("leaflet", "esri.Geocoding.reverseGeocode")
@js.native
object reverseGeocode extends js.Object {
  def apply(): ReverseGeocode = js.native
  def apply(options: Service): ReverseGeocode = js.native
  def apply(options: TaskOptions): ReverseGeocode = js.native
}

