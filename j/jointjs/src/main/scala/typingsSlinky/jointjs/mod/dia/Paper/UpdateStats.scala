package typingsSlinky.jointjs.mod.dia.Paper

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateStats extends js.Object {
  var empty: Boolean = js.native
  var mounted: Double = js.native
  var postponed: Double = js.native
  var priority: Double = js.native
  var unmounted: Double = js.native
  var updated: Double = js.native
}

object UpdateStats {
  @scala.inline
  def apply(
    empty: Boolean,
    mounted: Double,
    postponed: Double,
    priority: Double,
    unmounted: Double,
    updated: Double
  ): UpdateStats = {
    val __obj = js.Dynamic.literal(empty = empty.asInstanceOf[js.Any], mounted = mounted.asInstanceOf[js.Any], postponed = postponed.asInstanceOf[js.Any], priority = priority.asInstanceOf[js.Any], unmounted = unmounted.asInstanceOf[js.Any], updated = updated.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateStats]
  }
  @scala.inline
  implicit class UpdateStatsOps[Self <: UpdateStats] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEmpty(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("empty")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMounted(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mounted")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPostponed(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("postponed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPriority(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("priority")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUnmounted(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unmounted")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUpdated(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updated")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

