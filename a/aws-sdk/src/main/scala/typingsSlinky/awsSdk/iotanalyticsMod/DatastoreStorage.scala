package typingsSlinky.awsSdk.iotanalyticsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DatastoreStorage extends js.Object {
  /**
    * Use this to store data store data in an S3 bucket that you manage. When customer managed storage is selected, the "retentionPeriod" parameter is ignored. The choice of service-managed or customer-managed S3 storage cannot be changed after creation of the data store.
    */
  var customerManagedS3: js.UndefOr[CustomerManagedDatastoreS3Storage] = js.native
  /**
    * Use this to store data store data in an S3 bucket managed by the AWS IoT Analytics service. The choice of service-managed or customer-managed S3 storage cannot be changed after creation of the data store.
    */
  var serviceManagedS3: js.UndefOr[ServiceManagedDatastoreS3Storage] = js.native
}

object DatastoreStorage {
  @scala.inline
  def apply(): DatastoreStorage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DatastoreStorage]
  }
  @scala.inline
  implicit class DatastoreStorageOps[Self <: DatastoreStorage] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCustomerManagedS3(value: CustomerManagedDatastoreS3Storage): Self = {
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
    def withServiceManagedS3(value: ServiceManagedDatastoreS3Storage): Self = {
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

