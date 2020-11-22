package typingsSlinky.awsSdk.gameliftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateGameServerGroupInput extends js.Object {
  
  /**
    * Configuration settings to define a scaling policy for the Auto Scaling group that is optimized for game hosting. The scaling policy uses the metric "PercentUtilizedGameServers" to maintain a buffer of idle game servers that can immediately accommodate new games and players. After the Auto Scaling group is created, update this value directly in the Auto Scaling group using the AWS console or APIs.
    */
  var AutoScalingPolicy: js.UndefOr[GameServerGroupAutoScalingPolicy] = js.native
  
  /**
    * Indicates how GameLift FleetIQ balances the use of Spot Instances and On-Demand Instances in the game server group. Method options include the following:    SPOT_ONLY - Only Spot Instances are used in the game server group. If Spot Instances are unavailable or not viable for game hosting, the game server group provides no hosting capacity until Spot Instances can again be used. Until then, no new instances are started, and the existing nonviable Spot Instances are terminated (after current gameplay ends) and are not replaced.    SPOT_PREFERRED - (default value) Spot Instances are used whenever available in the game server group. If Spot Instances are unavailable, the game server group continues to provide hosting capacity by falling back to On-Demand Instances. Existing nonviable Spot Instances are terminated (after current gameplay ends) and are replaced with new On-Demand Instances.    ON_DEMAND_ONLY - Only On-Demand Instances are used in the game server group. No Spot Instances are used, even when available, while this balancing strategy is in force.  
    */
  var BalancingStrategy: js.UndefOr[typingsSlinky.awsSdk.gameliftMod.BalancingStrategy] = js.native
  
  /**
    * An identifier for the new game server group. This value is used to generate unique ARN identifiers for the EC2 Auto Scaling group and the GameLift FleetIQ game server group. The name must be unique per Region per AWS account.
    */
  var GameServerGroupName: typingsSlinky.awsSdk.gameliftMod.GameServerGroupName = js.native
  
  /**
    * A flag that indicates whether instances in the game server group are protected from early termination. Unprotected instances that have active game servers running might be terminated during a scale-down event, causing players to be dropped from the game. Protected instances cannot be terminated while there are active game servers running except in the event of a forced game server group deletion (see ). An exception to this is with Spot Instances, which can be terminated by AWS regardless of protection status. This property is set to NO_PROTECTION by default.
    */
  var GameServerProtectionPolicy: js.UndefOr[typingsSlinky.awsSdk.gameliftMod.GameServerProtectionPolicy] = js.native
  
  /**
    * The EC2 instance types and sizes to use in the Auto Scaling group. The instance definitions must specify at least two different instance types that are supported by GameLift FleetIQ. For more information on instance types, see EC2 Instance Types in the Amazon EC2 User Guide. You can optionally specify capacity weighting for each instance type. If no weight value is specified for an instance type, it is set to the default value "1". For more information about capacity weighting, see  Instance Weighting for Amazon EC2 Auto Scaling in the Amazon EC2 Auto Scaling User Guide.
    */
  var InstanceDefinitions: typingsSlinky.awsSdk.gameliftMod.InstanceDefinitions = js.native
  
  /**
    * The EC2 launch template that contains configuration settings and game server code to be deployed to all instances in the game server group. You can specify the template using either the template name or ID. For help with creating a launch template, see Creating a Launch Template for an Auto Scaling Group in the Amazon EC2 Auto Scaling User Guide. After the Auto Scaling group is created, update this value directly in the Auto Scaling group using the AWS console or APIs.
    */
  var LaunchTemplate: LaunchTemplateSpecification = js.native
  
  /**
    * The maximum number of instances allowed in the EC2 Auto Scaling group. During automatic scaling events, GameLift FleetIQ and EC2 do not scale up the group above this maximum. After the Auto Scaling group is created, update this value directly in the Auto Scaling group using the AWS console or APIs.
    */
  var MaxSize: PositiveInteger = js.native
  
  /**
    * The minimum number of instances allowed in the EC2 Auto Scaling group. During automatic scaling events, GameLift FleetIQ and EC2 do not scale down the group below this minimum. In production, this value should be set to at least 1. After the Auto Scaling group is created, update this value directly in the Auto Scaling group using the AWS console or APIs.
    */
  var MinSize: WholeNumber = js.native
  
  /**
    * The Amazon Resource Name (ARN) for an IAM role that allows Amazon GameLift to access your EC2 Auto Scaling groups.
    */
  var RoleArn: IamRoleArn = js.native
  
  /**
    * A list of labels to assign to the new game server group resource. Tags are developer-defined key-value pairs. Tagging AWS resources is useful for resource management, access management, and cost allocation. For more information, see  Tagging AWS Resources in the AWS General Reference. Once the resource is created, you can use TagResource, UntagResource, and ListTagsForResource to add, remove, and view tags, respectively. The maximum tag limit may be lower than stated. See the AWS General Reference for actual tagging limits.
    */
  var Tags: js.UndefOr[TagList] = js.native
  
  /**
    * A list of virtual private cloud (VPC) subnets to use with instances in the game server group. By default, all GameLift FleetIQ-supported Availability Zones are used. You can use this parameter to specify VPCs that you've set up. This property cannot be updated after the game server group is created, and the corresponding Auto Scaling group will always use the property value that is set with this request, even if the Auto Scaling group is updated directly
    */
  var VpcSubnets: js.UndefOr[typingsSlinky.awsSdk.gameliftMod.VpcSubnets] = js.native
}
object CreateGameServerGroupInput {
  
