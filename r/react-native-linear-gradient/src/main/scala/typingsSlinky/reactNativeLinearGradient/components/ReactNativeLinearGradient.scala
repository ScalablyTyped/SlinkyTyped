package typingsSlinky.reactNativeLinearGradient.components

import typingsSlinky.reactNativeLinearGradient.mod.LinearGradientProps
import typingsSlinky.reactNativeLinearGradient.mod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ReactNativeLinearGradient {
  
  @JSImport("react-native-linear-gradient", JSImport.Default)
  @js.native
  object component extends js.Object
  
  def withProps(p: LinearGradientProps): SharedBuilder_LinearGradientProps1757348134[default] = new SharedBuilder_LinearGradientProps1757348134[default](js.Array(this.component, p.asInstanceOf[js.Any]))
  
  @scala.inline
  def apply(colors: js.Array[String | Double]): SharedBuilder_LinearGradientProps1757348134[default] = {
    val __props = js.Dynamic.literal(colors = colors.asInstanceOf[js.Any])
    new SharedBuilder_LinearGradientProps1757348134[default](js.Array(this.component, __props.asInstanceOf[LinearGradientProps]))
  }
}
