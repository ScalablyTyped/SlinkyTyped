package typingsSlinky.oversmash

import typingsSlinky.oversmash.mod.CallerOptions
import typingsSlinky.oversmash.mod.Player
import typingsSlinky.oversmash.mod.PlayerStats
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Options extends StObject {
    
    val options: CallerOptions = js.native
    
    def player(name: String): js.Promise[Player] = js.native
    def player(name: String, platfortm: String): js.Promise[Player] = js.native
    
    def playerStats(name: String): js.Promise[PlayerStats] = js.native
    def playerStats(name: String, platform: String): js.Promise[PlayerStats] = js.native
  }
}
