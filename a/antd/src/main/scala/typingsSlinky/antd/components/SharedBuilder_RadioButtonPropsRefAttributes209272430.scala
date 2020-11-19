package typingsSlinky.antd.components

import org.scalajs.dom.raw.HTMLElement
import slinky.web.SyntheticKeyboardEvent
import slinky.web.SyntheticMouseEvent
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.antd.radioInterfaceMod.RadioChangeEvent
import typingsSlinky.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@scala.inline
class SharedBuilder_RadioButtonPropsRefAttributes209272430[R <: js.Object] (val args: js.Array[js.Any])
  extends AnyVal
     with StBuildingComponent[tag.type, R] {
  
  @scala.inline
  def autoFocus(value: Boolean): this.type = set("autoFocus", value.asInstanceOf[js.Any])
  
  @scala.inline
  def checked(value: Boolean): this.type = set("checked", value.asInstanceOf[js.Any])
  
  @scala.inline
  def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
  
  @scala.inline
  def defaultChecked(value: Boolean): this.type = set("defaultChecked", value.asInstanceOf[js.Any])
  
  @scala.inline
  def disabled(value: Boolean): this.type = set("disabled", value.asInstanceOf[js.Any])
  
  @scala.inline
  def id(value: String): this.type = set("id", value.asInstanceOf[js.Any])
  
  @scala.inline
  def name(value: String): this.type = set("name", value.asInstanceOf[js.Any])
  
  @scala.inline
  def onChange(value: RadioChangeEvent => Unit): this.type = set("onChange", js.Any.fromFunction1(value))
  
  @scala.inline
  def onClick(value: SyntheticMouseEvent[HTMLElement] => Unit): this.type = set("onClick", js.Any.fromFunction1(value))
  
  @scala.inline
  def onKeyDown(value: SyntheticKeyboardEvent[HTMLElement] => Unit): this.type = set("onKeyDown", js.Any.fromFunction1(value))
  
  @scala.inline
  def onKeyPress(value: SyntheticKeyboardEvent[HTMLElement] => Unit): this.type = set("onKeyPress", js.Any.fromFunction1(value))
  
  @scala.inline
  def onMouseEnter(value: SyntheticMouseEvent[HTMLElement] => Unit): this.type = set("onMouseEnter", js.Any.fromFunction1(value))
  
  @scala.inline
  def onMouseLeave(value: SyntheticMouseEvent[HTMLElement] => Unit): this.type = set("onMouseLeave", js.Any.fromFunction1(value))
  
  @scala.inline
  def prefixCls(value: String): this.type = set("prefixCls", value.asInstanceOf[js.Any])
  
  @scala.inline
  def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
  
  @scala.inline
  def tabIndex(value: Double): this.type = set("tabIndex", value.asInstanceOf[js.Any])
  
  @scala.inline
  def `type`(value: String): this.type = set("type", value.asInstanceOf[js.Any])
  
  @scala.inline
  def value(value: js.Any): this.type = set("value", value.asInstanceOf[js.Any])
}
