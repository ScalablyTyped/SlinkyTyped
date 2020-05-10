package typingsSlinky.googleapis.spannerV1Mod.spannerV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A modification to one or more Cloud Spanner rows.  Mutations can be applied
  * to a Cloud Spanner database by sending them in a Commit call.
  */
@js.native
trait SchemaMutation extends js.Object {
  /**
    * Delete rows from a table. Succeeds whether or not the named rows were
    * present.
    */
  var delete: js.UndefOr[SchemaDelete] = js.native
  /**
    * Insert new rows in a table. If any of the rows already exist, the write
    * or transaction fails with error `ALREADY_EXISTS`.
    */
  var insert: js.UndefOr[SchemaWrite] = js.native
  /**
    * Like insert, except that if the row already exists, then its column
    * values are overwritten with the ones provided. Any column values not
    * explicitly written are preserved.
    */
  var insertOrUpdate: js.UndefOr[SchemaWrite] = js.native
  /**
    * Like insert, except that if the row already exists, it is deleted, and
    * the column values provided are inserted instead. Unlike insert_or_update,
    * this means any values not explicitly written become `NULL`.
    */
  var replace: js.UndefOr[SchemaWrite] = js.native
  /**
    * Update existing rows in a table. If any of the rows does not already
    * exist, the transaction fails with error `NOT_FOUND`.
    */
  var update: js.UndefOr[SchemaWrite] = js.native
}

object SchemaMutation {
  @scala.inline
  def apply(): SchemaMutation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaMutation]
  }
  @scala.inline
  implicit class SchemaMutationOps[Self <: SchemaMutation] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDelete(value: SchemaDelete): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delete")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDelete: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delete")(js.undefined)
        ret
    }
    @scala.inline
    def withInsert(value: SchemaWrite): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insert")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInsert: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insert")(js.undefined)
        ret
    }
    @scala.inline
    def withInsertOrUpdate(value: SchemaWrite): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insertOrUpdate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInsertOrUpdate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insertOrUpdate")(js.undefined)
        ret
    }
    @scala.inline
    def withReplace(value: SchemaWrite): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("replace")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReplace: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("replace")(js.undefined)
        ret
    }
    @scala.inline
    def withUpdate(value: SchemaWrite): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("update")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUpdate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("update")(js.undefined)
        ret
    }
  }
  
}

