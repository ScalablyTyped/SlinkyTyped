package typingsSlinky.googleapis.spannerV1Mod.spannerV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The request for Read and StreamingRead.
  */
@js.native
trait SchemaReadRequest extends js.Object {
  /**
    * The columns of table to be returned for each row matching this request.
    */
  var columns: js.UndefOr[js.Array[String]] = js.native
  /**
    * If non-empty, the name of an index on table. This index is used instead
    * of the table primary key when interpreting key_set and sorting result
    * rows. See key_set for further information.
    */
  var index: js.UndefOr[String] = js.native
  /**
    * Required. `key_set` identifies the rows to be yielded. `key_set` names
    * the primary keys of the rows in table to be yielded, unless index is
    * present. If index is present, then key_set instead names index keys in
    * index.  If the partition_token field is empty, rows are yielded in table
    * primary key order (if index is empty) or index key order (if index is
    * non-empty).  If the partition_token field is not empty, rows will be
    * yielded in an unspecified order.  It is not an error for the `key_set` to
    * name rows that do not exist in the database. Read yields nothing for
    * nonexistent rows.
    */
  var keySet: js.UndefOr[SchemaKeySet] = js.native
  /**
    * If greater than zero, only the first `limit` rows are yielded. If `limit`
    * is zero, the default is no limit. A limit cannot be specified if
    * `partition_token` is set.
    */
  var limit: js.UndefOr[String] = js.native
  /**
    * If present, results will be restricted to the specified partition
    * previously created using PartitionRead().    There must be an exact match
    * for the values of fields common to this message and the
    * PartitionReadRequest message used to create this partition_token.
    */
  var partitionToken: js.UndefOr[String] = js.native
  /**
    * If this request is resuming a previously interrupted read, `resume_token`
    * should be copied from the last PartialResultSet yielded before the
    * interruption. Doing this enables the new read to resume where the last
    * read left off. The rest of the request parameters must exactly match the
    * request that yielded this token.
    */
  var resumeToken: js.UndefOr[String] = js.native
  /**
    * Required. The name of the table in the database to be read.
    */
  var table: js.UndefOr[String] = js.native
  /**
    * The transaction to use. If none is provided, the default is a temporary
    * read-only transaction with strong concurrency.
    */
  var transaction: js.UndefOr[SchemaTransactionSelector] = js.native
}

object SchemaReadRequest {
  @scala.inline
  def apply(): SchemaReadRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaReadRequest]
  }
  @scala.inline
  implicit class SchemaReadRequestOps[Self <: SchemaReadRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withColumns(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columns")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColumns: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columns")(js.undefined)
        ret
    }
    @scala.inline
    def withIndex(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("index")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIndex: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("index")(js.undefined)
        ret
    }
    @scala.inline
    def withKeySet(value: SchemaKeySet): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keySet")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKeySet: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keySet")(js.undefined)
        ret
    }
    @scala.inline
    def withLimit(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("limit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLimit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("limit")(js.undefined)
        ret
    }
    @scala.inline
    def withPartitionToken(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("partitionToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPartitionToken: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("partitionToken")(js.undefined)
        ret
    }
    @scala.inline
    def withResumeToken(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resumeToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResumeToken: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resumeToken")(js.undefined)
        ret
    }
    @scala.inline
    def withTable(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("table")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("table")(js.undefined)
        ret
    }
    @scala.inline
    def withTransaction(value: SchemaTransactionSelector): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transaction")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTransaction: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transaction")(js.undefined)
        ret
    }
  }
  
}

