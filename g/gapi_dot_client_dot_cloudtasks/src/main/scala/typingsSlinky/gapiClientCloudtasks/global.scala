package typingsSlinky.gapiClientCloudtasks

import typingsSlinky.gapiClientCloudtasks.gapi.client.cloudtasks.ProjectsResource
import typingsSlinky.gapiClientCloudtasks.gapiClientCloudtasksStrings.cloudtasks
import typingsSlinky.gapiClientCloudtasks.gapiClientCloudtasksStrings.v2beta2
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
      
      /** Load Cloud Tasks API v2beta2 */
      def load(name: cloudtasks, version: v2beta2): js.Thenable[Unit] = js.native
      def load(name: cloudtasks, version: v2beta2, callback: js.Function0[_]): Unit = js.native
      
      val projects: ProjectsResource = js.native
    }
  }
}
