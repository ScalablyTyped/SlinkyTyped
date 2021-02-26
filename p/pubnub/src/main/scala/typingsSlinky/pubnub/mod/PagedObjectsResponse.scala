package typingsSlinky.pubnub.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PagedObjectsResponse[DataType]
  extends ObjectsResponse[js.Array[DataType]] {
  
  var next: js.UndefOr[String] = js.native
  
  var prev: js.UndefOr[String] = js.native
  
  var totalCount: js.UndefOr[Double] = js.native
}
object PagedObjectsResponse {
  
  @scala.inline
  def apply[DataType](data: js.Array[DataType], status: Double): PagedObjectsResponse[DataType] = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[PagedObjectsResponse[DataType]]
  }
  
  @scala.inline
  implicit class PagedObjectsResponseMutableBuilder[Self <: PagedObjectsResponse[_], DataType] (val x: Self with PagedObjectsResponse[DataType]) extends AnyVal {
    
    @scala.inline
    def setNext(value: String): Self = StObject.set(x, "next", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextUndefined: Self = StObject.set(x, "next", js.undefined)
    
    @scala.inline
    def setPrev(value: String): Self = StObject.set(x, "prev", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrevUndefined: Self = StObject.set(x, "prev", js.undefined)
    
    @scala.inline
    def setTotalCount(value: Double): Self = StObject.set(x, "totalCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTotalCountUndefined: Self = StObject.set(x, "totalCount", js.undefined)
  }
}
