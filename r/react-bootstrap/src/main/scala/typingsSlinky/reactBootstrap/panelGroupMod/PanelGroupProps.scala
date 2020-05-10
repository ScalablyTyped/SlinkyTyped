package typingsSlinky.reactBootstrap.panelGroupMod

import typingsSlinky.react.mod.AllHTMLAttributes
import typingsSlinky.react.mod.ClassAttributes
import typingsSlinky.reactBootstrap.mod.SelectCallback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PanelGroupProps
  extends AllHTMLAttributes[PanelGroup]
     with ClassAttributes[PanelGroup] {
  var accordion: js.UndefOr[Boolean] = js.native
  var activeKey: js.UndefOr[js.Any] = js.native
  var defaultActiveKey: js.UndefOr[js.Any] = js.native
  var generateChildId: js.UndefOr[js.Function] = js.native
  @JSName("onSelect")
  var onSelect_PanelGroupProps: js.UndefOr[SelectCallback] = js.native
}

object PanelGroupProps {
  @scala.inline
  def apply(): PanelGroupProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PanelGroupProps]
  }
  @scala.inline
  implicit class PanelGroupPropsOps[Self <: PanelGroupProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAccordion(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accordion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAccordion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accordion")(js.undefined)
        ret
    }
    @scala.inline
    def withActiveKey(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("activeKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutActiveKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("activeKey")(js.undefined)
        ret
    }
    @scala.inline
    def withDefaultActiveKey(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultActiveKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultActiveKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultActiveKey")(js.undefined)
        ret
    }
    @scala.inline
    def withGenerateChildId(value: js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("generateChildId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGenerateChildId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("generateChildId")(js.undefined)
        ret
    }
    @scala.inline
    def withOnSelect(value: SelectCallback): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSelect")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnSelect: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSelect")(js.undefined)
        ret
    }
  }
  
}

