package typingsSlinky.antDesignProLayout.components

import org.scalajs.dom.raw.HTMLDivElement
import slinky.core.facade.ReactElement
import slinky.web.SyntheticMouseEvent
import slinky.web.html.div.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.antDesignProLayout.antDesignProLayoutBooleans.`false`
import typingsSlinky.antDesignProLayout.antDesignProLayoutStrings.lg
import typingsSlinky.antDesignProLayout.antDesignProLayoutStrings.md
import typingsSlinky.antDesignProLayout.antDesignProLayoutStrings.sm
import typingsSlinky.antDesignProLayout.antDesignProLayoutStrings.xl
import typingsSlinky.antDesignProLayout.antDesignProLayoutStrings.xs
import typingsSlinky.antDesignProLayout.antDesignProLayoutStrings.xxl
import typingsSlinky.antDesignProLayout.siderMenuSiderMenuMod.PrivateSiderMenuProps
import typingsSlinky.antDesignProLayout.siderMenuSiderMenuMod.SiderMenuProps
import typingsSlinky.antDesignProLayout.typingsMod.WithFalse
import typingsSlinky.react.mod.CSSProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object SiderMenu {
  
  @scala.inline
  def apply(matchMenuKeys: js.Array[String]): Builder = {
    val __props = js.Dynamic.literal(matchMenuKeys = matchMenuKeys.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[SiderMenuProps with PrivateSiderMenuProps]))
  }
  
  @JSImport("@ant-design/pro-layout/lib/SiderMenu", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, js.Object] {
    
    @scala.inline
    def breakpoint(value: xs | sm | md | lg | xl | xxl | `false`): this.type = set("breakpoint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def collapsedButtonRender(value: WithFalse[js.Function1[/* collapsed */ js.UndefOr[Boolean], ReactElement]]): this.type = set("collapsedButtonRender", value.asInstanceOf[js.Any])
    
    @scala.inline
    def collapsedButtonRenderFunction1(value: /* collapsed */ js.UndefOr[Boolean] => ReactElement): this.type = set("collapsedButtonRender", js.Any.fromFunction1(value))
    
    @scala.inline
    def getContainer(value: `false`): this.type = set("getContainer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def hide(value: Boolean): this.type = set("hide", value.asInstanceOf[js.Any])
    
    @scala.inline
    def links(value: js.Array[ReactElement]): this.type = set("links", value.asInstanceOf[js.Any])
    
    @scala.inline
    def linksVarargs(value: ReactElement*): this.type = set("links", js.Array(value :_*))
    
    @scala.inline
    def logo(value: ReactElement): this.type = set("logo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def logoReactElement(value: ReactElement): this.type = set("logo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def menuContentRender(value: WithFalse[js.Function2[SiderMenuProps, /* defaultDom */ ReactElement, ReactElement]]): this.type = set("menuContentRender", value.asInstanceOf[js.Any])
    
    @scala.inline
    def menuContentRenderFunction2(value: (SiderMenuProps, /* defaultDom */ ReactElement) => ReactElement): this.type = set("menuContentRender", js.Any.fromFunction2(value))
    
    @scala.inline
    def menuExtraRender(value: WithFalse[js.Function1[SiderMenuProps, ReactElement]]): this.type = set("menuExtraRender", value.asInstanceOf[js.Any])
    
    @scala.inline
    def menuExtraRenderFunction1(value: SiderMenuProps => ReactElement): this.type = set("menuExtraRender", js.Any.fromFunction1(value))
    
    @scala.inline
    def menuFooterRender(value: WithFalse[js.Function1[/* props */ js.UndefOr[SiderMenuProps], ReactElement]]): this.type = set("menuFooterRender", value.asInstanceOf[js.Any])
    
    @scala.inline
    def menuFooterRenderFunction1(value: /* props */ js.UndefOr[SiderMenuProps] => ReactElement): this.type = set("menuFooterRender", js.Any.fromFunction1(value))
    
    @scala.inline
    def menuHeaderRender(
      value: WithFalse[
          js.Function3[
            /* logo */ ReactElement, 
            /* title */ ReactElement, 
            /* props */ js.UndefOr[SiderMenuProps], 
            ReactElement
          ]
        ]
    ): this.type = set("menuHeaderRender", value.asInstanceOf[js.Any])
    
    @scala.inline
    def menuHeaderRenderFunction3(
      value: (/* logo */ ReactElement, /* title */ ReactElement, /* props */ js.UndefOr[SiderMenuProps]) => ReactElement
    ): this.type = set("menuHeaderRender", js.Any.fromFunction3(value))
    
    @scala.inline
    def onMenuHeaderClick(value: /* e */ SyntheticMouseEvent[HTMLDivElement] => Unit): this.type = set("onMenuHeaderClick", js.Any.fromFunction1(value))
    
    @scala.inline
    def onOpenChange(value: /* openKeys */ WithFalse[js.Array[String]] => Unit): this.type = set("onOpenChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def siderWidth(value: Double): this.type = set("siderWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: SiderMenuProps with PrivateSiderMenuProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
