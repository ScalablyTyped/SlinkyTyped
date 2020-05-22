package typingsSlinky.antd.components

import typingsSlinky.antd.listItemMod.ListItemProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ListItem {
  @JSImport("antd", "List.Item")
  @js.native
  object component extends js.Object
  
  def withProps(p: ListItemProps): SharedBuilder_ListItemProps_1246570549 = new SharedBuilder_ListItemProps_1246570549(js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: ListItem.type): SharedBuilder_ListItemProps_1246570549 = new SharedBuilder_ListItemProps_1246570549(js.Array(this.component, js.Dictionary.empty))()
}

