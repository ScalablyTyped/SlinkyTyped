package typingsSlinky.formatjsIntlRelativetimeformat.mod

import typingsSlinky.std.Intl.NumberFormatPart
import typingsSlinky.std.Intl.NumberFormatPartTypes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RelativeTimeFormatNumberPart
  extends NumberFormatPart
     with Part {
  var unit: Unit = js.native
}

object RelativeTimeFormatNumberPart {
  @scala.inline
  def apply(`type`: NumberFormatPartTypes, unit: Unit, value: String): RelativeTimeFormatNumberPart = {
    val __obj = js.Dynamic.literal(unit = unit.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[RelativeTimeFormatNumberPart]
  }
  @scala.inline
  implicit class RelativeTimeFormatNumberPartOps[Self <: RelativeTimeFormatNumberPart] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withUnit(value: Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unit")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

