package typingsSlinky.maximMazurokGapiClientDlp.gapi.client.dlp

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GooglePrivacyDlpV2RecordKey extends StObject {
  
  var bigQueryKey: js.UndefOr[GooglePrivacyDlpV2BigQueryKey] = js.native
  
  var datastoreKey: js.UndefOr[GooglePrivacyDlpV2DatastoreKey] = js.native
  
  /** Values of identifying columns in the given row. Order of values matches the order of `identifying_fields` specified in the scanning request. */
  var idValues: js.UndefOr[js.Array[String]] = js.native
}
object GooglePrivacyDlpV2RecordKey {
  
  @scala.inline
  def apply(): GooglePrivacyDlpV2RecordKey = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GooglePrivacyDlpV2RecordKey]
  }
  
  @scala.inline
  implicit class GooglePrivacyDlpV2RecordKeyMutableBuilder[Self <: GooglePrivacyDlpV2RecordKey] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBigQueryKey(value: GooglePrivacyDlpV2BigQueryKey): Self = StObject.set(x, "bigQueryKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBigQueryKeyUndefined: Self = StObject.set(x, "bigQueryKey", js.undefined)
    
    @scala.inline
    def setDatastoreKey(value: GooglePrivacyDlpV2DatastoreKey): Self = StObject.set(x, "datastoreKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDatastoreKeyUndefined: Self = StObject.set(x, "datastoreKey", js.undefined)
    
    @scala.inline
    def setIdValues(value: js.Array[String]): Self = StObject.set(x, "idValues", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdValuesUndefined: Self = StObject.set(x, "idValues", js.undefined)
    
    @scala.inline
    def setIdValuesVarargs(value: String*): Self = StObject.set(x, "idValues", js.Array(value :_*))
  }
}
