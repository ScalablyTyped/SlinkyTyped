package typingsSlinky.antdMobile.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.antdMobile.segmentedControlMod.SegmentedControlProps
import typingsSlinky.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object SegmentedControl {
  
  @JSImport("antd-mobile", "SegmentedControl")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.antdMobile.mod.SegmentedControl] {
    
    @scala.inline
    def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def disabled(value: Boolean): this.type = set("disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onChange(value: /* e */ js.Any => Unit): this.type = set("onChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def onValueChange(value: /* value */ String => Unit): this.type = set("onValueChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def prefixCls(value: String): this.type = set("prefixCls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def selectedIndex(value: Double): this.type = set("selectedIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def tintColor(value: String): this.type = set("tintColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def valuesVarargs(value: String*): this.type = set("values", js.Array(value :_*))
    
    @scala.inline
    def values(value: js.Array[String]): this.type = set("values", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: SegmentedControlProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  
  implicit def make(companion: SegmentedControl.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}
