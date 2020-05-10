package typingsSlinky.antd

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonAdjustX extends js.Object {
  var adjustX: js.UndefOr[Boolean] = js.native
  var adjustY: js.UndefOr[Boolean] = js.native
}

object AnonAdjustX {
  @scala.inline
  def apply(): AnonAdjustX = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonAdjustX]
  }
  @scala.inline
  implicit class AnonAdjustXOps[Self <: AnonAdjustX] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAdjustX(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("adjustX")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAdjustX: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("adjustX")(js.undefined)
        ret
    }
    @scala.inline
    def withAdjustY(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("adjustY")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAdjustY: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("adjustY")(js.undefined)
        ret
    }
  }
  
}

