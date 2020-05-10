package typingsSlinky.awsSdk.storagegatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TapeInfo extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the gateway. Use the ListGateways operation to return a list of gateways for your account and AWS Region.
    */
  var GatewayARN: js.UndefOr[typingsSlinky.awsSdk.storagegatewayMod.GatewayARN] = js.native
  /**
    * The ID of the pool that you want to add your tape to for archiving. The tape in this pool is archived in the S3 storage class that is associated with the pool. When you use your backup application to eject the tape, the tape is archived directly into the storage class (Glacier or Deep Archive) that corresponds to the pool. Valid values: "GLACIER", "DEEP_ARCHIVE"
    */
  var PoolId: js.UndefOr[typingsSlinky.awsSdk.storagegatewayMod.PoolId] = js.native
  /**
    * The Amazon Resource Name (ARN) of a virtual tape.
    */
  var TapeARN: js.UndefOr[typingsSlinky.awsSdk.storagegatewayMod.TapeARN] = js.native
  /**
    * The barcode that identifies a specific virtual tape.
    */
  var TapeBarcode: js.UndefOr[typingsSlinky.awsSdk.storagegatewayMod.TapeBarcode] = js.native
  /**
    * The size, in bytes, of a virtual tape.
    */
  var TapeSizeInBytes: js.UndefOr[TapeSize] = js.native
  /**
    * The status of the tape.
    */
  var TapeStatus: js.UndefOr[typingsSlinky.awsSdk.storagegatewayMod.TapeStatus] = js.native
}

object TapeInfo {
  @scala.inline
  def apply(): TapeInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TapeInfo]
  }
  @scala.inline
  implicit class TapeInfoOps[Self <: TapeInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGatewayARN(value: GatewayARN): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GatewayARN")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGatewayARN: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GatewayARN")(js.undefined)
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
  }
  
}

