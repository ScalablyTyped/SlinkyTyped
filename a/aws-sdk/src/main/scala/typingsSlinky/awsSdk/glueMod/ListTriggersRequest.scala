package typingsSlinky.awsSdk.glueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListTriggersRequest extends js.Object {
  
  /**
    *  The name of the job for which to retrieve triggers. The trigger that can start this job is returned. If there is no such trigger, all triggers are returned.
    */
  var DependentJobName: js.UndefOr[NameString] = js.native
  
  /**
    * The maximum size of a list to return.
    */
  var MaxResults: js.UndefOr[PageSize] = js.native
  
  /**
    * A continuation token, if this is a continuation request.
    */
  var NextToken: js.UndefOr[GenericString] = js.native
  
  /**
    * Specifies to return only these tagged resources.
    */
  var Tags: js.UndefOr[TagsMap] = js.native
}
object ListTriggersRequest {
  
  @scala.inline
  def apply(): ListTriggersRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListTriggersRequest]
  }
  
  @scala.inline
  implicit class ListTriggersRequestOps[Self <: ListTriggersRequest] (val x: Self) extends AnyVal {
    
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
    def setDependentJobName(value: NameString): Self = this.set("DependentJobName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDependentJobName: Self = this.set("DependentJobName", js.undefined)
    
    @scala.inline
    def setMaxResults(value: PageSize): Self = this.set("MaxResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxResults: Self = this.set("MaxResults", js.undefined)
    
    @scala.inline
    def setNextToken(value: GenericString): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
    
    @scala.inline
    def setTags(value: TagsMap): Self = this.set("Tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTags: Self = this.set("Tags", js.undefined)
  }
}
