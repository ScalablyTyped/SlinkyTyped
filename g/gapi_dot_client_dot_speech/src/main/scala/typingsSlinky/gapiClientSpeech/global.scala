package typingsSlinky.gapiClientSpeech

import org.scalablytyped.runtime.TopLevel
import typingsSlinky.gapiClientSpeech.gapi.client.speech.OperationsResource
import typingsSlinky.gapiClientSpeech.gapi.client.speech.SpeechResource
import typingsSlinky.gapiClientSpeech.gapiClientSpeechStrings.speech
import typingsSlinky.gapiClientSpeech.gapiClientSpeechStrings.v1
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
      
      /** Load Google Cloud Speech API v1 */
      def load(name: speech, version: v1): js.Thenable[Unit] = js.native
      def load(name: speech, version: v1, callback: js.Function0[_]): Unit = js.native
      
      val operations: OperationsResource = js.native
      
      @js.native
      object speech extends TopLevel[SpeechResource]
    }
  }
}
