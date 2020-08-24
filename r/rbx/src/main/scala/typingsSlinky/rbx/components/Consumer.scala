package typingsSlinky.rbx.components

import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent.Default
import typingsSlinky.rbx.anon.PreferHelpersPropsOverrid
import typingsSlinky.rbx.themeMod.ThemeContextValue
import typingsSlinky.react.mod.ConsumerProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Consumer {
  @JSImport("rbx/base/theme", "ThemeContext.Consumer")
  @js.native
  object component extends js.Object
  
  def withProps(p: ConsumerProps[ThemeContextValue[PreferHelpersPropsOverrid, js.Object]]): Default[tag.type, js.Object] = new Default[tag.type, js.Object](js.Array(this.component, p.asInstanceOf[js.Any]))
  @scala.inline
  def apply(children: ThemeContextValue[PreferHelpersPropsOverrid, js.Object] => ReactElement): Default[tag.type, js.Object] = {
    val __props = js.Dynamic.literal(children = js.Any.fromFunction1(children))
    new Default[tag.type, js.Object](js.Array(this.component, __props.asInstanceOf[ConsumerProps[ThemeContextValue[PreferHelpersPropsOverrid, js.Object]]]))
  }
}

