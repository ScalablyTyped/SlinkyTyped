package typingsSlinky.googleapis.v1b3Mod.dataflowV1b3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Obsolete in favor of ApproximateReportedProgress and
  * ApproximateSplitRequest.
  */
@js.native
trait SchemaApproximateProgress extends js.Object {
  /**
    * Obsolete.
    */
  var percentComplete: js.UndefOr[Double] = js.native
  /**
    * Obsolete.
    */
  var position: js.UndefOr[SchemaPosition] = js.native
  /**
    * Obsolete.
    */
  var remainingTime: js.UndefOr[String] = js.native
}

object SchemaApproximateProgress {
  @scala.inline
  def apply(): SchemaApproximateProgress = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaApproximateProgress]
  }
  @scala.inline
  implicit class SchemaApproximateProgressOps[Self <: SchemaApproximateProgress] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPercentComplete(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("percentComplete")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPercentComplete: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("percentComplete")(js.undefined)
        ret
    }
    @scala.inline
    def withPosition(value: SchemaPosition): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("position")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPosition: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("position")(js.undefined)
        ret
    }
    @scala.inline
    def withRemainingTime(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("remainingTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRemainingTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("remainingTime")(js.undefined)
        ret
    }
  }
  
}

