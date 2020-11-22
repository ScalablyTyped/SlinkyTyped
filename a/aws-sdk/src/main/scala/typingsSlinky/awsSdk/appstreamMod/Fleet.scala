package typingsSlinky.awsSdk.appstreamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Fleet extends js.Object {
  
  /**
    * The Amazon Resource Name (ARN) for the fleet.
    */
  var Arn: typingsSlinky.awsSdk.appstreamMod.Arn = js.native
  
  /**
    * The capacity status for the fleet.
    */
  var ComputeCapacityStatus: typingsSlinky.awsSdk.appstreamMod.ComputeCapacityStatus = js.native
  
  /**
    * The time the fleet was created.
    */
  var CreatedTime: js.UndefOr[js.Date] = js.native
  
  /**
    * The description to display.
    */
  var Description: js.UndefOr[String] = js.native
  
  /**
    * The amount of time that a streaming session remains active after users disconnect. If they try to reconnect to the streaming session after a disconnection or network interruption within this time interval, they are connected to their previous session. Otherwise, they are connected to a new session with a new streaming instance. Specify a value between 60 and 360000.
    */
  var DisconnectTimeoutInSeconds: js.UndefOr[Integer] = js.native
  
  /**
    * The fleet name to display.
    */
  var DisplayName: js.UndefOr[String] = js.native
  
  /**
    * The name of the directory and organizational unit (OU) to use to join the fleet to a Microsoft Active Directory domain. 
    */
  var DomainJoinInfo: js.UndefOr[typingsSlinky.awsSdk.appstreamMod.DomainJoinInfo] = js.native
  
  /**
    * Indicates whether default internet access is enabled for the fleet.
    */
  var EnableDefaultInternetAccess: js.UndefOr[BooleanObject] = js.native
  
  /**
    * The fleet errors.
    */
  var FleetErrors: js.UndefOr[typingsSlinky.awsSdk.appstreamMod.FleetErrors] = js.native
  
  /**
    * The fleet type.  ALWAYS_ON  Provides users with instant-on access to their apps. You are charged for all running instances in your fleet, even if no users are streaming apps.  ON_DEMAND  Provide users with access to applications after they connect, which takes one to two minutes. You are charged for instance streaming when users are connected and a small hourly fee for instances that are not streaming apps.  
    */
  var FleetType: js.UndefOr[typingsSlinky.awsSdk.appstreamMod.FleetType] = js.native
  
  /**
    * The ARN of the IAM role that is applied to the fleet. To assume a role, the fleet instance calls the AWS Security Token Service (STS) AssumeRole API operation and passes the ARN of the role to use. The operation creates a new session with temporary credentials. AppStream 2.0 retrieves the temporary credentials and creates the appstream_machine_role credential profile on the instance. For more information, see Using an IAM Role to Grant Permissions to Applications and Scripts Running on AppStream 2.0 Streaming Instances in the Amazon AppStream 2.0 Administration Guide.
    */
  var IamRoleArn: js.UndefOr[Arn] = js.native
  
  /**
    * The amount of time that users can be idle (inactive) before they are disconnected from their streaming session and the DisconnectTimeoutInSeconds time interval begins. Users are notified before they are disconnected due to inactivity. If users try to reconnect to the streaming session before the time interval specified in DisconnectTimeoutInSeconds elapses, they are connected to their previous session. Users are considered idle when they stop providing keyboard or mouse input during their streaming session. File uploads and downloads, audio in, audio out, and pixels changing do not qualify as user activity. If users continue to be idle after the time interval in IdleDisconnectTimeoutInSeconds elapses, they are disconnected. To prevent users from being disconnected due to inactivity, specify a value of 0. Otherwise, specify a value between 60 and 3600. The default value is 0.  If you enable this feature, we recommend that you specify a value that corresponds exactly to a whole number of minutes (for example, 60, 120, and 180). If you don't do this, the value is rounded to the nearest minute. For example, if you specify a value of 70, users are disconnected after 1 minute of inactivity. If you specify a value that is at the midpoint between two different minutes, the value is rounded up. For example, if you specify a value of 90, users are disconnected after 2 minutes of inactivity.  
    */
  var IdleDisconnectTimeoutInSeconds: js.UndefOr[Integer] = js.native
  
  /**
    * The ARN for the public, private, or shared image.
    */
  var ImageArn: js.UndefOr[Arn] = js.native
  
  /**
    * The name of the image used to create the fleet.
    */
  var ImageName: js.UndefOr[String] = js.native
  
  /**
    * The instance type to use when launching fleet instances. The following instance types are available:   stream.standard.medium   stream.standard.large   stream.compute.large   stream.compute.xlarge   stream.compute.2xlarge   stream.compute.4xlarge   stream.compute.8xlarge   stream.memory.large   stream.memory.xlarge   stream.memory.2xlarge   stream.memory.4xlarge   stream.memory.8xlarge   stream.memory.z1d.large   stream.memory.z1d.xlarge   stream.memory.z1d.2xlarge   stream.memory.z1d.3xlarge   stream.memory.z1d.6xlarge   stream.memory.z1d.12xlarge   stream.graphics-design.large   stream.graphics-design.xlarge   stream.graphics-design.2xlarge   stream.graphics-design.4xlarge   stream.graphics-desktop.2xlarge   stream.graphics.g4dn.xlarge   stream.graphics.g4dn.2xlarge   stream.graphics.g4dn.4xlarge   stream.graphics.g4dn.8xlarge   stream.graphics.g4dn.12xlarge   stream.graphics.g4dn.16xlarge   stream.graphics-pro.4xlarge   stream.graphics-pro.8xlarge   stream.graphics-pro.16xlarge  
    */
  var InstanceType: String = js.native
  
  /**
    * The maximum amount of time that a streaming session can remain active, in seconds. If users are still connected to a streaming instance five minutes before this limit is reached, they are prompted to save any open documents before being disconnected. After this time elapses, the instance is terminated and replaced by a new instance.  Specify a value between 600 and 360000.
    */
  var MaxUserDurationInSeconds: js.UndefOr[Integer] = js.native
  
  /**
    * The name of the fleet.
    */
  var Name: String = js.native
  
  /**
    * The current state for the fleet.
    */
  var State: FleetState = js.native
  
  /**
    * The AppStream 2.0 view that is displayed to your users when they stream from the fleet. When APP is specified, only the windows of applications opened by users display. When DESKTOP is specified, the standard desktop that is provided by the operating system displays. The default value is APP.
    */
  var StreamView: js.UndefOr[typingsSlinky.awsSdk.appstreamMod.StreamView] = js.native
  
  /**
    * The VPC configuration for the fleet.
    */
  var VpcConfig: js.UndefOr[typingsSlinky.awsSdk.appstreamMod.VpcConfig] = js.native
}
object Fleet {
  
