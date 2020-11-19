package typingsSlinky.materialUiStyles.components

import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent.Default
import typingsSlinky.materialUiStyles.stylesProviderStylesProviderMod.StylesOptions
import typingsSlinky.react.mod.ConsumerProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Consumer {
  
  @JSImport("@material-ui/styles/StylesProvider/StylesProvider", "StylesContext.Consumer")
  @js.native
  object component extends js.Object
  
  def withProps(p: ConsumerProps[StylesOptions]): Default[tag.type, js.Object] = new Default[tag.type, js.Object](js.Array(this.component, p.asInstanceOf[js.Any]))
  
  @scala.inline
  def apply(children: StylesOptions => ReactElement): Default[tag.type, js.Object] = {
    val __props = js.Dynamic.literal(children = js.Any.fromFunction1(children))
    new Default[tag.type, js.Object](js.Array(this.component, __props.asInstanceOf[ConsumerProps[StylesOptions]]))
  }
}
