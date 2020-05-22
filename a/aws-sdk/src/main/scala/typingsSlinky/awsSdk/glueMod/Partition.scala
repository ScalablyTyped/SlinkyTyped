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
  def apply(
    CreationTime: js.Date = null,
    DatabaseName: NameString = null,
    LastAccessTime: js.Date = null,
    LastAnalyzedTime: js.Date = null,
    Parameters: ParametersMap = null,
    StorageDescriptor: StorageDescriptor = null,
    TableName: NameString = null,
    Values: ValueStringList = null
  ): Partition = {
    val __obj = js.Dynamic.literal()
    if (CreationTime != null) __obj.updateDynamic("CreationTime")(CreationTime.asInstanceOf[js.Any])
    if (DatabaseName != null) __obj.updateDynamic("DatabaseName")(DatabaseName.asInstanceOf[js.Any])
    if (LastAccessTime != null) __obj.updateDynamic("LastAccessTime")(LastAccessTime.asInstanceOf[js.Any])
    if (LastAnalyzedTime != null) __obj.updateDynamic("LastAnalyzedTime")(LastAnalyzedTime.asInstanceOf[js.Any])
    if (Parameters != null) __obj.updateDynamic("Parameters")(Parameters.asInstanceOf[js.Any])
    if (StorageDescriptor != null) __obj.updateDynamic("StorageDescriptor")(StorageDescriptor.asInstanceOf[js.Any])
    if (TableName != null) __obj.updateDynamic("TableName")(TableName.asInstanceOf[js.Any])
    if (Values != null) __obj.updateDynamic("Values")(Values.asInstanceOf[js.Any])
    __obj.asInstanceOf[Partition]
  }
}

