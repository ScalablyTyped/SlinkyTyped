package typingsSlinky.reactNativeLinearGradient.components

import typingsSlinky.reactNativeLinearGradient.mod.LinearGradientProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object LinearGradient {
  
  @scala.inline
  def apply(colors: js.Array[String | Double]): SharedBuilder_LinearGradientProps1757348134[typingsSlinky.reactNativeLinearGradient.mod.LinearGradient] = {
    val __props = js.Dynamic.literal(colors = colors.asInstanceOf[js.Any])
    new SharedBuilder_LinearGradientProps1757348134[typingsSlinky.reactNativeLinearGradient.mod.LinearGradient](js.Array(this.component, __props.asInstanceOf[LinearGradientProps]))
  }
  
  @JSImport("react-native-linear-gradient", "LinearGradient")
  @js.native
  val component: js.Object = js.native
  
  def withProps(p: LinearGradientProps): SharedBuilder_LinearGradientProps1757348134[typingsSlinky.reactNativeLinearGradient.mod.LinearGradient] = new SharedBuilder_LinearGradientProps1757348134[typingsSlinky.reactNativeLinearGradient.mod.LinearGradient](js.Array(this.component, p.asInstanceOf[js.Any]))
}
