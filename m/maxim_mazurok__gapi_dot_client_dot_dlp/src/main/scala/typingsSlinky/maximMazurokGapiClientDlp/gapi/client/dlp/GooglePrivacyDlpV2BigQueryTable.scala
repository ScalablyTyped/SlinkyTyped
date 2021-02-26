package typingsSlinky.maximMazurokGapiClientDlp.gapi.client.dlp

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GooglePrivacyDlpV2BigQueryTable extends StObject {
  
  /** Dataset ID of the table. */
  var datasetId: js.UndefOr[String] = js.native
  
  /** The Google Cloud Platform project ID of the project containing the table. If omitted, project ID is inferred from the API call. */
  var projectId: js.UndefOr[String] = js.native
  
  /** Name of the table. */
  var tableId: js.UndefOr[String] = js.native
}
object GooglePrivacyDlpV2BigQueryTable {
  
  @scala.inline
  def apply(): GooglePrivacyDlpV2BigQueryTable = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GooglePrivacyDlpV2BigQueryTable]
  }
  
  @scala.inline
  implicit class GooglePrivacyDlpV2BigQueryTableMutableBuilder[Self <: GooglePrivacyDlpV2BigQueryTable] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDatasetId(value: String): Self = StObject.set(x, "datasetId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDatasetIdUndefined: Self = StObject.set(x, "datasetId", js.undefined)
    
    @scala.inline
    def setProjectId(value: String): Self = StObject.set(x, "projectId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProjectIdUndefined: Self = StObject.set(x, "projectId", js.undefined)
    
    @scala.inline
    def setTableId(value: String): Self = StObject.set(x, "tableId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTableIdUndefined: Self = StObject.set(x, "tableId", js.undefined)
  }
}
