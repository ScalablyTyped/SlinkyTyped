package typingsSlinky.awsSdk.iotanalyticsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DatasetContentDeliveryDestination extends js.Object {
  /**
    * Configuration information for delivery of data set contents to AWS IoT Events.
    */
  var iotEventsDestinationConfiguration: js.UndefOr[IotEventsDestinationConfiguration] = js.native
  /**
    * Configuration information for delivery of data set contents to Amazon S3.
    */
  var s3DestinationConfiguration: js.UndefOr[S3DestinationConfiguration] = js.native
}

object DatasetContentDeliveryDestination {
  @scala.inline
  def apply(): DatasetContentDeliveryDestination = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DatasetContentDeliveryDestination]
  }
  @scala.inline
  implicit class DatasetContentDeliveryDestinationOps[Self <: DatasetContentDeliveryDestination] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIotEventsDestinationConfiguration(value: IotEventsDestinationConfiguration): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iotEventsDestinationConfiguration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIotEventsDestinationConfiguration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iotEventsDestinationConfiguration")(js.undefined)
        ret
    }
    @scala.inline
    def withS3DestinationConfiguration(value: S3DestinationConfiguration): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("s3DestinationConfiguration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutS3DestinationConfiguration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("s3DestinationConfiguration")(js.undefined)
        ret
    }
  }
  
}

