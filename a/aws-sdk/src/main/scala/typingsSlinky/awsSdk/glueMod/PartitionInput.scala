package typingsSlinky.awsSdk.glueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PartitionInput extends js.Object {
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
    * The values of the partition. Although this parameter is not required by the SDK, you must specify this parameter for a valid input. The values for the keys for the new partition must be passed as an array of String objects that must be ordered in the same order as the partition keys appearing in the Amazon S3 prefix. Otherwise AWS Glue will add the values to the wrong keys.
    */
  var Values: js.UndefOr[ValueStringList] = js.native
}

object PartitionInput {
  @scala.inline
  def apply(): PartitionInput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartitionInput]
  }
  @scala.inline
  implicit class PartitionInputOps[Self <: PartitionInput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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

