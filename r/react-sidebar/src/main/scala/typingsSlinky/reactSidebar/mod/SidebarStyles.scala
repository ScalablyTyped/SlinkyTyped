package typingsSlinky.reactSidebar.mod

import typingsSlinky.reactSidebar.PartialCSSStyleDeclaratio
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SidebarStyles extends js.Object {
  var content: js.UndefOr[PartialCSSStyleDeclaratio] = js.native
  var dragHandle: js.UndefOr[PartialCSSStyleDeclaratio] = js.native
  var overlay: js.UndefOr[PartialCSSStyleDeclaratio] = js.native
  var root: js.UndefOr[PartialCSSStyleDeclaratio] = js.native
  var sidebar: js.UndefOr[PartialCSSStyleDeclaratio] = js.native
}

object SidebarStyles {
  @scala.inline
  def apply(): SidebarStyles = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SidebarStyles]
  }
  @scala.inline
  implicit class SidebarStylesOps[Self <: SidebarStyles] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withContent(value: PartialCSSStyleDeclaratio): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("content")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("content")(js.undefined)
        ret
    }
    @scala.inline
    def withDragHandle(value: PartialCSSStyleDeclaratio): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dragHandle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDragHandle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dragHandle")(js.undefined)
        ret
    }
    @scala.inline
    def withOverlay(value: PartialCSSStyleDeclaratio): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overlay")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOverlay: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overlay")(js.undefined)
        ret
    }
    @scala.inline
    def withRoot(value: PartialCSSStyleDeclaratio): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("root")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRoot: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("root")(js.undefined)
        ret
    }
    @scala.inline
    def withSidebar(value: PartialCSSStyleDeclaratio): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sidebar")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSidebar: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sidebar")(js.undefined)
        ret
    }
  }
  
}

