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
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object gapi {
    
    object client {
      
      object cloudsearch {
        
        @JSGlobal("gapi.client.cloudsearch.debug")
        @js.native
        val debug: DebugResource = js.native
        
        @JSGlobal("gapi.client.cloudsearch.indexing")
        @js.native
        val indexing: IndexingResource = js.native
        
        @JSGlobal("gapi.client.cloudsearch.media")
        @js.native
        val media: MediaResource = js.native
        
        @JSGlobal("gapi.client.cloudsearch.operations")
        @js.native
        val operations: OperationsResource = js.native
        
        @JSGlobal("gapi.client.cloudsearch.query")
        @js.native
        val query: QueryResource = js.native
        
        @JSGlobal("gapi.client.cloudsearch.settings")
        @js.native
        val settings: SettingsResource = js.native
        
        @JSGlobal("gapi.client.cloudsearch.stats")
        @js.native
        val stats: StatsResource = js.native
      }
      
      /** Load Cloud Search API v1 */
      @JSGlobal("gapi.client.load")
      @js.native
      def load(name: cloudsearch, version: v1): js.Thenable[Unit] = js.native
      @JSGlobal("gapi.client.load")
      @js.native
      def load(name: cloudsearch, version: v1, callback: js.Function0[_]): Unit = js.native
    }
  }
}
