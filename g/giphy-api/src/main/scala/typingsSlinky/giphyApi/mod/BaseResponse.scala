package typingsSlinky.giphyApi.mod

import typingsSlinky.giphyApi.anon.Count
import typingsSlinky.giphyApi.anon.Msg
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BaseResponse extends StObject {
  
  var meta: Msg = js.native
  
  var pagination: Count = js.native
}
object BaseResponse {
  
  @scala.inline
  def apply(meta: Msg, pagination: Count): BaseResponse = {
    val __obj = js.Dynamic.literal(meta = meta.asInstanceOf[js.Any], pagination = pagination.asInstanceOf[js.Any])
    __obj.asInstanceOf[BaseResponse]
  }
  
  @scala.inline
  implicit class BaseResponseMutableBuilder[Self <: BaseResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMeta(value: Msg): Self = StObject.set(x, "meta", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPagination(value: Count): Self = StObject.set(x, "pagination", value.asInstanceOf[js.Any])
  }
}
