package typingsSlinky.roslib.anon

import org.scalajs.dom.experimental.webrtc.RTCDataChannelInit
import org.scalajs.dom.experimental.webrtc.RTCPeerConnection
import typingsSlinky.roslib.roslibStrings.socketDotio
import typingsSlinky.roslib.roslibStrings.websocket
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GroovyCompatibility extends StObject {
  
  var groovyCompatibility: js.UndefOr[Boolean] = js.native
  
  var transportLibrary: js.UndefOr[websocket | socketDotio | RTCPeerConnection] = js.native
  
  var transportOptions: js.UndefOr[RTCDataChannelInit] = js.native
  
  var url: js.UndefOr[java.lang.String] = js.native
}
object GroovyCompatibility {
  
  @scala.inline
  def apply(): GroovyCompatibility = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GroovyCompatibility]
  }
  
  @scala.inline
  implicit class GroovyCompatibilityMutableBuilder[Self <: GroovyCompatibility] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGroovyCompatibility(value: Boolean): Self = StObject.set(x, "groovyCompatibility", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroovyCompatibilityUndefined: Self = StObject.set(x, "groovyCompatibility", js.undefined)
    
    @scala.inline
    def setTransportLibrary(value: websocket | socketDotio | RTCPeerConnection): Self = StObject.set(x, "transportLibrary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransportLibraryRTCPeerConnection(value: RTCPeerConnection): Self = StObject.set(x, "transportLibrary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransportLibraryUndefined: Self = StObject.set(x, "transportLibrary", js.undefined)
    
    @scala.inline
    def setTransportOptions(value: RTCDataChannelInit): Self = StObject.set(x, "transportOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransportOptionsUndefined: Self = StObject.set(x, "transportOptions", js.undefined)
    
    @scala.inline
    def setUrl(value: java.lang.String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
  }
}
