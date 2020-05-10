package typingsSlinky.figma

import typingsSlinky.figma.figmaStrings.SOLID_COLOR
import typingsSlinky.figma.mod._Global_.OverlayBackground
import typingsSlinky.figma.mod._Global_.RGBA
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonColor extends OverlayBackground {
  val color: RGBA = js.native
  val `type`: SOLID_COLOR = js.native
}

object AnonColor {
  @scala.inline
  def apply(color: RGBA, `type`: SOLID_COLOR): AnonColor = {
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonColor]
  }
  @scala.inline
  implicit class AnonColorOps[Self <: AnonColor] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withColor(value: RGBA): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("color")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: SOLID_COLOR): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

