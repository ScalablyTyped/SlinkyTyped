package typingsSlinky.awsSdk.gameliftMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DesiredPlayerSession extends StObject {
  
  /**
    * Developer-defined information related to a player. Amazon GameLift does not use this data, so it can be formatted as needed for use in the game.
    */
  var PlayerData: js.UndefOr[typingsSlinky.awsSdk.gameliftMod.PlayerData] = js.native
  
  /**
    * A unique identifier for a player to associate with the player session.
    */
  var PlayerId: js.UndefOr[NonZeroAndMaxString] = js.native
}
object DesiredPlayerSession {
  
  @scala.inline
  def apply(): DesiredPlayerSession = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DesiredPlayerSession]
  }
  
  @scala.inline
  implicit class DesiredPlayerSessionMutableBuilder[Self <: DesiredPlayerSession] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPlayerData(value: PlayerData): Self = StObject.set(x, "PlayerData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlayerDataUndefined: Self = StObject.set(x, "PlayerData", js.undefined)
    
    @scala.inline
    def setPlayerId(value: NonZeroAndMaxString): Self = StObject.set(x, "PlayerId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlayerIdUndefined: Self = StObject.set(x, "PlayerId", js.undefined)
  }
}
