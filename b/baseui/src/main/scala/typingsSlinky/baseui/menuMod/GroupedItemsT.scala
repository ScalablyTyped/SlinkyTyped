package typingsSlinky.baseui.menuMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GroupedItemsT extends /* key */ StringDictionary[ArrayItemsT] {
  var __ungrouped: ArrayItemsT = js.native
}

object GroupedItemsT {
  @scala.inline
  def apply(__ungrouped: ArrayItemsT): GroupedItemsT = {
    val __obj = js.Dynamic.literal(__ungrouped = __ungrouped.asInstanceOf[js.Any])
    __obj.asInstanceOf[GroupedItemsT]
  }
  @scala.inline
  implicit class GroupedItemsTOps[Self <: GroupedItemsT] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def with__ungrouped(value: ArrayItemsT): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("__ungrouped")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

