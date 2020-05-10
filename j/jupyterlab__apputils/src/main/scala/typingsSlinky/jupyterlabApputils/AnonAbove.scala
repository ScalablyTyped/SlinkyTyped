package typingsSlinky.jupyterlabApputils

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonAbove extends js.Object {
  var above: js.UndefOr[Double] = js.native
  var below: js.UndefOr[Double] = js.native
}

object AnonAbove {
  @scala.inline
  def apply(): AnonAbove = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonAbove]
  }
  @scala.inline
  implicit class AnonAboveOps[Self <: AnonAbove] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAbove(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("above")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAbove: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("above")(js.undefined)
        ret
    }
    @scala.inline
    def withBelow(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("below")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBelow: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("below")(js.undefined)
        ret
    }
  }
  
}

