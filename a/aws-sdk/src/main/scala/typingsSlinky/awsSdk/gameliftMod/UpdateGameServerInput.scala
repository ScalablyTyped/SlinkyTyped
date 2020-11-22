package typingsSlinky.awsSdk.gameliftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateGameServerInput extends js.Object {
  
  /**
    * A set of custom game server properties, formatted as a single string value. This data is passed to a game client or service when it requests information on game servers using ListGameServers or ClaimGameServer. 
    */
  var GameServerData: js.UndefOr[typingsSlinky.awsSdk.gameliftMod.GameServerData] = js.native
  
  /**
    * A unique identifier for the game server group where the game server is running. Use either the GameServerGroup name or ARN value.
    */
  var GameServerGroupName: GameServerGroupNameOrArn = js.native
  
  /**
    * A custom string that uniquely identifies the game server to update.
    */
  var GameServerId: typingsSlinky.awsSdk.gameliftMod.GameServerId = js.native
  
  /**
    * Indicates health status of the game server. A request that includes this parameter updates the game server's LastHealthCheckTime timestamp. 
    */
  var HealthCheck: js.UndefOr[GameServerHealthCheck] = js.native
  
  /**
    * Indicates whether the game server is available or is currently hosting gameplay.
    */
  var UtilizationStatus: js.UndefOr[GameServerUtilizationStatus] = js.native
}
object UpdateGameServerInput {
  
  @scala.inline
  def apply(GameServerGroupName: GameServerGroupNameOrArn, GameServerId: GameServerId): UpdateGameServerInput = {
    val __obj = js.Dynamic.literal(GameServerGroupName = GameServerGroupName.asInstanceOf[js.Any], GameServerId = GameServerId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateGameServerInput]
  }
  
  @scala.inline
  implicit class UpdateGameServerInputOps[Self <: UpdateGameServerInput] (val x: Self) extends AnyVal {
    
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
    def setGameServerId(value: GameServerId): Self = this.set("GameServerId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGameServerData(value: GameServerData): Self = this.set("GameServerData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGameServerData: Self = this.set("GameServerData", js.undefined)
    
    @scala.inline
    def setHealthCheck(value: GameServerHealthCheck): Self = this.set("HealthCheck", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHealthCheck: Self = this.set("HealthCheck", js.undefined)
    
    @scala.inline
    def setUtilizationStatus(value: GameServerUtilizationStatus): Self = this.set("UtilizationStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUtilizationStatus: Self = this.set("UtilizationStatus", js.undefined)
  }
}
