package typingsSlinky.reactThemeableTs.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.reactThemeableTs.themeProviderMod.IThemeProviderProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ThemeProvider {
  
  @JSImport("react-themeable-ts", "ThemeProvider")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.reactThemeableTs.mod.ThemeProvider] {
    
    @scala.inline
    def children(value: js.Any): this.type = set("children", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: IThemeProviderProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  
  @scala.inline
  def apply(reactThemeable: js.Any): Builder = {
    val __props = js.Dynamic.literal(reactThemeable = reactThemeable.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[IThemeProviderProps]))
  }
}
