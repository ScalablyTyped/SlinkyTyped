package typingsSlinky.giphyApi.mod

import typingsSlinky.giphyApi.anon.Count
import typingsSlinky.giphyApi.anon.Msg
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MultiResponse extends BaseResponse {
  
  var data: js.Array[GIFObject] = js.native
}
object MultiResponse {
  
  @scala.inline
  def apply(data: js.Array[GIFObject], meta: Msg, pagination: Count): MultiResponse = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], meta = meta.asInstanceOf[js.Any], pagination = pagination.asInstanceOf[js.Any])
    __obj.asInstanceOf[MultiResponse]
  }
  
  @scala.inline
  implicit class MultiResponseMutableBuilder[Self <: MultiResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setData(value: js.Array[GIFObject]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataVarargs(value: GIFObject*): Self = StObject.set(x, "data", js.Array(value :_*))
  }
}
