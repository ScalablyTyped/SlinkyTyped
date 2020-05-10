package typingsSlinky.awsSdk.iotanalyticsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateDatastoreRequest extends js.Object {
  /**
    * The name of the data store to be updated.
    */
  var datastoreName: DatastoreName = js.native
  /**
    * Where data store data is stored. You may choose one of "serviceManagedS3" or "customerManagedS3" storage. If not specified, the default is "serviceManagedS3". This cannot be changed after the data store is created.
    */
  var datastoreStorage: js.UndefOr[DatastoreStorage] = js.native
  /**
    * How long, in days, message data is kept for the data store. The retention period cannot be updated if the data store's S3 storage is customer-managed.
    */
  var retentionPeriod: js.UndefOr[RetentionPeriod] = js.native
}

object UpdateDatastoreRequest {
  @scala.inline
  def apply(datastoreName: DatastoreName): UpdateDatastoreRequest = {
    val __obj = js.Dynamic.literal(datastoreName = datastoreName.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateDatastoreRequest]
  }
  @scala.inline
  implicit class UpdateDatastoreRequestOps[Self <: UpdateDatastoreRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDatastoreName(value: DatastoreName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("datastoreName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDatastoreStorage(value: DatastoreStorage): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("datastoreStorage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDatastoreStorage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("datastoreStorage")(js.undefined)
        ret
    }
    @scala.inline
    def withRetentionPeriod(value: RetentionPeriod): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("retentionPeriod")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRetentionPeriod: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("retentionPeriod")(js.undefined)
        ret
    }
  }
  
}

