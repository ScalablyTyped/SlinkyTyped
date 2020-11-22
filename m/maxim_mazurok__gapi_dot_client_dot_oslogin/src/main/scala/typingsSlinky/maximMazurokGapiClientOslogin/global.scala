package typingsSlinky.maximMazurokGapiClientOslogin

import typingsSlinky.maximMazurokGapiClientOslogin.gapi.client.oslogin.UsersResource
import typingsSlinky.maximMazurokGapiClientOslogin.maximMazurokGapiClientOsloginStrings.oslogin
import typingsSlinky.maximMazurokGapiClientOslogin.maximMazurokGapiClientOsloginStrings.v1
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
      
      /** Load Cloud OS Login API v1 */
      def load(name: oslogin, version: v1): js.Thenable[Unit] = js.native
      def load(name: oslogin, version: v1, callback: js.Function0[_]): Unit = js.native
      
      @js.native
      object oslogin extends js.Object {
        
        val users: UsersResource = js.native
      }
    }
  }
}
