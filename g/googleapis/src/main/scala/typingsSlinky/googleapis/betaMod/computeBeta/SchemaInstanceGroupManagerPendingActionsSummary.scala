package typingsSlinky.googleapis.betaMod.computeBeta

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaInstanceGroupManagerPendingActionsSummary extends js.Object {
  /**
    * [Output Only] The number of instances in the managed instance group that
    * are pending to be created.
    */
  var creating: js.UndefOr[Double] = js.native
  /**
    * [Output Only] The number of instances in the managed instance group that
    * are pending to be deleted.
    */
  var deleting: js.UndefOr[Double] = js.native
  /**
    * [Output Only] The number of instances in the managed instance group that
    * are pending to be recreated.
    */
  var recreating: js.UndefOr[Double] = js.native
  /**
    * [Output Only] The number of instances in the managed instance group that
    * are pending to be restarted.
    */
  var restarting: js.UndefOr[Double] = js.native
}

object SchemaInstanceGroupManagerPendingActionsSummary {
  @scala.inline
  def apply(): SchemaInstanceGroupManagerPendingActionsSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaInstanceGroupManagerPendingActionsSummary]
  }
  @scala.inline
  implicit class SchemaInstanceGroupManagerPendingActionsSummaryOps[Self <: SchemaInstanceGroupManagerPendingActionsSummary] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCreating(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("creating")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCreating: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("creating")(js.undefined)
        ret
    }
    @scala.inline
    def withDeleting(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deleting")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeleting: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deleting")(js.undefined)
        ret
    }
    @scala.inline
    def withRecreating(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("recreating")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRecreating: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("recreating")(js.undefined)
        ret
    }
    @scala.inline
    def withRestarting(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("restarting")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRestarting: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("restarting")(js.undefined)
        ret
    }
  }
  
}

