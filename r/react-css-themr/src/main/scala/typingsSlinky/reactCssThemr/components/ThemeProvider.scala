package typingsSlinky.reactCssThemr.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.reactCssThemr.mod.TReactCSSThemrTheme
import typingsSlinky.reactCssThemr.mod.ThemeProviderProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ThemeProvider {
  
  @JSImport("react-css-themr", "ThemeProvider")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.reactCssThemr.mod.ThemeProvider] {
    
    @scala.inline
    def innerRef(value: js.Function): this.type = set("innerRef", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: ThemeProviderProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  
  @scala.inline
  def apply(theme: TReactCSSThemrTheme): Builder = {
    val __props = js.Dynamic.literal(theme = theme.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[ThemeProviderProps]))
  }
}
