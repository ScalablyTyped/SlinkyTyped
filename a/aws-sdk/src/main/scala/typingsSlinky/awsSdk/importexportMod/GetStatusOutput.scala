package typingsSlinky.awsSdk.importexportMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetStatusOutput extends StObject {
  
  var ArtifactList: js.UndefOr[typingsSlinky.awsSdk.importexportMod.ArtifactList] = js.native
  
  var Carrier: js.UndefOr[typingsSlinky.awsSdk.importexportMod.Carrier] = js.native
  
  var CreationDate: js.UndefOr[js.Date] = js.native
  
  var CurrentManifest: js.UndefOr[typingsSlinky.awsSdk.importexportMod.CurrentManifest] = js.native
  
  var ErrorCount: js.UndefOr[typingsSlinky.awsSdk.importexportMod.ErrorCount] = js.native
  
  var JobId: js.UndefOr[typingsSlinky.awsSdk.importexportMod.JobId] = js.native
  
  var JobType: js.UndefOr[typingsSlinky.awsSdk.importexportMod.JobType] = js.native
  
  var LocationCode: js.UndefOr[typingsSlinky.awsSdk.importexportMod.LocationCode] = js.native
  
  var LocationMessage: js.UndefOr[typingsSlinky.awsSdk.importexportMod.LocationMessage] = js.native
  
  var LogBucket: js.UndefOr[typingsSlinky.awsSdk.importexportMod.LogBucket] = js.native
  
  var LogKey: js.UndefOr[typingsSlinky.awsSdk.importexportMod.LogKey] = js.native
  
  var ProgressCode: js.UndefOr[typingsSlinky.awsSdk.importexportMod.ProgressCode] = js.native
  
  var ProgressMessage: js.UndefOr[typingsSlinky.awsSdk.importexportMod.ProgressMessage] = js.native
  
  var Signature: js.UndefOr[typingsSlinky.awsSdk.importexportMod.Signature] = js.native
  
  var SignatureFileContents: js.UndefOr[Signature] = js.native
  
  var TrackingNumber: js.UndefOr[typingsSlinky.awsSdk.importexportMod.TrackingNumber] = js.native
}
object GetStatusOutput {
  
  @scala.inline
  def apply(): GetStatusOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetStatusOutput]
  }
  
  @scala.inline
  implicit class GetStatusOutputMutableBuilder[Self <: GetStatusOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArtifactList(value: ArtifactList): Self = StObject.set(x, "ArtifactList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArtifactListUndefined: Self = StObject.set(x, "ArtifactList", js.undefined)
    
    @scala.inline
    def setArtifactListVarargs(value: Artifact*): Self = StObject.set(x, "ArtifactList", js.Array(value :_*))
    
    @scala.inline
    def setCarrier(value: Carrier): Self = StObject.set(x, "Carrier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCarrierUndefined: Self = StObject.set(x, "Carrier", js.undefined)
    
    @scala.inline
    def setCreationDate(value: js.Date): Self = StObject.set(x, "CreationDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreationDateUndefined: Self = StObject.set(x, "CreationDate", js.undefined)
    
    @scala.inline
    def setCurrentManifest(value: CurrentManifest): Self = StObject.set(x, "CurrentManifest", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurrentManifestUndefined: Self = StObject.set(x, "CurrentManifest", js.undefined)
    
    @scala.inline
    def setErrorCount(value: ErrorCount): Self = StObject.set(x, "ErrorCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorCountUndefined: Self = StObject.set(x, "ErrorCount", js.undefined)
    
    @scala.inline
    def setJobId(value: JobId): Self = StObject.set(x, "JobId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJobIdUndefined: Self = StObject.set(x, "JobId", js.undefined)
    
    @scala.inline
    def setJobType(value: JobType): Self = StObject.set(x, "JobType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJobTypeUndefined: Self = StObject.set(x, "JobType", js.undefined)
    
    @scala.inline
    def setLocationCode(value: LocationCode): Self = StObject.set(x, "LocationCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocationCodeUndefined: Self = StObject.set(x, "LocationCode", js.undefined)
    
    @scala.inline
    def setLocationMessage(value: LocationMessage): Self = StObject.set(x, "LocationMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocationMessageUndefined: Self = StObject.set(x, "LocationMessage", js.undefined)
    
    @scala.inline
    def setLogBucket(value: LogBucket): Self = StObject.set(x, "LogBucket", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLogBucketUndefined: Self = StObject.set(x, "LogBucket", js.undefined)
    
    @scala.inline
    def setLogKey(value: LogKey): Self = StObject.set(x, "LogKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLogKeyUndefined: Self = StObject.set(x, "LogKey", js.undefined)
    
    @scala.inline
    def setProgressCode(value: ProgressCode): Self = StObject.set(x, "ProgressCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProgressCodeUndefined: Self = StObject.set(x, "ProgressCode", js.undefined)
    
    @scala.inline
    def setProgressMessage(value: ProgressMessage): Self = StObject.set(x, "ProgressMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProgressMessageUndefined: Self = StObject.set(x, "ProgressMessage", js.undefined)
    
    @scala.inline
    def setSignature(value: Signature): Self = StObject.set(x, "Signature", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSignatureFileContents(value: Signature): Self = StObject.set(x, "SignatureFileContents", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSignatureFileContentsUndefined: Self = StObject.set(x, "SignatureFileContents", js.undefined)
    
    @scala.inline
    def setSignatureUndefined: Self = StObject.set(x, "Signature", js.undefined)
    
    @scala.inline
    def setTrackingNumber(value: TrackingNumber): Self = StObject.set(x, "TrackingNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTrackingNumberUndefined: Self = StObject.set(x, "TrackingNumber", js.undefined)
  }
}
