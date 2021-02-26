package typingsSlinky.expoLinearGradient.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent.Default
import typingsSlinky.expoLinearGradient.nativeLinearGradientTypesMod.NativeLinearGradientProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* The props of this component has an unsupported shape. You can use `set` manually to use it, but with no compiler support :/ . Couldn't find props for typingsSlinky.expoLinearGradient.nativeLinearGradientTypesMod.NativeLinearGradientProps because: IArray(Could't extract props from / * import warning: importer.ImportType#apply Failed type conversion: react.react.<global>.JSX.IntrinsicElements[T] * / js.Any because couldn't resolve ClassTree.) */
object NativeLinearGradientDotios {
  
  def apply(p: NativeLinearGradientProps): Default[tag.type, js.Object] = new Default[tag.type, js.Object](js.Array(this.component, p.asInstanceOf[js.Any]))
  
  @JSImport("expo-linear-gradient/build/NativeLinearGradient.ios", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  implicit def make(companion: NativeLinearGradientDotios.type): Default[tag.type, js.Object] = new Default[tag.type, js.Object](js.Array(this.component, js.Dictionary.empty))()
}
