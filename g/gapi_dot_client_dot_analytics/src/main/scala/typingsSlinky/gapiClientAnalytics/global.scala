package typingsSlinky.gapiClientAnalytics

import typingsSlinky.gapiClientAnalytics.gapi.client.analytics.DataResource
import typingsSlinky.gapiClientAnalytics.gapi.client.analytics.ManagementResource
import typingsSlinky.gapiClientAnalytics.gapi.client.analytics.MetadataResource
import typingsSlinky.gapiClientAnalytics.gapi.client.analytics.ProvisioningResource
import typingsSlinky.gapiClientAnalytics.gapiClientAnalyticsStrings.analytics
import typingsSlinky.gapiClientAnalytics.gapiClientAnalyticsStrings.v3
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
      
      val data: DataResource = js.native
      
      /** Load Google Analytics API v3 */
      def load(name: analytics, version: v3): js.Thenable[Unit] = js.native
      def load(name: analytics, version: v3, callback: js.Function0[_]): Unit = js.native
      
      val management: ManagementResource = js.native
      
      val metadata: MetadataResource = js.native
      
      val provisioning: ProvisioningResource = js.native
    }
  }
}
