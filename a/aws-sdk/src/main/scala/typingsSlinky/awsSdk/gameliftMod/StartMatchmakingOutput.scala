package typingsSlinky.awsSdk.gameliftMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StartMatchmakingOutput extends StObject {
  
  /**
    * Ticket representing the matchmaking request. This object include the information included in the request, ticket status, and match results as generated during the matchmaking process.
    */
  var MatchmakingTicket: js.UndefOr[typingsSlinky.awsSdk.gameliftMod.MatchmakingTicket] = js.native
}
object StartMatchmakingOutput {
  
  @scala.inline
  def apply(): StartMatchmakingOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StartMatchmakingOutput]
  }
  
  @scala.inline
  implicit class StartMatchmakingOutputMutableBuilder[Self <: StartMatchmakingOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMatchmakingTicket(value: MatchmakingTicket): Self = StObject.set(x, "MatchmakingTicket", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMatchmakingTicketUndefined: Self = StObject.set(x, "MatchmakingTicket", js.undefined)
  }
}
