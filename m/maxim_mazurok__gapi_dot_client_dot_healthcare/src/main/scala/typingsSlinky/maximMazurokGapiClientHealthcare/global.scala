package typingsSlinky.maximMazurokGapiClientHealthcare

import typingsSlinky.maximMazurokGapiClientHealthcare.gapi.client.healthcare.ProjectsResource
import typingsSlinky.maximMazurokGapiClientHealthcare.maximMazurokGapiClientHealthcareStrings.healthcare
import typingsSlinky.maximMazurokGapiClientHealthcare.maximMazurokGapiClientHealthcareStrings.v1
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
      
      /** Load Cloud Healthcare API v1 */
      def load(name: healthcare, version: v1): js.Thenable[Unit] = js.native
      def load(name: healthcare, version: v1, callback: js.Function0[_]): Unit = js.native
      
      @js.native
      object healthcare extends js.Object {
        
        val projects: ProjectsResource = js.native
      }
    }
  }
}
