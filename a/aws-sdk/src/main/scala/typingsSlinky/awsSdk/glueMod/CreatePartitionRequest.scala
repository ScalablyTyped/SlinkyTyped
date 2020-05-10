package typingsSlinky.awsSdk.glueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreatePartitionRequest extends js.Object {
  /**
    * The AWS account ID of the catalog in which the partition is to be created.
    */
  var CatalogId: js.UndefOr[CatalogIdString] = js.native
  /**
    * The name of the metadata database in which the partition is to be created.
    */
  var DatabaseName: NameString = js.native
  /**
    * A PartitionInput structure defining the partition to be created.
    */
  var PartitionInput: typingsSlinky.awsSdk.glueMod.PartitionInput = js.native
  /**
    * The name of the metadata table in which the partition is to be created.
    */
  var TableName: NameString = js.native
}

object CreatePartitionRequest {
  @scala.inline
  def apply(DatabaseName: NameString, PartitionInput: PartitionInput, TableName: NameString): CreatePartitionRequest = {
    val __obj = js.Dynamic.literal(DatabaseName = DatabaseName.asInstanceOf[js.Any], PartitionInput = PartitionInput.asInstanceOf[js.Any], TableName = TableName.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreatePartitionRequest]
  }
  @scala.inline
  implicit class CreatePartitionRequestOps[Self <: CreatePartitionRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDatabaseName(value: NameString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DatabaseName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPartitionInput(value: PartitionInput): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PartitionInput")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTableName(value: NameString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TableName")(value.asInstanceOf[js.Any])
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

