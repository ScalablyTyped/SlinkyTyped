package typingsSlinky.figma

import typingsSlinky.figma.figmaStrings.PERCENT
import typingsSlinky.figma.figmaStrings.PIXELS
import typingsSlinky.figma.mod._Global_.LineHeight
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonUnit extends LineHeight {
  val unit: PIXELS | PERCENT = js.native
  val value: Double = js.native
}

object AnonUnit {
  @scala.inline
  def apply(unit: PIXELS | PERCENT, value: Double): AnonUnit = {
    val __obj = js.Dynamic.literal(unit = unit.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonUnit]
  }
  @scala.inline
  implicit class AnonUnitOps[Self <: AnonUnit] (val x: Self) extends AnyVal {
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

