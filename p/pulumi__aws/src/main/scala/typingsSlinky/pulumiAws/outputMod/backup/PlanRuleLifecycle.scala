package typingsSlinky.pulumiAws.outputMod.backup

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PlanRuleLifecycle extends js.Object {
  /**
    * Specifies the number of days after creation that a recovery point is moved to cold storage.
    */
  var coldStorageAfter: js.UndefOr[Double] = js.native
  /**
    * Specifies the number of days after creation that a recovery point is deleted. Must be 90 days greater than `coldStorageAfter`.
    */
  var deleteAfter: js.UndefOr[Double] = js.native
}

object PlanRuleLifecycle {
  @scala.inline
  def apply(): PlanRuleLifecycle = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlanRuleLifecycle]
  }
  @scala.inline
  implicit class PlanRuleLifecycleOps[Self <: PlanRuleLifecycle] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withColdStorageAfter(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("coldStorageAfter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColdStorageAfter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("coldStorageAfter")(js.undefined)
        ret
    }
    @scala.inline
    def withDeleteAfter(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deleteAfter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeleteAfter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deleteAfter")(js.undefined)
        ret
    }
  }
  
}

