package typingsSlinky.reactNativeLinearGradient.components

import typingsSlinky.reactNativeLinearGradient.mod.LinearGradientProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object LinearGradient {
  
  @JSImport("react-native-linear-gradient", "LinearGradient")
  @js.native
  object component extends js.Object
  
  def withProps(p: LinearGradientProps): SharedBuilder_LinearGradientProps1757348134[typingsSlinky.reactNativeLinearGradient.mod.LinearGradient] = new SharedBuilder_LinearGradientProps1757348134[typingsSlinky.reactNativeLinearGradient.mod.LinearGradient](js.Array(this.component, p.asInstanceOf[js.Any]))
  
  @scala.inline
  def apply(colors: js.Array[String | Double]): SharedBuilder_LinearGradientProps1757348134[typingsSlinky.reactNativeLinearGradient.mod.LinearGradient] = {
    val __props = js.Dynamic.literal(colors = colors.asInstanceOf[js.Any])
    new SharedBuilder_LinearGradientProps1757348134[typingsSlinky.reactNativeLinearGradient.mod.LinearGradient](js.Array(this.component, __props.asInstanceOf[LinearGradientProps]))
  }
}
