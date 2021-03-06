package typingsSlinky.rcSlider.components

import org.scalajs.dom.raw.Element
import slinky.web.SyntheticMouseEvent
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.react.mod.CSSProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@scala.inline
class SharedBuilder_HandleProps_773947409[R <: js.Object] (val args: js.Array[js.Any])
  extends AnyVal
     with StBuildingComponent[tag.type, R] {
  
  @scala.inline
  def ariaLabel(value: String): this.type = set("ariaLabel", value.asInstanceOf[js.Any])
  
  @scala.inline
  def ariaLabelledBy(value: String): this.type = set("ariaLabelledBy", value.asInstanceOf[js.Any])
  
  @scala.inline
  def ariaValueTextFormatter(value: /* val */ Double => String): this.type = set("ariaValueTextFormatter", js.Any.fromFunction1(value))
  
  @scala.inline
  def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
  
  @scala.inline
  def disabled(value: Boolean): this.type = set("disabled", value.asInstanceOf[js.Any])
  
  @scala.inline
  def max(value: Double): this.type = set("max", value.asInstanceOf[js.Any])
  
  @scala.inline
  def min(value: Double): this.type = set("min", value.asInstanceOf[js.Any])
  
  @scala.inline
  def offset(value: Double): this.type = set("offset", value.asInstanceOf[js.Any])
  
  @scala.inline
  def onMouseEnter(value: SyntheticMouseEvent[Element] => Unit): this.type = set("onMouseEnter", js.Any.fromFunction1(value))
  
  @scala.inline
  def onMouseLeave(value: SyntheticMouseEvent[Element] => Unit): this.type = set("onMouseLeave", js.Any.fromFunction1(value))
  
  @scala.inline
  def prefixCls(value: String): this.type = set("prefixCls", value.asInstanceOf[js.Any])
  
  @scala.inline
  def reverse(value: Boolean): this.type = set("reverse", value.asInstanceOf[js.Any])
  
  @scala.inline
  def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
  
  @scala.inline
  def tabIndex(value: Double): this.type = set("tabIndex", value.asInstanceOf[js.Any])
  
  @scala.inline
  def value(value: Double): this.type = set("value", value.asInstanceOf[js.Any])
  
  @scala.inline
  def vertical(value: Boolean): this.type = set("vertical", value.asInstanceOf[js.Any])
}
