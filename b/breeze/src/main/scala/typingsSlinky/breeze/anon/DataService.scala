package typingsSlinky.breeze.anon

import typingsSlinky.breeze.breeze.EntityQuery
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DataService extends StObject {
  
  var dataService: typingsSlinky.breeze.breeze.DataService = js.native
  
  def getUrl(): String = js.native
  
  var query: EntityQuery = js.native
}
object DataService {
  
  @scala.inline
  def apply(dataService: typingsSlinky.breeze.breeze.DataService, getUrl: () => String, query: EntityQuery): DataService = {
    val __obj = js.Dynamic.literal(dataService = dataService.asInstanceOf[js.Any], getUrl = js.Any.fromFunction0(getUrl), query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataService]
  }
  
  @scala.inline
  implicit class DataServiceMutableBuilder[Self <: DataService] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDataService(value: typingsSlinky.breeze.breeze.DataService): Self = StObject.set(x, "dataService", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetUrl(value: () => String): Self = StObject.set(x, "getUrl", js.Any.fromFunction0(value))
    
    @scala.inline
    def setQuery(value: EntityQuery): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
  }
}
