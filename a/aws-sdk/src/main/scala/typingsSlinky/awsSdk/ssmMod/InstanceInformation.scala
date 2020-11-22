package typingsSlinky.awsSdk.ssmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InstanceInformation extends js.Object {
  
  /**
    * The activation ID created by Systems Manager when the server or VM was registered.
    */
  var ActivationId: js.UndefOr[typingsSlinky.awsSdk.ssmMod.ActivationId] = js.native
  
  /**
    * The version of SSM Agent running on your Linux instance. 
    */
  var AgentVersion: js.UndefOr[Version] = js.native
  
  /**
    * Information about the association.
    */
  var AssociationOverview: js.UndefOr[InstanceAggregatedAssociationOverview] = js.native
  
  /**
    * The status of the association.
    */
  var AssociationStatus: js.UndefOr[StatusName] = js.native
  
  /**
    * The fully qualified host name of the managed instance.
    */
  var ComputerName: js.UndefOr[typingsSlinky.awsSdk.ssmMod.ComputerName] = js.native
  
  /**
    * The IP address of the managed instance.
    */
  var IPAddress: js.UndefOr[typingsSlinky.awsSdk.ssmMod.IPAddress] = js.native
  
  /**
    * The Amazon Identity and Access Management (IAM) role assigned to the on-premises Systems Manager managed instance. This call does not return the IAM role for EC2 instances. To retrieve the IAM role for an EC2 instance, use the Amazon EC2 DescribeInstances action. For information, see DescribeInstances in the Amazon EC2 API Reference or describe-instances in the AWS CLI Command Reference.
    */
  var IamRole: js.UndefOr[typingsSlinky.awsSdk.ssmMod.IamRole] = js.native
  
  /**
    * The instance ID. 
    */
  var InstanceId: js.UndefOr[typingsSlinky.awsSdk.ssmMod.InstanceId] = js.native
  
  /**
    * Indicates whether the latest version of SSM Agent is running on your Linux Managed Instance. This field does not indicate whether or not the latest version is installed on Windows managed instances, because some older versions of Windows Server use the EC2Config service to process SSM requests.
    */
  var IsLatestVersion: js.UndefOr[Boolean] = js.native
  
  /**
    * The date the association was last run.
    */
  var LastAssociationExecutionDate: js.UndefOr[js.Date] = js.native
  
  /**
    * The date and time when agent last pinged Systems Manager service. 
    */
  var LastPingDateTime: js.UndefOr[js.Date] = js.native
  
  /**
    * The last date the association was successfully run.
    */
  var LastSuccessfulAssociationExecutionDate: js.UndefOr[js.Date] = js.native
  
  /**
    * The name assigned to an on-premises server or virtual machine (VM) when it is activated as a Systems Manager managed instance. The name is specified as the DefaultInstanceName property using the CreateActivation command. It is applied to the managed instance by specifying the Activation Code and Activation ID when you install SSM Agent on the instance, as explained in Install SSM Agent for a hybrid environment (Linux) and Install SSM Agent for a hybrid environment (Windows). To retrieve the Name tag of an EC2 instance, use the Amazon EC2 DescribeInstances action. For information, see DescribeInstances in the Amazon EC2 API Reference or describe-instances in the AWS CLI Command Reference.
    */
  var Name: js.UndefOr[String] = js.native
  
  /**
    * Connection status of SSM Agent.   The status Inactive has been deprecated and is no longer in use. 
    */
  var PingStatus: js.UndefOr[typingsSlinky.awsSdk.ssmMod.PingStatus] = js.native
  
  /**
    * The name of the operating system platform running on your instance. 
    */
  var PlatformName: js.UndefOr[String] = js.native
  
  /**
    * The operating system platform type. 
    */
  var PlatformType: js.UndefOr[typingsSlinky.awsSdk.ssmMod.PlatformType] = js.native
  
  /**
    * The version of the OS platform running on your instance. 
    */
  var PlatformVersion: js.UndefOr[String] = js.native
  
  /**
    * The date the server or VM was registered with AWS as a managed instance.
    */
  var RegistrationDate: js.UndefOr[js.Date] = js.native
  
  /**
    * The type of instance. Instances are either EC2 instances or managed instances. 
    */
  var ResourceType: js.UndefOr[typingsSlinky.awsSdk.ssmMod.ResourceType] = js.native
}
object InstanceInformation {
  
