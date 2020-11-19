package typingsSlinky.awsSdk.guarddutyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FlowLogsConfigurationResult extends js.Object {
  
  /**
    * Denotes whether VPC flow logs is enabled as a data source.
    */
  var Status: DataSourceStatus = js.native
}
object FlowLogsConfigurationResult {
  
  @scala.inline
  def apply(Status: DataSourceStatus): FlowLogsConfigurationResult = {
    val __obj = js.Dynamic.literal(Status = Status.asInstanceOf[js.Any])
    __obj.asInstanceOf[FlowLogsConfigurationResult]
  }
  
  @scala.inline
  implicit class FlowLogsConfigurationResultOps[Self <: FlowLogsConfigurationResult] (val x: Self) extends AnyVal {
    
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
    def setStatus(value: DataSourceStatus): Self = this.set("Status", value.asInstanceOf[js.Any])
  }
}
