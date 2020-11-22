package typingsSlinky.maximMazurokGapiClientChat

import typingsSlinky.maximMazurokGapiClientChat.gapi.client.chat.MediaResource
import typingsSlinky.maximMazurokGapiClientChat.gapi.client.chat.SpacesResource
import typingsSlinky.maximMazurokGapiClientChat.maximMazurokGapiClientChatStrings.chat
import typingsSlinky.maximMazurokGapiClientChat.maximMazurokGapiClientChatStrings.v1
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
      
      /** Load Hangouts Chat API v1 */
      def load(name: chat, version: v1): js.Thenable[Unit] = js.native
      def load(name: chat, version: v1, callback: js.Function0[_]): Unit = js.native
      
      @js.native
      object chat extends js.Object {
        
        val media: MediaResource = js.native
        
        val spaces: SpacesResource = js.native
      }
    }
  }
}
