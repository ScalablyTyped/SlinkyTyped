package typingsSlinky.maximMazurokGapiClientDoubleclicksearch

import typingsSlinky.maximMazurokGapiClientDoubleclicksearch.gapi.client.doubleclicksearch.ConversionResource
import typingsSlinky.maximMazurokGapiClientDoubleclicksearch.gapi.client.doubleclicksearch.ReportsResource
import typingsSlinky.maximMazurokGapiClientDoubleclicksearch.gapi.client.doubleclicksearch.SavedColumnsResource
import typingsSlinky.maximMazurokGapiClientDoubleclicksearch.maximMazurokGapiClientDoubleclicksearchStrings.doubleclicksearch
import typingsSlinky.maximMazurokGapiClientDoubleclicksearch.maximMazurokGapiClientDoubleclicksearchStrings.v2
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object gapi {
    
    object client {
      
      object doubleclicksearch {
        
        @JSGlobal("gapi.client.doubleclicksearch.conversion")
        @js.native
        val conversion: ConversionResource = js.native
        
        @JSGlobal("gapi.client.doubleclicksearch.reports")
        @js.native
        val reports: ReportsResource = js.native
        
        @JSGlobal("gapi.client.doubleclicksearch.savedColumns")
        @js.native
        val savedColumns: SavedColumnsResource = js.native
      }
      
      /** Load Search Ads 360 API v2 */
      @JSGlobal("gapi.client.load")
      @js.native
      def load(name: doubleclicksearch, version: v2): js.Thenable[Unit] = js.native
      @JSGlobal("gapi.client.load")
      @js.native
      def load(name: doubleclicksearch, version: v2, callback: js.Function0[_]): Unit = js.native
    }
  }
}
