package typingsSlinky.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LabelCounters extends js.Object {
  /**
    * The total number of objects that could not be labeled due to an error.
    */
  var FailedNonRetryableError: js.UndefOr[LabelCounter] = js.native
  /**
    * The total number of objects labeled by a human worker.
    */
  var HumanLabeled: js.UndefOr[LabelCounter] = js.native
  /**
    * The total number of objects labeled by automated data labeling.
    */
  var MachineLabeled: js.UndefOr[LabelCounter] = js.native
  /**
    * The total number of objects labeled.
    */
  var TotalLabeled: js.UndefOr[LabelCounter] = js.native
  /**
    * The total number of objects not yet labeled.
    */
  var Unlabeled: js.UndefOr[LabelCounter] = js.native
}

object LabelCounters {
  @scala.inline
  def apply(): LabelCounters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LabelCounters]
  }
  @scala.inline
  implicit class LabelCountersOps[Self <: LabelCounters] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFailedNonRetryableError(value: LabelCounter): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FailedNonRetryableError")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFailedNonRetryableError: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FailedNonRetryableError")(js.undefined)
        ret
    }
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
    def withMachineLabeled(value: LabelCounter): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MachineLabeled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMachineLabeled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MachineLabeled")(js.undefined)
        ret
    }
    @scala.inline
    def withTotalLabeled(value: LabelCounter): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TotalLabeled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTotalLabeled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TotalLabeled")(js.undefined)
        ret
    }
    @scala.inline
    def withUnlabeled(value: LabelCounter): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Unlabeled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUnlabeled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Unlabeled")(js.undefined)
        ret
    }
  }
  
}

