package typingsSlinky.awsSdk.mediapackageMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListChannelsRequest extends js.Object {
  
  /**
    * Upper bound on number of records to return.
    */
  var MaxResults: js.UndefOr[typingsSlinky.awsSdk.mediapackageMod.MaxResults] = js.native
  
  /**
    * A token used to resume pagination from the end of a previous request.
    */
  var NextToken: js.UndefOr[string] = js.native
}
object ListChannelsRequest {
  
  @scala.inline
  def apply(): ListChannelsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListChannelsRequest]
  }
  
  @scala.inline
  implicit class ListChannelsRequestOps[Self <: ListChannelsRequest] (val x: Self) extends AnyVal {
    
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
    def setMaxResults(value: MaxResults): Self = this.set("MaxResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxResults: Self = this.set("MaxResults", js.undefined)
    
    @scala.inline
    def setNextToken(value: string): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
  }
}
