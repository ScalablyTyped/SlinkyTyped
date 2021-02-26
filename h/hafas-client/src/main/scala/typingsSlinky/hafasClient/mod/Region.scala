package typingsSlinky.hafasClient.mod

import typingsSlinky.hafasClient.hafasClientStrings.region
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A region is a group of stations, for example a metropolitan area or a geographical or cultural region.
  */
@js.native
trait Region extends StObject {
  
  var id: String = js.native
  
  var name: String = js.native
  
  /** station ids */
  var stations: js.Array[String] = js.native
  
  var `type`: region = js.native
}
object Region {
  
  @scala.inline
  def apply(id: String, name: String, stations: js.Array[String], `type`: region): Region = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], stations = stations.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Region]
  }
  
  @scala.inline
  implicit class RegionMutableBuilder[Self <: Region] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStations(value: js.Array[String]): Self = StObject.set(x, "stations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStationsVarargs(value: String*): Self = StObject.set(x, "stations", js.Array(value :_*))
    
    @scala.inline
    def setType(value: region): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
