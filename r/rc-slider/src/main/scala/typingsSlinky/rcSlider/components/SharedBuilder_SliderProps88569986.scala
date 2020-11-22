package typingsSlinky.rcSlider.components

import org.scalajs.dom.raw.HTMLDivElement
import slinky.core.facade.ReactElement
import slinky.web.SyntheticFocusEvent
import slinky.web.html.div.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.rcSlider.anon.AriaLabel
import typingsSlinky.rcSlider.anon.Label
import typingsSlinky.react.mod.CSSProperties
import typingsSlinky.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@scala.inline
class SharedBuilder_SliderProps88569986[R <: js.Object] (val args: js.Array[js.Any])
  extends AnyVal
     with StBuildingComponent[tag.type, R] {
  
  @scala.inline
  def activeDotStyle(value: CSSProperties): this.type = set("activeDotStyle", value.asInstanceOf[js.Any])
  
  @scala.inline
  def ariaLabelForHandle(value: String): this.type = set("ariaLabelForHandle", value.asInstanceOf[js.Any])
  
  @scala.inline
  def ariaLabelledByForHandle(value: String): this.type = set("ariaLabelledByForHandle", value.asInstanceOf[js.Any])
  
  @scala.inline
  def ariaValueTextFormatterForHandle(value: String): this.type = set("ariaValueTextFormatterForHandle", value.asInstanceOf[js.Any])
  
  @scala.inline
  def autoFocus(value: Boolean): this.type = set("autoFocus", value.asInstanceOf[js.Any])
  
  @scala.inline
  def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
  
  @scala.inline
  def defaultValue(value: Double): this.type = set("defaultValue", value.asInstanceOf[js.Any])
  
  @scala.inline
  def disabled(value: Boolean): this.type = set("disabled", value.asInstanceOf[js.Any])
  
  @scala.inline
  def dotStyle(value: CSSProperties): this.type = set("dotStyle", value.asInstanceOf[js.Any])
  
  @scala.inline
  def dots(value: Boolean): this.type = set("dots", value.asInstanceOf[js.Any])
  
  @scala.inline
  def handle(value: /* props */ AriaLabel => ReactElement): this.type = set("handle", js.Any.fromFunction1(value))
  
  @scala.inline
  def handleStyle(value: CSSProperties): this.type = set("handleStyle", value.asInstanceOf[js.Any])
  
  @scala.inline
  def included(value: Boolean): this.type = set("included", value.asInstanceOf[js.Any])
  
  @scala.inline
  def marks(value: Record[Double, ReactElement | Label]): this.type = set("marks", value.asInstanceOf[js.Any])
  
  @scala.inline
  def max(value: Double): this.type = set("max", value.asInstanceOf[js.Any])
  
  @scala.inline
  def maximumTrackStyle(value: CSSProperties): this.type = set("maximumTrackStyle", value.asInstanceOf[js.Any])
  
  @scala.inline
  def min(value: Double): this.type = set("min", value.asInstanceOf[js.Any])
  
  @scala.inline
  def minimumTrackStyle(value: CSSProperties): this.type = set("minimumTrackStyle", value.asInstanceOf[js.Any])
  
  @scala.inline
  def onAfterChange(value: /* value */ Double => Unit): this.type = set("onAfterChange", js.Any.fromFunction1(value))
  
  @scala.inline
  def onBeforeChange(value: /* value */ Double => Unit): this.type = set("onBeforeChange", js.Any.fromFunction1(value))
  
  @scala.inline
  def onBlur(value: /* e */ SyntheticFocusEvent[HTMLDivElement] => Unit): this.type = set("onBlur", js.Any.fromFunction1(value))
  
  @scala.inline
  def onChange(value: /* value */ Double => Unit): this.type = set("onChange", js.Any.fromFunction1(value))
  
  @scala.inline
  def onFocus(value: /* e */ SyntheticFocusEvent[HTMLDivElement] => Unit): this.type = set("onFocus", js.Any.fromFunction1(value))
  
  @scala.inline
  def prefixCls(value: String): this.type = set("prefixCls", value.asInstanceOf[js.Any])
  
  @scala.inline
  def railStyle(value: CSSProperties): this.type = set("railStyle", value.asInstanceOf[js.Any])
  
  @scala.inline
  def reverse(value: Boolean): this.type = set("reverse", value.asInstanceOf[js.Any])
  
  @scala.inline
  def startPoint(value: Double): this.type = set("startPoint", value.asInstanceOf[js.Any])
  
  @scala.inline
  def step(value: Double): this.type = set("step", value.asInstanceOf[js.Any])
  
  @scala.inline
  def stepNull: this.type = set("step", null)
  
  @scala.inline
  def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
  
  @scala.inline
  def tabIndex(value: Double): this.type = set("tabIndex", value.asInstanceOf[js.Any])
  
  @scala.inline
  def trackStyle(value: CSSProperties): this.type = set("trackStyle", value.asInstanceOf[js.Any])
  
  @scala.inline
  def value(value: Double): this.type = set("value", value.asInstanceOf[js.Any])
  
  @scala.inline
  def vertical(value: Boolean): this.type = set("vertical", value.asInstanceOf[js.Any])
}
