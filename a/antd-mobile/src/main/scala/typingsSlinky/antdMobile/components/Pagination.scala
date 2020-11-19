package typingsSlinky.antdMobile.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.antdMobile.antdMobileStrings.button
import typingsSlinky.antdMobile.antdMobileStrings.number
import typingsSlinky.antdMobile.antdMobileStrings.pointer
import typingsSlinky.antdMobile.paginationMod.PaginationProps
import typingsSlinky.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Pagination {
  
  @JSImport("antd-mobile", "Pagination")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.antdMobile.mod.Pagination] {
    
    @scala.inline
    def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def mode(value: button | number | pointer): this.type = set("mode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def nextText(value: String): this.type = set("nextText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onChange(value: /* current */ Double => Unit): this.type = set("onChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def onNext(value: () => Unit): this.type = set("onNext", js.Any.fromFunction0(value))
    
    @scala.inline
    def onPrev(value: () => Unit): this.type = set("onPrev", js.Any.fromFunction0(value))
    
    @scala.inline
    def prefixCls(value: String): this.type = set("prefixCls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def prevText(value: String): this.type = set("prevText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def simple(value: Boolean): this.type = set("simple", value.asInstanceOf[js.Any])
    
    @scala.inline
    def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: PaginationProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  
  @scala.inline
  def apply(current: Double, total: Double): Builder = {
    val __props = js.Dynamic.literal(current = current.asInstanceOf[js.Any], total = total.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[PaginationProps]))
  }
}
