package typingsSlinky.giphyApi.mod

import typingsSlinky.giphyApi.anon.Count
import typingsSlinky.giphyApi.anon.Msg
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BaseResponse extends js.Object {
  
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
  implicit class BaseResponseOps[Self <: BaseResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setMeta(value: Msg): Self = this.set("meta", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPagination(value: Count): Self = this.set("pagination", value.asInstanceOf[js.Any])
  }
}
