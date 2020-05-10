package typingsSlinky.awsSdk.redshiftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DataTransferProgress extends js.Object {
  /**
    * Describes the data transfer rate in MB's per second.
    */
  var CurrentRateInMegaBytesPerSecond: js.UndefOr[DoubleOptional] = js.native
  /**
    * Describes the total amount of data that has been transfered in MB's.
    */
  var DataTransferredInMegaBytes: js.UndefOr[Long] = js.native
  /**
    * Describes the number of seconds that have elapsed during the data transfer.
    */
  var ElapsedTimeInSeconds: js.UndefOr[LongOptional] = js.native
  /**
    * Describes the estimated number of seconds remaining to complete the transfer.
    */
  var EstimatedTimeToCompletionInSeconds: js.UndefOr[LongOptional] = js.native
  /**
    * Describes the status of the cluster. While the transfer is in progress the status is transferringdata.
    */
  var Status: js.UndefOr[String] = js.native
  /**
    * Describes the total amount of data to be transfered in megabytes.
    */
  var TotalDataInMegaBytes: js.UndefOr[Long] = js.native
}

object DataTransferProgress {
  @scala.inline
  def apply(): DataTransferProgress = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DataTransferProgress]
  }
  @scala.inline
  implicit class DataTransferProgressOps[Self <: DataTransferProgress] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCurrentRateInMegaBytesPerSecond(value: DoubleOptional): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CurrentRateInMegaBytesPerSecond")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCurrentRateInMegaBytesPerSecond: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CurrentRateInMegaBytesPerSecond")(js.undefined)
        ret
    }
    @scala.inline
    def withDataTransferredInMegaBytes(value: Long): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DataTransferredInMegaBytes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDataTransferredInMegaBytes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DataTransferredInMegaBytes")(js.undefined)
        ret
    }
    @scala.inline
    def withElapsedTimeInSeconds(value: LongOptional): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ElapsedTimeInSeconds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutElapsedTimeInSeconds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ElapsedTimeInSeconds")(js.undefined)
        ret
    }
    @scala.inline
    def withEstimatedTimeToCompletionInSeconds(value: LongOptional): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EstimatedTimeToCompletionInSeconds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEstimatedTimeToCompletionInSeconds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EstimatedTimeToCompletionInSeconds")(js.undefined)
        ret
    }
    @scala.inline
    def withStatus(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Status")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Status")(js.undefined)
        ret
    }
    @scala.inline
    def withTotalDataInMegaBytes(value: Long): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TotalDataInMegaBytes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTotalDataInMegaBytes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TotalDataInMegaBytes")(js.undefined)
        ret
    }
  }
  
}

