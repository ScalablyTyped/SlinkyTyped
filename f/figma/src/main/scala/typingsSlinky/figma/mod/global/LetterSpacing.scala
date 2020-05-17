package typingsSlinky.figma.mod.global

import typingsSlinky.figma.figmaStrings.PERCENT
import typingsSlinky.figma.figmaStrings.PIXELS
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LetterSpacing extends js.Object {
  val unit: PIXELS | PERCENT = js.native
  val value: Double = js.native
}

object LetterSpacing {
  @scala.inline
  def apply(unit: PIXELS | PERCENT, value: Double): LetterSpacing = {
    val __obj = js.Dynamic.literal(unit = unit.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[LetterSpacing]
  }
  @scala.inline
  implicit class LetterSpacingOps[Self <: LetterSpacing] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withUnit(value: PIXELS | PERCENT): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValue(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

