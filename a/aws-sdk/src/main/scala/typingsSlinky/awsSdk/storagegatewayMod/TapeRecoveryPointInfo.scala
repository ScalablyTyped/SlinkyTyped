package typingsSlinky.awsSdk.storagegatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TapeRecoveryPointInfo extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the virtual tape.
    */
  var TapeARN: js.UndefOr[typingsSlinky.awsSdk.storagegatewayMod.TapeARN] = js.native
  /**
    * The time when the point-in-time view of the virtual tape was replicated for later recovery. The default time stamp format of the tape recovery point time is in the ISO8601 extended YYYY-MM-DD'T'HH:MM:SS'Z' format.
    */
  var TapeRecoveryPointTime: js.UndefOr[js.Date] = js.native
  /**
    * The size, in bytes, of the virtual tapes to recover.
    */
  var TapeSizeInBytes: js.UndefOr[TapeSize] = js.native
  /**
    * The status of the virtual tapes.
    */
  var TapeStatus: js.UndefOr[TapeRecoveryPointStatus] = js.native
}

object TapeRecoveryPointInfo {
  @scala.inline
  def apply(): TapeRecoveryPointInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TapeRecoveryPointInfo]
  }
  @scala.inline
  implicit class TapeRecoveryPointInfoOps[Self <: TapeRecoveryPointInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTapeARN(value: TapeARN): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TapeARN")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTapeARN: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TapeARN")(js.undefined)
        ret
    }
    @scala.inline
    def withTapeRecoveryPointTime(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TapeRecoveryPointTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTapeRecoveryPointTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TapeRecoveryPointTime")(js.undefined)
        ret
    }
    @scala.inline
    def withTapeSizeInBytes(value: TapeSize): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TapeSizeInBytes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTapeSizeInBytes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TapeSizeInBytes")(js.undefined)
        ret
    }
    @scala.inline
    def withTapeStatus(value: TapeRecoveryPointStatus): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TapeStatus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTapeStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TapeStatus")(js.undefined)
        ret
    }
  }
  
}

