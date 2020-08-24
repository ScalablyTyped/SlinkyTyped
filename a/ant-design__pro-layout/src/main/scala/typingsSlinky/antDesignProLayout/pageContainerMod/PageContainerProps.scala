package typingsSlinky.antDesignProLayout.pageContainerMod

import org.scalajs.dom.raw.HTMLDivElement
import slinky.core.facade.ReactElement
import slinky.web.SyntheticMouseEvent
import typingsSlinky.antDesignProLayout.anon.TabPanePropskeyReactTextu
import typingsSlinky.antDesignProLayout.antDesignProLayoutBooleans.`false`
import typingsSlinky.antd.avatarAvatarMod.AvatarProps
import typingsSlinky.antd.breadcrumbBreadcrumbMod.BreadcrumbProps
import typingsSlinky.antd.tabsMod.TabsProps
import typingsSlinky.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined parent @ant-design/pro-layout.@ant-design/pro-layout/lib/PageContainer.PageHeaderTabConfig */
/* Inlined parent std.Omit<antd.antd/lib/page-header.PageHeaderProps, 'title'> */
@js.native
trait PageContainerProps extends js.Object {
  var avatar: js.UndefOr[AvatarProps] = js.native
  var backIcon: js.UndefOr[ReactElement] = js.native
  var breadcrumb: js.UndefOr[BreadcrumbProps] = js.native
  var className: js.UndefOr[String] = js.native
  var content: js.UndefOr[ReactElement] = js.native
  var extra: js.UndefOr[ReactElement] = js.native
  var extraContent: js.UndefOr[ReactElement] = js.native
  var footer: js.UndefOr[js.Array[ReactElement]] = js.native
  var ghost: js.UndefOr[Boolean] = js.native
  var onBack: js.UndefOr[js.Function1[/* e */ SyntheticMouseEvent[HTMLDivElement], Unit]] = js.native
  var onTabChange: js.UndefOr[js.Function1[/* activeKey */ String, Unit]] = js.native
  var pageHeaderRender: js.UndefOr[js.Function1[/* props */ this.type, ReactElement]] = js.native
  var prefixCls: js.UndefOr[String] = js.native
  var style: js.UndefOr[CSSProperties] = js.native
  var subTitle: js.UndefOr[ReactElement] = js.native
  var tabActiveKey: js.UndefOr[String] = js.native
  var tabBarExtraContent: js.UndefOr[ReactElement] = js.native
  var tabList: js.UndefOr[js.Array[TabPanePropskeyReactTextu]] = js.native
  var tabProps: js.UndefOr[TabsProps] = js.native
  var tags: js.UndefOr[ReactElement | js.Array[ReactElement]] = js.native
  var title: js.UndefOr[ReactElement | `false`] = js.native
}

object PageContainerProps {
  @scala.inline
  def apply(): PageContainerProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PageContainerProps]
  }
  @scala.inline
  implicit class PageContainerPropsOps[Self <: PageContainerProps] (val x: Self) extends AnyVal {
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
    def setAvatar(value: AvatarProps): Self = this.set("avatar", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAvatar: Self = this.set("avatar", js.undefined)
    @scala.inline
    def setBackIconReactElement(value: ReactElement): Self = this.set("backIcon", value.asInstanceOf[js.Any])
    @scala.inline
    def setBackIcon(value: ReactElement): Self = this.set("backIcon", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBackIcon: Self = this.set("backIcon", js.undefined)
    @scala.inline
    def setBreadcrumb(value: BreadcrumbProps): Self = this.set("breadcrumb", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBreadcrumb: Self = this.set("breadcrumb", js.undefined)
    @scala.inline
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    @scala.inline
    def setContentReactElement(value: ReactElement): Self = this.set("content", value.asInstanceOf[js.Any])
    @scala.inline
    def setContent(value: ReactElement): Self = this.set("content", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContent: Self = this.set("content", js.undefined)
    @scala.inline
    def setExtraReactElement(value: ReactElement): Self = this.set("extra", value.asInstanceOf[js.Any])
    @scala.inline
    def setExtra(value: ReactElement): Self = this.set("extra", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExtra: Self = this.set("extra", js.undefined)
    @scala.inline
    def setExtraContentReactElement(value: ReactElement): Self = this.set("extraContent", value.asInstanceOf[js.Any])
    @scala.inline
    def setExtraContent(value: ReactElement): Self = this.set("extraContent", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExtraContent: Self = this.set("extraContent", js.undefined)
    @scala.inline
    def setFooterVarargs(value: ReactElement*): Self = this.set("footer", js.Array(value :_*))
    @scala.inline
    def setFooter(value: js.Array[ReactElement]): Self = this.set("footer", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFooter: Self = this.set("footer", js.undefined)
    @scala.inline
    def setGhost(value: Boolean): Self = this.set("ghost", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGhost: Self = this.set("ghost", js.undefined)
    @scala.inline
    def setOnBack(value: /* e */ SyntheticMouseEvent[HTMLDivElement] => Unit): Self = this.set("onBack", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnBack: Self = this.set("onBack", js.undefined)
    @scala.inline
    def setOnTabChange(value: /* activeKey */ String => Unit): Self = this.set("onTabChange", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnTabChange: Self = this.set("onTabChange", js.undefined)
    @scala.inline
    def setPageHeaderRender(value: PageContainerProps => ReactElement): Self = this.set("pageHeaderRender", js.Any.fromFunction1(value))
    @scala.inline
    def deletePageHeaderRender: Self = this.set("pageHeaderRender", js.undefined)
    @scala.inline
    def setPrefixCls(value: String): Self = this.set("prefixCls", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrefixCls: Self = this.set("prefixCls", js.undefined)
    @scala.inline
    def setStyle(value: CSSProperties): Self = this.set("style", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
    @scala.inline
    def setSubTitleReactElement(value: ReactElement): Self = this.set("subTitle", value.asInstanceOf[js.Any])
    @scala.inline
    def setSubTitle(value: ReactElement): Self = this.set("subTitle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSubTitle: Self = this.set("subTitle", js.undefined)
    @scala.inline
    def setTabActiveKey(value: String): Self = this.set("tabActiveKey", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTabActiveKey: Self = this.set("tabActiveKey", js.undefined)
    @scala.inline
    def setTabBarExtraContentReactElement(value: ReactElement): Self = this.set("tabBarExtraContent", value.asInstanceOf[js.Any])
    @scala.inline
    def setTabBarExtraContent(value: ReactElement): Self = this.set("tabBarExtraContent", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTabBarExtraContent: Self = this.set("tabBarExtraContent", js.undefined)
    @scala.inline
    def setTabListVarargs(value: TabPanePropskeyReactTextu*): Self = this.set("tabList", js.Array(value :_*))
    @scala.inline
    def setTabList(value: js.Array[TabPanePropskeyReactTextu]): Self = this.set("tabList", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTabList: Self = this.set("tabList", js.undefined)
    @scala.inline
    def setTabProps(value: TabsProps): Self = this.set("tabProps", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTabProps: Self = this.set("tabProps", js.undefined)
    @scala.inline
    def setTagsReactElement(value: ReactElement): Self = this.set("tags", value.asInstanceOf[js.Any])
    @scala.inline
    def setTagsVarargs(value: ReactElement*): Self = this.set("tags", js.Array(value :_*))
    @scala.inline
    def setTags(value: ReactElement | js.Array[ReactElement]): Self = this.set("tags", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTags: Self = this.set("tags", js.undefined)
    @scala.inline
    def setTitleReactElement(value: ReactElement): Self = this.set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def setTitle(value: ReactElement | `false`): Self = this.set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
  }
  
}

