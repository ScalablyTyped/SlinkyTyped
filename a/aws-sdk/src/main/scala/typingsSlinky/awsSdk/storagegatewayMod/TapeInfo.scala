package typingsSlinky.awsSdk.storagegatewayMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TapeInfo extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the gateway. Use the ListGateways operation to return a list of gateways for your account and AWS Region.
    */
  var GatewayARN: js.UndefOr[typingsSlinky.awsSdk.storagegatewayMod.GatewayARN] = js.native
  
  /**
    * The date that the tape entered the custom tape pool with tape retention lock enabled.
    */
  var PoolEntryDate: js.UndefOr[js.Date] = js.native
  
  /**
    * The ID of the pool that you want to add your tape to for archiving. The tape in this pool is archived in the S3 storage class that is associated with the pool. When you use your backup application to eject the tape, the tape is archived directly into the storage class (S3 Glacier or S3 Glacier Deep Archive) that corresponds to the pool. Valid Values: GLACIER | DEEP_ARCHIVE 
    */
  var PoolId: js.UndefOr[typingsSlinky.awsSdk.storagegatewayMod.PoolId] = js.native
  
  /**
    * The date that the tape became subject to tape retention lock.
    */
  var RetentionStartDate: js.UndefOr[js.Date] = js.native
  
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
  implicit class TapeInfoMutableBuilder[Self <: TapeInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGatewayARN(value: GatewayARN): Self = StObject.set(x, "GatewayARN", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGatewayARNUndefined: Self = StObject.set(x, "GatewayARN", js.undefined)
    
    @scala.inline
    def setPoolEntryDate(value: js.Date): Self = StObject.set(x, "PoolEntryDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPoolEntryDateUndefined: Self = StObject.set(x, "PoolEntryDate", js.undefined)
    
    @scala.inline
    def setPoolId(value: PoolId): Self = StObject.set(x, "PoolId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPoolIdUndefined: Self = StObject.set(x, "PoolId", js.undefined)
    
    @scala.inline
    def setRetentionStartDate(value: js.Date): Self = StObject.set(x, "RetentionStartDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRetentionStartDateUndefined: Self = StObject.set(x, "RetentionStartDate", js.undefined)
    
    @scala.inline
    def setTapeARN(value: TapeARN): Self = StObject.set(x, "TapeARN", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTapeARNUndefined: Self = StObject.set(x, "TapeARN", js.undefined)
    
    @scala.inline
    def setTapeBarcode(value: TapeBarcode): Self = StObject.set(x, "TapeBarcode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTapeBarcodeUndefined: Self = StObject.set(x, "TapeBarcode", js.undefined)
    
    @scala.inline
    def setTapeSizeInBytes(value: TapeSize): Self = StObject.set(x, "TapeSizeInBytes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTapeSizeInBytesUndefined: Self = StObject.set(x, "TapeSizeInBytes", js.undefined)
    
    @scala.inline
    def setTapeStatus(value: TapeStatus): Self = StObject.set(x, "TapeStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTapeStatusUndefined: Self = StObject.set(x, "TapeStatus", js.undefined)
  }
}
