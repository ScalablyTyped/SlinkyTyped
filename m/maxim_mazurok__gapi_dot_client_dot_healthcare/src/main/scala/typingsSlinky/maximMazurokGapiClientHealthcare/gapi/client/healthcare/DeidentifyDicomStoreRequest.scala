package typingsSlinky.maximMazurokGapiClientHealthcare.gapi.client.healthcare

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeidentifyDicomStoreRequest extends StObject {
  
  /** De-identify configuration. */
  var config: js.UndefOr[DeidentifyConfig] = js.native
  
  /**
    * The name of the DICOM store to create and write the redacted data to. For example,
    * `projects/{project_id}/locations/{location_id}/datasets/{dataset_id}/dicomStores/{dicom_store_id}`. * The destination dataset must exist. * The source dataset and destination
    * dataset must both reside in the same project. De-identifying data across multiple projects is not supported. * The destination DICOM store must not exist. * The caller must have the
    * necessary permissions to create the destination DICOM store.
    */
  var destinationStore: js.UndefOr[String] = js.native
  
  /** Filter configuration. */
  var filterConfig: js.UndefOr[DicomFilterConfig] = js.native
}
object DeidentifyDicomStoreRequest {
  
  @scala.inline
  def apply(): DeidentifyDicomStoreRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeidentifyDicomStoreRequest]
  }
  
  @scala.inline
  implicit class DeidentifyDicomStoreRequestMutableBuilder[Self <: DeidentifyDicomStoreRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConfig(value: DeidentifyConfig): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConfigUndefined: Self = StObject.set(x, "config", js.undefined)
    
    @scala.inline
    def setDestinationStore(value: String): Self = StObject.set(x, "destinationStore", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDestinationStoreUndefined: Self = StObject.set(x, "destinationStore", js.undefined)
    
    @scala.inline
    def setFilterConfig(value: DicomFilterConfig): Self = StObject.set(x, "filterConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilterConfigUndefined: Self = StObject.set(x, "filterConfig", js.undefined)
  }
}
