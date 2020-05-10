package typingsSlinky.awsSdk.iotanalyticsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeDatastoreResponse extends js.Object {
  /**
    * Information about the data store.
    */
  var datastore: js.UndefOr[Datastore] = js.native
  /**
    * Additional statistical information about the data store. Included if the 'includeStatistics' parameter is set to true in the request.
    */
  var statistics: js.UndefOr[DatastoreStatistics] = js.native
}

object DescribeDatastoreResponse {
  @scala.inline
  def apply(): DescribeDatastoreResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeDatastoreResponse]
  }
  @scala.inline
  implicit class DescribeDatastoreResponseOps[Self <: DescribeDatastoreResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDatastore(value: Datastore): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("datastore")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDatastore: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("datastore")(js.undefined)
        ret
    }
    @scala.inline
    def withStatistics(value: DatastoreStatistics): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("statistics")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStatistics: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("statistics")(js.undefined)
        ret
    }
  }
  
}

