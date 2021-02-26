package typingsSlinky.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReportInstanceStatusRequest extends StObject {
  
  /**
    * Descriptive text about the health state of your instance.
    */
  var Description: js.UndefOr[String] = js.native
  
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.native
  
  /**
    * The time at which the reported instance health state ended.
    */
  var EndTime: js.UndefOr[js.Date] = js.native
  
  /**
    * The instances.
    */
  var Instances: InstanceIdStringList = js.native
  
  /**
    * The reason codes that describe the health state of your instance.    instance-stuck-in-state: My instance is stuck in a state.    unresponsive: My instance is unresponsive.    not-accepting-credentials: My instance is not accepting my credentials.    password-not-available: A password is not available for my instance.    performance-network: My instance is experiencing performance problems that I believe are network related.    performance-instance-store: My instance is experiencing performance problems that I believe are related to the instance stores.    performance-ebs-volume: My instance is experiencing performance problems that I believe are related to an EBS volume.    performance-other: My instance is experiencing performance problems.    other: [explain using the description parameter]  
    */
  var ReasonCodes: ReasonCodesList = js.native
  
  /**
    * The time at which the reported instance health state began.
    */
  var StartTime: js.UndefOr[js.Date] = js.native
  
  /**
    * The status of all instances listed.
    */
  var Status: ReportStatusType = js.native
}
object ReportInstanceStatusRequest {
  
  @scala.inline
  def apply(Instances: InstanceIdStringList, ReasonCodes: ReasonCodesList, Status: ReportStatusType): ReportInstanceStatusRequest = {
    val __obj = js.Dynamic.literal(Instances = Instances.asInstanceOf[js.Any], ReasonCodes = ReasonCodes.asInstanceOf[js.Any], Status = Status.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReportInstanceStatusRequest]
  }
  
  @scala.inline
  implicit class ReportInstanceStatusRequestMutableBuilder[Self <: ReportInstanceStatusRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    @scala.inline
    def setDryRun(value: Boolean): Self = StObject.set(x, "DryRun", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDryRunUndefined: Self = StObject.set(x, "DryRun", js.undefined)
    
    @scala.inline
    def setEndTime(value: js.Date): Self = StObject.set(x, "EndTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndTimeUndefined: Self = StObject.set(x, "EndTime", js.undefined)
    
    @scala.inline
    def setInstances(value: InstanceIdStringList): Self = StObject.set(x, "Instances", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstancesVarargs(value: InstanceId*): Self = StObject.set(x, "Instances", js.Array(value :_*))
    
    @scala.inline
    def setReasonCodes(value: ReasonCodesList): Self = StObject.set(x, "ReasonCodes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReasonCodesVarargs(value: ReportInstanceReasonCodes*): Self = StObject.set(x, "ReasonCodes", js.Array(value :_*))
    
    @scala.inline
    def setStartTime(value: js.Date): Self = StObject.set(x, "StartTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartTimeUndefined: Self = StObject.set(x, "StartTime", js.undefined)
    
    @scala.inline
    def setStatus(value: ReportStatusType): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
  }
}
