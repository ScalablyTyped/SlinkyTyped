package typingsSlinky.reactNative.mod

import typingsSlinky.reactNative.AnonHighlight
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SectionListRenderItemInfo[ItemT] extends ListRenderItemInfo[ItemT] {
  var section: SectionListData[ItemT] = js.native
}

object SectionListRenderItemInfo {
  @scala.inline
  def apply[ItemT](index: Double, item: ItemT, section: SectionListData[ItemT], separators: AnonHighlight): SectionListRenderItemInfo[ItemT] = {
    val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any], item = item.asInstanceOf[js.Any], section = section.asInstanceOf[js.Any], separators = separators.asInstanceOf[js.Any])
    __obj.asInstanceOf[SectionListRenderItemInfo[ItemT]]
  }
  @scala.inline
  implicit class SectionListRenderItemInfoOps[Self[itemt] <: SectionListRenderItemInfo[itemt], ItemT] (val x: Self[ItemT]) extends AnyVal {
    @scala.inline
    def duplicate: Self[ItemT] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[ItemT]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[ItemT] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[ItemT] with Other]
    @scala.inline
    def withSection(value: SectionListData[ItemT]): Self[ItemT] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("section")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

