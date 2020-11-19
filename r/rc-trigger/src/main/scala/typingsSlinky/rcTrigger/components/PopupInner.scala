package typingsSlinky.rcTrigger.components

import org.scalajs.dom.raw.HTMLDivElement
import slinky.web.SyntheticMouseEvent
import slinky.web.SyntheticTouchEvent
import slinky.web.html.div.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.rcTrigger.popupInnerMod.PopupInnerProps
import typingsSlinky.react.mod.CSSProperties
import typingsSlinky.react.mod.RefAttributes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object PopupInner {
  
  @JSImport("rc-trigger/es/PopupInner", JSImport.Default)
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, HTMLDivElement] {
    
    @scala.inline
    def hiddenClassName(value: String): this.type = set("hiddenClassName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onMouseDown(value: SyntheticMouseEvent[HTMLDivElement] => Unit): this.type = set("onMouseDown", js.Any.fromFunction1(value))
    
    @scala.inline
    def onMouseEnter(value: SyntheticMouseEvent[HTMLDivElement] => Unit): this.type = set("onMouseEnter", js.Any.fromFunction1(value))
    
    @scala.inline
    def onMouseLeave(value: SyntheticMouseEvent[HTMLDivElement] => Unit): this.type = set("onMouseLeave", js.Any.fromFunction1(value))
    
    @scala.inline
    def onTouchStart(value: SyntheticTouchEvent[HTMLDivElement] => Unit): this.type = set("onTouchStart", js.Any.fromFunction1(value))
    
    @scala.inline
    def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def visible(value: Boolean): this.type = set("visible", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: PopupInnerProps with RefAttributes[HTMLDivElement]): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  
  @scala.inline
  def apply(className: String, prefixCls: String): Builder = {
    val __props = js.Dynamic.literal(className = className.asInstanceOf[js.Any], prefixCls = prefixCls.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[PopupInnerProps with RefAttributes[HTMLDivElement]]))
  }
}
