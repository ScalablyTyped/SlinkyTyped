package typingsSlinky.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JobExecutionStatusDetails extends js.Object {
  /**
    * The job execution status.
    */
  var detailsMap: js.UndefOr[DetailsMap] = js.native
}

object JobExecutionStatusDetails {
  @scala.inline
  def apply(): JobExecutionStatusDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JobExecutionStatusDetails]
  }
  @scala.inline
  implicit class JobExecutionStatusDetailsOps[Self <: JobExecutionStatusDetails] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDetailsMap(value: DetailsMap): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("detailsMap")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDetailsMap: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("detailsMap")(js.undefined)
        ret
    }
  }
  
}

