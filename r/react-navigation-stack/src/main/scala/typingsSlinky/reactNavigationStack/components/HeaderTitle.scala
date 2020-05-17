package typingsSlinky.reactNavigationStack.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent.Default
import typingsSlinky.react.mod.ComponentProps
import typingsSlinky.reactNative.mod.Animated.AnimatedComponent
import typingsSlinky.reactNative.mod.Text
import typingsSlinky.reactNavigationStack.headerTitleMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* The props of this component has an unsupported shape. You can use `set` manually to use it, but with no compiler support :/ . Not a trait, Could't extract props from / * import warning: importer.ImportType#apply Failed type conversion: react.react.<global>.JSX.IntrinsicElements[T] * / js.Any because couldn't resolve ClassTree. */
object HeaderTitle {
  @JSImport("react-navigation-stack/lib/typescript/views/Header/HeaderTitle", JSImport.Default)
  @js.native
  object component extends js.Object
  
  def apply(p: ComponentProps[AnimatedComponent[Text]]): Default[tag.type, default] = new Default[tag.type, default](js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: HeaderTitle.type): Default[tag.type, default] = new Default[tag.type, default](js.Array(this.component, js.Dictionary.empty))()
}

