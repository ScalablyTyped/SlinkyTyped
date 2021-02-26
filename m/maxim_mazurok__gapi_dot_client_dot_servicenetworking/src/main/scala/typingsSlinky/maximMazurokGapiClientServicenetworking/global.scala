package typingsSlinky.maximMazurokGapiClientServicenetworking

import typingsSlinky.maximMazurokGapiClientServicenetworking.gapi.client.servicenetworking.OperationsResource
import typingsSlinky.maximMazurokGapiClientServicenetworking.gapi.client.servicenetworking.ServicesResource
import typingsSlinky.maximMazurokGapiClientServicenetworking.maximMazurokGapiClientServicenetworkingStrings.servicenetworking
import typingsSlinky.maximMazurokGapiClientServicenetworking.maximMazurokGapiClientServicenetworkingStrings.v1
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object gapi {
    
    object client {
      
      /** Load Service Networking API v1 */
      @JSGlobal("gapi.client.load")
      @js.native
      def load(name: servicenetworking, version: v1): js.Thenable[Unit] = js.native
      @JSGlobal("gapi.client.load")
      @js.native
      def load(name: servicenetworking, version: v1, callback: js.Function0[_]): Unit = js.native
      
      object servicenetworking {
        
        @JSGlobal("gapi.client.servicenetworking.operations")
        @js.native
        val operations: OperationsResource = js.native
        
        @JSGlobal("gapi.client.servicenetworking.services")
        @js.native
        val services: ServicesResource = js.native
      }
    }
  }
}
