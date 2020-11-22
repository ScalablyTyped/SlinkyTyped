package typingsSlinky.maximMazurokGapiClientPlayablelocations

import typingsSlinky.maximMazurokGapiClientPlayablelocations.gapi.client.playablelocations.V3Resource
import typingsSlinky.maximMazurokGapiClientPlayablelocations.maximMazurokGapiClientPlayablelocationsStrings.playablelocations
import typingsSlinky.maximMazurokGapiClientPlayablelocations.maximMazurokGapiClientPlayablelocationsStrings.v3
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobalScope
@js.native
object global extends js.Object {
  
  @js.native
  object gapi extends js.Object {
    
    @js.native
    object client extends js.Object {
      
      /** Load Playable Locations API v3 */
      def load(name: playablelocations, version: v3): js.Thenable[Unit] = js.native
      def load(name: playablelocations, version: v3, callback: js.Function0[_]): Unit = js.native
      
      @js.native
      object playablelocations extends js.Object {
        
        val v3: V3Resource = js.native
      }
    }
  }
}
