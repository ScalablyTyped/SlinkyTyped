package typingsSlinky.maximMazurokGapiClientTranslate

import typingsSlinky.maximMazurokGapiClientTranslate.gapi.client.translate.ProjectsResource
import typingsSlinky.maximMazurokGapiClientTranslate.maximMazurokGapiClientTranslateStrings.translate
import typingsSlinky.maximMazurokGapiClientTranslate.maximMazurokGapiClientTranslateStrings.v3
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
      
      /** Load Cloud Translation API v3 */
      def load(name: translate, version: v3): js.Thenable[Unit] = js.native
      def load(name: translate, version: v3, callback: js.Function0[_]): Unit = js.native
      
      @js.native
      object translate extends js.Object {
        
        val projects: ProjectsResource = js.native
      }
    }
  }
}
