package typingsSlinky.blueprintjsCore.tabsMod

import typingsSlinky.blueprintjsCore.tabMod.TabId
import typingsSlinky.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ITabsState extends js.Object {
  var indicatorWrapperStyle: js.UndefOr[CSSProperties] = js.native
  var selectedTabId: js.UndefOr[TabId] = js.native
}

object ITabsState {
  @scala.inline
  def apply(): ITabsState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ITabsState]
  }
  @scala.inline
  implicit class ITabsStateOps[Self <: ITabsState] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIndicatorWrapperStyle(value: CSSProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("indicatorWrapperStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIndicatorWrapperStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("indicatorWrapperStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withSelectedTabId(value: TabId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectedTabId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelectedTabId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectedTabId")(js.undefined)
        ret
    }
  }
  
}

