package typingsSlinky.antd.components

import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.antd.transferListItemMod.ListItemProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ListItem {
  @JSImport("antd/lib/transfer/ListItem", JSImport.Default)
  @js.native
  object component extends js.Object
  
  def withProps(p: js.Function1[/* props */ ListItemProps, ReactElement]): typingsSlinky.StBuildingComponent.Default[tag.type, js.Object] = new typingsSlinky.StBuildingComponent.Default[tag.type, js.Object](js.Array(this.component, p.asInstanceOf[js.Any]))
  @scala.inline
  def apply(
    bind: (js.Any, /* repeated */ js.Dynamic) => js.Any,
    call: (js.Any, /* repeated */ js.Dynamic) => js.Any,
    length: Int
  ): typingsSlinky.StBuildingComponent.Default[tag.type, js.Object] = {
    val __props = js.Dynamic.literal(bind = js.Any.fromFunction2(bind), call = js.Any.fromFunction2(call), length = length.asInstanceOf[js.Any])
    new typingsSlinky.StBuildingComponent.Default[tag.type, js.Object](js.Array(this.component, __props.asInstanceOf[js.Function1[/* props */ ListItemProps, ReactElement]]))
  }
}

