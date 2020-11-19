package typingsSlinky.expoLinearGradient.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent.Default
import typingsSlinky.expoLinearGradient.nativeLinearGradientAndroidMod.Props
import typingsSlinky.expoLinearGradient.nativeLinearGradientAndroidMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* The props of this component has an unsupported shape. You can use `set` manually to use it, but with no compiler support :/ . Couldn't find props for typingsSlinky.expoLinearGradient.nativeLinearGradientAndroidMod.Props because: IArray(Could't extract props from / * import warning: importer.ImportType#apply Failed type conversion: react.react.<global>.JSX.IntrinsicElements[T] * / js.Any because couldn't resolve ClassTree.) */
object NativeLinearGradientDotandroid {
  
  @JSImport("expo-linear-gradient/build/NativeLinearGradient.android", JSImport.Default)
  @js.native
  object component extends js.Object
  
  def apply(p: Props): Default[tag.type, default] = new Default[tag.type, default](js.Array(this.component, p.asInstanceOf[js.Any]))
  
  implicit def make(companion: NativeLinearGradientDotandroid.type): Default[tag.type, default] = new Default[tag.type, default](js.Array(this.component, js.Dictionary.empty))()
}
