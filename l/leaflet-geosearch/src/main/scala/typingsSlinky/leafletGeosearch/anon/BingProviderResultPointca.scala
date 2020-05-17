package typingsSlinky.leafletGeosearch.anon

import typingsSlinky.leafletGeosearch.mod.PointTuple
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined leaflet-geosearch.leaflet-geosearch.BingProviderResultPoint & {  calculationMethod  :string,   usageTypes  :std.Array<string>} */
@js.native
trait BingProviderResultPointca extends js.Object {
  var calculationMethod: String = js.native
  var coordinates: PointTuple = js.native
  var `type`: String = js.native
  var usageTypes: js.Array[String] = js.native
}

object BingProviderResultPointca {
  @scala.inline
  def apply(calculationMethod: String, coordinates: PointTuple, `type`: String, usageTypes: js.Array[String]): BingProviderResultPointca = {
    val __obj = js.Dynamic.literal(calculationMethod = calculationMethod.asInstanceOf[js.Any], coordinates = coordinates.asInstanceOf[js.Any], usageTypes = usageTypes.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[BingProviderResultPointca]
  }
  @scala.inline
  implicit class BingProviderResultPointcaOps[Self <: BingProviderResultPointca] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCalculationMethod(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("calculationMethod")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCoordinates(value: PointTuple): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("coordinates")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUsageTypes(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("usageTypes")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

