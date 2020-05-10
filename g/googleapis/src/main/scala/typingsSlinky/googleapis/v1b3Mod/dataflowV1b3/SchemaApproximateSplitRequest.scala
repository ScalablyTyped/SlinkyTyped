package typingsSlinky.googleapis.v1b3Mod.dataflowV1b3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A suggestion by the service to the worker to dynamically split the
  * WorkItem.
  */
@js.native
trait SchemaApproximateSplitRequest extends js.Object {
  /**
    * A fraction at which to split the work item, from 0.0 (beginning of the
    * input) to 1.0 (end of the input).
    */
  var fractionConsumed: js.UndefOr[Double] = js.native
  /**
    * The fraction of the remainder of work to split the work item at, from 0.0
    * (split at the current position) to 1.0 (end of the input).
    */
  var fractionOfRemainder: js.UndefOr[Double] = js.native
  /**
    * A Position at which to split the work item.
    */
  var position: js.UndefOr[SchemaPosition] = js.native
}

object SchemaApproximateSplitRequest {
  @scala.inline
  def apply(): SchemaApproximateSplitRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaApproximateSplitRequest]
  }
  @scala.inline
  implicit class SchemaApproximateSplitRequestOps[Self <: SchemaApproximateSplitRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFractionConsumed(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fractionConsumed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFractionConsumed: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fractionConsumed")(js.undefined)
        ret
    }
    @scala.inline
    def withFractionOfRemainder(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fractionOfRemainder")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFractionOfRemainder: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fractionOfRemainder")(js.undefined)
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
  }
  
}

