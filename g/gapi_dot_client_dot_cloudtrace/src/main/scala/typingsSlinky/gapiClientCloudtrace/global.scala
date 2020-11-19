package typingsSlinky.gapiClientCloudtrace

import typingsSlinky.gapiClientCloudtrace.gapi.client.cloudtrace.ProjectsResource
import typingsSlinky.gapiClientCloudtrace.gapiClientCloudtraceStrings.cloudtrace
import typingsSlinky.gapiClientCloudtrace.gapiClientCloudtraceStrings.v2
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
      
      /** Load Stackdriver Trace API v2 */
      def load(name: cloudtrace, version: v2): js.Thenable[Unit] = js.native
      def load(name: cloudtrace, version: v2, callback: js.Function0[_]): Unit = js.native
      
      val projects: ProjectsResource = js.native
    }
  }
}
