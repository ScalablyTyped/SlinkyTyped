package typingsSlinky.reactNative.components

import slinky.core.SyntheticEvent
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.reactNative.mod.ButtonProps
import typingsSlinky.reactNative.mod.ColorValue
import typingsSlinky.reactNative.mod.NativeTouchEvent
import typingsSlinky.reactNative.mod.NodeHandle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Button {
  
  @scala.inline
  def apply(onPress: SyntheticEvent[NodeHandle, NativeTouchEvent] => Unit, title: String): Builder = {
    val __props = js.Dynamic.literal(onPress = js.Any.fromFunction1(onPress), title = title.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[ButtonProps]))
  }
  
  @JSImport("react-native", "Button")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.reactNative.mod.Button] {
    
    @scala.inline
    def accessibilityLabel(value: String): this.type = set("accessibilityLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def color(value: ColorValue): this.type = set("color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def disabled(value: Boolean): this.type = set("disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def testID(value: String): this.type = set("testID", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: ButtonProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
