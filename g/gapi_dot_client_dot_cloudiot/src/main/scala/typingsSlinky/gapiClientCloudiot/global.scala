package typingsSlinky.gapiClientCloudiot

import typingsSlinky.gapiClientCloudiot.gapi.client.cloudiot.ProjectsResource
import typingsSlinky.gapiClientCloudiot.gapiClientCloudiotStrings.cloudiot
import typingsSlinky.gapiClientCloudiot.gapiClientCloudiotStrings.v1
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobalScope
@js.native
object global extends js.Object {
  @js.native
  object gapi extends js.Object {
    @js.native
    object client extends js.Object {
      val projects: ProjectsResource = js.native
      /** Load Google Cloud IoT API v1 */
      def load(name: cloudiot, version: v1): js.Thenable[Unit] = js.native
      def load(name: cloudiot, version: v1, callback: js.Function0[_]): Unit = js.native
    }
    
  }
  
}

