package typingsSlinky.atlaskitTree.mod

import org.scalablytyped.runtime.NumberDictionary
import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TreeData extends js.Object {
  var items: StringDictionary[TreeItem] with NumberDictionary[TreeItem] = js.native
  var rootId: ItemId = js.native
}

object TreeData {
  @scala.inline
  def apply(items: StringDictionary[TreeItem] with NumberDictionary[TreeItem], rootId: ItemId): TreeData = {
    val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any], rootId = rootId.asInstanceOf[js.Any])
    __obj.asInstanceOf[TreeData]
  }
  @scala.inline
  implicit class TreeDataOps[Self <: TreeData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withItems(value: StringDictionary[TreeItem] with NumberDictionary[TreeItem]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("items")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRootId(value: ItemId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rootId")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

