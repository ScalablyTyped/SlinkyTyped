package typingsSlinky.maximMazurokGapiClientHealthcare.gapi.client.healthcare

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeidentifyFhirStoreRequest extends StObject {
  
  /** Deidentify configuration. */
  var config: js.UndefOr[DeidentifyConfig] = js.native
  
  /**
    * The name of the FHIR store to create and write the redacted data to. For example, `projects/{project_id}/locations/{location_id}/datasets/{dataset_id}/fhirStores/{fhir_store_id}`. *
    * The destination dataset must exist. * The source dataset and destination dataset must both reside in the same project. De-identifying data across multiple projects is not supported.
    * * The destination FHIR store must exist. * The caller must have the healthcare.fhirResources.update permission to write to the destination FHIR store.
    */
  var destinationStore: js.UndefOr[String] = js.native
  
  /** A filter specifying the resources to include in the output. If not specified, all resources are included in the output. */
  var resourceFilter: js.UndefOr[FhirFilter] = js.native
}
object DeidentifyFhirStoreRequest {
  
  @scala.inline
  def apply(): DeidentifyFhirStoreRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeidentifyFhirStoreRequest]
  }
  
  @scala.inline
  implicit class DeidentifyFhirStoreRequestMutableBuilder[Self <: DeidentifyFhirStoreRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConfig(value: DeidentifyConfig): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConfigUndefined: Self = StObject.set(x, "config", js.undefined)
    
    @scala.inline
    def setDestinationStore(value: String): Self = StObject.set(x, "destinationStore", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDestinationStoreUndefined: Self = StObject.set(x, "destinationStore", js.undefined)
    
    @scala.inline
    def setResourceFilter(value: FhirFilter): Self = StObject.set(x, "resourceFilter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceFilterUndefined: Self = StObject.set(x, "resourceFilter", js.undefined)
  }
}
