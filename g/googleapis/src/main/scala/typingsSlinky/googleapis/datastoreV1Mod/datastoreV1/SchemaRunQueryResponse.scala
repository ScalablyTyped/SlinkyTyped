package typingsSlinky.googleapis.datastoreV1Mod.datastoreV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The response for Datastore.RunQuery.
  */
@js.native
trait SchemaRunQueryResponse extends js.Object {
  /**
    * A batch of query results (always present).
    */
  var batch: js.UndefOr[SchemaQueryResultBatch] = js.native
  /**
    * The parsed form of the `GqlQuery` from the request, if it was set.
    */
  var query: js.UndefOr[SchemaQuery] = js.native
}

object SchemaRunQueryResponse {
  @scala.inline
  def apply(): SchemaRunQueryResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaRunQueryResponse]
  }
  @scala.inline
  implicit class SchemaRunQueryResponseOps[Self <: SchemaRunQueryResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBatch(value: SchemaQueryResultBatch): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("batch")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBatch: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("batch")(js.undefined)
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
  }
  
}

