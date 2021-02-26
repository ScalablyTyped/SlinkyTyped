package typingsSlinky.awsSdk.storagegatewayMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Tape extends StObject {
  
  var KMSKey: js.UndefOr[typingsSlinky.awsSdk.storagegatewayMod.KMSKey] = js.native
  
  /**
    * The date that the tape enters a custom tape pool.
    */
  var PoolEntryDate: js.UndefOr[js.Date] = js.native
  
  /**
    * The ID of the pool that contains tapes that will be archived. The tapes in this pool are archived in the S3 storage class that is associated with the pool. When you use your backup application to eject the tape, the tape is archived directly into the storage class (S3 Glacier or S3 Glacier Deep Archive) that corresponds to the pool. Valid Values: GLACIER | DEEP_ARCHIVE 
    */
  var PoolId: js.UndefOr[typingsSlinky.awsSdk.storagegatewayMod.PoolId] = js.native
  
  /**
    * For archiving virtual tapes, indicates how much data remains to be uploaded before archiving is complete. Range: 0 (not started) to 100 (complete).
    */
  var Progress: js.UndefOr[DoubleObject] = js.native
  
  /**
    * The date that the tape is first archived with tape retention lock enabled.
    */
  var RetentionStartDate: js.UndefOr[js.Date] = js.native
  
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
  
  /**
    * If the tape is archived as write-once-read-many (WORM), this value is true.
    */
  var Worm: js.UndefOr[scala.Boolean] = js.native
}
object Tape {
  
  @scala.inline
  def apply(): Tape = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Tape]
  }
  
  @scala.inline
  implicit class TapeMutableBuilder[Self <: Tape] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKMSKey(value: KMSKey): Self = StObject.set(x, "KMSKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKMSKeyUndefined: Self = StObject.set(x, "KMSKey", js.undefined)
    
    @scala.inline
    def setPoolEntryDate(value: js.Date): Self = StObject.set(x, "PoolEntryDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPoolEntryDateUndefined: Self = StObject.set(x, "PoolEntryDate", js.undefined)
    
    @scala.inline
    def setPoolId(value: PoolId): Self = StObject.set(x, "PoolId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPoolIdUndefined: Self = StObject.set(x, "PoolId", js.undefined)
    
    @scala.inline
    def setProgress(value: DoubleObject): Self = StObject.set(x, "Progress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProgressUndefined: Self = StObject.set(x, "Progress", js.undefined)
    
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
    def setTapeCreatedDate(value: js.Date): Self = StObject.set(x, "TapeCreatedDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTapeCreatedDateUndefined: Self = StObject.set(x, "TapeCreatedDate", js.undefined)
    
    @scala.inline
    def setTapeSizeInBytes(value: TapeSize): Self = StObject.set(x, "TapeSizeInBytes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTapeSizeInBytesUndefined: Self = StObject.set(x, "TapeSizeInBytes", js.undefined)
    
    @scala.inline
    def setTapeStatus(value: TapeStatus): Self = StObject.set(x, "TapeStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTapeStatusUndefined: Self = StObject.set(x, "TapeStatus", js.undefined)
    
    @scala.inline
    def setTapeUsedInBytes(value: TapeUsage): Self = StObject.set(x, "TapeUsedInBytes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTapeUsedInBytesUndefined: Self = StObject.set(x, "TapeUsedInBytes", js.undefined)
    
    @scala.inline
    def setVTLDevice(value: VTLDeviceARN): Self = StObject.set(x, "VTLDevice", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVTLDeviceUndefined: Self = StObject.set(x, "VTLDevice", js.undefined)
    
    @scala.inline
    def setWorm(value: scala.Boolean): Self = StObject.set(x, "Worm", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWormUndefined: Self = StObject.set(x, "Worm", js.undefined)
  }
}
