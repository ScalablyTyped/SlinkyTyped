package typingsSlinky.gapiClientMonitoring

import typingsSlinky.gapiClientMonitoring.gapi.client.monitoring.ProjectsResource
import typingsSlinky.gapiClientMonitoring.gapiClientMonitoringStrings.monitoring
import typingsSlinky.gapiClientMonitoring.gapiClientMonitoringStrings.v3
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
      
      /** Load Stackdriver Monitoring API v3 */
      def load(name: monitoring, version: v3): js.Thenable[Unit] = js.native
      def load(name: monitoring, version: v3, callback: js.Function0[_]): Unit = js.native
      
      val projects: ProjectsResource = js.native
    }
  }
}
