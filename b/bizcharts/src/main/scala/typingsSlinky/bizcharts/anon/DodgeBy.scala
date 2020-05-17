package typingsSlinky.bizcharts.anon

import typingsSlinky.bizcharts.mod.GeomAdjustType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DodgeBy extends js.Object {
  var dodgeBy: js.UndefOr[String] = js.native
  var marginRatio: js.UndefOr[Double] = js.native
  var `type`: js.UndefOr[GeomAdjustType] = js.native
}

object DodgeBy {
  @scala.inline
  def apply(): DodgeBy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DodgeBy]
  }
  @scala.inline
  implicit class DodgeByOps[Self <: DodgeBy] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDodgeBy(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dodgeBy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDodgeBy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dodgeBy")(js.undefined)
        ret
    }
    @scala.inline
    def withMarginRatio(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("marginRatio")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMarginRatio: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("marginRatio")(js.undefined)
        ret
    }
    @scala.inline
    def withType(value: GeomAdjustType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(js.undefined)
        ret
    }
  }
  
}

