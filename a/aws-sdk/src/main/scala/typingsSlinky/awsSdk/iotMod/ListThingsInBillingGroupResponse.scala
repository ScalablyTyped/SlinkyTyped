package typingsSlinky.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListThingsInBillingGroupResponse extends js.Object {
  
  /**
    * The token used to get the next set of results, or null if there are no additional results.
    */
  var nextToken: js.UndefOr[NextToken] = js.native
  
  /**
    * A list of things in the billing group.
    */
  var things: js.UndefOr[ThingNameList] = js.native
}
object ListThingsInBillingGroupResponse {
  
  @scala.inline
  def apply(): ListThingsInBillingGroupResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListThingsInBillingGroupResponse]
  }
  
  @scala.inline
  implicit class ListThingsInBillingGroupResponseOps[Self <: ListThingsInBillingGroupResponse] (val x: Self) extends AnyVal {
    
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
    def setThingsVarargs(value: ThingName*): Self = this.set("things", js.Array(value :_*))
    
    @scala.inline
    def setThings(value: ThingNameList): Self = this.set("things", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteThings: Self = this.set("things", js.undefined)
  }
}
