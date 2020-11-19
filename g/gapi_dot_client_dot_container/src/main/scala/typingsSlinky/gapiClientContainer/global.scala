package typingsSlinky.gapiClientContainer

import typingsSlinky.gapiClientContainer.gapi.client.container.ProjectsResource
import typingsSlinky.gapiClientContainer.gapiClientContainerStrings.container
import typingsSlinky.gapiClientContainer.gapiClientContainerStrings.v1
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
      
      /** Load Google Container Engine API v1 */
      def load(name: container, version: v1): js.Thenable[Unit] = js.native
      def load(name: container, version: v1, callback: js.Function0[_]): Unit = js.native
      
      val projects: ProjectsResource = js.native
    }
  }
}
