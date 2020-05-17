package typingsSlinky.reactNative.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Item[ItemT] extends js.Object {
  var animated: js.UndefOr[Boolean | Null] = js.native
  var item: ItemT = js.native
  var viewPosition: js.UndefOr[Double] = js.native
}

object Item {
  @scala.inline
  def apply[ItemT](item: ItemT): Item[ItemT] = {
    val __obj = js.Dynamic.literal(item = item.asInstanceOf[js.Any])
    __obj.asInstanceOf[Item[ItemT]]
  }
  @scala.inline
  implicit class ItemOps[Self[itemt] <: Item[itemt], ItemT] (val x: Self[ItemT]) extends AnyVal {
    @scala.inline
    def duplicate: Self[ItemT] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[ItemT]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[ItemT] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[ItemT] with Other]
    @scala.inline
    def withItem(value: ItemT): Self[ItemT] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("item")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAnimated(value: Boolean): Self[ItemT] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animated")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAnimated: Self[ItemT] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animated")(js.undefined)
        ret
    }
    @scala.inline
    def withAnimatedNull: Self[ItemT] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animated")(null)
        ret
    }
    @scala.inline
    def withViewPosition(value: Double): Self[ItemT] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("viewPosition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutViewPosition: Self[ItemT] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("viewPosition")(js.undefined)
        ret
    }
  }
  
}

