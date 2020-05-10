package typingsSlinky.awsSdk.lakeformationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TableWithColumnsResource extends js.Object {
  /**
    * The list of column names for the table. At least one of ColumnNames or ColumnWildcard is required.
    */
  var ColumnNames: js.UndefOr[typingsSlinky.awsSdk.lakeformationMod.ColumnNames] = js.native
  /**
    * A wildcard specified by a ColumnWildcard object. At least one of ColumnNames or ColumnWildcard is required.
    */
  var ColumnWildcard: js.UndefOr[typingsSlinky.awsSdk.lakeformationMod.ColumnWildcard] = js.native
  /**
    * The name of the database for the table with columns resource. Unique to the Data Catalog. A database is a set of associated table definitions organized into a logical group. You can Grant and Revoke database privileges to a principal. 
    */
  var DatabaseName: js.UndefOr[NameString] = js.native
  /**
    * The name of the table resource. A table is a metadata definition that represents your data. You can Grant and Revoke table privileges to a principal. 
    */
  var Name: js.UndefOr[NameString] = js.native
}

object TableWithColumnsResource {
  @scala.inline
  def apply(): TableWithColumnsResource = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TableWithColumnsResource]
  }
  @scala.inline
  implicit class TableWithColumnsResourceOps[Self <: TableWithColumnsResource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withColumnNames(value: ColumnNames): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ColumnNames")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColumnNames: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ColumnNames")(js.undefined)
        ret
    }
    @scala.inline
    def withColumnWildcard(value: ColumnWildcard): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ColumnWildcard")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColumnWildcard: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ColumnWildcard")(js.undefined)
        ret
    }
    @scala.inline
    def withDatabaseName(value: NameString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DatabaseName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDatabaseName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DatabaseName")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: NameString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Name")(js.undefined)
        ret
    }
  }
  
}

