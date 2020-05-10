package typingsSlinky.googleapis.datastoreV1Mod.datastoreV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The request for Datastore.RunQuery.
  */
@js.native
trait SchemaRunQueryRequest extends js.Object {
  /**
    * The GQL query to run.
    */
  var gqlQuery: js.UndefOr[SchemaGqlQuery] = js.native
  /**
    * Entities are partitioned into subsets, identified by a partition ID.
    * Queries are scoped to a single partition. This partition ID is normalized
    * with the standard default context partition ID.
    */
  var partitionId: js.UndefOr[SchemaPartitionId] = js.native
  /**
    * The query to run.
    */
  var query: js.UndefOr[SchemaQuery] = js.native
  /**
    * The options for this query.
    */
  var readOptions: js.UndefOr[SchemaReadOptions] = js.native
}

object SchemaRunQueryRequest {
  @scala.inline
  def apply(): SchemaRunQueryRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaRunQueryRequest]
  }
  @scala.inline
  implicit class SchemaRunQueryRequestOps[Self <: SchemaRunQueryRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGqlQuery(value: SchemaGqlQuery): Self = {
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
    def withPartitionId(value: SchemaPartitionId): Self = {
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
    def withQuery(value: SchemaQuery): Self = {
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
    def withReadOptions(value: SchemaReadOptions): Self = {
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

