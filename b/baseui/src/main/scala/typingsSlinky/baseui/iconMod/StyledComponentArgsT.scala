package typingsSlinky.baseui.iconMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StyledComponentArgsT extends js.Object {
  @JSName("$color")
  var $color: js.UndefOr[String] = js.native
  @JSName("$size")
  var $size: js.UndefOr[Double | String] = js.native
}

object StyledComponentArgsT {
  @scala.inline
  def apply(): StyledComponentArgsT = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StyledComponentArgsT]
  }
  @scala.inline
  implicit class StyledComponentArgsTOps[Self <: StyledComponentArgsT] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def with$color(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$color")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without$color: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$color")(js.undefined)
        ret
    }
    @scala.inline
    def with$size(value: Double | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$size")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without$size: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$size")(js.undefined)
        ret
    }
  }
  
}

