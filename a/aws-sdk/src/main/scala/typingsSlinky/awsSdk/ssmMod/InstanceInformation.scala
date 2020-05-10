package typingsSlinky.awsSdk.ssmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
    * The Amazon Identity and Access Management (IAM) role assigned to the on-premises Systems Manager managed instances. This call does not return the IAM role for Amazon EC2 instances. 
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
    * The name of the managed instance.
    */
  var Name: js.UndefOr[String] = js.native
  /**
    * Connection status of SSM Agent. 
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
    def withActivationId(value: ActivationId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ActivationId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutActivationId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ActivationId")(js.undefined)
        ret
    }
    @scala.inline
    def withAgentVersion(value: Version): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AgentVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAgentVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AgentVersion")(js.undefined)
        ret
    }
    @scala.inline
    def withAssociationOverview(value: InstanceAggregatedAssociationOverview): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AssociationOverview")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAssociationOverview: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AssociationOverview")(js.undefined)
        ret
    }
    @scala.inline
    def withAssociationStatus(value: StatusName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AssociationStatus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAssociationStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AssociationStatus")(js.undefined)
        ret
    }
    @scala.inline
    def withComputerName(value: ComputerName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ComputerName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutComputerName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ComputerName")(js.undefined)
        ret
    }
    @scala.inline
    def withIPAddress(value: IPAddress): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IPAddress")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIPAddress: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IPAddress")(js.undefined)
        ret
    }
    @scala.inline
    def withIamRole(value: IamRole): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IamRole")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIamRole: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IamRole")(js.undefined)
        ret
    }
    @scala.inline
    def withInstanceId(value: InstanceId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InstanceId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInstanceId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InstanceId")(js.undefined)
        ret
    }
    @scala.inline
    def withIsLatestVersion(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IsLatestVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsLatestVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IsLatestVersion")(js.undefined)
        ret
    }
    @scala.inline
    def withLastAssociationExecutionDate(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LastAssociationExecutionDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLastAssociationExecutionDate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LastAssociationExecutionDate")(js.undefined)
        ret
    }
    @scala.inline
    def withLastPingDateTime(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LastPingDateTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLastPingDateTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LastPingDateTime")(js.undefined)
        ret
    }
    @scala.inline
    def withLastSuccessfulAssociationExecutionDate(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LastSuccessfulAssociationExecutionDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLastSuccessfulAssociationExecutionDate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LastSuccessfulAssociationExecutionDate")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Name")(js.undefined)
        ret
    }
    @scala.inline
    def withPingStatus(value: PingStatus): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PingStatus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPingStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PingStatus")(js.undefined)
        ret
    }
    @scala.inline
    def withPlatformName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PlatformName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPlatformName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PlatformName")(js.undefined)
        ret
    }
    @scala.inline
    def withPlatformType(value: PlatformType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PlatformType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPlatformType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PlatformType")(js.undefined)
        ret
    }
    @scala.inline
    def withPlatformVersion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PlatformVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPlatformVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PlatformVersion")(js.undefined)
        ret
    }
    @scala.inline
    def withRegistrationDate(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RegistrationDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRegistrationDate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RegistrationDate")(js.undefined)
        ret
    }
    @scala.inline
    def withResourceType(value: ResourceType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ResourceType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResourceType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ResourceType")(js.undefined)
        ret
    }
  }
  
}

