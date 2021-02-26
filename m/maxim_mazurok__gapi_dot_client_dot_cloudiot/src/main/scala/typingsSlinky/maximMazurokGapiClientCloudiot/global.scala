package typingsSlinky.maximMazurokGapiClientCloudiot

import typingsSlinky.maximMazurokGapiClientCloudiot.gapi.client.cloudiot.ProjectsResource
import typingsSlinky.maximMazurokGapiClientCloudiot.maximMazurokGapiClientCloudiotStrings.cloudiot
import typingsSlinky.maximMazurokGapiClientCloudiot.maximMazurokGapiClientCloudiotStrings.v1
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object gapi {
    
    object client {
      
      object cloudiot {
        
        @JSGlobal("gapi.client.cloudiot.projects")
        @js.native
        val projects: ProjectsResource = js.native
      }
      
      /** Load Cloud IoT API v1 */
      @JSGlobal("gapi.client.load")
      @js.native
      def load(name: cloudiot, version: v1): js.Thenable[Unit] = js.native
      @JSGlobal("gapi.client.load")
      @js.native
      def load(name: cloudiot, version: v1, callback: js.Function0[_]): Unit = js.native
    }
  }
}
