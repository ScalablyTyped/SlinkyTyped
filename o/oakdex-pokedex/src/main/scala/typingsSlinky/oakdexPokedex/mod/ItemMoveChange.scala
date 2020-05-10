package typingsSlinky.oakdexPokedex.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ItemMoveChange extends js.Object {
  var change_by: js.UndefOr[Double] = js.native
  var change_by_max: js.UndefOr[Double] = js.native
  var change_by_percent: js.UndefOr[Double] = js.native
  var field: String = js.native
}

object ItemMoveChange {
  @scala.inline
  def apply(field: String): ItemMoveChange = {
    val __obj = js.Dynamic.literal(field = field.asInstanceOf[js.Any])
    __obj.asInstanceOf[ItemMoveChange]
  }
  @scala.inline
  implicit class ItemMoveChangeOps[Self <: ItemMoveChange] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withField(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("field")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withChange_by(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("change_by")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChange_by: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("change_by")(js.undefined)
        ret
    }
    @scala.inline
    def withChange_by_max(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("change_by_max")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChange_by_max: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("change_by_max")(js.undefined)
        ret
    }
    @scala.inline
    def withChange_by_percent(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("change_by_percent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChange_by_percent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("change_by_percent")(js.undefined)
        ret
    }
  }
  
}

