package typingsSlinky.materialUiStyles.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent.Default
import typingsSlinky.materialUiStyles.stylesProviderStylesProviderMod.StylesOptions
import typingsSlinky.react.mod.ProviderProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Provider {
  
  @JSImport("@material-ui/styles/StylesProvider/StylesProvider", "StylesContext.Provider")
  @js.native
  object component extends js.Object
  
  def withProps(p: ProviderProps[StylesOptions]): Default[tag.type, js.Object] = new Default[tag.type, js.Object](js.Array(this.component, p.asInstanceOf[js.Any]))
  
  @scala.inline
  def apply(value: StylesOptions): Default[tag.type, js.Object] = {
    val __props = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    new Default[tag.type, js.Object](js.Array(this.component, __props.asInstanceOf[ProviderProps[StylesOptions]]))
  }
}
