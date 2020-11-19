package typingsSlinky.gapiClientCloudbuild

import typingsSlinky.gapiClientCloudbuild.gapi.client.cloudbuild.OperationsResource
import typingsSlinky.gapiClientCloudbuild.gapi.client.cloudbuild.ProjectsResource
import typingsSlinky.gapiClientCloudbuild.gapiClientCloudbuildStrings.cloudbuild
import typingsSlinky.gapiClientCloudbuild.gapiClientCloudbuildStrings.v1
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
      
      /** Load Google Cloud Container Builder API v1 */
      def load(name: cloudbuild, version: v1): js.Thenable[Unit] = js.native
      def load(name: cloudbuild, version: v1, callback: js.Function0[_]): Unit = js.native
      
      val operations: OperationsResource = js.native
      
      val projects: ProjectsResource = js.native
    }
  }
}
