package typingsSlinky.materialUiStyles.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.materialUiStyles.themeProviderThemeProviderMod.ThemeProviderProps
import typingsSlinky.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ThemeProvider {
  @JSImport("@material-ui/styles/ThemeProvider/ThemeProvider", JSImport.Default)
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder[T] (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, js.Object]
  
  def withProps[T](p: ThemeProviderProps[T]): Builder[T] = new Builder[T](js.Array(this.component, p.asInstanceOf[js.Any]))
  @scala.inline
  def apply[T](theme: Partial[T] | (js.Function1[T, T])): Builder[T] = {
    val __props = js.Dynamic.literal(theme = theme.asInstanceOf[js.Any])
    new Builder[T](js.Array(this.component, __props.asInstanceOf[ThemeProviderProps[T]]))
  }
}

