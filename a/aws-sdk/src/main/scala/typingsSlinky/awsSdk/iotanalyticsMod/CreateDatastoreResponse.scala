package typingsSlinky.awsSdk.iotanalyticsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateDatastoreResponse extends js.Object {
  /**
    * The ARN of the data store.
    */
  var datastoreArn: js.UndefOr[DatastoreArn] = js.native
  /**
    * The name of the data store.
    */
  var datastoreName: js.UndefOr[DatastoreName] = js.native
  /**
    * How long, in days, message data is kept for the data store.
    */
  var retentionPeriod: js.UndefOr[RetentionPeriod] = js.native
}

object CreateDatastoreResponse {
  @scala.inline
  def apply(): CreateDatastoreResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateDatastoreResponse]
  }
  @scala.inline
  implicit class CreateDatastoreResponseOps[Self <: CreateDatastoreResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDatastoreArn(value: DatastoreArn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("datastoreArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDatastoreArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("datastoreArn")(js.undefined)
        ret
    }
    @scala.inline
    def withDatastoreName(value: DatastoreName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("datastoreName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDatastoreName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("datastoreName")(js.undefined)
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

