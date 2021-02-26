package typingsSlinky.maximMazurokGapiClientDiscovery

import typingsSlinky.maximMazurokGapiClientDiscovery.gapi.client.discovery.ApisResource
import typingsSlinky.maximMazurokGapiClientDiscovery.maximMazurokGapiClientDiscoveryStrings.discovery
import typingsSlinky.maximMazurokGapiClientDiscovery.maximMazurokGapiClientDiscoveryStrings.v1
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object gapi {
    
    object client {
      
      object discovery {
        
        @JSGlobal("gapi.client.discovery.apis")
        @js.native
        val apis: ApisResource = js.native
      }
      
      /** Load API Discovery Service v1 */
      @JSGlobal("gapi.client.load")
      @js.native
      def load(name: discovery, version: v1): js.Thenable[Unit] = js.native
      @JSGlobal("gapi.client.load")
      @js.native
      def load(name: discovery, version: v1, callback: js.Function0[_]): Unit = js.native
    }
  }
}
