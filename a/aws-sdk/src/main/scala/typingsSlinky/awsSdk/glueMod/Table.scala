package typingsSlinky.awsSdk.glueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Table extends js.Object {
  /**
    * The time when the table definition was created in the Data Catalog.
    */
  var CreateTime: js.UndefOr[js.Date] = js.native
  /**
    * The person or entity who created the table.
    */
  var CreatedBy: js.UndefOr[NameString] = js.native
  /**
    * The name of the database where the table metadata resides. For Hive compatibility, this must be all lowercase.
    */
  var DatabaseName: js.UndefOr[NameString] = js.native
  /**
    * A description of the table.
    */
  var Description: js.UndefOr[DescriptionString] = js.native
  /**
    * Indicates whether the table has been registered with AWS Lake Formation.
    */
  var IsRegisteredWithLakeFormation: js.UndefOr[Boolean] = js.native
  /**
    * The last time that the table was accessed. This is usually taken from HDFS, and might not be reliable.
    */
  var LastAccessTime: js.UndefOr[js.Date] = js.native
  /**
    * The last time that column statistics were computed for this table.
    */
  var LastAnalyzedTime: js.UndefOr[js.Date] = js.native
  /**
    * The table name. For Hive compatibility, this must be entirely lowercase.
    */
  var Name: NameString = js.native
  /**
    * The owner of the table.
    */
  var Owner: js.UndefOr[NameString] = js.native
  /**
    * These key-value pairs define properties associated with the table.
    */
  var Parameters: js.UndefOr[ParametersMap] = js.native
  /**
    * A list of columns by which the table is partitioned. Only primitive types are supported as partition keys. When you create a table used by Amazon Athena, and you do not specify any partitionKeys, you must at least set the value of partitionKeys to an empty list. For example:  "PartitionKeys": [] 
    */
  var PartitionKeys: js.UndefOr[ColumnList] = js.native
  /**
    * The retention time for this table.
    */
  var Retention: js.UndefOr[NonNegativeInteger] = js.native
  /**
    * A storage descriptor containing information about the physical storage of this table.
    */
  var StorageDescriptor: js.UndefOr[typingsSlinky.awsSdk.glueMod.StorageDescriptor] = js.native
  /**
    * The type of this table (EXTERNAL_TABLE, VIRTUAL_VIEW, etc.).
    */
  var TableType: js.UndefOr[TableTypeString] = js.native
  /**
    * The last time that the table was updated.
    */
  var UpdateTime: js.UndefOr[js.Date] = js.native
  /**
    * If the table is a view, the expanded text of the view; otherwise null.
    */
  var ViewExpandedText: js.UndefOr[ViewTextString] = js.native
  /**
    * If the table is a view, the original text of the view; otherwise null.
    */
  var ViewOriginalText: js.UndefOr[ViewTextString] = js.native
}

object Table {
  @scala.inline
  def apply(Name: NameString): Table = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Table]
  }
  @scala.inline
  implicit class TableOps[Self <: Table] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withName(value: NameString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCreateTime(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CreateTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCreateTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CreateTime")(js.undefined)
        ret
    }
    @scala.inline
    def withCreatedBy(value: NameString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CreatedBy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCreatedBy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CreatedBy")(js.undefined)
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
    def withDescription(value: DescriptionString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDescription: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Description")(js.undefined)
        ret
    }
    @scala.inline
    def withIsRegisteredWithLakeFormation(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IsRegisteredWithLakeFormation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsRegisteredWithLakeFormation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IsRegisteredWithLakeFormation")(js.undefined)
        ret
    }
    @scala.inline
    def withLastAccessTime(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LastAccessTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLastAccessTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LastAccessTime")(js.undefined)
        ret
    }
    @scala.inline
    def withLastAnalyzedTime(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LastAnalyzedTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLastAnalyzedTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LastAnalyzedTime")(js.undefined)
        ret
    }
    @scala.inline
    def withOwner(value: NameString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Owner")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOwner: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Owner")(js.undefined)
        ret
    }
    @scala.inline
    def withParameters(value: ParametersMap): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Parameters")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutParameters: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Parameters")(js.undefined)
        ret
    }
    @scala.inline
    def withPartitionKeys(value: ColumnList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PartitionKeys")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPartitionKeys: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PartitionKeys")(js.undefined)
        ret
    }
    @scala.inline
    def withRetention(value: NonNegativeInteger): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Retention")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRetention: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Retention")(js.undefined)
        ret
    }
    @scala.inline
    def withStorageDescriptor(value: StorageDescriptor): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StorageDescriptor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStorageDescriptor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StorageDescriptor")(js.undefined)
        ret
    }
    @scala.inline
    def withTableType(value: TableTypeString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TableType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTableType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TableType")(js.undefined)
        ret
    }
    @scala.inline
    def withUpdateTime(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UpdateTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUpdateTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UpdateTime")(js.undefined)
        ret
    }
    @scala.inline
    def withViewExpandedText(value: ViewTextString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ViewExpandedText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutViewExpandedText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ViewExpandedText")(js.undefined)
        ret
    }
    @scala.inline
    def withViewOriginalText(value: ViewTextString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ViewOriginalText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutViewOriginalText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ViewOriginalText")(js.undefined)
        ret
    }
  }
  
}

