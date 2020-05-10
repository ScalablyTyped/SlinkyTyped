package typingsSlinky.reactColor.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.reactColor.chromeMod.ChromePickerStyles
import typingsSlinky.reactColor.mod.Color
import typingsSlinky.reactColor.mod.ColorResult
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@scala.inline
class SharedBuilder_ChromePickerProps_1493222285[R <: js.Object] (val args: js.Array[js.Any])
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
  def styles(value: ChromePickerStyles): this.type = set("styles", value.asInstanceOf[js.Any])
}

