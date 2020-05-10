package typingsSlinky.reactTabsRedux.tabsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TabsProps extends js.Object {
  var activeLinkStyle: js.UndefOr[js.Object] = js.native
  var disableInlineStyles: js.UndefOr[Boolean] = js.native
  var handleSelect: js.UndefOr[js.Function2[/* tab */ String, /* name */ String, Unit]] = js.native
  var name: js.UndefOr[String] = js.native
  var onChange: js.UndefOr[js.Function2[/* selectedTab */ String, /* name */ String, Unit]] = js.native
  var renderActiveTabContentOnly: js.UndefOr[Boolean] = js.native
  var selectedTab: js.UndefOr[String] = js.native
  var visibleTabStyle: js.UndefOr[js.Object] = js.native
}

object TabsProps {
  @scala.inline
  def apply(): TabsProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TabsProps]
  }
  @scala.inline
  implicit class TabsPropsOps[Self <: TabsProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withActiveLinkStyle(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("activeLinkStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutActiveLinkStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("activeLinkStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withDisableInlineStyles(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableInlineStyles")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisableInlineStyles: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableInlineStyles")(js.undefined)
        ret
    }
    @scala.inline
    def withHandleSelect(value: (/* tab */ String, /* name */ String) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("handleSelect")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutHandleSelect: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("handleSelect")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
        ret
    }
    @scala.inline
    def withOnChange(value: (/* selectedTab */ String, /* name */ String) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onChange")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnChange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onChange")(js.undefined)
        ret
    }
    @scala.inline
    def withRenderActiveTabContentOnly(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderActiveTabContentOnly")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRenderActiveTabContentOnly: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderActiveTabContentOnly")(js.undefined)
        ret
    }
    @scala.inline
    def withSelectedTab(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectedTab")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelectedTab: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectedTab")(js.undefined)
        ret
    }
    @scala.inline
    def withVisibleTabStyle(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visibleTabStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVisibleTabStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visibleTabStyle")(js.undefined)
        ret
    }
  }
  
}

