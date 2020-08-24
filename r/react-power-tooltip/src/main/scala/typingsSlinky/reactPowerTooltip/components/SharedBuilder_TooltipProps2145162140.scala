package typingsSlinky.reactPowerTooltip.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.reactPowerTooltip.toolTipMod.AnimationType
import typingsSlinky.reactPowerTooltip.toolTipMod.ArrowAlignType
import typingsSlinky.reactPowerTooltip.toolTipMod.PositionType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@scala.inline
class SharedBuilder_TooltipProps2145162140[R <: js.Object] (val args: js.Array[js.Any])
  extends AnyVal
     with StBuildingComponent[tag.type, R] {
  @scala.inline
  def animation(value: AnimationType): this.type = set("animation", value.asInstanceOf[js.Any])
  @scala.inline
  def arrowAlign(value: ArrowAlignType): this.type = set("arrowAlign", value.asInstanceOf[js.Any])
  @scala.inline
  def backgroundColor(value: String): this.type = set("backgroundColor", value.asInstanceOf[js.Any])
  @scala.inline
  def color(value: String): this.type = set("color", value.asInstanceOf[js.Any])
  @scala.inline
  def flat(value: Boolean): this.type = set("flat", value.asInstanceOf[js.Any])
  @scala.inline
  def fontFamily(value: String): this.type = set("fontFamily", value.asInstanceOf[js.Any])
  @scala.inline
  def fontSize(value: String): this.type = set("fontSize", value.asInstanceOf[js.Any])
  @scala.inline
  def fontWeight(value: String): this.type = set("fontWeight", value.asInstanceOf[js.Any])
  @scala.inline
  def hoverBackground(value: String): this.type = set("hoverBackground", value.asInstanceOf[js.Any])
  @scala.inline
  def lineSeparated(value: Boolean | String): this.type = set("lineSeparated", value.asInstanceOf[js.Any])
  @scala.inline
  def moveDown(value: String): this.type = set("moveDown", value.asInstanceOf[js.Any])
  @scala.inline
  def moveLeft(value: String): this.type = set("moveLeft", value.asInstanceOf[js.Any])
  @scala.inline
  def moveRight(value: String): this.type = set("moveRight", value.asInstanceOf[js.Any])
  @scala.inline
  def moveUp(value: String): this.type = set("moveUp", value.asInstanceOf[js.Any])
  @scala.inline
  def position(value: PositionType): this.type = set("position", value.asInstanceOf[js.Any])
  @scala.inline
  def static(value: Boolean): this.type = set("static", value.asInstanceOf[js.Any])
  @scala.inline
  def textAlign(value: String): this.type = set("textAlign", value.asInstanceOf[js.Any])
  @scala.inline
  def zIndex(value: String): this.type = set("zIndex", value.asInstanceOf[js.Any])
}

