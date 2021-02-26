package typingsSlinky.googleapis.healthcareV1beta1Mod.healthcareV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Request to export resources.
  */
@js.native
trait SchemaExportResourcesRequest extends StObject {
  
  /**
    * The BigQuery output destination.  The BigQuery location requires two IAM
    * roles: `roles/bigquery.dataEditor` and `roles/bigquery.jobUser`.  The
    * output will be one BigQuery table per resource type.
    */
  var bigqueryDestination: js.UndefOr[SchemaGoogleCloudHealthcareV1beta1FhirBigQueryDestination] = js.native
  
  /**
    * The Cloud Storage output destination.  The Cloud Storage location
    * requires the `roles/storage.objectAdmin` Cloud IAM role.  The exported
    * outputs are organized by FHIR resource types. The server will create one
    * object per resource type. Each object contains newline delimited JSON,
    * and each line is a FHIR resource.
    */
  var gcsDestination: js.UndefOr[SchemaGoogleCloudHealthcareV1beta1FhirRestGcsDestination] = js.native
}
object SchemaExportResourcesRequest {
  
  @scala.inline
  def apply(): SchemaExportResourcesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaExportResourcesRequest]
  }
  
  @scala.inline
  implicit class SchemaExportResourcesRequestMutableBuilder[Self <: SchemaExportResourcesRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBigqueryDestination(value: SchemaGoogleCloudHealthcareV1beta1FhirBigQueryDestination): Self = StObject.set(x, "bigqueryDestination", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBigqueryDestinationUndefined: Self = StObject.set(x, "bigqueryDestination", js.undefined)
    
    @scala.inline
    def setGcsDestination(value: SchemaGoogleCloudHealthcareV1beta1FhirRestGcsDestination): Self = StObject.set(x, "gcsDestination", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGcsDestinationUndefined: Self = StObject.set(x, "gcsDestination", js.undefined)
  }
}
