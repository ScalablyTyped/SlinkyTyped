package typingsSlinky.ranjs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonDim extends js.Object {
  var dim: js.UndefOr[Double] = js.native
  var maxHistory: js.UndefOr[Double] = js.native
}

object AnonDim {
  @scala.inline
  def apply(): AnonDim = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonDim]
  }
  @scala.inline
  implicit class AnonDimOps[Self <: AnonDim] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDim(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dim")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDim: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dim")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxHistory(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxHistory")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxHistory: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxHistory")(js.undefined)
        ret
    }
  }
  
}

