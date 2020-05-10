package typingsSlinky.leafletGeosearch.mod

import typingsSlinky.leafletGeosearch.AnonAddress
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined leaflet-geosearch.leaflet-geosearch.Omit<leaflet-geosearch.leaflet-geosearch.SearchResult<leaflet-geosearch.leaflet-geosearch.OpenStreetMapProviderResultRaw>, 'raw'> & {  raw  :{  address  :{  house_number  :string,   road  :string,   town  :string,   city  :string,   county  :string,   state_district  :string,   state  :string,   postcode  :string,   country  :string,   country_code  :string}}} */
@js.native
trait OpenStreetMapProviderReverseResult extends js.Object {
  var bounds: BoundsTuple = js.native
  var label: String = js.native
  var raw: AnonAddress = js.native
  var x: String = js.native
  var y: String = js.native
}

object OpenStreetMapProviderReverseResult {
  @scala.inline
  def apply(bounds: BoundsTuple, label: String, raw: AnonAddress, x: String, y: String): OpenStreetMapProviderReverseResult = {
    val __obj = js.Dynamic.literal(bounds = bounds.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], raw = raw.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[OpenStreetMapProviderReverseResult]
  }
  @scala.inline
  implicit class OpenStreetMapProviderReverseResultOps[Self <: OpenStreetMapProviderReverseResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBounds(value: BoundsTuple): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bounds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLabel(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("label")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRaw(value: AnonAddress): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("raw")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withX(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("x")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withY(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("y")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

