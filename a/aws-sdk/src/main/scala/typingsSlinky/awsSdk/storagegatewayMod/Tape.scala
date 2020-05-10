package typingsSlinky.awsSdk.storagegatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Tape extends js.Object {
  var KMSKey: js.UndefOr[typingsSlinky.awsSdk.storagegatewayMod.KMSKey] = js.native
  /**
    * The ID of the pool that contains tapes that will be archived. The tapes in this pool are archived in the S3 storage class that is associated with the pool. When you use your backup application to eject the tape, the tape is archived directly into the storage class (Glacier or Deep Archive) that corresponds to the pool. Valid values: "GLACIER", "DEEP_ARCHIVE"
    */
  var PoolId: js.UndefOr[typingsSlinky.awsSdk.storagegatewayMod.PoolId] = js.native
  /**
    * For archiving virtual tapes, indicates how much data remains to be uploaded before archiving is complete. Range: 0 (not started) to 100 (complete).
    */
  var Progress: js.UndefOr[DoubleObject] = js.native
  /**
    * The Amazon Resource Name (ARN) of the virtual tape.
    */
  var TapeARN: js.UndefOr[typingsSlinky.awsSdk.storagegatewayMod.TapeARN] = js.native
  /**
    * The barcode that identifies a specific virtual tape.
    */
  var TapeBarcode: js.UndefOr[typingsSlinky.awsSdk.storagegatewayMod.TapeBarcode] = js.native
  /**
    * The date the virtual tape was created.
    */
  var TapeCreatedDate: js.UndefOr[js.Date] = js.native
  /**
    * The size, in bytes, of the virtual tape capacity.
    */
  var TapeSizeInBytes: js.UndefOr[TapeSize] = js.native
  /**
    * The current state of the virtual tape.
    */
  var TapeStatus: js.UndefOr[typingsSlinky.awsSdk.storagegatewayMod.TapeStatus] = js.native
  /**
    * The size, in bytes, of data stored on the virtual tape.  This value is not available for tapes created prior to May 13, 2015. 
    */
  var TapeUsedInBytes: js.UndefOr[TapeUsage] = js.native
  /**
    * The virtual tape library (VTL) device that the virtual tape is associated with.
    */
  var VTLDevice: js.UndefOr[VTLDeviceARN] = js.native
}

object Tape {
  @scala.inline
  def apply(): Tape = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Tape]
  }
  @scala.inline
  implicit class TapeOps[Self <: Tape] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withKMSKey(value: KMSKey): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("KMSKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKMSKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("KMSKey")(js.undefined)
        ret
    }
    @scala.inline
    def withPoolId(value: PoolId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PoolId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPoolId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PoolId")(js.undefined)
        ret
    }
    @scala.inline
    def withProgress(value: DoubleObject): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Progress")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProgress: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Progress")(js.undefined)
        ret
    }
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
    def withTapeBarcode(value: TapeBarcode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TapeBarcode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTapeBarcode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TapeBarcode")(js.undefined)
        ret
    }
    @scala.inline
    def withTapeCreatedDate(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TapeCreatedDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTapeCreatedDate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TapeCreatedDate")(js.undefined)
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
    def withTapeStatus(value: TapeStatus): Self = {
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
    @scala.inline
    def withTapeUsedInBytes(value: TapeUsage): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TapeUsedInBytes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTapeUsedInBytes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TapeUsedInBytes")(js.undefined)
        ret
    }
    @scala.inline
    def withVTLDevice(value: VTLDeviceARN): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("VTLDevice")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVTLDevice: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("VTLDevice")(js.undefined)
        ret
    }
  }
  
}

