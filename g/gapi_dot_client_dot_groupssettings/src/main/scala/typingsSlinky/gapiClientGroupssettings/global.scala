package typingsSlinky.gapiClientGroupssettings

import typingsSlinky.gapiClientGroupssettings.gapi.client.groupssettings.GroupsResource
import typingsSlinky.gapiClientGroupssettings.gapiClientGroupssettingsStrings.groupssettings
import typingsSlinky.gapiClientGroupssettings.gapiClientGroupssettingsStrings.v1
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
      val groups: GroupsResource = js.native
      /** Load Groups Settings API v1 */
      def load(name: groupssettings, version: v1): js.Thenable[Unit] = js.native
      def load(name: groupssettings, version: v1, callback: js.Function0[_]): Unit = js.native
    }
    
  }
  
}

