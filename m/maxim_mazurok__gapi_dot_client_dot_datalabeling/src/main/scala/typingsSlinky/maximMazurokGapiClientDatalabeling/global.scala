package typingsSlinky.maximMazurokGapiClientDatalabeling

import typingsSlinky.maximMazurokGapiClientDatalabeling.gapi.client.datalabeling.ProjectsResource
import typingsSlinky.maximMazurokGapiClientDatalabeling.maximMazurokGapiClientDatalabelingStrings.datalabeling
import typingsSlinky.maximMazurokGapiClientDatalabeling.maximMazurokGapiClientDatalabelingStrings.v1beta1
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object gapi {
    
    object client {
      
      object datalabeling {
        
        @JSGlobal("gapi.client.datalabeling.projects")
        @js.native
        val projects: ProjectsResource = js.native
      }
      
      /** Load Data Labeling API v1beta1 */
      @JSGlobal("gapi.client.load")
      @js.native
      def load(name: datalabeling, version: v1beta1): js.Thenable[Unit] = js.native
      @JSGlobal("gapi.client.load")
      @js.native
      def load(name: datalabeling, version: v1beta1, callback: js.Function0[_]): Unit = js.native
    }
  }
}
