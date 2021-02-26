package typingsSlinky.reactScrollbar.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.react.mod.CSSProperties
import typingsSlinky.reactScrollbar.anon.ContainerHeight
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@scala.inline
class SharedBuilder_ScrollAreaProps_622662951[R <: js.Object] (val args: js.Array[js.Any])
  extends AnyVal
     with StBuildingComponent[tag.type, R] {
  
  @scala.inline
  def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
  
  @scala.inline
  def contentClassName(value: String): this.type = set("contentClassName", value.asInstanceOf[js.Any])
  
  @scala.inline
  def contentStyle(value: CSSProperties): this.type = set("contentStyle", value.asInstanceOf[js.Any])
  
  @scala.inline
  def contentWindow(value: js.Any): this.type = set("contentWindow", value.asInstanceOf[js.Any])
  
  @scala.inline
  def focusableTabIndex(value: Double): this.type = set("focusableTabIndex", value.asInstanceOf[js.Any])
  
  @scala.inline
  def horizontal(value: Boolean): this.type = set("horizontal", value.asInstanceOf[js.Any])
  
  @scala.inline
  def horizontalContainerStyle(value: CSSProperties): this.type = set("horizontalContainerStyle", value.asInstanceOf[js.Any])
  
  @scala.inline
  def horizontalScrollbarStyle(value: CSSProperties): this.type = set("horizontalScrollbarStyle", value.asInstanceOf[js.Any])
  
  @scala.inline
  def minScrollSize(value: Double): this.type = set("minScrollSize", value.asInstanceOf[js.Any])
  
  @scala.inline
  def onScroll(value: /* value */ ContainerHeight => Unit): this.type = set("onScroll", js.Any.fromFunction1(value))
  
  @scala.inline
  def ownerDocument(value: js.Any): this.type = set("ownerDocument", value.asInstanceOf[js.Any])
  
  @scala.inline
  def smoothScrolling(value: Boolean): this.type = set("smoothScrolling", value.asInstanceOf[js.Any])
  
  @scala.inline
  def speed(value: Double): this.type = set("speed", value.asInstanceOf[js.Any])
  
  @scala.inline
  def stopScrollPropagation(value: Boolean): this.type = set("stopScrollPropagation", value.asInstanceOf[js.Any])
  
  @scala.inline
  def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
  
  @scala.inline
  def swapWheelAxes(value: Boolean): this.type = set("swapWheelAxes", value.asInstanceOf[js.Any])
  
  @scala.inline
  def vertical(value: Boolean): this.type = set("vertical", value.asInstanceOf[js.Any])
  
  @scala.inline
  def verticalContainerStyle(value: CSSProperties): this.type = set("verticalContainerStyle", value.asInstanceOf[js.Any])
  
  @scala.inline
  def verticalScrollbarStyle(value: CSSProperties): this.type = set("verticalScrollbarStyle", value.asInstanceOf[js.Any])
}
