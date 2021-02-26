package typingsSlinky.maximMazurokGapiClientFirebase

import typingsSlinky.maximMazurokGapiClientFirebase.gapi.client.firebase.AvailableProjectsResource
import typingsSlinky.maximMazurokGapiClientFirebase.gapi.client.firebase.OperationsResource
import typingsSlinky.maximMazurokGapiClientFirebase.gapi.client.firebase.ProjectsResource
import typingsSlinky.maximMazurokGapiClientFirebase.maximMazurokGapiClientFirebaseStrings.firebase
import typingsSlinky.maximMazurokGapiClientFirebase.maximMazurokGapiClientFirebaseStrings.v1beta1
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object gapi {
    
    object client {
      
      object firebase {
        
        @JSGlobal("gapi.client.firebase.availableProjects")
        @js.native
        val availableProjects: AvailableProjectsResource = js.native
        
        @JSGlobal("gapi.client.firebase.operations")
        @js.native
        val operations: OperationsResource = js.native
        
        @JSGlobal("gapi.client.firebase.projects")
        @js.native
        val projects: ProjectsResource = js.native
      }
      
      /** Load Firebase Management API v1beta1 */
      @JSGlobal("gapi.client.load")
      @js.native
      def load(name: firebase, version: v1beta1): js.Thenable[Unit] = js.native
      @JSGlobal("gapi.client.load")
      @js.native
      def load(name: firebase, version: v1beta1, callback: js.Function0[_]): Unit = js.native
    }
  }
}
