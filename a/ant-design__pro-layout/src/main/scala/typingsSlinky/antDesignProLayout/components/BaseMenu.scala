package typingsSlinky.antDesignProLayout.components

import slinky.core.TagMod
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.antDesignProLayout.MenuDataItemisUrlboolean
import typingsSlinky.antDesignProLayout.baseMenuMod.BaseMenuProps
import typingsSlinky.antDesignProLayout.typingsMod.MenuDataItem
import typingsSlinky.antDesignProLayout.typingsMod.MessageDescriptor
import typingsSlinky.antDesignProLayout.typingsMod.WithFalse
import typingsSlinky.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object BaseMenu {
  @JSImport("@ant-design/pro-layout/lib/SiderMenu/BaseMenu", JSImport.Default)
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, js.Object] {
    @scala.inline
    def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def collapsed(value: Boolean): this.type = set("collapsed", value.asInstanceOf[js.Any])
    @scala.inline
    def formatMessage(value: /* message */ MessageDescriptor => String): this.type = set("formatMessage", js.Any.fromFunction1(value))
    @scala.inline
    def handleOpenChange(value: /* openKeys */ js.Array[String] => Unit): this.type = set("handleOpenChange", js.Any.fromFunction1(value))
    @scala.inline
    def isMobile(value: Boolean): this.type = set("isMobile", value.asInstanceOf[js.Any])
    @scala.inline
    def menuData(value: js.Array[MenuDataItem]): this.type = set("menuData", value.asInstanceOf[js.Any])
    @scala.inline
    def menuItemRenderFunction2(value: (/* item */ MenuDataItemisUrlboolean, /* defaultDom */ TagMod[Any]) => TagMod[Any]): this.type = set("menuItemRender", js.Any.fromFunction2(value))
    @scala.inline
    def menuItemRender(
      value: WithFalse[
          js.Function2[/* item */ MenuDataItemisUrlboolean, /* defaultDom */ TagMod[Any], TagMod[Any]]
        ]
    ): this.type = set("menuItemRender", value.asInstanceOf[js.Any])
    @scala.inline
    def menuProps(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify MenuProps */ js.Any
    ): this.type = set("menuProps", value.asInstanceOf[js.Any])
    @scala.inline
    def mode(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify MenuMode */ js.Any
    ): this.type = set("mode", value.asInstanceOf[js.Any])
    @scala.inline
    def onCollapse(value: /* collapsed */ Boolean => Unit): this.type = set("onCollapse", js.Any.fromFunction1(value))
    @scala.inline
    def openKeys(value: WithFalse[js.Array[String]]): this.type = set("openKeys", value.asInstanceOf[js.Any])
    @scala.inline
    def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
    @scala.inline
    def subMenuItemRenderFunction2(value: (/* item */ MenuDataItemisUrlboolean, /* defaultDom */ TagMod[Any]) => TagMod[Any]): this.type = set("subMenuItemRender", js.Any.fromFunction2(value))
    @scala.inline
    def subMenuItemRender(
      value: WithFalse[
          js.Function2[/* item */ MenuDataItemisUrlboolean, /* defaultDom */ TagMod[Any], TagMod[Any]]
        ]
    ): this.type = set("subMenuItemRender", value.asInstanceOf[js.Any])
    @scala.inline
    def theme(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify MenuTheme */ js.Any
    ): this.type = set("theme", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: BaseMenuProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: BaseMenu.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}