  @scala.inline
  def apply(): InstanceInformation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InstanceInformation]
  }
  
  @scala.inline
  implicit class InstanceInformationOps[Self <: InstanceInformation] (val x: Self) extends AnyVal {
    
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
    def setActivationId(value: ActivationId): Self = this.set("ActivationId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteActivationId: Self = this.set("ActivationId", js.undefined)
    
    @scala.inline
    def setAgentVersion(value: Version): Self = this.set("AgentVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAgentVersion: Self = this.set("AgentVersion", js.undefined)
    
    @scala.inline
    def setAssociationOverview(value: InstanceAggregatedAssociationOverview): Self = this.set("AssociationOverview", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAssociationOverview: Self = this.set("AssociationOverview", js.undefined)
    
    @scala.inline
    def setAssociationStatus(value: StatusName): Self = this.set("AssociationStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAssociationStatus: Self = this.set("AssociationStatus", js.undefined)
    
    @scala.inline
    def setComputerName(value: ComputerName): Self = this.set("ComputerName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteComputerName: Self = this.set("ComputerName", js.undefined)
    
    @scala.inline
    def setIPAddress(value: IPAddress): Self = this.set("IPAddress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIPAddress: Self = this.set("IPAddress", js.undefined)
    
    @scala.inline
    def setIamRole(value: IamRole): Self = this.set("IamRole", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIamRole: Self = this.set("IamRole", js.undefined)
    
    @scala.inline
    def setInstanceId(value: InstanceId): Self = this.set("InstanceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInstanceId: Self = this.set("InstanceId", js.undefined)
    
    @scala.inline
    def setIsLatestVersion(value: Boolean): Self = this.set("IsLatestVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsLatestVersion: Self = this.set("IsLatestVersion", js.undefined)
    
    @scala.inline
    def setLastAssociationExecutionDate(value: js.Date): Self = this.set("LastAssociationExecutionDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLastAssociationExecutionDate: Self = this.set("LastAssociationExecutionDate", js.undefined)
    
    @scala.inline
    def setLastPingDateTime(value: js.Date): Self = this.set("LastPingDateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLastPingDateTime: Self = this.set("LastPingDateTime", js.undefined)
    
    @scala.inline
    def setLastSuccessfulAssociationExecutionDate(value: js.Date): Self = this.set("LastSuccessfulAssociationExecutionDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLastSuccessfulAssociationExecutionDate: Self = this.set("LastSuccessfulAssociationExecutionDate", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("Name", js.undefined)
    
    @scala.inline
    def setPingStatus(value: PingStatus): Self = this.set("PingStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePingStatus: Self = this.set("PingStatus", js.undefined)
    
    @scala.inline
    def setPlatformName(value: String): Self = this.set("PlatformName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePlatformName: Self = this.set("PlatformName", js.undefined)
    
    @scala.inline
    def setPlatformType(value: PlatformType): Self = this.set("PlatformType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePlatformType: Self = this.set("PlatformType", js.undefined)
    
    @scala.inline
    def setPlatformVersion(value: String): Self = this.set("PlatformVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePlatformVersion: Self = this.set("PlatformVersion", js.undefined)
    
    @scala.inline
    def setRegistrationDate(value: js.Date): Self = this.set("RegistrationDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRegistrationDate: Self = this.set("RegistrationDate", js.undefined)
    
    @scala.inline
    def setResourceType(value: ResourceType): Self = this.set("ResourceType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResourceType: Self = this.set("ResourceType", js.undefined)
  }
}
