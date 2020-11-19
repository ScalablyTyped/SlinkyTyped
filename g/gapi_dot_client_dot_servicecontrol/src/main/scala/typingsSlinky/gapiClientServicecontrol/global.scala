package typingsSlinky.gapiClientServicecontrol

import typingsSlinky.gapiClientServicecontrol.gapi.client.servicecontrol.ServicesResource
import typingsSlinky.gapiClientServicecontrol.gapiClientServicecontrolStrings.servicecontrol
import typingsSlinky.gapiClientServicecontrol.gapiClientServicecontrolStrings.v1
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
      
      /** Load Google Service Control API v1 */
      def load(name: servicecontrol, version: v1): js.Thenable[Unit] = js.native
      def load(name: servicecontrol, version: v1, callback: js.Function0[_]): Unit = js.native
      
      val services: ServicesResource = js.native
    }
  }
}
