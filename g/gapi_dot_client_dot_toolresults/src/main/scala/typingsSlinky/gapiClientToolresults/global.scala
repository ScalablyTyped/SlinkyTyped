package typingsSlinky.gapiClientToolresults

import typingsSlinky.gapiClientToolresults.gapi.client.toolresults.ProjectsResource
import typingsSlinky.gapiClientToolresults.gapiClientToolresultsStrings.toolresults
import typingsSlinky.gapiClientToolresults.gapiClientToolresultsStrings.v1beta3
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
      
      /** Load Cloud Tool Results API v1beta3 */
      def load(name: toolresults, version: v1beta3): js.Thenable[Unit] = js.native
      def load(name: toolresults, version: v1beta3, callback: js.Function0[_]): Unit = js.native
      
      val projects: ProjectsResource = js.native
    }
  }
}
