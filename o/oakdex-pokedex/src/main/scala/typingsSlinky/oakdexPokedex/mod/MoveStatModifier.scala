package typingsSlinky.oakdexPokedex.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MoveStatModifier extends js.Object {
  var affects_user: js.UndefOr[Boolean] = js.native
  var change_by: Double = js.native
  var stat: String = js.native
}

object MoveStatModifier {
  @scala.inline
  def apply(change_by: Double, stat: String): MoveStatModifier = {
    val __obj = js.Dynamic.literal(change_by = change_by.asInstanceOf[js.Any], stat = stat.asInstanceOf[js.Any])
    __obj.asInstanceOf[MoveStatModifier]
  }
  @scala.inline
  implicit class MoveStatModifierOps[Self <: MoveStatModifier] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withChange_by(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("change_by")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStat(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stat")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAffects_user(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("affects_user")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAffects_user: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("affects_user")(js.undefined)
        ret
    }
  }
  
}

