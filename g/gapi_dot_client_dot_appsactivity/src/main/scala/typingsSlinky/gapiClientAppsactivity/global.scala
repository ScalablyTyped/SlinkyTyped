package typingsSlinky.gapiClientAppsactivity

import typingsSlinky.gapiClientAppsactivity.gapi.client.appsactivity.ActivitiesResource
import typingsSlinky.gapiClientAppsactivity.gapiClientAppsactivityStrings.appsactivity
import typingsSlinky.gapiClientAppsactivity.gapiClientAppsactivityStrings.v1
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
      
      val activities: ActivitiesResource = js.native
      
      /** Load G Suite Activity API v1 */
      def load(name: appsactivity, version: v1): js.Thenable[Unit] = js.native
      def load(name: appsactivity, version: v1, callback: js.Function0[_]): Unit = js.native
    }
  }
}
