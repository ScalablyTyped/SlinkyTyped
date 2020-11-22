package typingsSlinky.maximMazurokGapiClientFirebase

import typingsSlinky.maximMazurokGapiClientFirebase.gapi.client.firebase.AvailableProjectsResource
import typingsSlinky.maximMazurokGapiClientFirebase.gapi.client.firebase.OperationsResource
import typingsSlinky.maximMazurokGapiClientFirebase.gapi.client.firebase.ProjectsResource
import typingsSlinky.maximMazurokGapiClientFirebase.maximMazurokGapiClientFirebaseStrings.firebase
import typingsSlinky.maximMazurokGapiClientFirebase.maximMazurokGapiClientFirebaseStrings.v1beta1
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
      
      /** Load Firebase Management API v1beta1 */
      def load(name: firebase, version: v1beta1): js.Thenable[Unit] = js.native
      def load(name: firebase, version: v1beta1, callback: js.Function0[_]): Unit = js.native
      
      @js.native
      object firebase extends js.Object {
        
        val availableProjects: AvailableProjectsResource = js.native
        
        val operations: OperationsResource = js.native
        
        val projects: ProjectsResource = js.native
      }
    }
  }
}
