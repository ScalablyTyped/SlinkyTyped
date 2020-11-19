package typingsSlinky.gapiClientOslogin

import typingsSlinky.gapiClientOslogin.gapi.client.oslogin.UsersResource
import typingsSlinky.gapiClientOslogin.gapiClientOsloginStrings.oslogin
import typingsSlinky.gapiClientOslogin.gapiClientOsloginStrings.v1alpha
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
      
      /** Load Google Cloud OS Login API v1alpha */
      def load(name: oslogin, version: v1alpha): js.Thenable[Unit] = js.native
      def load(name: oslogin, version: v1alpha, callback: js.Function0[_]): Unit = js.native
      
      val users: UsersResource = js.native
    }
  }
}
