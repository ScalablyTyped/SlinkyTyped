package typingsSlinky.antDesignProLayout.components

import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.antDesignProLayout.anon.FooterToolbarPropsRouteCo
import typingsSlinky.antDesignProLayout.footerToolbarMod.FooterToolbarProps
import typingsSlinky.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object FooterToolbar {
  
  @JSImport("@ant-design/pro-layout", "FooterToolbar")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, js.Object] {
    
    @scala.inline
    def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def extraReactElement(value: ReactElement): this.type = set("extra", value.asInstanceOf[js.Any])
    
    @scala.inline
    def extra(value: ReactElement): this.type = set("extra", value.asInstanceOf[js.Any])
    
    @scala.inline
    def prefixCls(value: String): this.type = set("prefixCls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def renderContent(value: (/* props */ FooterToolbarPropsRouteCo, ReactElement) => ReactElement): this.type = set("renderContent", js.Any.fromFunction2(value))
    
    @scala.inline
    def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: FooterToolbarProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  
  implicit def make(companion: FooterToolbar.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}
