package typingsSlinky.awsSdk.batchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ArrayPropertiesDetail extends js.Object {
  /**
    * The job index within the array that is associated with this job. This parameter is returned for array job children.
    */
  var index: js.UndefOr[Integer] = js.native
  /**
    * The size of the array job. This parameter is returned for parent array jobs.
    */
  var size: js.UndefOr[Integer] = js.native
  /**
    * A summary of the number of array job children in each available job status. This parameter is returned for parent array jobs.
    */
  var statusSummary: js.UndefOr[ArrayJobStatusSummary] = js.native
}

object ArrayPropertiesDetail {
  @scala.inline
  def apply(): ArrayPropertiesDetail = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ArrayPropertiesDetail]
  }
  @scala.inline
  implicit class ArrayPropertiesDetailOps[Self <: ArrayPropertiesDetail] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIndex(value: Integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("index")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIndex: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("index")(js.undefined)
        ret
    }
    @scala.inline
    def withSize(value: Integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("size")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("size")(js.undefined)
        ret
    }
    @scala.inline
    def withStatusSummary(value: ArrayJobStatusSummary): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("statusSummary")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStatusSummary: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("statusSummary")(js.undefined)
        ret
    }
  }
  
}

