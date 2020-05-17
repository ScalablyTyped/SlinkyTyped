package typingsSlinky.oakdexPokedex.anon

import typingsSlinky.oakdexPokedex.mod.MoveStatusCondition
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Increasedcriticalhitratio extends js.Object {
  var increased_critical_hit_ratio: js.UndefOr[Boolean] = js.native
  var status_conditions: js.UndefOr[js.Array[MoveStatusCondition]] = js.native
}

object Increasedcriticalhitratio {
  @scala.inline
  def apply(): Increasedcriticalhitratio = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Increasedcriticalhitratio]
  }
  @scala.inline
  implicit class IncreasedcriticalhitratioOps[Self <: Increasedcriticalhitratio] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIncreased_critical_hit_ratio(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("increased_critical_hit_ratio")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIncreased_critical_hit_ratio: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("increased_critical_hit_ratio")(js.undefined)
        ret
    }
    @scala.inline
    def withStatus_conditions(value: js.Array[MoveStatusCondition]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status_conditions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStatus_conditions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status_conditions")(js.undefined)
        ret
    }
  }
  
}

