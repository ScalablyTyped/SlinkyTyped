package typingsSlinky.gapiClientDataflow

import typingsSlinky.gapiClientDataflow.gapi.client.dataflow.ProjectsResource
import typingsSlinky.gapiClientDataflow.gapiClientDataflowStrings.dataflow
import typingsSlinky.gapiClientDataflow.gapiClientDataflowStrings.v1b3
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
      /** Load Google Dataflow API v1b3 */
      def load(name: dataflow, version: v1b3): js.Thenable[Unit] = js.native
      def load(name: dataflow, version: v1b3, callback: js.Function0[_]): Unit = js.native
    }
    
  }
  
}

