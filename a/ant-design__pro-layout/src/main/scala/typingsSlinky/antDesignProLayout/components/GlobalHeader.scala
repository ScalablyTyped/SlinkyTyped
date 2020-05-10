package typingsSlinky.antDesignProLayout.components

import slinky.core.TagMod
import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.antDesignProLayout.globalHeaderMod.GlobalHeaderProps
import typingsSlinky.antDesignProLayout.globalHeaderMod.default
import typingsSlinky.antDesignProLayout.typingsMod.WithFalse
import typingsSlinky.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object GlobalHeader {
  @JSImport("@ant-design/pro-layout/lib/GlobalHeader", JSImport.Default)
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, default] {
    @scala.inline
    def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def collapsed(value: Boolean): this.type = set("collapsed", value.asInstanceOf[js.Any])
    @scala.inline
    def collapsedButtonRenderFunction1(value: /* collapsed */ js.UndefOr[Boolean] => TagMod[Any]): this.type = set("collapsedButtonRender", js.Any.fromFunction1(value))
    @scala.inline
    def collapsedButtonRender(value: WithFalse[js.Function1[/* collapsed */ js.UndefOr[Boolean], TagMod[Any]]]): this.type = set("collapsedButtonRender", value.asInstanceOf[js.Any])
    @scala.inline
    def isMobile(value: Boolean): this.type = set("isMobile", value.asInstanceOf[js.Any])
    @scala.inline
    def logoReactElement(value: ReactElement): this.type = set("logo", value.asInstanceOf[js.Any])
    @scala.inline
    def logo(value: TagMod[Any]): this.type = set("logo", value.asInstanceOf[js.Any])
    @scala.inline
    def menuHeaderRenderFunction3(
      value: (/* logo */ TagMod[Any], /* title */ TagMod[Any], /* props */ js.UndefOr[GlobalHeaderProps]) => TagMod[Any]
    ): this.type = set("menuHeaderRender", js.Any.fromFunction3(value))
    @scala.inline
    def menuHeaderRender(
      value: WithFalse[
          js.Function3[
            /* logo */ TagMod[Any], 
            /* title */ TagMod[Any], 
            /* props */ js.UndefOr[GlobalHeaderProps], 
            TagMod[Any]
          ]
        ]
    ): this.type = set("menuHeaderRender", value.asInstanceOf[js.Any])
    @scala.inline
    def menuRender(
      value: /* import warning: importer.ImportType#apply Failed type conversion: @ant-design/pro-layout.@ant-design/pro-layout/lib/BasicLayout.BasicLayoutProps['menuRender'] */ js.Any
    ): this.type = set("menuRender", value.asInstanceOf[js.Any])
    @scala.inline
    def onCollapse(value: /* collapsed */ Boolean => Unit): this.type = set("onCollapse", js.Any.fromFunction1(value))
    @scala.inline
    def rightContentRenderFunction1(value: GlobalHeaderProps => TagMod[Any]): this.type = set("rightContentRender", js.Any.fromFunction1(value))
    @scala.inline
    def rightContentRender(value: WithFalse[js.Function1[GlobalHeaderProps, TagMod[Any]]]): this.type = set("rightContentRender", value.asInstanceOf[js.Any])
    @scala.inline
    def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: GlobalHeaderProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: GlobalHeader.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}

