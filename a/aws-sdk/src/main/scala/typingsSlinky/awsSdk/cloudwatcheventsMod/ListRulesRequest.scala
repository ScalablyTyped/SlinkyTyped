package typingsSlinky.awsSdk.cloudwatcheventsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListRulesRequest extends js.Object {
  
  /**
    * Limits the results to show only the rules associated with the specified event bus.
    */
  var EventBusName: js.UndefOr[typingsSlinky.awsSdk.cloudwatcheventsMod.EventBusName] = js.native
  
  /**
    * The maximum number of results to return.
    */
  var Limit: js.UndefOr[LimitMax100] = js.native
  
  /**
    * The prefix matching the rule name.
    */
  var NamePrefix: js.UndefOr[RuleName] = js.native
  
  /**
    * The token returned by a previous call to retrieve the next set of results.
    */
  var NextToken: js.UndefOr[typingsSlinky.awsSdk.cloudwatcheventsMod.NextToken] = js.native
}
object ListRulesRequest {
  
  @scala.inline
  def apply(): ListRulesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListRulesRequest]
  }
  
  @scala.inline
  implicit class ListRulesRequestOps[Self <: ListRulesRequest] (val x: Self) extends AnyVal {
    
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
    def setEventBusName(value: EventBusName): Self = this.set("EventBusName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEventBusName: Self = this.set("EventBusName", js.undefined)
    
    @scala.inline
    def setLimit(value: LimitMax100): Self = this.set("Limit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLimit: Self = this.set("Limit", js.undefined)
    
    @scala.inline
    def setNamePrefix(value: RuleName): Self = this.set("NamePrefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNamePrefix: Self = this.set("NamePrefix", js.undefined)
    
    @scala.inline
    def setNextToken(value: NextToken): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
  }
}
