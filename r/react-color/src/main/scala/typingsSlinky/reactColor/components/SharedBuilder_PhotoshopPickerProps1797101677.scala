package typingsSlinky.reactColor.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.reactColor.mod.Color
import typingsSlinky.reactColor.mod.ColorResult
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@scala.inline
class SharedBuilder_PhotoshopPickerProps1797101677[R <: js.Object] (val args: js.Array[js.Any])
  extends AnyVal
     with StBuildingComponent[tag.type, R] {
  @scala.inline
  def color(value: Color): this.type = set("color", value.asInstanceOf[js.Any])
  @scala.inline
  def header(value: String): this.type = set("header", value.asInstanceOf[js.Any])
  @scala.inline
  def onAccept(value: /* color */ ColorResult => Unit): this.type = set("onAccept", js.Any.fromFunction1(value))
  @scala.inline
  def onCancel(value: /* color */ ColorResult => Unit): this.type = set("onCancel", js.Any.fromFunction1(value))
  @scala.inline
  def onChange(value: /* color */ ColorResult => Unit): this.type = set("onChange", js.Any.fromFunction1(value))
  @scala.inline
  def onChangeComplete(value: /* color */ ColorResult => Unit): this.type = set("onChangeComplete", js.Any.fromFunction1(value))
}

