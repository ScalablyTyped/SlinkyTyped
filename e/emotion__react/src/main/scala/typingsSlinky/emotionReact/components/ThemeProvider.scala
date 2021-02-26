package typingsSlinky.emotionReact.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent.Default
import typingsSlinky.emotionReact.emotionReactMod.Theme
import typingsSlinky.emotionReact.themingMod.ThemeProviderProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ThemeProvider {
  
  @scala.inline
  def apply(theme: js.Object | (js.Function1[/* outerTheme */ Theme, Theme])): Default[tag.type, js.Object] = {
    val __props = js.Dynamic.literal(theme = theme.asInstanceOf[js.Any])
    new Default[tag.type, js.Object](js.Array(this.component, __props.asInstanceOf[/* props */ ThemeProviderProps]))
  }
  
  @JSImport("@emotion/react", "ThemeProvider")
  @js.native
  val component: js.Object = js.native
  
  def withProps(p: /* props */ ThemeProviderProps): Default[tag.type, js.Object] = new Default[tag.type, js.Object](js.Array(this.component, p.asInstanceOf[js.Any]))
}
