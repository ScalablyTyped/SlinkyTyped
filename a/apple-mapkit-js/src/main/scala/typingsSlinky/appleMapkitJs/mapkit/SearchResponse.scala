package typingsSlinky.appleMapkitJs.mapkit

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The result of a search, including the original search query, the bounding
  * region, and a list of places that match the query.
  */
@js.native
trait SearchResponse extends js.Object {
  /**
    * The region that encloses the places included in the search results.
    */
  var boundingRegion: CoordinateRegion = js.native
  /**
    * A list of places that match the search query.
    */
  var places: js.Array[Place] = js.native
  /**
    * The query string used to perform the search.
    */
  var query: String = js.native
}

object SearchResponse {
  @scala.inline
  def apply(boundingRegion: CoordinateRegion, places: js.Array[Place], query: String): SearchResponse = {
    val __obj = js.Dynamic.literal(boundingRegion = boundingRegion.asInstanceOf[js.Any], places = places.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchResponse]
  }
  @scala.inline
  implicit class SearchResponseOps[Self <: SearchResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBoundingRegion(value: CoordinateRegion): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("boundingRegion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPlaces(value: js.Array[Place]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("places")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQuery(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("query")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

