package typingsSlinky.agGrid.tabbedLayoutMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TabbedLayoutParams extends js.Object {
  var cssClass: js.UndefOr[String] = js.native
  var items: js.Array[TabbedItem] = js.native
  var onActiveItemClicked: js.UndefOr[js.Function] = js.native
  var onItemClicked: js.UndefOr[js.Function] = js.native
}

object TabbedLayoutParams {
  @scala.inline
  def apply(items: js.Array[TabbedItem]): TabbedLayoutParams = {
    val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any])
    __obj.asInstanceOf[TabbedLayoutParams]
  }
  @scala.inline
  implicit class TabbedLayoutParamsOps[Self <: TabbedLayoutParams] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withItems(value: js.Array[TabbedItem]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("items")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCssClass(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cssClass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCssClass: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cssClass")(js.undefined)
        ret
    }
    @scala.inline
    def withOnActiveItemClicked(value: js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onActiveItemClicked")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnActiveItemClicked: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onActiveItemClicked")(js.undefined)
        ret
    }
    @scala.inline
    def withOnItemClicked(value: js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onItemClicked")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnItemClicked: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onItemClicked")(js.undefined)
        ret
    }
  }
  
}

