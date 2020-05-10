package typingsSlinky.awsSdk.iotanalyticsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DatastoreStatistics extends js.Object {
  /**
    * The estimated size of the data store.
    */
  var size: js.UndefOr[EstimatedResourceSize] = js.native
}

object DatastoreStatistics {
  @scala.inline
  def apply(): DatastoreStatistics = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DatastoreStatistics]
  }
  @scala.inline
  implicit class DatastoreStatisticsOps[Self <: DatastoreStatistics] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSize(value: EstimatedResourceSize): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("size")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("size")(js.undefined)
        ret
    }
  }
  
}

