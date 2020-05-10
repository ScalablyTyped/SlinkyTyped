package typingsSlinky.awsSdk.gameliftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FleetAttributes extends js.Object {
  /**
    *  The Amazon Resource Name (ARN) associated with the GameLift build resource that is deployed on instances in this fleet. In a GameLift build ARN, the resource ID matches the BuildId value.
    */
  var BuildArn: js.UndefOr[typingsSlinky.awsSdk.gameliftMod.BuildArn] = js.native
  /**
    * A unique identifier for a build.
    */
  var BuildId: js.UndefOr[typingsSlinky.awsSdk.gameliftMod.BuildId] = js.native
  /**
    * Indicates whether a TLS/SSL certificate was generated for the fleet. 
    */
  var CertificateConfiguration: js.UndefOr[typingsSlinky.awsSdk.gameliftMod.CertificateConfiguration] = js.native
  /**
    * Time stamp indicating when this data object was created. Format is a number expressed in Unix time as milliseconds (for example "1469498468.057").
    */
  var CreationTime: js.UndefOr[js.Date] = js.native
  /**
    * Human-readable description of the fleet.
    */
  var Description: js.UndefOr[NonZeroAndMaxString] = js.native
  /**
    * The Amazon Resource Name (ARN) that is assigned to a GameLift fleet resource and uniquely identifies it. ARNs are unique across all Regions. In a GameLift fleet ARN, the resource ID matches the FleetId value.
    */
  var FleetArn: js.UndefOr[ArnStringModel] = js.native
  /**
    * A unique identifier for a fleet.
    */
  var FleetId: js.UndefOr[typingsSlinky.awsSdk.gameliftMod.FleetId] = js.native
  /**
    * Indicates whether the fleet uses on-demand or spot instances. A spot instance in use may be interrupted with a two-minute notification.
    */
  var FleetType: js.UndefOr[typingsSlinky.awsSdk.gameliftMod.FleetType] = js.native
  /**
    * A unique identifier for an AWS IAM role that manages access to your AWS services. With an instance role ARN set, any application that runs on an instance in this fleet can assume the role, including install scripts, server processes, and daemons (background processes). Create a role or look up a role's ARN from the IAM dashboard in the AWS Management Console. Learn more about using on-box credentials for your game servers at  Access external resources from a game server.
    */
  var InstanceRoleArn: js.UndefOr[NonEmptyString] = js.native
  /**
    * EC2 instance type indicating the computing resources of each instance in the fleet, including CPU, memory, storage, and networking capacity. See Amazon EC2 Instance Types for detailed descriptions.
    */
  var InstanceType: js.UndefOr[EC2InstanceType] = js.native
  /**
    * Location of default log files. When a server process is shut down, Amazon GameLift captures and stores any log files in this location. These logs are in addition to game session logs; see more on game session logs in the Amazon GameLift Developer Guide. If no default log path for a fleet is specified, Amazon GameLift automatically uploads logs that are stored on each instance at C:\game\logs (for Windows) or /local/game/logs (for Linux). Use the Amazon GameLift console to access stored logs. 
    */
  var LogPaths: js.UndefOr[StringList] = js.native
  /**
    * Names of metric groups that this fleet is included in. In Amazon CloudWatch, you can view metrics for an individual fleet or aggregated metrics for fleets that are in a fleet metric group. A fleet can be included in only one metric group at a time.
    */
  var MetricGroups: js.UndefOr[MetricGroupList] = js.native
  /**
    * A descriptive label that is associated with a fleet. Fleet names do not need to be unique.
    */
  var Name: js.UndefOr[NonZeroAndMaxString] = js.native
  /**
    * The type of game session protection to set for all new instances started in the fleet.    NoProtection -- The game session can be terminated during a scale-down event.    FullProtection -- If the game session is in an ACTIVE status, it cannot be terminated during a scale-down event.  
    */
  var NewGameSessionProtectionPolicy: js.UndefOr[ProtectionPolicy] = js.native
  /**
    * Operating system of the fleet's computing resources. A fleet's operating system depends on the OS specified for the build that is deployed on this fleet.
    */
  var OperatingSystem: js.UndefOr[typingsSlinky.awsSdk.gameliftMod.OperatingSystem] = js.native
  /**
    * Fleet policy to limit the number of game sessions an individual player can create over a span of time.
    */
  var ResourceCreationLimitPolicy: js.UndefOr[typingsSlinky.awsSdk.gameliftMod.ResourceCreationLimitPolicy] = js.native
  /**
    *  The Amazon Resource Name (ARN) associated with the GameLift script resource that is deployed on instances in this fleet. In a GameLift script ARN, the resource ID matches the ScriptId value.
    */
  var ScriptArn: js.UndefOr[typingsSlinky.awsSdk.gameliftMod.ScriptArn] = js.native
  /**
    * A unique identifier for a Realtime script.
    */
  var ScriptId: js.UndefOr[typingsSlinky.awsSdk.gameliftMod.ScriptId] = js.native
  /**
    * Game server launch parameters specified for fleets created before 2016-08-04 (or AWS SDK v. 0.12.16). Server launch parameters for fleets created after this date are specified in the fleet's RuntimeConfiguration.
    */
  var ServerLaunchParameters: js.UndefOr[NonZeroAndMaxString] = js.native
  /**
    * Path to a game server executable in the fleet's build, specified for fleets created before 2016-08-04 (or AWS SDK v. 0.12.16). Server launch paths for fleets created after this date are specified in the fleet's RuntimeConfiguration.
    */
  var ServerLaunchPath: js.UndefOr[NonZeroAndMaxString] = js.native
  /**
    * Current status of the fleet. Possible fleet statuses include the following:    NEW -- A new fleet has been defined and desired instances is set to 1.     DOWNLOADING/VALIDATING/BUILDING/ACTIVATING -- Amazon GameLift is setting up the new fleet, creating new instances with the game build or Realtime script and starting server processes.    ACTIVE -- Hosts can now accept game sessions.    ERROR -- An error occurred when downloading, validating, building, or activating the fleet.    DELETING -- Hosts are responding to a delete fleet request.    TERMINATED -- The fleet no longer exists.  
    */
  var Status: js.UndefOr[FleetStatus] = js.native
  /**
    * List of fleet actions that have been suspended using StopFleetActions. This includes auto-scaling.
    */
  var StoppedActions: js.UndefOr[FleetActionList] = js.native
  /**
    * Time stamp indicating when this data object was terminated. Format is a number expressed in Unix time as milliseconds (for example "1469498468.057").
    */
  var TerminationTime: js.UndefOr[js.Date] = js.native
}

