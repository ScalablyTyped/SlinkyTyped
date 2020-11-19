package typingsSlinky.gapiClientDoubleclicksearch

import typingsSlinky.gapiClientDoubleclicksearch.gapi.client.doubleclicksearch.ConversionResource
import typingsSlinky.gapiClientDoubleclicksearch.gapi.client.doubleclicksearch.ReportsResource
import typingsSlinky.gapiClientDoubleclicksearch.gapi.client.doubleclicksearch.SavedColumnsResource
import typingsSlinky.gapiClientDoubleclicksearch.gapiClientDoubleclicksearchStrings.doubleclicksearch
import typingsSlinky.gapiClientDoubleclicksearch.gapiClientDoubleclicksearchStrings.v2
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
      
      val conversion: ConversionResource = js.native
      
      /** Load DoubleClick Search API v2 */
      def load(name: doubleclicksearch, version: v2): js.Thenable[Unit] = js.native
      def load(name: doubleclicksearch, version: v2, callback: js.Function0[_]): Unit = js.native
      
      val reports: ReportsResource = js.native
      
      val savedColumns: SavedColumnsResource = js.native
    }
  }
}
