package typingsSlinky.maximMazurokGapiClientServicedirectory

import typingsSlinky.maximMazurokGapiClientServicedirectory.gapi.client.servicedirectory.ProjectsResource
import typingsSlinky.maximMazurokGapiClientServicedirectory.maximMazurokGapiClientServicedirectoryStrings.servicedirectory
import typingsSlinky.maximMazurokGapiClientServicedirectory.maximMazurokGapiClientServicedirectoryStrings.v1beta1
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
      
      /** Load Service Directory API v1beta1 */
      def load(name: servicedirectory, version: v1beta1): js.Thenable[Unit] = js.native
      def load(name: servicedirectory, version: v1beta1, callback: js.Function0[_]): Unit = js.native
      
      @js.native
      object servicedirectory extends js.Object {
        
        val projects: ProjectsResource = js.native
      }
    }
  }
}
