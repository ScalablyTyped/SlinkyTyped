package typingsSlinky.awsSdk.gameliftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateFleetInput extends js.Object {
  /**
    * A unique identifier for a build to be deployed on the new fleet. You can use either the build ID or ARN value. The custom game server build must have been successfully uploaded to Amazon GameLift and be in a READY status. This fleet setting cannot be changed once the fleet is created. 
    */
  var BuildId: js.UndefOr[typingsSlinky.awsSdk.gameliftMod.BuildId] = js.native
  /**
    * Indicates whether to generate a TLS/SSL certificate for the new fleet. TLS certificates are used for encrypting traffic between game clients and game servers running on GameLift. If this parameter is not specified, the default value, DISABLED, is used. This fleet setting cannot be changed once the fleet is created. Learn more at Securing Client/Server Communication.  Note: This feature requires the AWS Certificate Manager (ACM) service, which is available in the AWS global partition but not in all other partitions. When working in a partition that does not support this feature, a request for a new fleet with certificate generation results fails with a 4xx unsupported Region error. Valid values include:     GENERATED - Generate a TLS/SSL certificate for this fleet.    DISABLED - (default) Do not generate a TLS/SSL certificate for this fleet.  
    */
  var CertificateConfiguration: js.UndefOr[typingsSlinky.awsSdk.gameliftMod.CertificateConfiguration] = js.native
  /**
    * A human-readable description of a fleet.
    */
  var Description: js.UndefOr[NonZeroAndMaxString] = js.native
  /**
    * Range of IP addresses and port settings that permit inbound traffic to access game sessions that are running on the fleet. For fleets using a custom game build, this parameter is required before game sessions running on the fleet can accept connections. For Realtime Servers fleets, Amazon GameLift automatically sets TCP and UDP ranges for use by the Realtime servers. You can specify multiple permission settings or add more by updating the fleet.
    */
  var EC2InboundPermissions: js.UndefOr[IpPermissionsList] = js.native
  /**
    * The name of an EC2 instance type that is supported in Amazon GameLift. A fleet instance type determines the computing resources of each instance in the fleet, including CPU, memory, storage, and networking capacity. Amazon GameLift supports the following EC2 instance types. See Amazon EC2 Instance Types for detailed descriptions.
    */
  var EC2InstanceType: typingsSlinky.awsSdk.gameliftMod.EC2InstanceType = js.native
  /**
    * Indicates whether to use On-Demand instances or Spot instances for this fleet. If empty, the default is ON_DEMAND. Both categories of instances use identical hardware and configurations based on the instance type selected for this fleet. Learn more about  On-Demand versus Spot Instances. 
    */
  var FleetType: js.UndefOr[typingsSlinky.awsSdk.gameliftMod.FleetType] = js.native
  /**
    * A unique identifier for an AWS IAM role that manages access to your AWS services. With an instance role ARN set, any application that runs on an instance in this fleet can assume the role, including install scripts, server processes, and daemons (background processes). Create a role or look up a role's ARN from the IAM dashboard in the AWS Management Console. Learn more about using on-box credentials for your game servers at  Access external resources from a game server.
    */
  var InstanceRoleArn: js.UndefOr[NonEmptyString] = js.native
  /**
    * This parameter is no longer used. Instead, to specify where Amazon GameLift should store log files once a server process shuts down, use the Amazon GameLift server API ProcessReady() and specify one or more directory paths in logParameters. See more information in the Server API Reference. 
    */
  var LogPaths: js.UndefOr[StringList] = js.native
  /**
    * The name of an Amazon CloudWatch metric group to add this fleet to. A metric group aggregates the metrics for all fleets in the group. Specify an existing metric group name, or provide a new name to create a new metric group. A fleet can only be included in one metric group at a time. 
    */
  var MetricGroups: js.UndefOr[MetricGroupList] = js.native
  /**
    * A descriptive label that is associated with a fleet. Fleet names do not need to be unique.
    */
  var Name: NonZeroAndMaxString = js.native
  /**
    * A game session protection policy to apply to all instances in this fleet. If this parameter is not set, instances in this fleet default to no protection. You can change a fleet's protection policy using UpdateFleetAttributes, but this change will only affect sessions created after the policy change. You can also set protection for individual instances using UpdateGameSession.    NoProtection - The game session can be terminated during a scale-down event.    FullProtection - If the game session is in an ACTIVE status, it cannot be terminated during a scale-down event.  
    */
  var NewGameSessionProtectionPolicy: js.UndefOr[ProtectionPolicy] = js.native
  /**
    * A unique identifier for the AWS account with the VPC that you want to peer your Amazon GameLift fleet with. You can find your account ID in the AWS Management Console under account settings. 
    */
  var PeerVpcAwsAccountId: js.UndefOr[NonZeroAndMaxString] = js.native
  /**
    * A unique identifier for a VPC with resources to be accessed by your Amazon GameLift fleet. The VPC must be in the same Region as your fleet. To look up a VPC ID, use the VPC Dashboard in the AWS Management Console. Learn more about VPC peering in VPC Peering with Amazon GameLift Fleets. 
    */
  var PeerVpcId: js.UndefOr[NonZeroAndMaxString] = js.native
  /**
    * A policy that limits the number of game sessions an individual player can create over a span of time for this fleet.
    */
  var ResourceCreationLimitPolicy: js.UndefOr[typingsSlinky.awsSdk.gameliftMod.ResourceCreationLimitPolicy] = js.native
  /**
    * Instructions for launching server processes on each instance in the fleet. Server processes run either a custom game build executable or a Realtime script. The runtime configuration defines the server executables or launch script file, launch parameters, and the number of processes to run concurrently on each instance. When creating a fleet, the runtime configuration must have at least one server process configuration; otherwise the request fails with an invalid request exception. (This parameter replaces the parameters ServerLaunchPath and ServerLaunchParameters, although requests that contain values for these parameters instead of a runtime configuration will continue to work.) This parameter is required unless the parameters ServerLaunchPath and ServerLaunchParameters are defined. Runtime configuration replaced these parameters, but fleets that use them will continue to work. 
    */
  var RuntimeConfiguration: js.UndefOr[typingsSlinky.awsSdk.gameliftMod.RuntimeConfiguration] = js.native
  /**
    * A unique identifier for a Realtime script to be deployed on the new fleet. You can use either the script ID or ARN value. The Realtime script must have been successfully uploaded to Amazon GameLift. This fleet setting cannot be changed once the fleet is created.
    */
  var ScriptId: js.UndefOr[typingsSlinky.awsSdk.gameliftMod.ScriptId] = js.native
  /**
    * This parameter is no longer used. Instead, specify server launch parameters in the RuntimeConfiguration parameter. (Requests that specify a server launch path and launch parameters instead of a runtime configuration will continue to work.)
    */
  var ServerLaunchParameters: js.UndefOr[NonZeroAndMaxString] = js.native
  /**
    * This parameter is no longer used. Instead, specify a server launch path using the RuntimeConfiguration parameter. Requests that specify a server launch path and launch parameters instead of a runtime configuration will continue to work.
    */
  var ServerLaunchPath: js.UndefOr[NonZeroAndMaxString] = js.native
  /**
    * A list of labels to assign to the new fleet resource. Tags are developer-defined key-value pairs. Tagging AWS resources are useful for resource management, access management and cost allocation. For more information, see  Tagging AWS Resources in the AWS General Reference. Once the resource is created, you can use TagResource, UntagResource, and ListTagsForResource to add, remove, and view tags. The maximum tag limit may be lower than stated. See the AWS General Reference for actual tagging limits.
    */
  var Tags: js.UndefOr[TagList] = js.native
}

