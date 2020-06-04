package typingsSlinky.antd.tabsMod

import org.scalajs.dom.raw.HTMLElement
import slinky.core.ReactComponentClass
import slinky.core.TagMod
import slinky.core.facade.ReactElement
import slinky.web.SyntheticMouseEvent
import typingsSlinky.antd.anon.InkBar
import typingsSlinky.antd.antdStrings.add
import typingsSlinky.antd.antdStrings.large
import typingsSlinky.antd.antdStrings.remove
import typingsSlinky.antd.antdStrings.small
import typingsSlinky.react.mod.CSSProperties
import typingsSlinky.react.mod.MouseEventHandler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TabsProps extends js.Object {
  var activeKey: js.UndefOr[String] = js.undefined
  var animated: js.UndefOr[Boolean | InkBar] = js.undefined
  var className: js.UndefOr[String] = js.undefined
  var defaultActiveKey: js.UndefOr[String] = js.undefined
  var destroyInactiveTabPane: js.UndefOr[Boolean] = js.undefined
  var hideAdd: js.UndefOr[Boolean] = js.undefined
  var keyboard: js.UndefOr[Boolean] = js.undefined
  var onChange: js.UndefOr[js.Function1[/* activeKey */ String, Unit]] = js.undefined
  var onEdit: js.UndefOr[
    js.Function2[
      /* targetKey */ String | SyntheticMouseEvent[HTMLElement], 
      /* action */ add | remove, 
      Unit
    ]
  ] = js.undefined
  var onNextClick: js.UndefOr[MouseEventHandler[HTMLElement]] = js.undefined
  var onPrevClick: js.UndefOr[MouseEventHandler[HTMLElement]] = js.undefined
  var onTabClick: js.UndefOr[js.Function] = js.undefined
  var prefixCls: js.UndefOr[String] = js.undefined
  var renderTabBar: js.UndefOr[
    js.Function2[/* props */ TabsProps, /* DefaultTabBar */ ReactComponentClass[_], ReactElement]
  ] = js.undefined
  var size: js.UndefOr[large | typingsSlinky.antd.antdStrings.default | small] = js.undefined
  var style: js.UndefOr[CSSProperties] = js.undefined
  var tabBarExtraContent: js.UndefOr[TagMod[Any] | Null] = js.undefined
  var tabBarGutter: js.UndefOr[Double] = js.undefined
  var tabBarStyle: js.UndefOr[CSSProperties] = js.undefined
  var tabPosition: js.UndefOr[TabsPosition] = js.undefined
  var `type`: js.UndefOr[TabsType] = js.undefined
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
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setActiveKey(value: String): Self = this.set("activeKey", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteActiveKey: Self = this.set("activeKey", js.undefined)
    @scala.inline
    def setAnimated(value: Boolean | InkBar): Self = this.set("animated", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAnimated: Self = this.set("animated", js.undefined)
    @scala.inline
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    @scala.inline
    def setDefaultActiveKey(value: String): Self = this.set("defaultActiveKey", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefaultActiveKey: Self = this.set("defaultActiveKey", js.undefined)
    @scala.inline
    def setDestroyInactiveTabPane(value: Boolean): Self = this.set("destroyInactiveTabPane", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDestroyInactiveTabPane: Self = this.set("destroyInactiveTabPane", js.undefined)
    @scala.inline
    def setHideAdd(value: Boolean): Self = this.set("hideAdd", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHideAdd: Self = this.set("hideAdd", js.undefined)
    @scala.inline
    def setKeyboard(value: Boolean): Self = this.set("keyboard", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKeyboard: Self = this.set("keyboard", js.undefined)
    @scala.inline
    def setOnChange(value: /* activeKey */ String => Unit): Self = this.set("onChange", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnChange: Self = this.set("onChange", js.undefined)
    @scala.inline
    def setOnEdit(
      value: (/* targetKey */ String | SyntheticMouseEvent[HTMLElement], /* action */ add | remove) => Unit
    ): Self = this.set("onEdit", js.Any.fromFunction2(value))
    @scala.inline
    def deleteOnEdit: Self = this.set("onEdit", js.undefined)
    @scala.inline
    def setOnNextClick(value: SyntheticMouseEvent[HTMLElement] => Unit): Self = this.set("onNextClick", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnNextClick: Self = this.set("onNextClick", js.undefined)
    @scala.inline
    def setOnPrevClick(value: SyntheticMouseEvent[HTMLElement] => Unit): Self = this.set("onPrevClick", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnPrevClick: Self = this.set("onPrevClick", js.undefined)
    @scala.inline
    def setOnTabClick(value: js.Function): Self = this.set("onTabClick", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnTabClick: Self = this.set("onTabClick", js.undefined)
    @scala.inline
    def setPrefixCls(value: String): Self = this.set("prefixCls", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrefixCls: Self = this.set("prefixCls", js.undefined)
    @scala.inline
    def setRenderTabBar(value: (/* props */ TabsProps, /* DefaultTabBar */ ReactComponentClass[_]) => ReactElement): Self = this.set("renderTabBar", js.Any.fromFunction2(value))
    @scala.inline
    def deleteRenderTabBar: Self = this.set("renderTabBar", js.undefined)
    @scala.inline
    def setSize(value: large | typingsSlinky.antd.antdStrings.default | small): Self = this.set("size", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSize: Self = this.set("size", js.undefined)
    @scala.inline
    def setStyle(value: CSSProperties): Self = this.set("style", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
    @scala.inline
    def setTabBarExtraContentReactElement(value: ReactElement): Self = this.set("tabBarExtraContent", value.asInstanceOf[js.Any])
    @scala.inline
    def setTabBarExtraContent(value: TagMod[Any]): Self = this.set("tabBarExtraContent", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTabBarExtraContent: Self = this.set("tabBarExtraContent", js.undefined)
    @scala.inline
    def setTabBarExtraContentNull: Self = this.set("tabBarExtraContent", null)
    @scala.inline
    def setTabBarGutter(value: Double): Self = this.set("tabBarGutter", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTabBarGutter: Self = this.set("tabBarGutter", js.undefined)
    @scala.inline
    def setTabBarStyle(value: CSSProperties): Self = this.set("tabBarStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTabBarStyle: Self = this.set("tabBarStyle", js.undefined)
    @scala.inline
    def setTabPosition(value: TabsPosition): Self = this.set("tabPosition", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTabPosition: Self = this.set("tabPosition", js.undefined)
    @scala.inline
    def setType(value: TabsType): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
  
}

