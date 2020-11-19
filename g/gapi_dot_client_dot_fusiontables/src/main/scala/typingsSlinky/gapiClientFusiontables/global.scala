package typingsSlinky.gapiClientFusiontables

import typingsSlinky.gapiClientFusiontables.gapi.client.fusiontables.ColumnResource
import typingsSlinky.gapiClientFusiontables.gapi.client.fusiontables.QueryResource
import typingsSlinky.gapiClientFusiontables.gapi.client.fusiontables.StyleResource
import typingsSlinky.gapiClientFusiontables.gapi.client.fusiontables.TableResource
import typingsSlinky.gapiClientFusiontables.gapi.client.fusiontables.TaskResource
import typingsSlinky.gapiClientFusiontables.gapi.client.fusiontables.TemplateResource
import typingsSlinky.gapiClientFusiontables.gapiClientFusiontablesStrings.fusiontables
import typingsSlinky.gapiClientFusiontables.gapiClientFusiontablesStrings.v2
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
      
      val column: ColumnResource = js.native
      
      /** Load Fusion Tables API v2 */
      def load(name: fusiontables, version: v2): js.Thenable[Unit] = js.native
      def load(name: fusiontables, version: v2, callback: js.Function0[_]): Unit = js.native
      
      val query: QueryResource = js.native
      
      val style: StyleResource = js.native
      
      val table: TableResource = js.native
      
      val task: TaskResource = js.native
      
      val template: TemplateResource = js.native
    }
  }
}
