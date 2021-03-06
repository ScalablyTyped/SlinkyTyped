package typingsSlinky.gapiClientFirebaseremoteconfig

import typingsSlinky.gapiClientFirebaseremoteconfig.gapi.client.firebaseremoteconfig.ProjectsResource
import typingsSlinky.gapiClientFirebaseremoteconfig.gapiClientFirebaseremoteconfigStrings.firebaseremoteconfig
import typingsSlinky.gapiClientFirebaseremoteconfig.gapiClientFirebaseremoteconfigStrings.v1
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
      
      /** Load Firebase Remote Config API v1 */
      def load(name: firebaseremoteconfig, version: v1): js.Thenable[Unit] = js.native
      def load(name: firebaseremoteconfig, version: v1, callback: js.Function0[_]): Unit = js.native
      
      val projects: ProjectsResource = js.native
    }
  }
}
