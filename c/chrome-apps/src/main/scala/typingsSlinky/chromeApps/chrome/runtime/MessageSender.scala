package typingsSlinky.chromeApps.chrome.runtime

import typingsSlinky.chromeApps.chrome.integer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An object containing information about the script context that sent a message or request.
  * @since Chrome 26.
  */
@js.native
trait MessageSender extends StObject {
  
  /**
    * The frame that opened the connection. 0 for top-level frames, positive for child frames. This will only be set when tab is set.
    * @since Chrome 41.
    */
  var frameId: js.UndefOr[integer] = js.native
  
  /** The ID of the app that opened the connection, if any. */
  var id: js.UndefOr[String] = js.native
  
  /**
    * The TLS channel ID of the page or frame that opened the connection, if requested by the app, and if available.
    * @since Chrome 32.
    */
  var tlsChannelId: js.UndefOr[String] = js.native
  
  /**
    * The URL of the page or frame that opened the connection. If the sender is in an iframe, it will be iframe's URL not the URL of the page which hosts it.
    * @since Chrome 28.
    */
  var url: js.UndefOr[String] = js.native
}
object MessageSender {
  
  @scala.inline
  def apply(): MessageSender = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MessageSender]
  }
  
  @scala.inline
  implicit class MessageSenderMutableBuilder[Self <: MessageSender] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFrameId(value: integer): Self = StObject.set(x, "frameId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFrameIdUndefined: Self = StObject.set(x, "frameId", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setTlsChannelId(value: String): Self = StObject.set(x, "tlsChannelId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTlsChannelIdUndefined: Self = StObject.set(x, "tlsChannelId", js.undefined)
    
    @scala.inline
    def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
  }
}
