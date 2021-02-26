package typingsSlinky.reactJss.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.std.NonNullable
import typingsSlinky.theming.mod.DefaultTheme
import typingsSlinky.theming.mod.ThemeProviderProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ThemeProvider {
  
  @JSImport("react-jss", "ThemeProvider")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, js.Object] {
    
    @scala.inline
    def theme(value: NonNullable[DefaultTheme] | (js.Function1[DefaultTheme, NonNullable[DefaultTheme]])): this.type = set("theme", value.asInstanceOf[js.Any])
    
    @scala.inline
    def themeFunction1(value: DefaultTheme => NonNullable[DefaultTheme]): this.type = set("theme", js.Any.fromFunction1(value))
    
    @scala.inline
    def themeNull: this.type = set("theme", null)
  }
  
  implicit def make(companion: ThemeProvider.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: ThemeProviderProps[DefaultTheme]): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
