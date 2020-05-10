package typingsSlinky.awsSdk.glueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Partition extends js.Object {
  /**
    * The time at which the partition was created.
    */
  var CreationTime: js.UndefOr[js.Date] = js.native
  /**
    * The name of the catalog database in which to create the partition.
    */
  var DatabaseName: js.UndefOr[NameString] = js.native
  /**
    * The last time at which the partition was accessed.
    */
  var LastAccessTime: js.UndefOr[js.Date] = js.native
  /**
    * The last time at which column statistics were computed for this partition.
    */
  var LastAnalyzedTime: js.UndefOr[js.Date] = js.native
  /**
    * These key-value pairs define partition parameters.
    */
  var Parameters: js.UndefOr[ParametersMap] = js.native
  /**
    * Provides information about the physical location where the partition is stored.
    */
  var StorageDescriptor: js.UndefOr[typingsSlinky.awsSdk.glueMod.StorageDescriptor] = js.native
  /**
    * The name of the database table in which to create the partition.
    */
  var TableName: js.UndefOr[NameString] = js.native
  /**
    * The values of the partition.
    */
  var Values: js.UndefOr[ValueStringList] = js.native
}

object Partition {
  @scala.inline
  def apply(): Partition = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Partition]
  }
  @scala.inline
  implicit class PartitionOps[Self <: Partition] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCreationTime(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CreationTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCreationTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CreationTime")(js.undefined)
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
    def withTableName(value: NameString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TableName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTableName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TableName")(js.undefined)
        ret
    }
    @scala.inline
    def withValues(value: ValueStringList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Values")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValues: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Values")(js.undefined)
        ret
    }
  }
  
}

