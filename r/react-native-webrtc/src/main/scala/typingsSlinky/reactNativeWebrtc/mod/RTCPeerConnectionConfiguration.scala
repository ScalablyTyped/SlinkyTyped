package typingsSlinky.reactNativeWebrtc.mod

import typingsSlinky.reactNativeWebrtc.reactNativeWebrtcStrings.all
import typingsSlinky.reactNativeWebrtc.reactNativeWebrtcStrings.public
import typingsSlinky.reactNativeWebrtc.reactNativeWebrtcStrings.relay
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RTCPeerConnectionConfiguration extends StObject {
  
  var iceServers: js.Array[ConfigurationParamWithUrl | ConfigurationParamWithUrls] = js.native
  
  var iceTransportPolicy: js.UndefOr[all | public | relay] = js.native
}
object RTCPeerConnectionConfiguration {
  
  @scala.inline
  def apply(iceServers: js.Array[ConfigurationParamWithUrl | ConfigurationParamWithUrls]): RTCPeerConnectionConfiguration = {
    val __obj = js.Dynamic.literal(iceServers = iceServers.asInstanceOf[js.Any])
    __obj.asInstanceOf[RTCPeerConnectionConfiguration]
  }
  
  @scala.inline
  implicit class RTCPeerConnectionConfigurationMutableBuilder[Self <: RTCPeerConnectionConfiguration] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIceServers(value: js.Array[ConfigurationParamWithUrl | ConfigurationParamWithUrls]): Self = StObject.set(x, "iceServers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIceServersVarargs(value: (ConfigurationParamWithUrl | ConfigurationParamWithUrls)*): Self = StObject.set(x, "iceServers", js.Array(value :_*))
    
    @scala.inline
    def setIceTransportPolicy(value: all | public | relay): Self = StObject.set(x, "iceTransportPolicy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIceTransportPolicyUndefined: Self = StObject.set(x, "iceTransportPolicy", js.undefined)
  }
}
