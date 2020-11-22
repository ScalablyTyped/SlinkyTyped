package typingsSlinky.maximMazurokGapiClientLanguage

import typingsSlinky.maximMazurokGapiClientLanguage.gapi.client.language.DocumentsResource
import typingsSlinky.maximMazurokGapiClientLanguage.maximMazurokGapiClientLanguageStrings.language
import typingsSlinky.maximMazurokGapiClientLanguage.maximMazurokGapiClientLanguageStrings.v1
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
      
      /** Load Cloud Natural Language API v1 */
      def load(name: language, version: v1): js.Thenable[Unit] = js.native
      def load(name: language, version: v1, callback: js.Function0[_]): Unit = js.native
      
      @js.native
      object language extends js.Object {
        
        val documents: DocumentsResource = js.native
      }
    }
  }
}
