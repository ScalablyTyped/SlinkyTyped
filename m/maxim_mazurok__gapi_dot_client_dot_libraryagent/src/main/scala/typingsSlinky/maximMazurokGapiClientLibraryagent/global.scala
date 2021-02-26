package typingsSlinky.maximMazurokGapiClientLibraryagent

import typingsSlinky.maximMazurokGapiClientLibraryagent.gapi.client.libraryagent.ShelvesResource
import typingsSlinky.maximMazurokGapiClientLibraryagent.maximMazurokGapiClientLibraryagentStrings.libraryagent
import typingsSlinky.maximMazurokGapiClientLibraryagent.maximMazurokGapiClientLibraryagentStrings.v1
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object gapi {
    
    object client {
      
      object libraryagent {
        
        @JSGlobal("gapi.client.libraryagent.shelves")
        @js.native
        val shelves: ShelvesResource = js.native
      }
      
      /** Load Library Agent API v1 */
      @JSGlobal("gapi.client.load")
      @js.native
      def load(name: libraryagent, version: v1): js.Thenable[Unit] = js.native
      @JSGlobal("gapi.client.load")
      @js.native
      def load(name: libraryagent, version: v1, callback: js.Function0[_]): Unit = js.native
    }
  }
}
