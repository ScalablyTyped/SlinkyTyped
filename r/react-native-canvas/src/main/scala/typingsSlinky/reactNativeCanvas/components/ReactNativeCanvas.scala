package typingsSlinky.reactNativeCanvas.components

import slinky.core.facade.ReactRef
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.reactNative.mod.StyleProp
import typingsSlinky.reactNative.mod.ViewStyle
import typingsSlinky.reactNativeCanvas.mod.Canvas
import typingsSlinky.reactNativeCanvas.mod.CanvasProps
import typingsSlinky.reactNativeCanvas.mod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ReactNativeCanvas {
  
  @scala.inline
  def apply(ref: (js.Function1[/* canvas */ Canvas, _]) | ReactRef[Canvas]): Builder = {
    val __props = js.Dynamic.literal(ref = ref.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[CanvasProps]))
  }
  
  @JSImport("react-native-canvas", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, default] {
    
    @scala.inline
    def baseUrl(value: String): this.type = set("baseUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def originWhitelist(value: js.Array[String]): this.type = set("originWhitelist", value.asInstanceOf[js.Any])
    
    @scala.inline
    def originWhitelistVarargs(value: String*): this.type = set("originWhitelist", js.Array(value :_*))
    
    @scala.inline
    def style(value: StyleProp[ViewStyle]): this.type = set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def styleNull: this.type = set("style", null)
  }
  
  def withProps(p: CanvasProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
