package typingsSlinky.carbonIconHelpers.mod

import typingsSlinky.carbonIconHelpers.AnonCx
import typingsSlinky.carbonIconHelpers.carbonIconHelpersStrings.circle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Circle extends js.Object {
  var attrs: AnonCx = js.native
  var elem: circle = js.native
}

object Circle {
  @scala.inline
  def apply(attrs: AnonCx, elem: circle): Circle = {
    val __obj = js.Dynamic.literal(attrs = attrs.asInstanceOf[js.Any], elem = elem.asInstanceOf[js.Any])
    __obj.asInstanceOf[Circle]
  }
  @scala.inline
  implicit class CircleOps[Self <: Circle] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAttrs(value: AnonCx): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attrs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withElem(value: circle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("elem")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

