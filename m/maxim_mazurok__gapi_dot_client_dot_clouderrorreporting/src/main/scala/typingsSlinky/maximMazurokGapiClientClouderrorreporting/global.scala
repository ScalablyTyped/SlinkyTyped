package typingsSlinky.maximMazurokGapiClientClouderrorreporting

import typingsSlinky.maximMazurokGapiClientClouderrorreporting.gapi.client.clouderrorreporting.ProjectsResource
import typingsSlinky.maximMazurokGapiClientClouderrorreporting.maximMazurokGapiClientClouderrorreportingStrings.clouderrorreporting
import typingsSlinky.maximMazurokGapiClientClouderrorreporting.maximMazurokGapiClientClouderrorreportingStrings.v1beta1
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object gapi {
    
    object client {
      
      object clouderrorreporting {
        
        @JSGlobal("gapi.client.clouderrorreporting.projects")
        @js.native
        val projects: ProjectsResource = js.native
      }
      
      /** Load Error Reporting API v1beta1 */
      @JSGlobal("gapi.client.load")
      @js.native
      def load(name: clouderrorreporting, version: v1beta1): js.Thenable[Unit] = js.native
      @JSGlobal("gapi.client.load")
      @js.native
      def load(name: clouderrorreporting, version: v1beta1, callback: js.Function0[_]): Unit = js.native
    }
  }
}
