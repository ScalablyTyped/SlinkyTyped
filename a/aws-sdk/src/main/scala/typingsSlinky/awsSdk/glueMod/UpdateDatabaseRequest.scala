package typingsSlinky.awsSdk.glueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateDatabaseRequest extends js.Object {
  /**
    * The ID of the Data Catalog in which the metadata database resides. If none is provided, the AWS account ID is used by default.
    */
  var CatalogId: js.UndefOr[CatalogIdString] = js.native
  /**
    * A DatabaseInput object specifying the new definition of the metadata database in the catalog.
    */
  var DatabaseInput: typingsSlinky.awsSdk.glueMod.DatabaseInput = js.native
  /**
    * The name of the database to update in the catalog. For Hive compatibility, this is folded to lowercase.
    */
  var Name: NameString = js.native
}

object UpdateDatabaseRequest {
  @scala.inline
  def apply(DatabaseInput: DatabaseInput, Name: NameString): UpdateDatabaseRequest = {
    val __obj = js.Dynamic.literal(DatabaseInput = DatabaseInput.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateDatabaseRequest]
  }
  @scala.inline
  implicit class UpdateDatabaseRequestOps[Self <: UpdateDatabaseRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDatabaseInput(value: DatabaseInput): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DatabaseInput")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: NameString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCatalogId(value: CatalogIdString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CatalogId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCatalogId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CatalogId")(js.undefined)
        ret
    }
  }
  
}

