package typingsSlinky.maximMazurokGapiClientAnalyticsadmin

import typingsSlinky.maximMazurokGapiClientAnalyticsadmin.gapi.client.analyticsadmin.AccountSummariesResource
import typingsSlinky.maximMazurokGapiClientAnalyticsadmin.gapi.client.analyticsadmin.AccountsResource
import typingsSlinky.maximMazurokGapiClientAnalyticsadmin.gapi.client.analyticsadmin.PropertiesResource
import typingsSlinky.maximMazurokGapiClientAnalyticsadmin.maximMazurokGapiClientAnalyticsadminStrings.analyticsadmin
import typingsSlinky.maximMazurokGapiClientAnalyticsadmin.maximMazurokGapiClientAnalyticsadminStrings.v1alpha
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
      
      /** Load Google Analytics Admin API v1alpha */
      def load(name: analyticsadmin, version: v1alpha): js.Thenable[Unit] = js.native
      def load(name: analyticsadmin, version: v1alpha, callback: js.Function0[_]): Unit = js.native
      
      @js.native
      object analyticsadmin extends js.Object {
        
        val accountSummaries: AccountSummariesResource = js.native
        
        val accounts: AccountsResource = js.native
        
        val properties: PropertiesResource = js.native
      }
    }
  }
}
