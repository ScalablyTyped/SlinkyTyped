package typingsSlinky.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LabelCountersForWorkteam extends js.Object {
  /**
    * The total number of data objects labeled by a human worker.
    */
  var HumanLabeled: js.UndefOr[LabelCounter] = js.native
  /**
    * The total number of data objects that need to be labeled by a human worker.
    */
  var PendingHuman: js.UndefOr[LabelCounter] = js.native
  /**
    * The total number of tasks in the labeling job.
    */
  var Total: js.UndefOr[LabelCounter] = js.native
}

object LabelCountersForWorkteam {
  @scala.inline
  def apply(): LabelCountersForWorkteam = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LabelCountersForWorkteam]
  }
  @scala.inline
  implicit class LabelCountersForWorkteamOps[Self <: LabelCountersForWorkteam] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHumanLabeled(value: LabelCounter): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HumanLabeled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHumanLabeled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HumanLabeled")(js.undefined)
        ret
    }
    @scala.inline
    def withPendingHuman(value: LabelCounter): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PendingHuman")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPendingHuman: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PendingHuman")(js.undefined)
        ret
    }
    @scala.inline
    def withTotal(value: LabelCounter): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Total")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTotal: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Total")(js.undefined)
        ret
    }
  }
  
}

