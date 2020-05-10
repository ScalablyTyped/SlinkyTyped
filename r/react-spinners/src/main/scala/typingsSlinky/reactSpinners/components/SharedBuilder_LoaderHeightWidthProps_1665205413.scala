package typingsSlinky.reactSpinners.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.reactSpinners.interfacesMod.PrecompiledCss
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@scala.inline
class SharedBuilder_LoaderHeightWidthProps_1665205413[R <: js.Object] (val args: js.Array[js.Any])
  extends AnyVal
     with StBuildingComponent[tag.type, R] {
  @scala.inline
  def color(value: String): this.type = set("color", value.asInstanceOf[js.Any])
  @scala.inline
  def css(value: String | PrecompiledCss): this.type = set("css", value.asInstanceOf[js.Any])
  @scala.inline
  def height(value: Double): this.type = set("height", value.asInstanceOf[js.Any])
  @scala.inline
  def heightUnit(value: String): this.type = set("heightUnit", value.asInstanceOf[js.Any])
  @scala.inline
  def loading(value: Boolean): this.type = set("loading", value.asInstanceOf[js.Any])
  @scala.inline
  def width(value: Double): this.type = set("width", value.asInstanceOf[js.Any])
  @scala.inline
  def widthUnit(value: String): this.type = set("widthUnit", value.asInstanceOf[js.Any])
}

