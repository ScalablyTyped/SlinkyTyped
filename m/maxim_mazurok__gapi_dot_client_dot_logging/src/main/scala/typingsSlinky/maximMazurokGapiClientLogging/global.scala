package typingsSlinky.maximMazurokGapiClientLogging

import typingsSlinky.maximMazurokGapiClientLogging.gapi.client.logging.BillingAccountsResource
import typingsSlinky.maximMazurokGapiClientLogging.gapi.client.logging.EntriesResource
import typingsSlinky.maximMazurokGapiClientLogging.gapi.client.logging.ExclusionsResource
import typingsSlinky.maximMazurokGapiClientLogging.gapi.client.logging.FoldersResource
import typingsSlinky.maximMazurokGapiClientLogging.gapi.client.logging.LocationsResource
import typingsSlinky.maximMazurokGapiClientLogging.gapi.client.logging.LogsResource
import typingsSlinky.maximMazurokGapiClientLogging.gapi.client.logging.MonitoredResourceDescriptorsResource
import typingsSlinky.maximMazurokGapiClientLogging.gapi.client.logging.OrganizationsResource
import typingsSlinky.maximMazurokGapiClientLogging.gapi.client.logging.ProjectsResource
import typingsSlinky.maximMazurokGapiClientLogging.gapi.client.logging.SinksResource
import typingsSlinky.maximMazurokGapiClientLogging.gapi.client.logging.V2Resource
import typingsSlinky.maximMazurokGapiClientLogging.maximMazurokGapiClientLoggingStrings.logging
import typingsSlinky.maximMazurokGapiClientLogging.maximMazurokGapiClientLoggingStrings.v2
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
      
      /** Load Cloud Logging API v2 */
      def load(name: logging, version: v2): js.Thenable[Unit] = js.native
      def load(name: logging, version: v2, callback: js.Function0[_]): Unit = js.native
      
      @js.native
      object logging extends js.Object {
        
        val billingAccounts: BillingAccountsResource = js.native
        
        val entries: EntriesResource = js.native
        
        val exclusions: ExclusionsResource = js.native
        
        val folders: FoldersResource = js.native
        
        val locations: LocationsResource = js.native
        
        val logs: LogsResource = js.native
        
        val monitoredResourceDescriptors: MonitoredResourceDescriptorsResource = js.native
        
        val organizations: OrganizationsResource = js.native
        
        val projects: ProjectsResource = js.native
        
        val sinks: SinksResource = js.native
        
        val v2: V2Resource = js.native
      }
    }
  }
}
