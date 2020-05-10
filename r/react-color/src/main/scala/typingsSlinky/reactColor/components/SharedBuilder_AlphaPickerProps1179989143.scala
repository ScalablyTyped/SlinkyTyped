package typingsSlinky.reactColor.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.reactColor.mod.Color
import typingsSlinky.reactColor.mod.ColorResult
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@scala.inline
class SharedBuilder_AlphaPickerProps1179989143[R <: js.Object] (val args: js.Array[js.Any])
  extends AnyVal
     with StBuildingComponent[tag.type, R] {
  @scala.inline
  def color(value: Color): this.type = set("color", value.asInstanceOf[js.Any])
  @scala.inline
  def height(value: String): this.type = set("height", value.asInstanceOf[js.Any])
  @scala.inline
  def onChange(value: /* color */ ColorResult => Unit): this.type = set("onChange", js.Any.fromFunction1(value))
  @scala.inline
  def onChangeComplete(value: /* color */ ColorResult => Unit): this.type = set("onChangeComplete", js.Any.fromFunction1(value))
  @scala.inline
  def width(value: String): this.type = set("width", value.asInstanceOf[js.Any])
}

