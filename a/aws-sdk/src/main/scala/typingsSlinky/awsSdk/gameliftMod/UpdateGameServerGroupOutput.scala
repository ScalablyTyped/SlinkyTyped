package typingsSlinky.awsSdk.gameliftMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateGameServerGroupOutput extends StObject {
  
  /**
    * An object that describes the game server group resource with updated properties. 
    */
  var GameServerGroup: js.UndefOr[typingsSlinky.awsSdk.gameliftMod.GameServerGroup] = js.native
}
object UpdateGameServerGroupOutput {
  
  @scala.inline
  def apply(): UpdateGameServerGroupOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateGameServerGroupOutput]
  }
  
  @scala.inline
  implicit class UpdateGameServerGroupOutputMutableBuilder[Self <: UpdateGameServerGroupOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGameServerGroup(value: GameServerGroup): Self = StObject.set(x, "GameServerGroup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGameServerGroupUndefined: Self = StObject.set(x, "GameServerGroup", js.undefined)
  }
}
