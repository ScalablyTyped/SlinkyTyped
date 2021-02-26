package typingsSlinky.materialUiStyles.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.materialUiStyles.themeProviderThemeProviderMod.ThemeProviderProps
import typingsSlinky.std.Partial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ThemeProvider {
  
  @scala.inline
  def apply[T](theme: Partial[T] | (js.Function1[T, T])): Builder[T] = {
    val __props = js.Dynamic.literal(theme = theme.asInstanceOf[js.Any])
    new Builder[T](js.Array(this.component, __props.asInstanceOf[ThemeProviderProps[T]]))
  }
  
  @JSImport("@material-ui/styles", "ThemeProvider")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder[T] (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, js.Object]
  
  def withProps[T](p: ThemeProviderProps[T]): Builder[T] = new Builder[T](js.Array(this.component, p.asInstanceOf[js.Any]))
}
