package typingsSlinky.googleapis.spannerV1Mod.spannerV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The request for PartitionRead
  */
@js.native
trait SchemaPartitionReadRequest extends js.Object {
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
    * index.  It is not an error for the `key_set` to name rows that do not
    * exist in the database. Read yields nothing for nonexistent rows.
    */
  var keySet: js.UndefOr[SchemaKeySet] = js.native
  /**
    * Additional options that affect how many partitions are created.
    */
  var partitionOptions: js.UndefOr[SchemaPartitionOptions] = js.native
  /**
    * Required. The name of the table in the database to be read.
    */
  var table: js.UndefOr[String] = js.native
  /**
    * Read only snapshot transactions are supported, read/write and single use
    * transactions are not.
    */
  var transaction: js.UndefOr[SchemaTransactionSelector] = js.native
}

object SchemaPartitionReadRequest {
  @scala.inline
  def apply(): SchemaPartitionReadRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPartitionReadRequest]
  }
  @scala.inline
  implicit class SchemaPartitionReadRequestOps[Self <: SchemaPartitionReadRequest] (val x: Self) extends AnyVal {
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
    def withPartitionOptions(value: SchemaPartitionOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("partitionOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPartitionOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("partitionOptions")(js.undefined)
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

