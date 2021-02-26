package typingsSlinky.bingmaps.Microsoft.Maps.SpatialDataService

import typingsSlinky.bingmaps.Microsoft.Maps.Location
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IGeoDataResultSet extends StObject {
  
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
  implicit class IGeoDataResultSetMutableBuilder[Self <: IGeoDataResultSet] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCopyright(value: String): Self = StObject.set(x, "Copyright", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocation(value: String | Location): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResults(value: js.Array[IGeoDataResult]): Self = StObject.set(x, "results", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResultsVarargs(value: IGeoDataResult*): Self = StObject.set(x, "results", js.Array(value :_*))
  }
}
