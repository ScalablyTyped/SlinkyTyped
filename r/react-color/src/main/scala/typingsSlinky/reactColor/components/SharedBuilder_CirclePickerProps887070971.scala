package typingsSlinky.reactColor.components

import org.scalajs.dom.raw.HTMLInputElement
import org.scalajs.dom.raw.MouseEvent
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.react.mod.ChangeEvent
import typingsSlinky.reactColor.anon.PartialClassesCirclePicke
import typingsSlinky.reactColor.mod.Color
import typingsSlinky.reactColor.mod.ColorResult
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@scala.inline
class SharedBuilder_CirclePickerProps887070971[R <: js.Object] (val args: js.Array[js.Any])
  extends AnyVal
     with StBuildingComponent[tag.type, R] {
  
  @scala.inline
  def circleSize(value: Double): this.type = set("circleSize", value.asInstanceOf[js.Any])
  
  @scala.inline
  def circleSpacing(value: Double): this.type = set("circleSpacing", value.asInstanceOf[js.Any])
  
  @scala.inline
  def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
  
  @scala.inline
  def color(value: Color): this.type = set("color", value.asInstanceOf[js.Any])
  
  @scala.inline
  def colorsVarargs(value: String*): this.type = set("colors", js.Array(value :_*))
  
  @scala.inline
  def colors(value: js.Array[String]): this.type = set("colors", value.asInstanceOf[js.Any])
  
  @scala.inline
  def onChange(value: (/* color */ ColorResult, /* event */ ChangeEvent[HTMLInputElement]) => Unit): this.type = set("onChange", js.Any.fromFunction2(value))
  
  @scala.inline
  def onChangeComplete(value: (/* color */ ColorResult, /* event */ ChangeEvent[HTMLInputElement]) => Unit): this.type = set("onChangeComplete", js.Any.fromFunction2(value))
  
  @scala.inline
  def onSwatchHover(value: (/* color */ ColorResult, /* event */ MouseEvent) => Unit): this.type = set("onSwatchHover", js.Any.fromFunction2(value))
  
  @scala.inline
  def styles(value: PartialClassesCirclePicke): this.type = set("styles", value.asInstanceOf[js.Any])
  
  @scala.inline
  def width(value: String): this.type = set("width", value.asInstanceOf[js.Any])
}
