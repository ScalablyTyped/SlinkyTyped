package typingsSlinky.maximMazurokGapiClientAnalytics

import typingsSlinky.maximMazurokGapiClientAnalytics.gapi.client.analytics.DataResource
import typingsSlinky.maximMazurokGapiClientAnalytics.gapi.client.analytics.ManagementResource
import typingsSlinky.maximMazurokGapiClientAnalytics.gapi.client.analytics.MetadataResource
import typingsSlinky.maximMazurokGapiClientAnalytics.gapi.client.analytics.ProvisioningResource
import typingsSlinky.maximMazurokGapiClientAnalytics.gapi.client.analytics.UserDeletionResource
import typingsSlinky.maximMazurokGapiClientAnalytics.maximMazurokGapiClientAnalyticsStrings.analytics
import typingsSlinky.maximMazurokGapiClientAnalytics.maximMazurokGapiClientAnalyticsStrings.v3
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object gapi {
    
    object client {
      
      object analytics {
        
        @JSGlobal("gapi.client.analytics.data")
        @js.native
        val data: DataResource = js.native
        
        @JSGlobal("gapi.client.analytics.management")
        @js.native
        val management: ManagementResource = js.native
        
        @JSGlobal("gapi.client.analytics.metadata")
        @js.native
        val metadata: MetadataResource = js.native
        
        @JSGlobal("gapi.client.analytics.provisioning")
        @js.native
        val provisioning: ProvisioningResource = js.native
        
        @JSGlobal("gapi.client.analytics.userDeletion")
        @js.native
        val userDeletion: UserDeletionResource = js.native
      }
      
      /** Load Google Analytics API v3 */
      @JSGlobal("gapi.client.load")
      @js.native
      def load(name: analytics, version: v3): js.Thenable[Unit] = js.native
      @JSGlobal("gapi.client.load")
      @js.native
      def load(name: analytics, version: v3, callback: js.Function0[_]): Unit = js.native
    }
  }
}
