package typingsSlinky.maximMazurokGapiClientCloudfunctions

import typingsSlinky.maximMazurokGapiClientCloudfunctions.gapi.client.cloudfunctions.OperationsResource
import typingsSlinky.maximMazurokGapiClientCloudfunctions.gapi.client.cloudfunctions.ProjectsResource
import typingsSlinky.maximMazurokGapiClientCloudfunctions.maximMazurokGapiClientCloudfunctionsStrings.cloudfunctions
import typingsSlinky.maximMazurokGapiClientCloudfunctions.maximMazurokGapiClientCloudfunctionsStrings.v1
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
      
      /** Load Cloud Functions API v1 */
      def load(name: cloudfunctions, version: v1): js.Thenable[Unit] = js.native
      def load(name: cloudfunctions, version: v1, callback: js.Function0[_]): Unit = js.native
      
      @js.native
      object cloudfunctions extends js.Object {
        
        val operations: OperationsResource = js.native
        
        val projects: ProjectsResource = js.native
      }
    }
  }
}
