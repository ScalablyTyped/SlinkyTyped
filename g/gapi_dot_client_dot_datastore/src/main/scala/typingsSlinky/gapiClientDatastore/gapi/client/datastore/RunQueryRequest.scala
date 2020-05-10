package typingsSlinky.gapiClientDatastore.gapi.client.datastore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RunQueryRequest extends js.Object {
  /** The GQL query to run. */
  var gqlQuery: js.UndefOr[GqlQuery] = js.native
  /**
    * Entities are partitioned into subsets, identified by a partition ID.
    * Queries are scoped to a single partition.
    * This partition ID is normalized with the standard default context
    * partition ID.
    */
  var partitionId: js.UndefOr[PartitionId] = js.native
  /** The query to run. */
  var query: js.UndefOr[Query] = js.native
  /** The options for this query. */
  var readOptions: js.UndefOr[ReadOptions] = js.native
}

object RunQueryRequest {
  @scala.inline
  def apply(): RunQueryRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RunQueryRequest]
  }
  @scala.inline
  implicit class RunQueryRequestOps[Self <: RunQueryRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGqlQuery(value: GqlQuery): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gqlQuery")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGqlQuery: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gqlQuery")(js.undefined)
        ret
    }
    @scala.inline
    def withPartitionId(value: PartitionId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("partitionId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPartitionId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("partitionId")(js.undefined)
        ret
    }
    @scala.inline
    def withQuery(value: Query): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("query")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQuery: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("query")(js.undefined)
        ret
    }
    @scala.inline
    def withReadOptions(value: ReadOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("readOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReadOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("readOptions")(js.undefined)
        ret
    }
  }
  
}

