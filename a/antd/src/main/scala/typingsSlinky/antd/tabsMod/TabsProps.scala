package typingsSlinky.antd.tabsMod

import org.scalajs.dom.raw.HTMLElement
import slinky.core.ReactComponentClass
import slinky.core.TagMod
import slinky.core.facade.ReactElement
import slinky.web.SyntheticMouseEvent
import typingsSlinky.antd.AnonInkBar
import typingsSlinky.antd.antdStrings.add
import typingsSlinky.antd.antdStrings.large
import typingsSlinky.antd.antdStrings.remove
import typingsSlinky.antd.antdStrings.small
import typingsSlinky.react.mod.CSSProperties
import typingsSlinky.react.mod.MouseEventHandler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TabsProps extends js.Object {
  var activeKey: js.UndefOr[String] = js.native
  var animated: js.UndefOr[Boolean | AnonInkBar] = js.native
  var className: js.UndefOr[String] = js.native
  var defaultActiveKey: js.UndefOr[String] = js.native
  var destroyInactiveTabPane: js.UndefOr[Boolean] = js.native
  var hideAdd: js.UndefOr[Boolean] = js.native
  var onChange: js.UndefOr[js.Function1[/* activeKey */ String, Unit]] = js.native
  var onEdit: js.UndefOr[
    js.Function2[
      /* targetKey */ String | SyntheticMouseEvent[HTMLElement], 
      /* action */ add | remove, 
      Unit
    ]
  ] = js.native
  var onNextClick: js.UndefOr[MouseEventHandler[HTMLElement]] = js.native
  var onPrevClick: js.UndefOr[MouseEventHandler[HTMLElement]] = js.native
  var onTabClick: js.UndefOr[js.Function] = js.native
  var prefixCls: js.UndefOr[String] = js.native
  var renderTabBar: js.UndefOr[
    js.Function2[/* props */ TabsProps, /* DefaultTabBar */ ReactComponentClass[_], ReactElement]
  ] = js.native
  var size: js.UndefOr[large | typingsSlinky.antd.antdStrings.default | small] = js.native
  var style: js.UndefOr[CSSProperties] = js.native
  var tabBarExtraContent: js.UndefOr[TagMod[Any] | Null] = js.native
  var tabBarGutter: js.UndefOr[Double] = js.native
  var tabBarStyle: js.UndefOr[CSSProperties] = js.native
  var tabPosition: js.UndefOr[TabsPosition] = js.native
  var `type`: js.UndefOr[TabsType] = js.native
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
    def withActiveKey(value: String): Self = {
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
    def withAnimated(value: Boolean | AnonInkBar): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animated")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAnimated: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animated")(js.undefined)
        ret
    }
    @scala.inline
    def withClassName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("className")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClassName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("className")(js.undefined)
        ret
    }
    @scala.inline
    def withDefaultActiveKey(value: String): Self = {
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
    def withDestroyInactiveTabPane(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("destroyInactiveTabPane")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDestroyInactiveTabPane: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("destroyInactiveTabPane")(js.undefined)
        ret
    }
    @scala.inline
    def withHideAdd(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hideAdd")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHideAdd: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hideAdd")(js.undefined)
        ret
    }
    @scala.inline
    def withOnChange(value: /* activeKey */ String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onChange")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnChange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onChange")(js.undefined)
        ret
    }
    @scala.inline
    def withOnEdit(
      value: (/* targetKey */ String | SyntheticMouseEvent[HTMLElement], /* action */ add | remove) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onEdit")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnEdit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onEdit")(js.undefined)
        ret
    }
    @scala.inline
    def withOnNextClick(value: SyntheticMouseEvent[HTMLElement] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onNextClick")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnNextClick: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onNextClick")(js.undefined)
        ret
    }
    @scala.inline
    def withOnPrevClick(value: SyntheticMouseEvent[HTMLElement] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPrevClick")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnPrevClick: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPrevClick")(js.undefined)
        ret
    }
    @scala.inline
    def withOnTabClick(value: js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onTabClick")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnTabClick: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onTabClick")(js.undefined)
        ret
    }
    @scala.inline
    def withPrefixCls(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prefixCls")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrefixCls: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prefixCls")(js.undefined)
        ret
    }
    @scala.inline
    def withRenderTabBar(value: (/* props */ TabsProps, /* DefaultTabBar */ ReactComponentClass[_]) => ReactElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderTabBar")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutRenderTabBar: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderTabBar")(js.undefined)
        ret
    }
    @scala.inline
    def withSize(value: large | typingsSlinky.antd.antdStrings.default | small): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("size")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("size")(js.undefined)
        ret
    }
    @scala.inline
    def withStyle(value: CSSProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("style")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("style")(js.undefined)
        ret
    }
    @scala.inline
    def withTabBarExtraContentReactElement(value: ReactElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tabBarExtraContent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTabBarExtraContent(value: TagMod[Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tabBarExtraContent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTabBarExtraContent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tabBarExtraContent")(js.undefined)
        ret
    }
    @scala.inline
    def withTabBarExtraContentNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tabBarExtraContent")(null)
        ret
    }
    @scala.inline
    def withTabBarGutter(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tabBarGutter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTabBarGutter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tabBarGutter")(js.undefined)
        ret
    }
    @scala.inline
    def withTabBarStyle(value: CSSProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tabBarStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTabBarStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tabBarStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withTabPosition(value: TabsPosition): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tabPosition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTabPosition: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tabPosition")(js.undefined)
        ret
    }
    @scala.inline
    def withType(value: TabsType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(js.undefined)
        ret
    }
  }
  
}

