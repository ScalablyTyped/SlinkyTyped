package typingsSlinky.officeUiFabricReact.listScrollingExampleMod

import typingsSlinky.officeUiFabricReact.listTypesMod.ScrollToMode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IListScrollingExampleState extends js.Object {
  var scrollToMode: ScrollToMode = js.native
  var selectedIndex: Double = js.native
  var showItemIndexInView: Boolean = js.native
}

object IListScrollingExampleState {
  @scala.inline
  def apply(scrollToMode: ScrollToMode, selectedIndex: Double, showItemIndexInView: Boolean): IListScrollingExampleState = {
    val __obj = js.Dynamic.literal(scrollToMode = scrollToMode.asInstanceOf[js.Any], selectedIndex = selectedIndex.asInstanceOf[js.Any], showItemIndexInView = showItemIndexInView.asInstanceOf[js.Any])
    __obj.asInstanceOf[IListScrollingExampleState]
  }
  @scala.inline
  implicit class IListScrollingExampleStateOps[Self <: IListScrollingExampleState] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withScrollToMode(value: ScrollToMode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollToMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSelectedIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectedIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withShowItemIndexInView(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showItemIndexInView")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

