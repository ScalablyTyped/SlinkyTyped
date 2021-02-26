package typingsSlinky.maximMazurokGapiClientGameservices

import typingsSlinky.maximMazurokGapiClientGameservices.gapi.client.gameservices.ProjectsResource
import typingsSlinky.maximMazurokGapiClientGameservices.maximMazurokGapiClientGameservicesStrings.gameservices
import typingsSlinky.maximMazurokGapiClientGameservices.maximMazurokGapiClientGameservicesStrings.v1
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object gapi {
    
    object client {
      
      object gameservices {
        
        @JSGlobal("gapi.client.gameservices.projects")
        @js.native
        val projects: ProjectsResource = js.native
      }
      
      /** Load Game Services API v1 */
      @JSGlobal("gapi.client.load")
      @js.native
      def load(name: gameservices, version: v1): js.Thenable[Unit] = js.native
      @JSGlobal("gapi.client.load")
      @js.native
      def load(name: gameservices, version: v1, callback: js.Function0[_]): Unit = js.native
    }
  }
}
