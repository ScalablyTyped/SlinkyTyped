package typingsSlinky.maximMazurokGapiClientReseller

import typingsSlinky.maximMazurokGapiClientReseller.gapi.client.reseller.CustomersResource
import typingsSlinky.maximMazurokGapiClientReseller.gapi.client.reseller.ResellernotifyResource
import typingsSlinky.maximMazurokGapiClientReseller.gapi.client.reseller.SubscriptionsResource
import typingsSlinky.maximMazurokGapiClientReseller.maximMazurokGapiClientResellerStrings.reseller
import typingsSlinky.maximMazurokGapiClientReseller.maximMazurokGapiClientResellerStrings.v1
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object gapi {
    
    object client {
      
      /** Load Workspace Reseller API v1 */
      @JSGlobal("gapi.client.load")
      @js.native
      def load(name: reseller, version: v1): js.Thenable[Unit] = js.native
      @JSGlobal("gapi.client.load")
      @js.native
      def load(name: reseller, version: v1, callback: js.Function0[_]): Unit = js.native
      
      object reseller {
        
        @JSGlobal("gapi.client.reseller.customers")
        @js.native
        val customers: CustomersResource = js.native
        
        @JSGlobal("gapi.client.reseller.resellernotify")
        @js.native
        val resellernotify: ResellernotifyResource = js.native
        
        @JSGlobal("gapi.client.reseller.subscriptions")
        @js.native
        val subscriptions: SubscriptionsResource = js.native
      }
    }
  }
}
