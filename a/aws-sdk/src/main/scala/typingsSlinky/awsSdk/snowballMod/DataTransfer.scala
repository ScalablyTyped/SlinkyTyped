package typingsSlinky.awsSdk.snowballMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DataTransfer extends js.Object {
  /**
    * The number of bytes transferred between a Snowball and Amazon S3.
    */
  var BytesTransferred: js.UndefOr[Long] = js.native
  /**
    * The number of objects transferred between a Snowball and Amazon S3.
    */
  var ObjectsTransferred: js.UndefOr[Long] = js.native
  /**
    * The total bytes of data for a transfer between a Snowball and Amazon S3. This value is set to 0 (zero) until all the keys that will be transferred have been listed.
    */
  var TotalBytes: js.UndefOr[Long] = js.native
  /**
    * The total number of objects for a transfer between a Snowball and Amazon S3. This value is set to 0 (zero) until all the keys that will be transferred have been listed.
    */
  var TotalObjects: js.UndefOr[Long] = js.native
}

object DataTransfer {
  @scala.inline
  def apply(): DataTransfer = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DataTransfer]
  }
  @scala.inline
  implicit class DataTransferOps[Self <: DataTransfer] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBytesTransferred(value: Long): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BytesTransferred")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBytesTransferred: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BytesTransferred")(js.undefined)
        ret
    }
    @scala.inline
    def withObjectsTransferred(value: Long): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ObjectsTransferred")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutObjectsTransferred: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ObjectsTransferred")(js.undefined)
        ret
    }
    @scala.inline
    def withTotalBytes(value: Long): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TotalBytes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTotalBytes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TotalBytes")(js.undefined)
        ret
    }
    @scala.inline
    def withTotalObjects(value: Long): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TotalObjects")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTotalObjects: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TotalObjects")(js.undefined)
        ret
    }
  }
  
}

