package typingsSlinky.awsSdk.cognitosyncMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RecordPatch extends js.Object {
  /**
    * The last modified date of the client device.
    */
  var DeviceLastModifiedDate: js.UndefOr[js.Date] = js.native
  /**
    * The key associated with the record patch.
    */
  var Key: RecordKey = js.native
  /**
    * An operation, either replace or remove.
    */
  var Op: Operation = js.native
  /**
    * Last known server sync count for this record. Set to 0 if unknown.
    */
  var SyncCount: Long = js.native
  /**
    * The value associated with the record patch.
    */
  var Value: js.UndefOr[RecordValue] = js.native
}

object RecordPatch {
  @scala.inline
  def apply(Key: RecordKey, Op: Operation, SyncCount: Long): RecordPatch = {
    val __obj = js.Dynamic.literal(Key = Key.asInstanceOf[js.Any], Op = Op.asInstanceOf[js.Any], SyncCount = SyncCount.asInstanceOf[js.Any])
    __obj.asInstanceOf[RecordPatch]
  }
  @scala.inline
  implicit class RecordPatchOps[Self <: RecordPatch] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withKey(value: RecordKey): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Key")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOp(value: Operation): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Op")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSyncCount(value: Long): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SyncCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDeviceLastModifiedDate(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DeviceLastModifiedDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeviceLastModifiedDate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DeviceLastModifiedDate")(js.undefined)
        ret
    }
    @scala.inline
    def withValue(value: RecordValue): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Value")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Value")(js.undefined)
        ret
    }
  }
  
}

