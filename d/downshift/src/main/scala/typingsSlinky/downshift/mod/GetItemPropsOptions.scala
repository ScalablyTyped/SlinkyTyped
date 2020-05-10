package typingsSlinky.downshift.mod

import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.react.mod.AllHTMLAttributes
import typingsSlinky.react.mod.ClassAttributes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetItemPropsOptions[Item]
  extends AllHTMLAttributes[HTMLElement]
     with ClassAttributes[HTMLElement] {
  var index: js.UndefOr[Double] = js.native
  var isSelected: js.UndefOr[Boolean] = js.native
  var item: Item = js.native
}

object GetItemPropsOptions {
  @scala.inline
  def apply[Item](item: Item): GetItemPropsOptions[Item] = {
    val __obj = js.Dynamic.literal(item = item.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetItemPropsOptions[Item]]
  }
  @scala.inline
  implicit class GetItemPropsOptionsOps[Self[item] <: GetItemPropsOptions[item], Item] (val x: Self[Item]) extends AnyVal {
    @scala.inline
    def duplicate: Self[Item] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[Item]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[Item] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[Item] with Other]
    @scala.inline
    def withItem(value: Item): Self[Item] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("item")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIndex(value: Double): Self[Item] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("index")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIndex: Self[Item] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("index")(js.undefined)
        ret
    }
    @scala.inline
    def withIsSelected(value: Boolean): Self[Item] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isSelected")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsSelected: Self[Item] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isSelected")(js.undefined)
        ret
    }
  }
  
}

