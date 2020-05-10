package typingsSlinky.gapiClientPlus

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonTotalItems extends js.Object {
  /** Total number of people who +1'd this comment. */
  var totalItems: js.UndefOr[Double] = js.native
}

object AnonTotalItems {
  @scala.inline
  def apply(): AnonTotalItems = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonTotalItems]
  }
  @scala.inline
  implicit class AnonTotalItemsOps[Self <: AnonTotalItems] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTotalItems(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("totalItems")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTotalItems: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("totalItems")(js.undefined)
        ret
    }
  }
  
}

