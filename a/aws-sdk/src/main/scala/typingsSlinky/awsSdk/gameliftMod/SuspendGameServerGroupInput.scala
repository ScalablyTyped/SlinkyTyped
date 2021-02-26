package typingsSlinky.awsSdk.gameliftMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SuspendGameServerGroupInput extends StObject {
  
  /**
    * A unique identifier for the game server group. Use either the GameServerGroup name or ARN value.
    */
  var GameServerGroupName: GameServerGroupNameOrArn = js.native
  
  /**
    * The activity to suspend for this game server group.
    */
  var SuspendActions: GameServerGroupActions = js.native
}
object SuspendGameServerGroupInput {
  
  @scala.inline
  def apply(GameServerGroupName: GameServerGroupNameOrArn, SuspendActions: GameServerGroupActions): SuspendGameServerGroupInput = {
    val __obj = js.Dynamic.literal(GameServerGroupName = GameServerGroupName.asInstanceOf[js.Any], SuspendActions = SuspendActions.asInstanceOf[js.Any])
    __obj.asInstanceOf[SuspendGameServerGroupInput]
  }
  
  @scala.inline
  implicit class SuspendGameServerGroupInputMutableBuilder[Self <: SuspendGameServerGroupInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGameServerGroupName(value: GameServerGroupNameOrArn): Self = StObject.set(x, "GameServerGroupName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSuspendActions(value: GameServerGroupActions): Self = StObject.set(x, "SuspendActions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSuspendActionsVarargs(value: GameServerGroupAction*): Self = StObject.set(x, "SuspendActions", js.Array(value :_*))
  }
}
