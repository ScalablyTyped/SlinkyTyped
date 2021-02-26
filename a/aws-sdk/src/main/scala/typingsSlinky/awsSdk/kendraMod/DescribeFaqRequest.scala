package typingsSlinky.awsSdk.kendraMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeFaqRequest extends StObject {
  
  /**
    * The unique identifier of the FAQ.
    */
  var Id: FaqId = js.native
  
  /**
    * The identifier of the index that contains the FAQ.
    */
  var IndexId: typingsSlinky.awsSdk.kendraMod.IndexId = js.native
}
object DescribeFaqRequest {
  
  @scala.inline
  def apply(Id: FaqId, IndexId: IndexId): DescribeFaqRequest = {
    val __obj = js.Dynamic.literal(Id = Id.asInstanceOf[js.Any], IndexId = IndexId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeFaqRequest]
  }
  
  @scala.inline
  implicit class DescribeFaqRequestMutableBuilder[Self <: DescribeFaqRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setId(value: FaqId): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndexId(value: IndexId): Self = StObject.set(x, "IndexId", value.asInstanceOf[js.Any])
  }
}
