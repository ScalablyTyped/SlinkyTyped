package typingsSlinky.reactNativeMaterialRipple.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent.Default
import typingsSlinky.reactNativeMaterialRipple.mod.RippleProps
import typingsSlinky.reactNativeMaterialRipple.mod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* The props of this component has an unsupported shape. You can use `set` manually to use it, but with no compiler support :/ . Support for combinations of intersection and union types not implemented */
object ReactNativeMaterialRipple {
  @JSImport("react-native-material-ripple", JSImport.Default)
  @js.native
  object component extends js.Object
  
  def apply(p: RippleProps): Default[tag.type, default] = new Default[tag.type, default](js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: ReactNativeMaterialRipple.type): Default[tag.type, default] = new Default[tag.type, default](js.Array(this.component, js.Dictionary.empty))()
}

