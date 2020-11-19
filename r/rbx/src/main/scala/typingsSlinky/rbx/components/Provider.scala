package typingsSlinky.rbx.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent.Default
import typingsSlinky.rbx.anon.PreferHelpersPropsOverrid
import typingsSlinky.rbx.themeMod.ThemeContextValue
import typingsSlinky.react.mod.ProviderProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Provider {
  
  @JSImport("rbx/base/theme", "ThemeContext.Provider")
  @js.native
  object component extends js.Object
  
  def withProps(p: ProviderProps[ThemeContextValue[PreferHelpersPropsOverrid, js.Object]]): Default[tag.type, js.Object] = new Default[tag.type, js.Object](js.Array(this.component, p.asInstanceOf[js.Any]))
  
  @scala.inline
  def apply(value: ThemeContextValue[PreferHelpersPropsOverrid, js.Object]): Default[tag.type, js.Object] = {
    val __props = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    new Default[tag.type, js.Object](js.Array(this.component, __props.asInstanceOf[ProviderProps[ThemeContextValue[PreferHelpersPropsOverrid, js.Object]]]))
  }
}
