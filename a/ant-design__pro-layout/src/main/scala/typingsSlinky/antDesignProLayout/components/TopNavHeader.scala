package typingsSlinky.antDesignProLayout.components

import org.scalajs.dom.raw.HTMLDivElement
import slinky.core.TagMod
import slinky.core.facade.ReactElement
import slinky.web.SyntheticMouseEvent
import slinky.web.html.div.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.antDesignProLayout.antDesignProLayoutBooleans.`false`
import typingsSlinky.antDesignProLayout.topNavHeaderMod.TopNavHeaderProps
import typingsSlinky.antDesignProLayout.typingsMod.WithFalse
import typingsSlinky.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object TopNavHeader {
  @JSImport("@ant-design/pro-layout/lib/TopNavHeader", JSImport.Default)
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, js.Object] {
    @scala.inline
    def breakpoint(
      value: (/* import warning: importer.ImportType#apply Failed type conversion: / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SiderProps * / any['breakpoint'] */ js.Any) | `false`
    ): this.type = set("breakpoint", value.asInstanceOf[js.Any])
    @scala.inline
    def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def hide(value: Boolean): this.type = set("hide", value.asInstanceOf[js.Any])
    @scala.inline
    def links(value: js.Array[TagMod[Any]]): this.type = set("links", value.asInstanceOf[js.Any])
    @scala.inline
    def logoReactElement(value: ReactElement): this.type = set("logo", value.asInstanceOf[js.Any])
    @scala.inline
    def logo(value: TagMod[Any]): this.type = set("logo", value.asInstanceOf[js.Any])
    @scala.inline
    def menuHeaderRenderFunction3(
      value: (/* logo */ TagMod[Any], /* title */ TagMod[Any], /* props */ js.UndefOr[TopNavHeaderProps]) => TagMod[Any]
    ): this.type = set("menuHeaderRender", js.Any.fromFunction3(value))
    @scala.inline
    def menuHeaderRender(
      value: WithFalse[
          js.Function3[
            /* logo */ TagMod[Any], 
            /* title */ TagMod[Any], 
            /* props */ js.UndefOr[TopNavHeaderProps], 
            TagMod[Any]
          ]
        ]
    ): this.type = set("menuHeaderRender", value.asInstanceOf[js.Any])
    @scala.inline
    def onCollapse(value: /* collapse */ Boolean => Unit): this.type = set("onCollapse", js.Any.fromFunction1(value))
    @scala.inline
    def onMenuHeaderClick(value: /* e */ SyntheticMouseEvent[HTMLDivElement] => Unit): this.type = set("onMenuHeaderClick", js.Any.fromFunction1(value))
    @scala.inline
    def onOpenChange(value: /* openKeys */ WithFalse[js.Array[String]] => Unit): this.type = set("onOpenChange", js.Any.fromFunction1(value))
    @scala.inline
    def rightContentRenderFunction1(value: TopNavHeaderProps => TagMod[Any]): this.type = set("rightContentRender", js.Any.fromFunction1(value))
    @scala.inline
    def rightContentRender(value: WithFalse[js.Function1[TopNavHeaderProps, TagMod[Any]]]): this.type = set("rightContentRender", value.asInstanceOf[js.Any])
    @scala.inline
    def siderMenuStyle(value: CSSProperties): this.type = set("siderMenuStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def siderWidth(value: Double): this.type = set("siderWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: TopNavHeaderProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: TopNavHeader.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}

