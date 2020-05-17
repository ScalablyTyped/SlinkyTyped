package typingsSlinky.gapiClientAppengine

import typingsSlinky.gapiClientAppengine.gapi.client.appengine.AppsResource
import typingsSlinky.gapiClientAppengine.gapiClientAppengineStrings.appengine
import typingsSlinky.gapiClientAppengine.gapiClientAppengineStrings.v1
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
      val apps: AppsResource = js.native
      /** Load Google App Engine Admin API v1 */
      def load(name: appengine, version: v1): js.Thenable[Unit] = js.native
      def load(name: appengine, version: v1, callback: js.Function0[_]): Unit = js.native
    }
    
  }
  
}

