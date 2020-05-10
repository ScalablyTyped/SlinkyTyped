package typingsSlinky.googlemaps.google.maps.places

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FindPlaceFromQueryRequest extends js.Object {
  var fields: js.Array[String] = js.native
  var locationBias: js.UndefOr[LocationBias] = js.native
  var query: String = js.native
}

object FindPlaceFromQueryRequest {
  @scala.inline
  def apply(fields: js.Array[String], query: String): FindPlaceFromQueryRequest = {
    val __obj = js.Dynamic.literal(fields = fields.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[FindPlaceFromQueryRequest]
  }
  @scala.inline
  implicit class FindPlaceFromQueryRequestOps[Self <: FindPlaceFromQueryRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFields(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fields")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQuery(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("query")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLocationBias(value: LocationBias): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("locationBias")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLocationBias: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("locationBias")(js.undefined)
        ret
    }
  }
  
}

