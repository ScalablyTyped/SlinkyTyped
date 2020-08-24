package typingsSlinky.antDesignPro.components

import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.antDesignPro.anon.Key
import typingsSlinky.antDesignPro.anon.Title
import typingsSlinky.history.mod.Location
import typingsSlinky.history.mod.LocationState
import typingsSlinky.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@scala.inline
class SharedBuilder_PageHeaderProps65645423[R <: js.Object] (val args: js.Array[js.Any])
  extends AnyVal
     with StBuildingComponent[tag.type, R] {
  @scala.inline
  def actionReactElement(value: ReactElement): this.type = set("action", value.asInstanceOf[js.Any])
  @scala.inline
  def action(value: ReactElement | String): this.type = set("action", value.asInstanceOf[js.Any])
  @scala.inline
  def breadcrumbListVarargs(value: Title*): this.type = set("breadcrumbList", js.Array(value :_*))
  @scala.inline
  def breadcrumbList(value: js.Array[Title]): this.type = set("breadcrumbList", value.asInstanceOf[js.Any])
  @scala.inline
  def breadcrumbNameMap(value: js.Any): this.type = set("breadcrumbNameMap", value.asInstanceOf[js.Any])
  @scala.inline
  def breadcrumbSeparatorReactElement(value: ReactElement): this.type = set("breadcrumbSeparator", value.asInstanceOf[js.Any])
  @scala.inline
  def breadcrumbSeparator(value: ReactElement): this.type = set("breadcrumbSeparator", value.asInstanceOf[js.Any])
  @scala.inline
  def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
  @scala.inline
  def contentReactElement(value: ReactElement): this.type = set("content", value.asInstanceOf[js.Any])
  @scala.inline
  def content(value: ReactElement): this.type = set("content", value.asInstanceOf[js.Any])
  @scala.inline
  def extraContentReactElement(value: ReactElement): this.type = set("extraContent", value.asInstanceOf[js.Any])
  @scala.inline
  def extraContent(value: ReactElement): this.type = set("extraContent", value.asInstanceOf[js.Any])
  @scala.inline
  def hiddenBreadcrumb(value: Boolean): this.type = set("hiddenBreadcrumb", value.asInstanceOf[js.Any])
  @scala.inline
  def homeReactElement(value: ReactElement): this.type = set("home", value.asInstanceOf[js.Any])
  @scala.inline
  def home(value: ReactElement): this.type = set("home", value.asInstanceOf[js.Any])
  @scala.inline
  def linkElementReactElement(value: ReactElement): this.type = set("linkElement", value.asInstanceOf[js.Any])
  @scala.inline
  def linkElement(value: ReactElement | String): this.type = set("linkElement", value.asInstanceOf[js.Any])
  @scala.inline
  def loading(value: Boolean): this.type = set("loading", value.asInstanceOf[js.Any])
  @scala.inline
  def location(value: Location[LocationState]): this.type = set("location", value.asInstanceOf[js.Any])
  @scala.inline
  def logoReactElement(value: ReactElement): this.type = set("logo", value.asInstanceOf[js.Any])
  @scala.inline
  def logo(value: ReactElement | String): this.type = set("logo", value.asInstanceOf[js.Any])
  @scala.inline
  def onTabChange(value: /* key */ String => Unit): this.type = set("onTabChange", js.Any.fromFunction1(value))
  @scala.inline
  def params(value: js.Any): this.type = set("params", value.asInstanceOf[js.Any])
  @scala.inline
  def routesVarargs(value: js.Any*): this.type = set("routes", js.Array(value :_*))
  @scala.inline
  def routes(value: js.Array[_]): this.type = set("routes", value.asInstanceOf[js.Any])
  @scala.inline
  def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
  @scala.inline
  def tabActiveKey(value: String): this.type = set("tabActiveKey", value.asInstanceOf[js.Any])
  @scala.inline
  def tabBarExtraContentReactElement(value: ReactElement): this.type = set("tabBarExtraContent", value.asInstanceOf[js.Any])
  @scala.inline
  def tabBarExtraContent(value: ReactElement): this.type = set("tabBarExtraContent", value.asInstanceOf[js.Any])
  @scala.inline
  def tabDefaultActiveKey(value: String): this.type = set("tabDefaultActiveKey", value.asInstanceOf[js.Any])
  @scala.inline
  def tabListVarargs(value: Key*): this.type = set("tabList", js.Array(value :_*))
  @scala.inline
  def tabList(value: js.Array[Key]): this.type = set("tabList", value.asInstanceOf[js.Any])
  @scala.inline
  def titleReactElement(value: ReactElement): this.type = set("title", value.asInstanceOf[js.Any])
  @scala.inline
  def title(value: ReactElement | String | Double): this.type = set("title", value.asInstanceOf[js.Any])
  @scala.inline
  def wide(value: Boolean): this.type = set("wide", value.asInstanceOf[js.Any])
}

