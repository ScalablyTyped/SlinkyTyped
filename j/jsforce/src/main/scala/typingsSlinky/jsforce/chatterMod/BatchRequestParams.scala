package typingsSlinky.jsforce.chatterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BatchRequestParams extends RequestParams {
  
  var richInput: js.UndefOr[String] = js.native
}
object BatchRequestParams {
  
  @scala.inline
  def apply(method: String, url: String): BatchRequestParams = {
    val __obj = js.Dynamic.literal(method = method.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchRequestParams]
  }
  
  @scala.inline
  implicit class BatchRequestParamsOps[Self <: BatchRequestParams] (val x: Self) extends AnyVal {
    
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
    def setRichInput(value: String): Self = this.set("richInput", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRichInput: Self = this.set("richInput", js.undefined)
  }
}
