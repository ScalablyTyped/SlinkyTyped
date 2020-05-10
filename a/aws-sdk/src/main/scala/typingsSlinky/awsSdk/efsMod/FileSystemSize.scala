package typingsSlinky.awsSdk.efsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FileSystemSize extends js.Object {
  /**
    * The time at which the size of data, returned in the Value field, was determined. The value is the integer number of seconds since 1970-01-01T00:00:00Z.
    */
  var Timestamp: js.UndefOr[js.Date] = js.native
  /**
    * The latest known metered size (in bytes) of data stored in the file system.
    */
  var Value: FileSystemSizeValue = js.native
  /**
    * The latest known metered size (in bytes) of data stored in the Infrequent Access storage class.
    */
  var ValueInIA: js.UndefOr[FileSystemNullableSizeValue] = js.native
  /**
    * The latest known metered size (in bytes) of data stored in the Standard storage class.
    */
  var ValueInStandard: js.UndefOr[FileSystemNullableSizeValue] = js.native
}

object FileSystemSize {
  @scala.inline
  def apply(Value: FileSystemSizeValue): FileSystemSize = {
    val __obj = js.Dynamic.literal(Value = Value.asInstanceOf[js.Any])
    __obj.asInstanceOf[FileSystemSize]
  }
  @scala.inline
  implicit class FileSystemSizeOps[Self <: FileSystemSize] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withValue(value: FileSystemSizeValue): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Value")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTimestamp(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Timestamp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTimestamp: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Timestamp")(js.undefined)
        ret
    }
    @scala.inline
    def withValueInIA(value: FileSystemNullableSizeValue): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ValueInIA")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValueInIA: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ValueInIA")(js.undefined)
        ret
    }
    @scala.inline
    def withValueInStandard(value: FileSystemNullableSizeValue): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ValueInStandard")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValueInStandard: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ValueInStandard")(js.undefined)
        ret
    }
  }
  
}

