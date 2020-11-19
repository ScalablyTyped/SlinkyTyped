package typingsSlinky.gapiClientDoubleclickbidmanager

import typingsSlinky.gapiClientDoubleclickbidmanager.gapi.client.doubleclickbidmanager.LineitemsResource
import typingsSlinky.gapiClientDoubleclickbidmanager.gapi.client.doubleclickbidmanager.QueriesResource
import typingsSlinky.gapiClientDoubleclickbidmanager.gapi.client.doubleclickbidmanager.ReportsResource
import typingsSlinky.gapiClientDoubleclickbidmanager.gapi.client.doubleclickbidmanager.SdfResource
import typingsSlinky.gapiClientDoubleclickbidmanager.gapiClientDoubleclickbidmanagerStrings.doubleclickbidmanager
import typingsSlinky.gapiClientDoubleclickbidmanager.gapiClientDoubleclickbidmanagerStrings.v1
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
      
      val lineitems: LineitemsResource = js.native
      
      /** Load DoubleClick Bid Manager API v1 */
      def load(name: doubleclickbidmanager, version: v1): js.Thenable[Unit] = js.native
      def load(name: doubleclickbidmanager, version: v1, callback: js.Function0[_]): Unit = js.native
      
      val queries: QueriesResource = js.native
      
      val reports: ReportsResource = js.native
      
      val sdf: SdfResource = js.native
    }
  }
}