  @scala.inline
  def apply(
    Arn: Arn,
    ComputeCapacityStatus: ComputeCapacityStatus,
    InstanceType: String,
    Name: String,
    State: FleetState
  ): Fleet = {
    val __obj = js.Dynamic.literal(Arn = Arn.asInstanceOf[js.Any], ComputeCapacityStatus = ComputeCapacityStatus.asInstanceOf[js.Any], InstanceType = InstanceType.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], State = State.asInstanceOf[js.Any])
    __obj.asInstanceOf[Fleet]
  }
  
  @scala.inline
  implicit class FleetOps[Self <: Fleet] (val x: Self) extends AnyVal {
    
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
    def setArn(value: Arn): Self = this.set("Arn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setComputeCapacityStatus(value: ComputeCapacityStatus): Self = this.set("ComputeCapacityStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstanceType(value: String): Self = this.set("InstanceType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = this.set("Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setState(value: FleetState): Self = this.set("State", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreatedTime(value: js.Date): Self = this.set("CreatedTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreatedTime: Self = this.set("CreatedTime", js.undefined)
    
    @scala.inline
    def setDescription(value: String): Self = this.set("Description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("Description", js.undefined)
    
    @scala.inline
    def setDisconnectTimeoutInSeconds(value: Integer): Self = this.set("DisconnectTimeoutInSeconds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisconnectTimeoutInSeconds: Self = this.set("DisconnectTimeoutInSeconds", js.undefined)
    
    @scala.inline
    def setDisplayName(value: String): Self = this.set("DisplayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisplayName: Self = this.set("DisplayName", js.undefined)
    
    @scala.inline
    def setDomainJoinInfo(value: DomainJoinInfo): Self = this.set("DomainJoinInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDomainJoinInfo: Self = this.set("DomainJoinInfo", js.undefined)
    
    @scala.inline
    def setEnableDefaultInternetAccess(value: BooleanObject): Self = this.set("EnableDefaultInternetAccess", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnableDefaultInternetAccess: Self = this.set("EnableDefaultInternetAccess", js.undefined)
    
    @scala.inline
    def setFleetErrorsVarargs(value: FleetError*): Self = this.set("FleetErrors", js.Array(value :_*))
    
    @scala.inline
    def setFleetErrors(value: FleetErrors): Self = this.set("FleetErrors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFleetErrors: Self = this.set("FleetErrors", js.undefined)
    
    @scala.inline
    def setFleetType(value: FleetType): Self = this.set("FleetType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFleetType: Self = this.set("FleetType", js.undefined)
    
    @scala.inline
    def setIamRoleArn(value: Arn): Self = this.set("IamRoleArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIamRoleArn: Self = this.set("IamRoleArn", js.undefined)
    
    @scala.inline
    def setIdleDisconnectTimeoutInSeconds(value: Integer): Self = this.set("IdleDisconnectTimeoutInSeconds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIdleDisconnectTimeoutInSeconds: Self = this.set("IdleDisconnectTimeoutInSeconds", js.undefined)
    
    @scala.inline
    def setImageArn(value: Arn): Self = this.set("ImageArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteImageArn: Self = this.set("ImageArn", js.undefined)
    
    @scala.inline
    def setImageName(value: String): Self = this.set("ImageName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteImageName: Self = this.set("ImageName", js.undefined)
    
    @scala.inline
    def setMaxUserDurationInSeconds(value: Integer): Self = this.set("MaxUserDurationInSeconds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxUserDurationInSeconds: Self = this.set("MaxUserDurationInSeconds", js.undefined)
    
    @scala.inline
    def setStreamView(value: StreamView): Self = this.set("StreamView", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStreamView: Self = this.set("StreamView", js.undefined)
    
    @scala.inline
    def setVpcConfig(value: VpcConfig): Self = this.set("VpcConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVpcConfig: Self = this.set("VpcConfig", js.undefined)
  }
}
