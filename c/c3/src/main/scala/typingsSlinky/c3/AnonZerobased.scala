package typingsSlinky.c3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonZerobased extends js.Object {
  /**
    * Set if min or max value will be 0 on area chart.
    */
  var zerobased: js.UndefOr[Boolean] = js.native
}

object AnonZerobased {
  @scala.inline
  def apply(): AnonZerobased = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonZerobased]
  }
  @scala.inline
  implicit class AnonZerobasedOps[Self <: AnonZerobased] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withZerobased(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zerobased")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutZerobased: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zerobased")(js.undefined)
        ret
    }
  }
  
}