  @scala.inline
  def apply(
    GameServerGroupName: GameServerGroupName,
    InstanceDefinitions: InstanceDefinitions,
    LaunchTemplate: LaunchTemplateSpecification,
    MaxSize: PositiveInteger,
    MinSize: WholeNumber,
    RoleArn: IamRoleArn
  ): CreateGameServerGroupInput = {
    val __obj = js.Dynamic.literal(GameServerGroupName = GameServerGroupName.asInstanceOf[js.Any], InstanceDefinitions = InstanceDefinitions.asInstanceOf[js.Any], LaunchTemplate = LaunchTemplate.asInstanceOf[js.Any], MaxSize = MaxSize.asInstanceOf[js.Any], MinSize = MinSize.asInstanceOf[js.Any], RoleArn = RoleArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateGameServerGroupInput]
  }
  
  @scala.inline
  implicit class CreateGameServerGroupInputOps[Self <: CreateGameServerGroupInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setGameServerGroupName(value: GameServerGroupName): Self = this.set("GameServerGroupName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstanceDefinitionsVarargs(value: InstanceDefinition*): Self = this.set("InstanceDefinitions", js.Array(value :_*))
    
    @scala.inline
    def setInstanceDefinitions(value: InstanceDefinitions): Self = this.set("InstanceDefinitions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLaunchTemplate(value: LaunchTemplateSpecification): Self = this.set("LaunchTemplate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxSize(value: PositiveInteger): Self = this.set("MaxSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinSize(value: WholeNumber): Self = this.set("MinSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoleArn(value: IamRoleArn): Self = this.set("RoleArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoScalingPolicy(value: GameServerGroupAutoScalingPolicy): Self = this.set("AutoScalingPolicy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutoScalingPolicy: Self = this.set("AutoScalingPolicy", js.undefined)
    
    @scala.inline
    def setBalancingStrategy(value: BalancingStrategy): Self = this.set("BalancingStrategy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBalancingStrategy: Self = this.set("BalancingStrategy", js.undefined)
    
    @scala.inline
    def setGameServerProtectionPolicy(value: GameServerProtectionPolicy): Self = this.set("GameServerProtectionPolicy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGameServerProtectionPolicy: Self = this.set("GameServerProtectionPolicy", js.undefined)
    
    @scala.inline
    def setTagsVarargs(value: Tag*): Self = this.set("Tags", js.Array(value :_*))
    
    @scala.inline
    def setTags(value: TagList): Self = this.set("Tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTags: Self = this.set("Tags", js.undefined)
    
    @scala.inline
    def setVpcSubnetsVarargs(value: VpcSubnet*): Self = this.set("VpcSubnets", js.Array(value :_*))
    
    @scala.inline
    def setVpcSubnets(value: VpcSubnets): Self = this.set("VpcSubnets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVpcSubnets: Self = this.set("VpcSubnets", js.undefined)
  }
}
