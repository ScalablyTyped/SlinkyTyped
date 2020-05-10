package typingsSlinky.azdata.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExecutionPlanOptions extends js.Object {
  var displayActualQueryPlan: js.UndefOr[Boolean] = js.native
  var displayEstimatedQueryPlan: js.UndefOr[Boolean] = js.native
}

object ExecutionPlanOptions {
  @scala.inline
  def apply(): ExecutionPlanOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExecutionPlanOptions]
  }
  @scala.inline
  implicit class ExecutionPlanOptionsOps[Self <: ExecutionPlanOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDisplayActualQueryPlan(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayActualQueryPlan")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisplayActualQueryPlan: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayActualQueryPlan")(js.undefined)
        ret
    }
    @scala.inline
    def withDisplayEstimatedQueryPlan(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayEstimatedQueryPlan")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisplayEstimatedQueryPlan: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayEstimatedQueryPlan")(js.undefined)
        ret
    }
  }
  
}

