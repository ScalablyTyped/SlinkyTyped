package typingsSlinky.awsSdk.storagegatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateTapesInput extends js.Object {
  /**
    * A unique identifier that you use to retry a request. If you retry a request, use the same ClientToken you specified in the initial request.  Using the same ClientToken prevents creating the tape multiple times. 
    */
  var ClientToken: typingsSlinky.awsSdk.storagegatewayMod.ClientToken = js.native
  /**
    * The unique Amazon Resource Name (ARN) that represents the gateway to associate the virtual tapes with. Use the ListGateways operation to return a list of gateways for your account and AWS Region.
    */
  var GatewayARN: typingsSlinky.awsSdk.storagegatewayMod.GatewayARN = js.native
  /**
    * True to use Amazon S3 server side encryption with your own AWS KMS key, or false to use a key managed by Amazon S3. Optional.
    */
  var KMSEncrypted: js.UndefOr[Boolean] = js.native
  /**
    * The Amazon Resource Name (ARN) of the AWS KMS key used for Amazon S3 server side encryption. This value can only be set when KMSEncrypted is true. Optional.
    */
  var KMSKey: js.UndefOr[typingsSlinky.awsSdk.storagegatewayMod.KMSKey] = js.native
  /**
    * The number of virtual tapes that you want to create.
    */
  var NumTapesToCreate: typingsSlinky.awsSdk.storagegatewayMod.NumTapesToCreate = js.native
  /**
    * The ID of the pool that you want to add your tape to for archiving. The tape in this pool is archived in the S3 storage class that is associated with the pool. When you use your backup application to eject the tape, the tape is archived directly into the storage class (Glacier or Deep Archive) that corresponds to the pool. Valid values: "GLACIER", "DEEP_ARCHIVE"
    */
  var PoolId: js.UndefOr[typingsSlinky.awsSdk.storagegatewayMod.PoolId] = js.native
  /**
    * A list of up to 50 tags that can be assigned to a virtual tape. Each tag is a key-value pair.  Valid characters for key and value are letters, spaces, and numbers representable in UTF-8 format, and the following special characters: + - = . _ : / @. The maximum length of a tag's key is 128 characters, and the maximum length for a tag's value is 256. 
    */
  var Tags: js.UndefOr[typingsSlinky.awsSdk.storagegatewayMod.Tags] = js.native
  /**
    * A prefix that you append to the barcode of the virtual tape you are creating. This prefix makes the barcode unique.  The prefix must be 1 to 4 characters in length and must be one of the uppercase letters from A to Z. 
    */
  var TapeBarcodePrefix: typingsSlinky.awsSdk.storagegatewayMod.TapeBarcodePrefix = js.native
  /**
    * The size, in bytes, of the virtual tapes that you want to create.  The size must be aligned by gigabyte (1024*1024*1024 byte). 
    */
  var TapeSizeInBytes: TapeSize = js.native
}

object CreateTapesInput {
  @scala.inline
  def apply(
    ClientToken: ClientToken,
    GatewayARN: GatewayARN,
    NumTapesToCreate: NumTapesToCreate,
    TapeBarcodePrefix: TapeBarcodePrefix,
    TapeSizeInBytes: TapeSize
  ): CreateTapesInput = {
    val __obj = js.Dynamic.literal(ClientToken = ClientToken.asInstanceOf[js.Any], GatewayARN = GatewayARN.asInstanceOf[js.Any], NumTapesToCreate = NumTapesToCreate.asInstanceOf[js.Any], TapeBarcodePrefix = TapeBarcodePrefix.asInstanceOf[js.Any], TapeSizeInBytes = TapeSizeInBytes.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateTapesInput]
  }
  @scala.inline
  implicit class CreateTapesInputOps[Self <: CreateTapesInput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClientToken(value: ClientToken): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ClientToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGatewayARN(value: GatewayARN): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GatewayARN")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNumTapesToCreate(value: NumTapesToCreate): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NumTapesToCreate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTapeBarcodePrefix(value: TapeBarcodePrefix): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TapeBarcodePrefix")(value.asInstanceOf[js.Any])
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

