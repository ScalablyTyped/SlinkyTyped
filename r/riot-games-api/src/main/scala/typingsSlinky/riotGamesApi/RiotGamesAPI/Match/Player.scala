package typingsSlinky.riotGamesApi.RiotGamesAPI.Match

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Player extends StObject {
  
  var matchHistoryUri: String = js.native
  
  var profileIcon: Double = js.native
  
  var summonerId: Double = js.native
  
  var summonerName: String = js.native
}
object Player {
  
  @scala.inline
  def apply(matchHistoryUri: String, profileIcon: Double, summonerId: Double, summonerName: String): Player = {
    val __obj = js.Dynamic.literal(matchHistoryUri = matchHistoryUri.asInstanceOf[js.Any], profileIcon = profileIcon.asInstanceOf[js.Any], summonerId = summonerId.asInstanceOf[js.Any], summonerName = summonerName.asInstanceOf[js.Any])
    __obj.asInstanceOf[Player]
  }
  
  @scala.inline
  implicit class PlayerMutableBuilder[Self <: Player] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMatchHistoryUri(value: String): Self = StObject.set(x, "matchHistoryUri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProfileIcon(value: Double): Self = StObject.set(x, "profileIcon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSummonerId(value: Double): Self = StObject.set(x, "summonerId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSummonerName(value: String): Self = StObject.set(x, "summonerName", value.asInstanceOf[js.Any])
  }
}
