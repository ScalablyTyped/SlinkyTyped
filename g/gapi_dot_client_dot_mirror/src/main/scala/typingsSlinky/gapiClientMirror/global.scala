package typingsSlinky.gapiClientMirror

import typingsSlinky.gapiClientMirror.gapi.client.mirror.AccountsResource
import typingsSlinky.gapiClientMirror.gapi.client.mirror.ContactsResource
import typingsSlinky.gapiClientMirror.gapi.client.mirror.LocationsResource
import typingsSlinky.gapiClientMirror.gapi.client.mirror.SettingsResource
import typingsSlinky.gapiClientMirror.gapi.client.mirror.SubscriptionsResource
import typingsSlinky.gapiClientMirror.gapi.client.mirror.TimelineResource
import typingsSlinky.gapiClientMirror.gapiClientMirrorStrings.mirror
import typingsSlinky.gapiClientMirror.gapiClientMirrorStrings.v1
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
      
      val accounts: AccountsResource = js.native
      
      val contacts: ContactsResource = js.native
      
      /** Load Google Mirror API v1 */
      def load(name: mirror, version: v1): js.Thenable[Unit] = js.native
      def load(name: mirror, version: v1, callback: js.Function0[_]): Unit = js.native
      
      val locations: LocationsResource = js.native
      
      val settings: SettingsResource = js.native
      
      val subscriptions: SubscriptionsResource = js.native
      
      val timeline: TimelineResource = js.native
    }
  }
}
