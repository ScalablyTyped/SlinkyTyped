package typingsSlinky.maximMazurokGapiClientLocalservices

import typingsSlinky.maximMazurokGapiClientLocalservices.gapi.client.localservices.AccountReportsResource
import typingsSlinky.maximMazurokGapiClientLocalservices.gapi.client.localservices.DetailedLeadReportsResource
import typingsSlinky.maximMazurokGapiClientLocalservices.maximMazurokGapiClientLocalservicesStrings.localservices
import typingsSlinky.maximMazurokGapiClientLocalservices.maximMazurokGapiClientLocalservicesStrings.v1
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
      
      /** Load Local Services API v1 */
      def load(name: localservices, version: v1): js.Thenable[Unit] = js.native
      def load(name: localservices, version: v1, callback: js.Function0[_]): Unit = js.native
      
      @js.native
      object localservices extends js.Object {
        
        val accountReports: AccountReportsResource = js.native
        
        val detailedLeadReports: DetailedLeadReportsResource = js.native
      }
    }
  }
}
