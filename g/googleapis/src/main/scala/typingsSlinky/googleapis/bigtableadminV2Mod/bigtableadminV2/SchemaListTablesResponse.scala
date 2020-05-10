package typingsSlinky.googleapis.bigtableadminV2Mod.bigtableadminV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Response message for google.bigtable.admin.v2.BigtableTableAdmin.ListTables
  */
@js.native
trait SchemaListTablesResponse extends js.Object {
  /**
    * Set if not all tables could be returned in a single response. Pass this
    * value to `page_token` in another request to get the next page of results.
    */
  var nextPageToken: js.UndefOr[String] = js.native
  /**
    * The tables present in the requested instance.
    */
  var tables: js.UndefOr[js.Array[SchemaTable]] = js.native
}

object SchemaListTablesResponse {
  @scala.inline
  def apply(): SchemaListTablesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListTablesResponse]
  }
  @scala.inline
  implicit class SchemaListTablesResponseOps[Self <: SchemaListTablesResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNextPageToken(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextPageToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNextPageToken: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextPageToken")(js.undefined)
        ret
    }
    @scala.inline
    def withTables(value: js.Array[SchemaTable]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tables")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTables: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tables")(js.undefined)
        ret
    }
  }
  
}

