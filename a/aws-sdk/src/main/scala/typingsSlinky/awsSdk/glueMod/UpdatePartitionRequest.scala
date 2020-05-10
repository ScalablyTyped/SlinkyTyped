package typingsSlinky.awsSdk.glueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdatePartitionRequest extends js.Object {
  /**
    * The ID of the Data Catalog where the partition to be updated resides. If none is provided, the AWS account ID is used by default.
    */
  var CatalogId: js.UndefOr[CatalogIdString] = js.native
  /**
    * The name of the catalog database in which the table in question resides.
    */
  var DatabaseName: NameString = js.native
  /**
    * The new partition object to update the partition to.
    */
  var PartitionInput: typingsSlinky.awsSdk.glueMod.PartitionInput = js.native
  /**
    * A list of the values defining the partition.
    */
  var PartitionValueList: BoundedPartitionValueList = js.native
  /**
    * The name of the table in which the partition to be updated is located.
    */
  var TableName: NameString = js.native
}

object UpdatePartitionRequest {
  @scala.inline
  def apply(
    DatabaseName: NameString,
    PartitionInput: PartitionInput,
    PartitionValueList: BoundedPartitionValueList,
    TableName: NameString
  ): UpdatePartitionRequest = {
    val __obj = js.Dynamic.literal(DatabaseName = DatabaseName.asInstanceOf[js.Any], PartitionInput = PartitionInput.asInstanceOf[js.Any], PartitionValueList = PartitionValueList.asInstanceOf[js.Any], TableName = TableName.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdatePartitionRequest]
  }
  @scala.inline
  implicit class UpdatePartitionRequestOps[Self <: UpdatePartitionRequest] (val x: Self) extends AnyVal {
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
    def withPartitionValueList(value: BoundedPartitionValueList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PartitionValueList")(value.asInstanceOf[js.Any])
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

