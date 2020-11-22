package typingsSlinky.awsSdk.gameliftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateGameServerGroupInput extends js.Object {
  
  /**
    * Indicates how GameLift FleetIQ balances the use of Spot Instances and On-Demand Instances in the game server group. Method options include the following:    SPOT_ONLY - Only Spot Instances are used in the game server group. If Spot Instances are unavailable or not viable for game hosting, the game server group provides no hosting capacity until Spot Instances can again be used. Until then, no new instances are started, and the existing nonviable Spot Instances are terminated (after current gameplay ends) and are not replaced.    SPOT_PREFERRED - (default value) Spot Instances are used whenever available in the game server group. If Spot Instances are unavailable, the game server group continues to provide hosting capacity by falling back to On-Demand Instances. Existing nonviable Spot Instances are terminated (after current gameplay ends) and are replaced with new On-Demand Instances.    ON_DEMAND_ONLY - Only On-Demand Instances are used in the game server group. No Spot Instances are used, even when available, while this balancing strategy is in force.  
    */
  var BalancingStrategy: js.UndefOr[typingsSlinky.awsSdk.gameliftMod.BalancingStrategy] = js.native
  
  /**
    * A unique identifier for the game server group. Use either the GameServerGroup name or ARN value.
    */
  var GameServerGroupName: GameServerGroupNameOrArn = js.native
  
  /**
    * A flag that indicates whether instances in the game server group are protected from early termination. Unprotected instances that have active game servers running might be terminated during a scale-down event, causing players to be dropped from the game. Protected instances cannot be terminated while there are active game servers running except in the event of a forced game server group deletion (see ). An exception to this is with Spot Instances, which can be terminated by AWS regardless of protection status. This property is set to NO_PROTECTION by default.
    */
  var GameServerProtectionPolicy: js.UndefOr[typingsSlinky.awsSdk.gameliftMod.GameServerProtectionPolicy] = js.native
  
  /**
    * An updated list of EC2 instance types to use in the Auto Scaling group. The instance definitions must specify at least two different instance types that are supported by GameLift FleetIQ. This updated list replaces the entire current list of instance definitions for the game server group. For more information on instance types, see EC2 Instance Types in the Amazon EC2 User Guide. You can optionally specify capacity weighting for each instance type. If no weight value is specified for an instance type, it is set to the default value "1". For more information about capacity weighting, see  Instance Weighting for Amazon EC2 Auto Scaling in the Amazon EC2 Auto Scaling User Guide.
    */
  var InstanceDefinitions: js.UndefOr[typingsSlinky.awsSdk.gameliftMod.InstanceDefinitions] = js.native
  
  /**
    * The Amazon Resource Name (ARN) for an IAM role that allows Amazon GameLift to access your EC2 Auto Scaling groups.
    */
  var RoleArn: js.UndefOr[IamRoleArn] = js.native
}
object UpdateGameServerGroupInput {
  
  @scala.inline
  def apply(GameServerGroupName: GameServerGroupNameOrArn): UpdateGameServerGroupInput = {
    val __obj = js.Dynamic.literal(GameServerGroupName = GameServerGroupName.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateGameServerGroupInput]
  }
  
  @scala.inline
  implicit class UpdateGameServerGroupInputOps[Self <: UpdateGameServerGroupInput] (val x: Self) extends AnyVal {
    
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
    def setGameServerGroupName(value: GameServerGroupNameOrArn): Self = this.set("GameServerGroupName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBalancingStrategy(value: BalancingStrategy): Self = this.set("BalancingStrategy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBalancingStrategy: Self = this.set("BalancingStrategy", js.undefined)
    
    @scala.inline
    def setGameServerProtectionPolicy(value: GameServerProtectionPolicy): Self = this.set("GameServerProtectionPolicy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGameServerProtectionPolicy: Self = this.set("GameServerProtectionPolicy", js.undefined)
    
    @scala.inline
    def setInstanceDefinitionsVarargs(value: InstanceDefinition*): Self = this.set("InstanceDefinitions", js.Array(value :_*))
    
    @scala.inline
    def setInstanceDefinitions(value: InstanceDefinitions): Self = this.set("InstanceDefinitions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInstanceDefinitions: Self = this.set("InstanceDefinitions", js.undefined)
    
    @scala.inline
    def setRoleArn(value: IamRoleArn): Self = this.set("RoleArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRoleArn: Self = this.set("RoleArn", js.undefined)
  }
}
