package typingsSlinky.maximMazurokGapiClientDatastore.gapi.client.datastore

import org.scalablytyped.runtime.TopLevel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleDatastoreAdminV1ExportEntitiesRequest extends StObject {
  
  /** Description of what data from the project is included in the export. */
  var entityFilter: js.UndefOr[GoogleDatastoreAdminV1EntityFilter] = js.native
  
  /** Client-assigned labels. */
  var labels: js.UndefOr[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in string ]: string}
    */ typingsSlinky.maximMazurokGapiClientDatastore.maximMazurokGapiClientDatastoreStrings.GoogleDatastoreAdminV1ExportEntitiesRequest with TopLevel[js.Any]
  ] = js.native
  
  /**
    * Required. Location for the export metadata and data files. The full resource URL of the external storage location. Currently, only Google Cloud Storage is supported. So
    * output_url_prefix should be of the form: `gs://BUCKET_NAME[/NAMESPACE_PATH]`, where `BUCKET_NAME` is the name of the Cloud Storage bucket and `NAMESPACE_PATH` is an optional Cloud
    * Storage namespace path (this is not a Cloud Datastore namespace). For more information about Cloud Storage namespace paths, see [Object name
    * considerations](https://cloud.google.com/storage/docs/naming#object-considerations). The resulting files will be nested deeper than the specified URL prefix. The final output URL
    * will be provided in the google.datastore.admin.v1.ExportEntitiesResponse.output_url field. That value should be used for subsequent ImportEntities operations. By nesting the data
    * files deeper, the same Cloud Storage bucket can be used in multiple ExportEntities operations without conflict.
    */
  var outputUrlPrefix: js.UndefOr[String] = js.native
}
object GoogleDatastoreAdminV1ExportEntitiesRequest {
  
  @scala.inline
  def apply(): GoogleDatastoreAdminV1ExportEntitiesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleDatastoreAdminV1ExportEntitiesRequest]
  }
  
  @scala.inline
  implicit class GoogleDatastoreAdminV1ExportEntitiesRequestMutableBuilder[Self <: GoogleDatastoreAdminV1ExportEntitiesRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEntityFilter(value: GoogleDatastoreAdminV1EntityFilter): Self = StObject.set(x, "entityFilter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEntityFilterUndefined: Self = StObject.set(x, "entityFilter", js.undefined)
    
    @scala.inline
    def setLabels(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in string ]: string}
      */ typingsSlinky.maximMazurokGapiClientDatastore.maximMazurokGapiClientDatastoreStrings.GoogleDatastoreAdminV1ExportEntitiesRequest with TopLevel[js.Any]
    ): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelsUndefined: Self = StObject.set(x, "labels", js.undefined)
    
    @scala.inline
    def setOutputUrlPrefix(value: String): Self = StObject.set(x, "outputUrlPrefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutputUrlPrefixUndefined: Self = StObject.set(x, "outputUrlPrefix", js.undefined)
  }
}
