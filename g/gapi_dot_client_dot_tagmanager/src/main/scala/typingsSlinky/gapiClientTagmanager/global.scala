package typingsSlinky.gapiClientTagmanager

import typingsSlinky.gapiClientTagmanager.gapi.client.tagmanager.AccountsResource
import typingsSlinky.gapiClientTagmanager.gapiClientTagmanagerStrings.tagmanager
import typingsSlinky.gapiClientTagmanager.gapiClientTagmanagerStrings.v2
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
      
      /** Load Tag Manager API v2 */
      def load(name: tagmanager, version: v2): js.Thenable[Unit] = js.native
      def load(name: tagmanager, version: v2, callback: js.Function0[_]): Unit = js.native
    }
  }
}
