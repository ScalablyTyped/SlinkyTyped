package typingsSlinky.grommet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonHoverAnonBackgroundExtend extends js.Object {
  var hover: js.UndefOr[AnonBackgroundExtend] = js.native
}

object AnonHoverAnonBackgroundExtend {
  @scala.inline
  def apply(): AnonHoverAnonBackgroundExtend = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonHoverAnonBackgroundExtend]
  }
  @scala.inline
  implicit class AnonHoverAnonBackgroundExtendOps[Self <: AnonHoverAnonBackgroundExtend] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHover(value: AnonBackgroundExtend): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hover")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHover: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hover")(js.undefined)
        ret
    }
  }
  
}

