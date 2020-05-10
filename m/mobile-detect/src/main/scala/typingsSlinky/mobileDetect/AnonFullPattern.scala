package typingsSlinky.mobileDetect

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonFullPattern extends js.Object {
  var fullPattern: js.RegExp = js.native
  var shortPattern: js.RegExp = js.native
  var tabletPattern: js.RegExp = js.native
}

object AnonFullPattern {
  @scala.inline
  def apply(fullPattern: js.RegExp, shortPattern: js.RegExp, tabletPattern: js.RegExp): AnonFullPattern = {
    val __obj = js.Dynamic.literal(fullPattern = fullPattern.asInstanceOf[js.Any], shortPattern = shortPattern.asInstanceOf[js.Any], tabletPattern = tabletPattern.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonFullPattern]
  }
  @scala.inline
  implicit class AnonFullPatternOps[Self <: AnonFullPattern] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFullPattern(value: js.RegExp): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fullPattern")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withShortPattern(value: js.RegExp): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shortPattern")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTabletPattern(value: js.RegExp): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tabletPattern")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

