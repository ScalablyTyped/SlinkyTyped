package typingsSlinky.antDesignProLayout.components

import org.scalajs.dom.raw.HTMLDivElement
import slinky.core.facade.ReactElement
import slinky.web.SyntheticMouseEvent
import slinky.web.html.div.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.antDesignProLayout.anon.PageHeaderPropschildrenRe
import typingsSlinky.antDesignProLayout.anon.TabPanePropskeyReactTextu
import typingsSlinky.antDesignProLayout.antDesignProLayoutBooleans.`false`
import typingsSlinky.antDesignProLayout.pageContainerMod.PageContainerProps
import typingsSlinky.antDesignProLayout.typingsMod.WithFalse
import typingsSlinky.antd.affixMod.AffixProps
import typingsSlinky.antd.avatarAvatarMod.AvatarProps
import typingsSlinky.antd.breadcrumbBreadcrumbMod.BreadcrumbProps
import typingsSlinky.antd.tabsMod.TabsProps
import typingsSlinky.rcTabs.interfaceMod.TabBarExtraContent
import typingsSlinky.react.mod.CSSProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@scala.inline
class SharedBuilder_PageContainerProps470028446 (val args: js.Array[js.Any])
  extends AnyVal
     with StBuildingComponent[tag.type, scala.Nothing] {
  
  @scala.inline
  def affixProps(value: AffixProps): this.type = set("affixProps", value.asInstanceOf[js.Any])
  
  @scala.inline
  def avatar(value: AvatarProps): this.type = set("avatar", value.asInstanceOf[js.Any])
  
  @scala.inline
  def backIcon(value: ReactElement): this.type = set("backIcon", value.asInstanceOf[js.Any])
  
  @scala.inline
  def backIconReactElement(value: ReactElement): this.type = set("backIcon", value.asInstanceOf[js.Any])
  
  @scala.inline
  def breadcrumb(value: BreadcrumbProps): this.type = set("breadcrumb", value.asInstanceOf[js.Any])
  
  @scala.inline
  def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
  
  @scala.inline
  def content(value: ReactElement): this.type = set("content", value.asInstanceOf[js.Any])
  
  @scala.inline
  def contentReactElement(value: ReactElement): this.type = set("content", value.asInstanceOf[js.Any])
  
  @scala.inline
  def extra(value: ReactElement): this.type = set("extra", value.asInstanceOf[js.Any])
  
  @scala.inline
  def extraContent(value: ReactElement): this.type = set("extraContent", value.asInstanceOf[js.Any])
  
  @scala.inline
  def extraContentReactElement(value: ReactElement): this.type = set("extraContent", value.asInstanceOf[js.Any])
  
  @scala.inline
  def extraReactElement(value: ReactElement): this.type = set("extra", value.asInstanceOf[js.Any])
  
  @scala.inline
  def fixHeader(value: Boolean): this.type = set("fixHeader", value.asInstanceOf[js.Any])
  
  @scala.inline
  def fixedHeader(value: Boolean): this.type = set("fixedHeader", value.asInstanceOf[js.Any])
  
  @scala.inline
  def footer(value: js.Array[ReactElement]): this.type = set("footer", value.asInstanceOf[js.Any])
  
  @scala.inline
  def footerVarargs(value: ReactElement*): this.type = set("footer", js.Array(value :_*))
  
  @scala.inline
  def ghost(value: Boolean): this.type = set("ghost", value.asInstanceOf[js.Any])
  
  @scala.inline
  def header(value: PageHeaderPropschildrenRe): this.type = set("header", value.asInstanceOf[js.Any])
  
  @scala.inline
  def loading(value: Boolean): this.type = set("loading", value.asInstanceOf[js.Any])
  
  @scala.inline
  def onBack(value: /* e */ SyntheticMouseEvent[HTMLDivElement] => Unit): this.type = set("onBack", js.Any.fromFunction1(value))
  
  @scala.inline
  def onTabChange(value: /* activeKey */ String => Unit): this.type = set("onTabChange", js.Any.fromFunction1(value))
  
  @scala.inline
  def pageHeaderRender(value: WithFalse[js.Function1[PageContainerProps, ReactElement]]): this.type = set("pageHeaderRender", value.asInstanceOf[js.Any])
  
  @scala.inline
  def pageHeaderRenderFunction1(value: PageContainerProps => ReactElement): this.type = set("pageHeaderRender", js.Any.fromFunction1(value))
  
  @scala.inline
  def prefixCls(value: String): this.type = set("prefixCls", value.asInstanceOf[js.Any])
  
  @scala.inline
  def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
  
  @scala.inline
  def subTitle(value: ReactElement): this.type = set("subTitle", value.asInstanceOf[js.Any])
  
  @scala.inline
  def subTitleReactElement(value: ReactElement): this.type = set("subTitle", value.asInstanceOf[js.Any])
  
  @scala.inline
  def tabActiveKey(value: String): this.type = set("tabActiveKey", value.asInstanceOf[js.Any])
  
  @scala.inline
  def tabBarExtraContent(value: TabBarExtraContent): this.type = set("tabBarExtraContent", value.asInstanceOf[js.Any])
  
  @scala.inline
  def tabBarExtraContentReactElement(value: ReactElement): this.type = set("tabBarExtraContent", value.asInstanceOf[js.Any])
  
  @scala.inline
  def tabList(value: js.Array[TabPanePropskeyReactTextu]): this.type = set("tabList", value.asInstanceOf[js.Any])
  
  @scala.inline
  def tabListVarargs(value: TabPanePropskeyReactTextu*): this.type = set("tabList", js.Array(value :_*))
  
  @scala.inline
  def tabProps(value: TabsProps): this.type = set("tabProps", value.asInstanceOf[js.Any])
  
  @scala.inline
  def tags(value: ReactElement | js.Array[ReactElement]): this.type = set("tags", value.asInstanceOf[js.Any])
  
  @scala.inline
  def tagsReactElement(value: ReactElement): this.type = set("tags", value.asInstanceOf[js.Any])
  
  @scala.inline
  def tagsVarargs(value: ReactElement*): this.type = set("tags", js.Array(value :_*))
  
  @scala.inline
  def title(value: ReactElement | `false`): this.type = set("title", value.asInstanceOf[js.Any])
  
  @scala.inline
  def titleReactElement(value: ReactElement): this.type = set("title", value.asInstanceOf[js.Any])
}
