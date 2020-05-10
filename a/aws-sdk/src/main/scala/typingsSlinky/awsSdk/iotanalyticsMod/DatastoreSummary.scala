package typingsSlinky.awsSdk.iotanalyticsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DatastoreSummary extends js.Object {
  /**
    * When the data store was created.
    */
  var creationTime: js.UndefOr[js.Date] = js.native
  /**
    * The name of the data store.
    */
  var datastoreName: js.UndefOr[DatastoreName] = js.native
  /**
    * Where data store data is stored.
    */
  var datastoreStorage: js.UndefOr[DatastoreStorageSummary] = js.native
  /**
    * The last time the data store was updated.
    */
  var lastUpdateTime: js.UndefOr[js.Date] = js.native
  /**
    * The status of the data store.
    */
  var status: js.UndefOr[DatastoreStatus] = js.native
}

object DatastoreSummary {
  @scala.inline
  def apply(): DatastoreSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DatastoreSummary]
  }
  @scala.inline
  implicit class DatastoreSummaryOps[Self <: DatastoreSummary] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCreationTime(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("creationTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCreationTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("creationTime")(js.undefined)
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
    def withDatastoreStorage(value: DatastoreStorageSummary): Self = {
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
    def withLastUpdateTime(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastUpdateTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLastUpdateTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastUpdateTime")(js.undefined)
        ret
    }
    @scala.inline
    def withStatus(value: DatastoreStatus): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(js.undefined)
        ret
    }
  }
  
}

