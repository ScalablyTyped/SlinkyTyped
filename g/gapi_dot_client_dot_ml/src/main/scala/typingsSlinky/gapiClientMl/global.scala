package typingsSlinky.gapiClientMl

import typingsSlinky.gapiClientMl.gapi.client.ml.ProjectsResource
import typingsSlinky.gapiClientMl.gapiClientMlStrings.ml
import typingsSlinky.gapiClientMl.gapiClientMlStrings.v1
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
      /** Load Google Cloud Machine Learning Engine v1 */
      def load(name: ml, version: v1): js.Thenable[Unit] = js.native
      def load(name: ml, version: v1, callback: js.Function0[_]): Unit = js.native
    }
    
  }
  
}

