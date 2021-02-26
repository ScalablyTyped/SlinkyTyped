package typingsSlinky.maximMazurokGapiClientCloudsearch.gapi.client.cloudsearch

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PollItemsResponse extends StObject {
  
  /**
    * Set of items from the queue available for connector to process. These items have the following subset of fields populated: version metadata.hash structured_data.hash content.hash
    * payload status queue
    */
  var items: js.UndefOr[js.Array[Item]] = js.native
}
object PollItemsResponse {
  
  @scala.inline
  def apply(): PollItemsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PollItemsResponse]
  }
  
  @scala.inline
  implicit class PollItemsResponseMutableBuilder[Self <: PollItemsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setItems(value: js.Array[Item]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    @scala.inline
    def setItemsVarargs(value: Item*): Self = StObject.set(x, "items", js.Array(value :_*))
  }
}
