package typingsSlinky.reactNative.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.reactNative.mod.ColorValue
import typingsSlinky.reactNative.mod.InputAccessoryViewProps
import typingsSlinky.reactNative.mod.StyleProp
import typingsSlinky.reactNative.mod.ViewStyle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object InputAccessoryView {
  
  @JSImport("react-native", "InputAccessoryView")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.reactNative.mod.InputAccessoryView] {
    
    @scala.inline
    def backgroundColor(value: ColorValue): this.type = set("backgroundColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def nativeID(value: String): this.type = set("nativeID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def style(value: StyleProp[ViewStyle]): this.type = set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def styleNull: this.type = set("style", null)
  }
  
  implicit def make(companion: InputAccessoryView.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: InputAccessoryViewProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
