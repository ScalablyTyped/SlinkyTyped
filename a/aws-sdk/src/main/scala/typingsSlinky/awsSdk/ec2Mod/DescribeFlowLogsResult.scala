package typingsSlinky.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeFlowLogsResult extends js.Object {
  
  /**
    * Information about the flow logs.
    */
  var FlowLogs: js.UndefOr[FlowLogSet] = js.native
  
  /**
    * The token to use to retrieve the next page of results. This value is null when there are no more results to return.
    */
  var NextToken: js.UndefOr[String] = js.native
}
object DescribeFlowLogsResult {
  
  @scala.inline
  def apply(): DescribeFlowLogsResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeFlowLogsResult]
  }
  
  @scala.inline
  implicit class DescribeFlowLogsResultOps[Self <: DescribeFlowLogsResult] (val x: Self) extends AnyVal {
    
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
    def setFlowLogsVarargs(value: FlowLog*): Self = this.set("FlowLogs", js.Array(value :_*))
    
    @scala.inline
    def setFlowLogs(value: FlowLogSet): Self = this.set("FlowLogs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFlowLogs: Self = this.set("FlowLogs", js.undefined)
    
    @scala.inline
    def setNextToken(value: String): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
  }
}
