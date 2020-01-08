package typingsSlinky.baseui

import typingsSlinky.baseui.menuMod.GetRequiredItemProps
import typingsSlinky.baseui.menuMod.ItemsT
import typingsSlinky.baseui.menuMod.RenderItemProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_GetRequiredItemProps extends js.Object {
  var getRequiredItemProps: GetRequiredItemProps
  var items: ItemsT
}

object Anon_GetRequiredItemProps {
  @scala.inline
  def apply(getRequiredItemProps: (/* item */ js.Any, /* index */ Double) => RenderItemProps, items: ItemsT): Anon_GetRequiredItemProps = {
    val __obj = js.Dynamic.literal(getRequiredItemProps = js.Any.fromFunction2(getRequiredItemProps), items = items.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_GetRequiredItemProps]
  }
}

