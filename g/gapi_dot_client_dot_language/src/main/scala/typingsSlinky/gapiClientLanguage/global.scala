package typingsSlinky.gapiClientLanguage

import typingsSlinky.gapiClientLanguage.gapi.client.language.DocumentsResource
import typingsSlinky.gapiClientLanguage.gapiClientLanguageStrings.language
import typingsSlinky.gapiClientLanguage.gapiClientLanguageStrings.v1
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobalScope
@js.native
object global extends js.Object {
  @js.native
  object gapi extends js.Object {
    @js.native
    object client extends js.Object {
      val documents: DocumentsResource = js.native
      /** Load Google Cloud Natural Language API v1 */
      def load(name: language, version: v1): js.Thenable[Unit] = js.native
      def load(name: language, version: v1, callback: js.Function0[_]): Unit = js.native
    }
    
  }
  
}