object CreateFleetInput {
  @scala.inline
  def apply(EC2InstanceType: EC2InstanceType, Name: NonZeroAndMaxString): CreateFleetInput = {
    val __obj = js.Dynamic.literal(EC2InstanceType = EC2InstanceType.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateFleetInput]
  }
  @scala.inline
  implicit class CreateFleetInputOps[Self <: CreateFleetInput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEC2InstanceType(value: EC2InstanceType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EC2InstanceType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: NonZeroAndMaxString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBuildId(value: BuildId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BuildId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBuildId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BuildId")(js.undefined)
        ret
    }
    @scala.inline
    def withCertificateConfiguration(value: CertificateConfiguration): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CertificateConfiguration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCertificateConfiguration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CertificateConfiguration")(js.undefined)
        ret
    }
    @scala.inline
    def withDescription(value: NonZeroAndMaxString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDescription: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Description")(js.undefined)
        ret
    }
    @scala.inline
    def withEC2InboundPermissions(value: IpPermissionsList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EC2InboundPermissions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEC2InboundPermissions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EC2InboundPermissions")(js.undefined)
        ret
    }
    @scala.inline
    def withFleetType(value: FleetType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FleetType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFleetType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FleetType")(js.undefined)
        ret
    }
    @scala.inline
    def withInstanceRoleArn(value: NonEmptyString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InstanceRoleArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInstanceRoleArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InstanceRoleArn")(js.undefined)
        ret
    }
    @scala.inline
    def withLogPaths(value: StringList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LogPaths")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLogPaths: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LogPaths")(js.undefined)
        ret
    }
    @scala.inline
    def withMetricGroups(value: MetricGroupList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MetricGroups")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMetricGroups: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MetricGroups")(js.undefined)
        ret
    }
    @scala.inline
    def withNewGameSessionProtectionPolicy(value: ProtectionPolicy): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NewGameSessionProtectionPolicy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNewGameSessionProtectionPolicy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NewGameSessionProtectionPolicy")(js.undefined)
        ret
    }
    @scala.inline
    def withPeerVpcAwsAccountId(value: NonZeroAndMaxString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PeerVpcAwsAccountId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPeerVpcAwsAccountId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PeerVpcAwsAccountId")(js.undefined)
        ret
    }
    @scala.inline
    def withPeerVpcId(value: NonZeroAndMaxString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PeerVpcId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPeerVpcId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PeerVpcId")(js.undefined)
        ret
    }
    @scala.inline
    def withResourceCreationLimitPolicy(value: ResourceCreationLimitPolicy): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ResourceCreationLimitPolicy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResourceCreationLimitPolicy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ResourceCreationLimitPolicy")(js.undefined)
        ret
    }
    @scala.inline
    def withRuntimeConfiguration(value: RuntimeConfiguration): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RuntimeConfiguration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRuntimeConfiguration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RuntimeConfiguration")(js.undefined)
        ret
    }
    @scala.inline
    def withScriptId(value: ScriptId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ScriptId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScriptId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ScriptId")(js.undefined)
        ret
    }
    @scala.inline
    def withServerLaunchParameters(value: NonZeroAndMaxString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ServerLaunchParameters")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutServerLaunchParameters: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ServerLaunchParameters")(js.undefined)
        ret
    }
    @scala.inline
    def withServerLaunchPath(value: NonZeroAndMaxString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ServerLaunchPath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutServerLaunchPath: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ServerLaunchPath")(js.undefined)
        ret
    }
    @scala.inline
    def withTags(value: TagList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Tags")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTags: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Tags")(js.undefined)
        ret
    }
  }
  
}

