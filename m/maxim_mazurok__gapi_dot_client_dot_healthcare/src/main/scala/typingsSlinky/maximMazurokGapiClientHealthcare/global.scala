package typingsSlinky.maximMazurokGapiClientHealthcare

import typingsSlinky.maximMazurokGapiClientHealthcare.gapi.client.healthcare.ProjectsResource
import typingsSlinky.maximMazurokGapiClientHealthcare.maximMazurokGapiClientHealthcareStrings.healthcare
import typingsSlinky.maximMazurokGapiClientHealthcare.maximMazurokGapiClientHealthcareStrings.v1
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object gapi {
    
    object client {
      
      object healthcare {
        
        @JSGlobal("gapi.client.healthcare.projects")
        @js.native
        val projects: ProjectsResource = js.native
      }
      
      /** Load Cloud Healthcare API v1 */
      @JSGlobal("gapi.client.load")
      @js.native
      def load(name: healthcare, version: v1): js.Thenable[Unit] = js.native
      @JSGlobal("gapi.client.load")
      @js.native
      def load(name: healthcare, version: v1, callback: js.Function0[_]): Unit = js.native
    }
  }
}
