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
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object gapi {
    
    object client {
      
      /** Load Cloud Logging API v2 */
      @JSGlobal("gapi.client.load")
      @js.native
      def load(name: logging, version: v2): js.Thenable[Unit] = js.native
      @JSGlobal("gapi.client.load")
      @js.native
      def load(name: logging, version: v2, callback: js.Function0[_]): Unit = js.native
      
      object logging {
        
        @JSGlobal("gapi.client.logging.billingAccounts")
        @js.native
        val billingAccounts: BillingAccountsResource = js.native
        
        @JSGlobal("gapi.client.logging.entries")
        @js.native
        val entries: EntriesResource = js.native
        
        @JSGlobal("gapi.client.logging.exclusions")
        @js.native
        val exclusions: ExclusionsResource = js.native
        
        @JSGlobal("gapi.client.logging.folders")
        @js.native
        val folders: FoldersResource = js.native
        
        @JSGlobal("gapi.client.logging.locations")
        @js.native
        val locations: LocationsResource = js.native
        
        @JSGlobal("gapi.client.logging.logs")
        @js.native
        val logs: LogsResource = js.native
        
        @JSGlobal("gapi.client.logging.monitoredResourceDescriptors")
        @js.native
        val monitoredResourceDescriptors: MonitoredResourceDescriptorsResource = js.native
        
        @JSGlobal("gapi.client.logging.organizations")
        @js.native
        val organizations: OrganizationsResource = js.native
        
        @JSGlobal("gapi.client.logging.projects")
        @js.native
        val projects: ProjectsResource = js.native
        
        @JSGlobal("gapi.client.logging.sinks")
        @js.native
        val sinks: SinksResource = js.native
        
        @JSGlobal("gapi.client.logging.v2")
        @js.native
        val v2: V2Resource = js.native
      }
    }
  }
}
