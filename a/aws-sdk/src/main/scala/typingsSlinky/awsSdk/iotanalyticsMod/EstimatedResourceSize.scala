package typingsSlinky.awsSdk.iotanalyticsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EstimatedResourceSize extends js.Object {
  /**
    * The time when the estimate of the size of the resource was made.
    */
  var estimatedOn: js.UndefOr[js.Date] = js.native
  /**
    * The estimated size of the resource in bytes.
    */
  var estimatedSizeInBytes: js.UndefOr[SizeInBytes] = js.native
}

object EstimatedResourceSize {
  @scala.inline
  def apply(): EstimatedResourceSize = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EstimatedResourceSize]
  }
  @scala.inline
  implicit class EstimatedResourceSizeOps[Self <: EstimatedResourceSize] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEstimatedOn(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("estimatedOn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEstimatedOn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("estimatedOn")(js.undefined)
        ret
    }
    @scala.inline
    def withEstimatedSizeInBytes(value: SizeInBytes): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("estimatedSizeInBytes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEstimatedSizeInBytes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("estimatedSizeInBytes")(js.undefined)
        ret
    }
  }
  
}

