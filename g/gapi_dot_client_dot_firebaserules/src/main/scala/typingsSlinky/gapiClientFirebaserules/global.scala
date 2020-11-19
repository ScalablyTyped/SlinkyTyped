package typingsSlinky.gapiClientFirebaserules

import typingsSlinky.gapiClientFirebaserules.gapi.client.firebaserules.ProjectsResource
import typingsSlinky.gapiClientFirebaserules.gapiClientFirebaserulesStrings.firebaserules
import typingsSlinky.gapiClientFirebaserules.gapiClientFirebaserulesStrings.v1
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
      
      /** Load Firebase Rules API v1 */
      def load(name: firebaserules, version: v1): js.Thenable[Unit] = js.native
      def load(name: firebaserules, version: v1, callback: js.Function0[_]): Unit = js.native
      
      val projects: ProjectsResource = js.native
    }
  }
}
