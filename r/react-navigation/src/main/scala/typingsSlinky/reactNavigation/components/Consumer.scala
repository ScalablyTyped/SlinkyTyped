package typingsSlinky.reactNavigation.components

import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent.Default
import typingsSlinky.react.mod.ConsumerProps
import typingsSlinky.reactNavigation.mod.SupportedThemes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Consumer {
  
  @JSImport("react-navigation", "ThemeContext.Consumer")
  @js.native
  object component extends js.Object
  
  def withProps(p: ConsumerProps[SupportedThemes]): Default[tag.type, js.Object] = new Default[tag.type, js.Object](js.Array(this.component, p.asInstanceOf[js.Any]))
  
  @scala.inline
  def apply(children: SupportedThemes => ReactElement): Default[tag.type, js.Object] = {
    val __props = js.Dynamic.literal(children = js.Any.fromFunction1(children))
    new Default[tag.type, js.Object](js.Array(this.component, __props.asInstanceOf[ConsumerProps[SupportedThemes]]))
  }
}
