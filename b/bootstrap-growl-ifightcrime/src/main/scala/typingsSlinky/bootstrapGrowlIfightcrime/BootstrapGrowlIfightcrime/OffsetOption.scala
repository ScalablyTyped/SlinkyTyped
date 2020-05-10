package typingsSlinky.bootstrapGrowlIfightcrime.BootstrapGrowlIfightcrime

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OffsetOption extends js.Object {
  /**
    * Offset amount
    */
  var amount: js.UndefOr[Double] = js.native
  /**
    * Position: top or bottom
    */
  var from: js.UndefOr[OffsetPositionType] = js.native
}

object OffsetOption {
  @scala.inline
  def apply(): OffsetOption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OffsetOption]
  }
  @scala.inline
  implicit class OffsetOptionOps[Self <: OffsetOption] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAmount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("amount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAmount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("amount")(js.undefined)
        ret
    }
    @scala.inline
    def withFrom(value: OffsetPositionType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("from")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFrom: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("from")(js.undefined)
        ret
    }
  }
  
}

