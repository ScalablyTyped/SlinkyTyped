package typingsSlinky.maximMazurokGapiClientDataproc

import typingsSlinky.maximMazurokGapiClientDataproc.gapi.client.dataproc.ProjectsResource
import typingsSlinky.maximMazurokGapiClientDataproc.maximMazurokGapiClientDataprocStrings.dataproc
import typingsSlinky.maximMazurokGapiClientDataproc.maximMazurokGapiClientDataprocStrings.v1
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
      
      /** Load Cloud Dataproc API v1 */
      def load(name: dataproc, version: v1): js.Thenable[Unit] = js.native
      def load(name: dataproc, version: v1, callback: js.Function0[_]): Unit = js.native
      
      @js.native
      object dataproc extends js.Object {
        
        val projects: ProjectsResource = js.native
      }
    }
  }
}
