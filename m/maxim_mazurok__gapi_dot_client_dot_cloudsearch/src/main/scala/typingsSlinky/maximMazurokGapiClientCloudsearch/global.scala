package typingsSlinky.maximMazurokGapiClientCloudsearch

import typingsSlinky.maximMazurokGapiClientCloudsearch.gapi.client.cloudsearch.DebugResource
import typingsSlinky.maximMazurokGapiClientCloudsearch.gapi.client.cloudsearch.IndexingResource
import typingsSlinky.maximMazurokGapiClientCloudsearch.gapi.client.cloudsearch.MediaResource
import typingsSlinky.maximMazurokGapiClientCloudsearch.gapi.client.cloudsearch.OperationsResource
import typingsSlinky.maximMazurokGapiClientCloudsearch.gapi.client.cloudsearch.QueryResource
import typingsSlinky.maximMazurokGapiClientCloudsearch.gapi.client.cloudsearch.SettingsResource
import typingsSlinky.maximMazurokGapiClientCloudsearch.gapi.client.cloudsearch.StatsResource
import typingsSlinky.maximMazurokGapiClientCloudsearch.maximMazurokGapiClientCloudsearchStrings.cloudsearch
import typingsSlinky.maximMazurokGapiClientCloudsearch.maximMazurokGapiClientCloudsearchStrings.v1
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
      
      /** Load Cloud Search API v1 */
      def load(name: cloudsearch, version: v1): js.Thenable[Unit] = js.native
      def load(name: cloudsearch, version: v1, callback: js.Function0[_]): Unit = js.native
      
      @js.native
      object cloudsearch extends js.Object {
        
        val debug: DebugResource = js.native
        
        val indexing: IndexingResource = js.native
        
        val media: MediaResource = js.native
        
        val operations: OperationsResource = js.native
        
        val query: QueryResource = js.native
        
        val settings: SettingsResource = js.native
        
        val stats: StatsResource = js.native
      }
    }
  }
}
