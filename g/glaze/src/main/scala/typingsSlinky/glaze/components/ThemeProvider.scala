package typingsSlinky.glaze.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent.Default
import typingsSlinky.glaze.themeContextMod.ThemeProviderProps
import typingsSlinky.glaze.themeMod.RuntimeTheme
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ThemeProvider {
  
  @scala.inline
  def apply(theme: RuntimeTheme): Default[tag.type, js.Object] = {
    val __props = js.Dynamic.literal(theme = theme.asInstanceOf[js.Any])
    new Default[tag.type, js.Object](js.Array(this.component, __props.asInstanceOf[ThemeProviderProps]))
  }
  
  @JSImport("glaze", "ThemeProvider")
  @js.native
  val component: js.Object = js.native
  
  def withProps(p: ThemeProviderProps): Default[tag.type, js.Object] = new Default[tag.type, js.Object](js.Array(this.component, p.asInstanceOf[js.Any]))
}
