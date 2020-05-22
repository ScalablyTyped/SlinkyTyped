package typingsSlinky.antd.components

import typingsSlinky.antd.listItemMod.ListItemProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Item {
  @JSImport("antd/lib/list/Item", JSImport.Default)
  @js.native
  object component extends js.Object
  
  def withProps(p: ListItemProps): SharedBuilder_ListItemProps_1246570549 = new SharedBuilder_ListItemProps_1246570549(js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: Item.type): SharedBuilder_ListItemProps_1246570549 = new SharedBuilder_ListItemProps_1246570549(js.Array(this.component, js.Dictionary.empty))()
}

