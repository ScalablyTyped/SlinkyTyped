package typingsSlinky.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListThingRegistrationTasksResponse extends js.Object {
  
  /**
    * The token to use to get the next set of results, or null if there are no additional results.
    */
  var nextToken: js.UndefOr[NextToken] = js.native
  
  /**
    * A list of bulk thing provisioning task IDs.
    */
  var taskIds: js.UndefOr[TaskIdList] = js.native
}
object ListThingRegistrationTasksResponse {
  
  @scala.inline
  def apply(): ListThingRegistrationTasksResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListThingRegistrationTasksResponse]
  }
  
  @scala.inline
  implicit class ListThingRegistrationTasksResponseOps[Self <: ListThingRegistrationTasksResponse] (val x: Self) extends AnyVal {
    
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
    def setNextToken(value: NextToken): Self = this.set("nextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextToken: Self = this.set("nextToken", js.undefined)
    
    @scala.inline
    def setTaskIdsVarargs(value: TaskId*): Self = this.set("taskIds", js.Array(value :_*))
    
    @scala.inline
    def setTaskIds(value: TaskIdList): Self = this.set("taskIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTaskIds: Self = this.set("taskIds", js.undefined)
  }
}
