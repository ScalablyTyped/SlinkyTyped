package typingsSlinky.maximMazurokGapiClientOsconfig

import typingsSlinky.maximMazurokGapiClientOsconfig.gapi.client.osconfig.ProjectsResource
import typingsSlinky.maximMazurokGapiClientOsconfig.maximMazurokGapiClientOsconfigStrings.osconfig
import typingsSlinky.maximMazurokGapiClientOsconfig.maximMazurokGapiClientOsconfigStrings.v1
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object gapi {
    
    object client {
      
      /** Load OS Config API v1 */
      @JSGlobal("gapi.client.load")
      @js.native
      def load(name: osconfig, version: v1): js.Thenable[Unit] = js.native
      @JSGlobal("gapi.client.load")
      @js.native
      def load(name: osconfig, version: v1, callback: js.Function0[_]): Unit = js.native
      
      object osconfig {
        
        @JSGlobal("gapi.client.osconfig.projects")
        @js.native
        val projects: ProjectsResource = js.native
      }
    }
  }
}
