package typingsSlinky.awsSdk.storagegatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateTapeWithBarcodeInput extends js.Object {
  /**
    * The unique Amazon Resource Name (ARN) that represents the gateway to associate the virtual tape with. Use the ListGateways operation to return a list of gateways for your account and AWS Region.
    */
  var GatewayARN: typingsSlinky.awsSdk.storagegatewayMod.GatewayARN = js.native
  /**
    * True to use Amazon S3 server side encryption with your own AWS KMS key, or false to use a key managed by Amazon S3. Optional.
    */
  var KMSEncrypted: js.UndefOr[Boolean] = js.native
  /**
    * The Amazon Resource Name (ARN) of the AWS KMS Key used for Amazon S3 server side encryption. This value can only be set when KMSEncrypted is true. Optional.
    */
  var KMSKey: js.UndefOr[typingsSlinky.awsSdk.storagegatewayMod.KMSKey] = js.native
  /**
    * The ID of the pool that you want to add your tape to for archiving. The tape in this pool is archived in the S3 storage class that is associated with the pool. When you use your backup application to eject the tape, the tape is archived directly into the storage class (Glacier or Deep Archive) that corresponds to the pool. Valid values: "GLACIER", "DEEP_ARCHIVE"
    */
  var PoolId: js.UndefOr[typingsSlinky.awsSdk.storagegatewayMod.PoolId] = js.native
  /**
    * A list of up to 50 tags that can be assigned to a virtual tape that has a barcode. Each tag is a key-value pair.  Valid characters for key and value are letters, spaces, and numbers representable in UTF-8 format, and the following special characters: + - = . _ : / @. The maximum length of a tag's key is 128 characters, and the maximum length for a tag's value is 256. 
    */
  var Tags: js.UndefOr[typingsSlinky.awsSdk.storagegatewayMod.Tags] = js.native
  /**
    * The barcode that you want to assign to the tape.  Barcodes cannot be reused. This includes barcodes used for tapes that have been deleted. 
    */
  var TapeBarcode: typingsSlinky.awsSdk.storagegatewayMod.TapeBarcode = js.native
  /**
    * The size, in bytes, of the virtual tape that you want to create.  The size must be aligned by gigabyte (1024*1024*1024 byte). 
    */
  var TapeSizeInBytes: TapeSize = js.native
}

object CreateTapeWithBarcodeInput {
  @scala.inline
  def apply(GatewayARN: GatewayARN, TapeBarcode: TapeBarcode, TapeSizeInBytes: TapeSize): CreateTapeWithBarcodeInput = {
    val __obj = js.Dynamic.literal(GatewayARN = GatewayARN.asInstanceOf[js.Any], TapeBarcode = TapeBarcode.asInstanceOf[js.Any], TapeSizeInBytes = TapeSizeInBytes.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateTapeWithBarcodeInput]
  }
  @scala.inline
  implicit class CreateTapeWithBarcodeInputOps[Self <: CreateTapeWithBarcodeInput] (val x: Self) extends AnyVal {
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
    def withTapeBarcode(value: TapeBarcode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TapeBarcode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTapeSizeInBytes(value: TapeSize): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TapeSizeInBytes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withKMSEncrypted(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("KMSEncrypted")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKMSEncrypted: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("KMSEncrypted")(js.undefined)
        ret
    }
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
    def withTags(value: Tags): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Tags")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTags: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Tags")(js.undefined)
        ret
    }
  }
  
}

