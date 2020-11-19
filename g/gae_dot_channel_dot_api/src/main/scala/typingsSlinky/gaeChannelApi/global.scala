package typingsSlinky.gaeChannelApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobalScope
@js.native
object global extends js.Object {
  
  @js.native
  object goog extends js.Object {
    
    @js.native
    object appengine extends js.Object {
      
      @js.native
      class Channel protected ()
        extends typingsSlinky.gaeChannelApi.goog.appengine.Channel {
        /**
          * Create a channel object using the token returned by the createChannel() call on the server.
          * @param token {string}
          */
        def this(token: String) = this()
      }
      
      @js.native
      class Socket ()
        extends typingsSlinky.gaeChannelApi.goog.appengine.Socket
    }
  }
}
