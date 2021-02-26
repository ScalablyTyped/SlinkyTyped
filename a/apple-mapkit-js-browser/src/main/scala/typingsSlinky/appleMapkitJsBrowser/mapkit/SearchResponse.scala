package typingsSlinky.appleMapkitJsBrowser.mapkit

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The result of a search, including the original search query, the bounding
  * region, and a list of places that match the query.
  */
@js.native
trait SearchResponse extends StObject {
  
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
  implicit class SearchResponseMutableBuilder[Self <: SearchResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBoundingRegion(value: CoordinateRegion): Self = StObject.set(x, "boundingRegion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlaces(value: js.Array[Place]): Self = StObject.set(x, "places", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlacesVarargs(value: Place*): Self = StObject.set(x, "places", js.Array(value :_*))
    
    @scala.inline
    def setQuery(value: String): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
  }
}
