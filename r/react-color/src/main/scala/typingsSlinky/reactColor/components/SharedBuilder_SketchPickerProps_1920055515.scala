package typingsSlinky.reactColor.components

import org.scalajs.dom.raw.MouseEvent
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.reactColor.mod.Color
import typingsSlinky.reactColor.mod.ColorResult
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@scala.inline
class SharedBuilder_SketchPickerProps_1920055515[R <: js.Object] (val args: js.Array[js.Any])
  extends AnyVal
     with StBuildingComponent[tag.type, R] {
  @scala.inline
  def color(value: Color): this.type = set("color", value.asInstanceOf[js.Any])
  @scala.inline
  def disableAlpha(value: Boolean): this.type = set("disableAlpha", value.asInstanceOf[js.Any])
  @scala.inline
  def onChange(value: /* color */ ColorResult => Unit): this.type = set("onChange", js.Any.fromFunction1(value))
  @scala.inline
  def onChangeComplete(value: /* color */ ColorResult => Unit): this.type = set("onChangeComplete", js.Any.fromFunction1(value))
  @scala.inline
  def onSwatchHover(value: (/* color */ ColorResult, /* event */ MouseEvent) => Unit): this.type = set("onSwatchHover", js.Any.fromFunction2(value))
  @scala.inline
  def presetColors(value: js.Array[String]): this.type = set("presetColors", value.asInstanceOf[js.Any])
  @scala.inline
  def width(value: String): this.type = set("width", value.asInstanceOf[js.Any])
}

