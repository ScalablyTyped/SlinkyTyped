package typingsSlinky.maximMazurokGapiClientReseller

import typingsSlinky.maximMazurokGapiClientReseller.gapi.client.reseller.CustomersResource
import typingsSlinky.maximMazurokGapiClientReseller.gapi.client.reseller.ResellernotifyResource
import typingsSlinky.maximMazurokGapiClientReseller.gapi.client.reseller.SubscriptionsResource
import typingsSlinky.maximMazurokGapiClientReseller.maximMazurokGapiClientResellerStrings.reseller
import typingsSlinky.maximMazurokGapiClientReseller.maximMazurokGapiClientResellerStrings.v1
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
      
      /** Load Workspace Reseller API v1 */
      def load(name: reseller, version: v1): js.Thenable[Unit] = js.native
      def load(name: reseller, version: v1, callback: js.Function0[_]): Unit = js.native
      
      @js.native
      object reseller extends js.Object {
        
        val customers: CustomersResource = js.native
        
        val resellernotify: ResellernotifyResource = js.native
        
        val subscriptions: SubscriptionsResource = js.native
      }
    }
  }
}
