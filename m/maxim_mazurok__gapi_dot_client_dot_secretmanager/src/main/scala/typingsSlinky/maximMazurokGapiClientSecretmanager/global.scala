package typingsSlinky.maximMazurokGapiClientSecretmanager

import typingsSlinky.maximMazurokGapiClientSecretmanager.gapi.client.secretmanager.ProjectsResource
import typingsSlinky.maximMazurokGapiClientSecretmanager.maximMazurokGapiClientSecretmanagerStrings.secretmanager
import typingsSlinky.maximMazurokGapiClientSecretmanager.maximMazurokGapiClientSecretmanagerStrings.v1
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object gapi {
    
    object client {
      
      /** Load Secret Manager API v1 */
      @JSGlobal("gapi.client.load")
      @js.native
      def load(name: secretmanager, version: v1): js.Thenable[Unit] = js.native
      @JSGlobal("gapi.client.load")
      @js.native
      def load(name: secretmanager, version: v1, callback: js.Function0[_]): Unit = js.native
      
      object secretmanager {
        
        @JSGlobal("gapi.client.secretmanager.projects")
        @js.native
        val projects: ProjectsResource = js.native
      }
    }
  }
}
