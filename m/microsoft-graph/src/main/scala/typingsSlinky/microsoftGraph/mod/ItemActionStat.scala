package typingsSlinky.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ItemActionStat extends js.Object {
  // The number of times the action took place. Read-only.
  var actionCount: js.UndefOr[Double] = js.native
  // The number of distinct actors that performed the action. Read-only.
  var actorCount: js.UndefOr[Double] = js.native
}

object ItemActionStat {
  @scala.inline
  def apply(): ItemActionStat = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ItemActionStat]
  }
  @scala.inline
  implicit class ItemActionStatOps[Self <: ItemActionStat] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withActionCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("actionCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutActionCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("actionCount")(js.undefined)
        ret
    }
    @scala.inline
    def withActorCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("actorCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutActorCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("actorCount")(js.undefined)
        ret
    }
  }
  
}

