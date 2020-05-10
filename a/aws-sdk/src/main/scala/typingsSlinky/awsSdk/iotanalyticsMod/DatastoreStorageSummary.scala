package typingsSlinky.awsSdk.iotanalyticsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DatastoreStorageSummary extends js.Object {
  /**
    * Used to store data store data in an S3 bucket that you manage.
    */
  var customerManagedS3: js.UndefOr[CustomerManagedDatastoreS3StorageSummary] = js.native
  /**
    * Used to store data store data in an S3 bucket managed by the AWS IoT Analytics service.
    */
  var serviceManagedS3: js.UndefOr[ServiceManagedDatastoreS3StorageSummary] = js.native
}

object DatastoreStorageSummary {
  @scala.inline
  def apply(): DatastoreStorageSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DatastoreStorageSummary]
  }
  @scala.inline
  implicit class DatastoreStorageSummaryOps[Self <: DatastoreStorageSummary] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCustomerManagedS3(value: CustomerManagedDatastoreS3StorageSummary): Self = {
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
    def withServiceManagedS3(value: ServiceManagedDatastoreS3StorageSummary): Self = {
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

