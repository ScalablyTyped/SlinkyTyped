package typingsSlinky.antdMobile.components

import org.scalajs.dom.raw.HTMLDivElement
import slinky.web.SyntheticMouseEvent
import slinky.web.html.div.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.antdMobile.antdMobileStrings.`column-reverse`
import typingsSlinky.antdMobile.antdMobileStrings.`row-reverse`
import typingsSlinky.antdMobile.antdMobileStrings.`wrap-reverse`
import typingsSlinky.antdMobile.antdMobileStrings.around
import typingsSlinky.antdMobile.antdMobileStrings.baseline
import typingsSlinky.antdMobile.antdMobileStrings.between
import typingsSlinky.antdMobile.antdMobileStrings.center
import typingsSlinky.antdMobile.antdMobileStrings.column
import typingsSlinky.antdMobile.antdMobileStrings.end
import typingsSlinky.antdMobile.antdMobileStrings.nowrap
import typingsSlinky.antdMobile.antdMobileStrings.row
import typingsSlinky.antdMobile.antdMobileStrings.start
import typingsSlinky.antdMobile.antdMobileStrings.stretch
import typingsSlinky.antdMobile.flexFlexMod.FlexProps
import typingsSlinky.react.mod.CSSProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Flex {
  
  @JSImport("antd-mobile", "Flex")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.antdMobile.mod.Flex] {
    
    @scala.inline
    def align(value: start | center | end | baseline | stretch): this.type = set("align", value.asInstanceOf[js.Any])
    
    @scala.inline
    def alignContent(value: start | end | center | between | around | stretch): this.type = set("alignContent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def direction(value: row | `row-reverse` | column | `column-reverse`): this.type = set("direction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def disabled(value: Boolean): this.type = set("disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def justify(value: start | end | center | between | around): this.type = set("justify", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onClick(value: /* e */ SyntheticMouseEvent[HTMLDivElement] => Unit): this.type = set("onClick", js.Any.fromFunction1(value))
    
    @scala.inline
    def prefixCls(value: String): this.type = set("prefixCls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def role(value: String): this.type = set("role", value.asInstanceOf[js.Any])
    
    @scala.inline
    def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def wrap(value: nowrap | typingsSlinky.antdMobile.antdMobileStrings.wrap | `wrap-reverse`): this.type = set("wrap", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: Flex.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: FlexProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
