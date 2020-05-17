package typingsSlinky.leafletGeosearch.mod

import typingsSlinky.leafletGeosearch.anon.AdminDistrict
import typingsSlinky.leafletGeosearch.anon.BingProviderResultPointca
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BingProviderResultRaw extends js.Object {
  var __type: String = js.native
  var address: AdminDistrict = js.native
  var bbox: js.Tuple4[Double, Double, Double, Double] = js.native
  var confidence: String = js.native
  var entityType: String = js.native
  var geocodePoints: js.Array[BingProviderResultPointca] = js.native
  var matchCodes: js.Array[String] = js.native
  var name: String = js.native
  var point: BingProviderResultPoint = js.native
}

object BingProviderResultRaw {
  @scala.inline
  def apply(
    __type: String,
    address: AdminDistrict,
    bbox: js.Tuple4[Double, Double, Double, Double],
    confidence: String,
    entityType: String,
    geocodePoints: js.Array[BingProviderResultPointca],
    matchCodes: js.Array[String],
    name: String,
    point: BingProviderResultPoint
  ): BingProviderResultRaw = {
    val __obj = js.Dynamic.literal(__type = __type.asInstanceOf[js.Any], address = address.asInstanceOf[js.Any], bbox = bbox.asInstanceOf[js.Any], confidence = confidence.asInstanceOf[js.Any], entityType = entityType.asInstanceOf[js.Any], geocodePoints = geocodePoints.asInstanceOf[js.Any], matchCodes = matchCodes.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], point = point.asInstanceOf[js.Any])
    __obj.asInstanceOf[BingProviderResultRaw]
  }
  @scala.inline
  implicit class BingProviderResultRawOps[Self <: BingProviderResultRaw] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def with__type(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("__type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAddress(value: AdminDistrict): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("address")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBbox(value: js.Tuple4[Double, Double, Double, Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bbox")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withConfidence(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("confidence")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEntityType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("entityType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGeocodePoints(value: js.Array[BingProviderResultPointca]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("geocodePoints")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMatchCodes(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("matchCodes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPoint(value: BingProviderResultPoint): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("point")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

