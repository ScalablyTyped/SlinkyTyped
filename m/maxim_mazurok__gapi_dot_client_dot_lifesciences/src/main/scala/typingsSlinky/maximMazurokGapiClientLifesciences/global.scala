package typingsSlinky.maximMazurokGapiClientLifesciences

import typingsSlinky.maximMazurokGapiClientLifesciences.gapi.client.lifesciences.ProjectsResource
import typingsSlinky.maximMazurokGapiClientLifesciences.maximMazurokGapiClientLifesciencesStrings.lifesciences
import typingsSlinky.maximMazurokGapiClientLifesciences.maximMazurokGapiClientLifesciencesStrings.v2beta
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object gapi {
    
    object client {
      
      object lifesciences {
        
        @JSGlobal("gapi.client.lifesciences.projects")
        @js.native
        val projects: ProjectsResource = js.native
      }
      
      /** Load Cloud Life Sciences API v2beta */
      @JSGlobal("gapi.client.load")
      @js.native
      def load(name: lifesciences, version: v2beta): js.Thenable[Unit] = js.native
      @JSGlobal("gapi.client.load")
      @js.native
      def load(name: lifesciences, version: v2beta, callback: js.Function0[_]): Unit = js.native
    }
  }
}
