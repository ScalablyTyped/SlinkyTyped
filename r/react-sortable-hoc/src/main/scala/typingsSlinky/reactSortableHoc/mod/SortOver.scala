package typingsSlinky.reactSortableHoc.mod

import org.scalajs.dom.raw.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SortOver extends js.Object {
  var collection: Offset = js.native
  var helper: HTMLElement = js.native
  var index: Double = js.native
  var isKeySorting: Boolean = js.native
  var newIndex: Double = js.native
  var nodes: js.Array[HTMLElement] = js.native
  var oldIndex: Double = js.native
}

object SortOver {
  @scala.inline
  def apply(
    collection: Offset,
    helper: HTMLElement,
    index: Double,
    isKeySorting: Boolean,
    newIndex: Double,
    nodes: js.Array[HTMLElement],
    oldIndex: Double
  ): SortOver = {
    val __obj = js.Dynamic.literal(collection = collection.asInstanceOf[js.Any], helper = helper.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], isKeySorting = isKeySorting.asInstanceOf[js.Any], newIndex = newIndex.asInstanceOf[js.Any], nodes = nodes.asInstanceOf[js.Any], oldIndex = oldIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[SortOver]
  }
  @scala.inline
  implicit class SortOverOps[Self <: SortOver] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCollection(value: Offset): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("collection")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHelper(value: HTMLElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("helper")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("index")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsKeySorting(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isKeySorting")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNewIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNodes(value: js.Array[HTMLElement]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nodes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOldIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("oldIndex")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

