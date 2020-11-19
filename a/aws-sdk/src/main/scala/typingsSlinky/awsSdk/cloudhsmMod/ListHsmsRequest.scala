package typingsSlinky.awsSdk.cloudhsmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListHsmsRequest extends js.Object {
  
  /**
    * The NextToken value from a previous call to ListHsms. Pass null if this is the first call.
    */
  var NextToken: js.UndefOr[PaginationToken] = js.native
}
object ListHsmsRequest {
  
  @scala.inline
  def apply(): ListHsmsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListHsmsRequest]
  }
  
  @scala.inline
  implicit class ListHsmsRequestOps[Self <: ListHsmsRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setNextToken(value: PaginationToken): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
  }
}
