package typingsSlinky.awsSdk.storagegatewayMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateTapesInput extends StObject {
  
  /**
    * A unique identifier that you use to retry a request. If you retry a request, use the same ClientToken you specified in the initial request.  Using the same ClientToken prevents creating the tape multiple times. 
    */
  var ClientToken: typingsSlinky.awsSdk.storagegatewayMod.ClientToken = js.native
  
  /**
    * The unique Amazon Resource Name (ARN) that represents the gateway to associate the virtual tapes with. Use the ListGateways operation to return a list of gateways for your account and AWS Region.
    */
  var GatewayARN: typingsSlinky.awsSdk.storagegatewayMod.GatewayARN = js.native
  
  /**
    * Set to true to use Amazon S3 server-side encryption with your own AWS KMS key, or false to use a key managed by Amazon S3. Optional. Valid Values: true | false 
    */
  var KMSEncrypted: js.UndefOr[Boolean] = js.native
  
  /**
    * The Amazon Resource Name (ARN) of a symmetric customer master key (CMK) used for Amazon S3 server-side encryption. Storage Gateway does not support asymmetric CMKs. This value can only be set when KMSEncrypted is true. Optional.
    */
  var KMSKey: js.UndefOr[typingsSlinky.awsSdk.storagegatewayMod.KMSKey] = js.native
  
  /**
    * The number of virtual tapes that you want to create.
    */
  var NumTapesToCreate: typingsSlinky.awsSdk.storagegatewayMod.NumTapesToCreate = js.native
  
  /**
    * The ID of the pool that you want to add your tape to for archiving. The tape in this pool is archived in the S3 storage class that is associated with the pool. When you use your backup application to eject the tape, the tape is archived directly into the storage class (S3 Glacier or S3 Glacier Deep Archive) that corresponds to the pool. Valid Values: GLACIER | DEEP_ARCHIVE 
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
    * The size, in bytes, of the virtual tapes that you want to create.  The size must be aligned by gigabyte (1024*1024*1024 bytes). 
    */
  var TapeSizeInBytes: TapeSize = js.native
  
  /**
    * Set to TRUE if the tape you are creating is to be configured as a write-once-read-many (WORM) tape.
    */
  var Worm: js.UndefOr[scala.Boolean] = js.native
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
  implicit class CreateTapesInputMutableBuilder[Self <: CreateTapesInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClientToken(value: ClientToken): Self = StObject.set(x, "ClientToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGatewayARN(value: GatewayARN): Self = StObject.set(x, "GatewayARN", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKMSEncrypted(value: Boolean): Self = StObject.set(x, "KMSEncrypted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKMSEncryptedUndefined: Self = StObject.set(x, "KMSEncrypted", js.undefined)
    
    @scala.inline
    def setKMSKey(value: KMSKey): Self = StObject.set(x, "KMSKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKMSKeyUndefined: Self = StObject.set(x, "KMSKey", js.undefined)
    
    @scala.inline
    def setNumTapesToCreate(value: NumTapesToCreate): Self = StObject.set(x, "NumTapesToCreate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPoolId(value: PoolId): Self = StObject.set(x, "PoolId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPoolIdUndefined: Self = StObject.set(x, "PoolId", js.undefined)
    
    @scala.inline
    def setTags(value: Tags): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    @scala.inline
    def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value :_*))
    
    @scala.inline
    def setTapeBarcodePrefix(value: TapeBarcodePrefix): Self = StObject.set(x, "TapeBarcodePrefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTapeSizeInBytes(value: TapeSize): Self = StObject.set(x, "TapeSizeInBytes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWorm(value: scala.Boolean): Self = StObject.set(x, "Worm", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWormUndefined: Self = StObject.set(x, "Worm", js.undefined)
  }
}
