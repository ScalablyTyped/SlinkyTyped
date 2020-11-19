package typingsSlinky.gapiClientClouderrorreporting

import typingsSlinky.gapiClientClouderrorreporting.gapi.client.clouderrorreporting.ProjectsResource
import typingsSlinky.gapiClientClouderrorreporting.gapiClientClouderrorreportingStrings.clouderrorreporting
import typingsSlinky.gapiClientClouderrorreporting.gapiClientClouderrorreportingStrings.v1beta1
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
      
      /** Load Stackdriver Error Reporting API v1beta1 */
      def load(name: clouderrorreporting, version: v1beta1): js.Thenable[Unit] = js.native
      def load(name: clouderrorreporting, version: v1beta1, callback: js.Function0[_]): Unit = js.native
      
      val projects: ProjectsResource = js.native
    }
  }
}
