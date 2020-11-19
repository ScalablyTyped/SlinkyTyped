package typingsSlinky.gapiClientAppstate

import typingsSlinky.gapiClientAppstate.gapi.client.appstate.StatesResource
import typingsSlinky.gapiClientAppstate.gapiClientAppstateStrings.appstate
import typingsSlinky.gapiClientAppstate.gapiClientAppstateStrings.v1
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
      
      /** Load Google App State API v1 */
      def load(name: appstate, version: v1): js.Thenable[Unit] = js.native
      def load(name: appstate, version: v1, callback: js.Function0[_]): Unit = js.native
      
      val states: StatesResource = js.native
    }
  }
}
