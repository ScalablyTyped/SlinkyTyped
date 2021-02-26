package typingsSlinky.maximMazurokGapiClientGamesmanagement.gapi.client.gamesmanagement

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HiddenPlayer extends StObject {
  
  /** Output only. The time this player was hidden. */
  var hiddenTimeMillis: js.UndefOr[String] = js.native
  
  /** Output only. Uniquely identifies the type of this resource. Value is always the fixed string `gamesManagement#hiddenPlayer`. */
  var kind: js.UndefOr[String] = js.native
  
  /** Output only. The player information. */
  var player: js.UndefOr[Player] = js.native
}
object HiddenPlayer {
  
  @scala.inline
  def apply(): HiddenPlayer = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HiddenPlayer]
  }
  
  @scala.inline
  implicit class HiddenPlayerMutableBuilder[Self <: HiddenPlayer] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHiddenTimeMillis(value: String): Self = StObject.set(x, "hiddenTimeMillis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHiddenTimeMillisUndefined: Self = StObject.set(x, "hiddenTimeMillis", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setPlayer(value: Player): Self = StObject.set(x, "player", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlayerUndefined: Self = StObject.set(x, "player", js.undefined)
  }
}
