package typingsSlinky.googleapis.v1managementMod.gamesManagementV1management

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This is a JSON template for the HiddenPlayer resource.
  */
@js.native
trait SchemaHiddenPlayer extends StObject {
  
  /**
    * The time this player was hidden.
    */
  var hiddenTimeMillis: js.UndefOr[String] = js.native
  
  /**
    * Uniquely identifies the type of this resource. Value is always the fixed
    * string gamesManagement#hiddenPlayer.
    */
  var kind: js.UndefOr[String] = js.native
  
  /**
    * The player information.
    */
  var player: js.UndefOr[SchemaPlayer] = js.native
}
object SchemaHiddenPlayer {
  
  @scala.inline
  def apply(): SchemaHiddenPlayer = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaHiddenPlayer]
  }
  
  @scala.inline
  implicit class SchemaHiddenPlayerMutableBuilder[Self <: SchemaHiddenPlayer] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHiddenTimeMillis(value: String): Self = StObject.set(x, "hiddenTimeMillis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHiddenTimeMillisUndefined: Self = StObject.set(x, "hiddenTimeMillis", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setPlayer(value: SchemaPlayer): Self = StObject.set(x, "player", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlayerUndefined: Self = StObject.set(x, "player", js.undefined)
  }
}
