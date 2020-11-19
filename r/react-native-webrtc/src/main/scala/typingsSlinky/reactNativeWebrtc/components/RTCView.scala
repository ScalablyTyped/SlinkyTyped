package typingsSlinky.reactNativeWebrtc.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.reactNative.mod.ViewStyle
import typingsSlinky.reactNativeWebrtc.mod.RTCViewProps
import typingsSlinky.reactNativeWebrtc.reactNativeWebrtcStrings.contain
import typingsSlinky.reactNativeWebrtc.reactNativeWebrtcStrings.cover
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object RTCView {
  
  @JSImport("react-native-webrtc", "RTCView")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.reactNativeWebrtc.mod.RTCView] {
    
    @scala.inline
    def mirror(value: Boolean): this.type = set("mirror", value.asInstanceOf[js.Any])
    
    @scala.inline
    def objectFit(value: contain | cover): this.type = set("objectFit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def style(value: ViewStyle): this.type = set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def zOrder(value: Double): this.type = set("zOrder", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: RTCViewProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  
  @scala.inline
  def apply(streamURL: String): Builder = {
    val __props = js.Dynamic.literal(streamURL = streamURL.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[RTCViewProps]))
  }
}
