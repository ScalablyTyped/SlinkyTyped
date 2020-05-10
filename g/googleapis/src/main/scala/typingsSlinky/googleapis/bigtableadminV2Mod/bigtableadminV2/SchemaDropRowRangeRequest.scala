package typingsSlinky.googleapis.bigtableadminV2Mod.bigtableadminV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Request message for
  * google.bigtable.admin.v2.BigtableTableAdmin.DropRowRange
  */
@js.native
trait SchemaDropRowRangeRequest extends js.Object {
  /**
    * Delete all rows in the table. Setting this to false is a no-op.
    */
  var deleteAllDataFromTable: js.UndefOr[Boolean] = js.native
  /**
    * Delete all rows that start with this row key prefix. Prefix cannot be
    * zero length.
    */
  var rowKeyPrefix: js.UndefOr[String] = js.native
}

object SchemaDropRowRangeRequest {
  @scala.inline
  def apply(): SchemaDropRowRangeRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDropRowRangeRequest]
  }
  @scala.inline
  implicit class SchemaDropRowRangeRequestOps[Self <: SchemaDropRowRangeRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDeleteAllDataFromTable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deleteAllDataFromTable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeleteAllDataFromTable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deleteAllDataFromTable")(js.undefined)
        ret
    }
    @scala.inline
    def withRowKeyPrefix(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowKeyPrefix")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRowKeyPrefix: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowKeyPrefix")(js.undefined)
        ret
    }
  }
  
}

