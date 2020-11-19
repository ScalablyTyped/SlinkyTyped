package typingsSlinky.gapiClientLogging

import typingsSlinky.gapiClientLogging.gapi.client.logging.BillingAccountsResource
import typingsSlinky.gapiClientLogging.gapi.client.logging.EntriesResource
import typingsSlinky.gapiClientLogging.gapi.client.logging.FoldersResource
import typingsSlinky.gapiClientLogging.gapi.client.logging.MonitoredResourceDescriptorsResource
import typingsSlinky.gapiClientLogging.gapi.client.logging.OrganizationsResource
import typingsSlinky.gapiClientLogging.gapi.client.logging.ProjectsResource
import typingsSlinky.gapiClientLogging.gapiClientLoggingStrings.logging
import typingsSlinky.gapiClientLogging.gapiClientLoggingStrings.v2
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
      
      val billingAccounts: BillingAccountsResource = js.native
      
      val entries: EntriesResource = js.native
      
      val folders: FoldersResource = js.native
      
      /** Load Stackdriver Logging API v2 */
      def load(name: logging, version: v2): js.Thenable[Unit] = js.native
      def load(name: logging, version: v2, callback: js.Function0[_]): Unit = js.native
      
      val monitoredResourceDescriptors: MonitoredResourceDescriptorsResource = js.native
      
      val organizations: OrganizationsResource = js.native
      
      val projects: ProjectsResource = js.native
    }
  }
}
