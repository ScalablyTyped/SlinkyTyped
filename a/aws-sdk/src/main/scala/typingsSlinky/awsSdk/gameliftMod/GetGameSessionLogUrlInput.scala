package typingsSlinky.awsSdk.gameliftMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetGameSessionLogUrlInput extends StObject {
  
  /**
    * A unique identifier for the game session to get logs for. 
    */
  var GameSessionId: ArnStringModel = js.native
}
object GetGameSessionLogUrlInput {
  
  @scala.inline
  def apply(GameSessionId: ArnStringModel): GetGameSessionLogUrlInput = {
    val __obj = js.Dynamic.literal(GameSessionId = GameSessionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetGameSessionLogUrlInput]
  }
  
  @scala.inline
  implicit class GetGameSessionLogUrlInputMutableBuilder[Self <: GetGameSessionLogUrlInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGameSessionId(value: ArnStringModel): Self = StObject.set(x, "GameSessionId", value.asInstanceOf[js.Any])
  }
}
