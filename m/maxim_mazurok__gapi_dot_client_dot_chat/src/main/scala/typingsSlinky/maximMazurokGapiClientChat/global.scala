package typingsSlinky.maximMazurokGapiClientChat

import typingsSlinky.maximMazurokGapiClientChat.gapi.client.chat.MediaResource
import typingsSlinky.maximMazurokGapiClientChat.gapi.client.chat.SpacesResource
import typingsSlinky.maximMazurokGapiClientChat.maximMazurokGapiClientChatStrings.chat
import typingsSlinky.maximMazurokGapiClientChat.maximMazurokGapiClientChatStrings.v1
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object gapi {
    
    object client {
      
      object chat {
        
        @JSGlobal("gapi.client.chat.media")
        @js.native
        val media: MediaResource = js.native
        
        @JSGlobal("gapi.client.chat.spaces")
        @js.native
        val spaces: SpacesResource = js.native
      }
      
      /** Load Hangouts Chat API v1 */
      @JSGlobal("gapi.client.load")
      @js.native
      def load(name: chat, version: v1): js.Thenable[Unit] = js.native
      @JSGlobal("gapi.client.load")
      @js.native
      def load(name: chat, version: v1, callback: js.Function0[_]): Unit = js.native
    }
  }
}
