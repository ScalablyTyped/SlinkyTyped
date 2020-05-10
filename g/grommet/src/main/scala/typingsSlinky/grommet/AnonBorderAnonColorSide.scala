package typingsSlinky.grommet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonBorderAnonColorSide extends js.Object {
  var border: js.UndefOr[AnonColorSide] = js.native
}

object AnonBorderAnonColorSide {
  @scala.inline
  def apply(): AnonBorderAnonColorSide = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonBorderAnonColorSide]
  }
  @scala.inline
  implicit class AnonBorderAnonColorSideOps[Self <: AnonBorderAnonColorSide] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBorder(value: AnonColorSide): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("border")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBorder: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("border")(js.undefined)
        ret
    }
  }
  
}

