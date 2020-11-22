package typingsSlinky.maximMazurokGapiClientServicecontrol

import typingsSlinky.maximMazurokGapiClientServicecontrol.gapi.client.servicecontrol.ServicesResource
import typingsSlinky.maximMazurokGapiClientServicecontrol.maximMazurokGapiClientServicecontrolStrings.servicecontrol
import typingsSlinky.maximMazurokGapiClientServicecontrol.maximMazurokGapiClientServicecontrolStrings.v2
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
      
      /** Load Service Control API v2 */
      def load(name: servicecontrol, version: v2): js.Thenable[Unit] = js.native
      def load(name: servicecontrol, version: v2, callback: js.Function0[_]): Unit = js.native
      
      @js.native
      object servicecontrol extends js.Object {
        
        val services: ServicesResource = js.native
      }
    }
  }
}