object FleetAttributes {
  @scala.inline
  def apply(): FleetAttributes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FleetAttributes]
  }
  @scala.inline
  implicit class FleetAttributesOps[Self <: FleetAttributes] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBuildArn(value: BuildArn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BuildArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBuildArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BuildArn")(js.undefined)
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
    def withCreationTime(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CreationTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCreationTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CreationTime")(js.undefined)
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
    def withFleetArn(value: ArnStringModel): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FleetArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFleetArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FleetArn")(js.undefined)
        ret
    }
    @scala.inline
    def withFleetId(value: FleetId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FleetId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFleetId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FleetId")(js.undefined)
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
    def withInstanceType(value: EC2InstanceType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InstanceType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInstanceType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InstanceType")(js.undefined)
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
    def withName(value: NonZeroAndMaxString): Self = {
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
    def withOperatingSystem(value: OperatingSystem): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OperatingSystem")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOperatingSystem: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OperatingSystem")(js.undefined)
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
    def withScriptArn(value: ScriptArn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ScriptArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScriptArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ScriptArn")(js.undefined)
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
    def withStatus(value: FleetStatus): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Status")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Status")(js.undefined)
        ret
    }
    @scala.inline
    def withStoppedActions(value: FleetActionList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StoppedActions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStoppedActions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StoppedActions")(js.undefined)
        ret
    }
    @scala.inline
    def withTerminationTime(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TerminationTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTerminationTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TerminationTime")(js.undefined)
        ret
    }
  }
  
}

