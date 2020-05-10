package typingsSlinky.appleMapkitJs

import typingsSlinky.appleMapkitJs.mapkit.CoordinateRegion
import typingsSlinky.appleMapkitJs.mapkit.Place
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonDisplayRegion[Q] extends js.Object {
  /**
    * A region that encloses the search results. This property is not present
    * if there are no results.
    */
  var displayRegion: js.UndefOr[CoordinateRegion] = js.native
  /**
    * An array of Place objects. The places array is empty if there is no match.
    */
  var places: js.Array[Place] = js.native
  /**
    * The query corresponding to the results  The query corresponding to the
    * results, if a SearchAutocompleteResult was not used to perform the search.
    */
  var query: js.UndefOr[String] = js.native
}

object AnonDisplayRegion {
  @scala.inline
  def apply[Q](places: js.Array[Place]): AnonDisplayRegion[Q] = {
    val __obj = js.Dynamic.literal(places = places.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDisplayRegion[Q]]
  }
  @scala.inline
  implicit class AnonDisplayRegionOps[Self[q] <: AnonDisplayRegion[q], Q] (val x: Self[Q]) extends AnyVal {
    @scala.inline
    def duplicate: Self[Q] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[Q]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[Q] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[Q] with Other]
    @scala.inline
    def withPlaces(value: js.Array[Place]): Self[Q] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("places")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDisplayRegion(value: CoordinateRegion): Self[Q] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayRegion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisplayRegion: Self[Q] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayRegion")(js.undefined)
        ret
    }
    @scala.inline
    def withQuery(value: String): Self[Q] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("query")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQuery: Self[Q] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("query")(js.undefined)
        ret
    }
  }
  
}

