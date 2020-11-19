package typingsSlinky.antdMobile.components

import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.antdMobile.listMod.ListProps
import typingsSlinky.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object List {
  
  @JSImport("antd-mobile", "List")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.antdMobile.mod.List] {
    
    @scala.inline
    def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def prefixCls(value: String): this.type = set("prefixCls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def renderFooterReactElement(value: ReactElement): this.type = set("renderFooter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def renderFooterFunction0(value: () => ReactElement): this.type = set("renderFooter", js.Any.fromFunction0(value))
    
    @scala.inline
    def renderFooter(value: js.Function0[ReactElement] | ReactElement): this.type = set("renderFooter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def renderHeaderReactElement(value: ReactElement): this.type = set("renderHeader", value.asInstanceOf[js.Any])
    
    @scala.inline
    def renderHeaderFunction0(value: () => ReactElement): this.type = set("renderHeader", js.Any.fromFunction0(value))
    
    @scala.inline
    def renderHeader(value: js.Function0[ReactElement] | ReactElement): this.type = set("renderHeader", value.asInstanceOf[js.Any])
    
    @scala.inline
    def role(value: String): this.type = set("role", value.asInstanceOf[js.Any])
    
    @scala.inline
    def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: ListProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  
  implicit def make(companion: List.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}
