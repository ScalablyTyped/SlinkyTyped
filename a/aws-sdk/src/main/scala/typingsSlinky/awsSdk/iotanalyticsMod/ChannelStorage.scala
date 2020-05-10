package typingsSlinky.awsSdk.iotanalyticsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ChannelStorage extends js.Object {
  /**
    * Use this to store channel data in an S3 bucket that you manage. If customer managed storage is selected, the "retentionPeriod" parameter is ignored. The choice of service-managed or customer-managed S3 storage cannot be changed after creation of the channel.
    */
  var customerManagedS3: js.UndefOr[CustomerManagedChannelS3Storage] = js.native
  /**
    * Use this to store channel data in an S3 bucket managed by the AWS IoT Analytics service. The choice of service-managed or customer-managed S3 storage cannot be changed after creation of the channel.
    */
  var serviceManagedS3: js.UndefOr[ServiceManagedChannelS3Storage] = js.native
}

object ChannelStorage {
  @scala.inline
  def apply(): ChannelStorage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChannelStorage]
  }
  @scala.inline
  implicit class ChannelStorageOps[Self <: ChannelStorage] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCustomerManagedS3(value: CustomerManagedChannelS3Storage): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customerManagedS3")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCustomerManagedS3: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customerManagedS3")(js.undefined)
        ret
    }
    @scala.inline
    def withServiceManagedS3(value: ServiceManagedChannelS3Storage): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serviceManagedS3")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutServiceManagedS3: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serviceManagedS3")(js.undefined)
        ret
    }
  }
  
}

