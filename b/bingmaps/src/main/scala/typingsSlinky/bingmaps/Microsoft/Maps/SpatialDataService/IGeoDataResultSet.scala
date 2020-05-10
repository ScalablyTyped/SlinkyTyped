package typingsSlinky.bingmaps.Microsoft.Maps.SpatialDataService

import typingsSlinky.bingmaps.Microsoft.Maps.Location
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IGeoDataResultSet extends js.Object {
  /** Copyright information for the GeoData API. */
  var Copyright: String = js.native
  /** The location provided in the query that generated this result. */
  var location: String | Location = js.native
  /** Results of the boundary data. */
  var results: js.Array[IGeoDataResult] = js.native
}

object IGeoDataResultSet {
  @scala.inline
  def apply(Copyright: String, location: String | Location, results: js.Array[IGeoDataResult]): IGeoDataResultSet = {
    val __obj = js.Dynamic.literal(Copyright = Copyright.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any], results = results.asInstanceOf[js.Any])
    __obj.asInstanceOf[IGeoDataResultSet]
  }
  @scala.inline
  implicit class IGeoDataResultSetOps[Self <: IGeoDataResultSet] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCopyright(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Copyright")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLocation(value: String | Location): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("location")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withResults(value: js.Array[IGeoDataResult]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("results")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

