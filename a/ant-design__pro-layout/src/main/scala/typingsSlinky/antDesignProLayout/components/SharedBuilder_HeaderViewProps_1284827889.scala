package typingsSlinky.antDesignProLayout.components

import slinky.core.TagMod
import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.antDesignProLayout.anon.DefaultOpenAll
import typingsSlinky.antDesignProLayout.antDesignProLayoutStrings.realDark
import typingsSlinky.antDesignProLayout.antDesignProLayoutStrings.sidemenu
import typingsSlinky.antDesignProLayout.antDesignProLayoutStrings.topmenu
import typingsSlinky.antDesignProLayout.defaultSettingsMod.ContentWidth
import typingsSlinky.antDesignProLayout.headerMod.HeaderViewProps
import typingsSlinky.antDesignProLayout.typingsMod.WithFalse
import typingsSlinky.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@scala.inline
class SharedBuilder_HeaderViewProps_1284827889[R <: js.Object] (val args: js.Array[js.Any])
  extends AnyVal
     with StBuildingComponent[tag.type, R] {
  @scala.inline
  def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
  @scala.inline
  def collapsed(value: Boolean): this.type = set("collapsed", value.asInstanceOf[js.Any])
  @scala.inline
  def collapsedButtonRenderFunction1(value: /* collapsed */ js.UndefOr[Boolean] => TagMod[Any]): this.type = set("collapsedButtonRender", js.Any.fromFunction1(value))
  @scala.inline
  def collapsedButtonRender(value: WithFalse[js.Function1[/* collapsed */ js.UndefOr[Boolean], TagMod[Any]]]): this.type = set("collapsedButtonRender", value.asInstanceOf[js.Any])
  @scala.inline
  def colorWeak(value: Boolean): this.type = set("colorWeak", value.asInstanceOf[js.Any])
  @scala.inline
  def contentWidth(value: ContentWidth): this.type = set("contentWidth", value.asInstanceOf[js.Any])
  @scala.inline
  def fixSiderbar(value: Boolean): this.type = set("fixSiderbar", value.asInstanceOf[js.Any])
  @scala.inline
  def fixedHeader(value: Boolean): this.type = set("fixedHeader", value.asInstanceOf[js.Any])
  @scala.inline
  def hasSiderMenu(value: Boolean): this.type = set("hasSiderMenu", value.asInstanceOf[js.Any])
  @scala.inline
  def headerRenderFunction2(value: (/* props */ HeaderViewProps, /* defaultDom */ TagMod[Any]) => TagMod[Any]): this.type = set("headerRender", js.Any.fromFunction2(value))
  @scala.inline
  def headerRender(
    value: WithFalse[
      js.Function2[/* props */ HeaderViewProps, /* defaultDom */ TagMod[Any], TagMod[Any]]
    ]
  ): this.type = set("headerRender", value.asInstanceOf[js.Any])
  @scala.inline
  def iconfontUrl(value: String): this.type = set("iconfontUrl", value.asInstanceOf[js.Any])
  @scala.inline
  def isMobile(value: Boolean): this.type = set("isMobile", value.asInstanceOf[js.Any])
  @scala.inline
  def layout(value: sidemenu | topmenu): this.type = set("layout", value.asInstanceOf[js.Any])
  @scala.inline
  def logoReactElement(value: ReactElement): this.type = set("logo", value.asInstanceOf[js.Any])
  @scala.inline
  def logo(value: TagMod[Any]): this.type = set("logo", value.asInstanceOf[js.Any])
  @scala.inline
  def menu(value: DefaultOpenAll): this.type = set("menu", value.asInstanceOf[js.Any])
  @scala.inline
  def menuHeaderRenderFunction3(
    value: (/* logo */ TagMod[Any], /* title */ TagMod[Any], /* props */ js.UndefOr[HeaderViewProps]) => TagMod[Any]
  ): this.type = set("menuHeaderRender", js.Any.fromFunction3(value))
  @scala.inline
  def menuHeaderRender(
    value: WithFalse[
      js.Function3[
        /* logo */ TagMod[Any], 
        /* title */ TagMod[Any], 
        /* props */ js.UndefOr[HeaderViewProps], 
        TagMod[Any]
      ]
    ]
  ): this.type = set("menuHeaderRender", value.asInstanceOf[js.Any])
  @scala.inline
  def menuRenderFunction2(value: (/* props */ HeaderViewProps, /* defaultDom */ TagMod[Any]) => TagMod[Any]): this.type = set("menuRender", js.Any.fromFunction2(value))
  @scala.inline
  def menuRender(
    value: WithFalse[
      js.Function2[/* props */ HeaderViewProps, /* defaultDom */ TagMod[Any], TagMod[Any]]
    ]
  ): this.type = set("menuRender", value.asInstanceOf[js.Any])
  @scala.inline
  def navTheme(
    value: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify MenuTheme */ js.Any) | realDark
  ): this.type = set("navTheme", value.asInstanceOf[js.Any])
  @scala.inline
  def onCollapse(value: /* collapsed */ Boolean => Unit): this.type = set("onCollapse", js.Any.fromFunction1(value))
  @scala.inline
  def primaryColor(value: String): this.type = set("primaryColor", value.asInstanceOf[js.Any])
  @scala.inline
  def rightContentRenderFunction1(value: HeaderViewProps => TagMod[Any]): this.type = set("rightContentRender", js.Any.fromFunction1(value))
  @scala.inline
  def rightContentRender(value: WithFalse[js.Function1[HeaderViewProps, TagMod[Any]]]): this.type = set("rightContentRender", value.asInstanceOf[js.Any])
  @scala.inline
  def siderWidth(value: Double): this.type = set("siderWidth", value.asInstanceOf[js.Any])
  @scala.inline
  def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
  @scala.inline
  def title(value: String): this.type = set("title", value.asInstanceOf[js.Any])
}

