package typingsSlinky.maximMazurokGapiClientDlp.gapi.client.dlp

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GooglePrivacyDlpV2BigQueryOptions extends StObject {
  
  /** References to fields excluded from scanning. This allows you to skip inspection of entire columns which you know have no findings. */
  var excludedFields: js.UndefOr[js.Array[GooglePrivacyDlpV2FieldId]] = js.native
  
  /**
    * Table fields that may uniquely identify a row within the table. When `actions.saveFindings.outputConfig.table` is specified, the values of columns specified here are available in
    * the output table under `location.content_locations.record_location.record_key.id_values`. Nested fields such as `person.birthdate.year` are allowed.
    */
  var identifyingFields: js.UndefOr[js.Array[GooglePrivacyDlpV2FieldId]] = js.native
  
  /**
    * Max number of rows to scan. If the table has more rows than this value, the rest of the rows are omitted. If not set, or if set to 0, all rows will be scanned. Only one of
    * rows_limit and rows_limit_percent can be specified. Cannot be used in conjunction with TimespanConfig.
    */
  var rowsLimit: js.UndefOr[String] = js.native
  
  /**
    * Max percentage of rows to scan. The rest are omitted. The number of rows scanned is rounded down. Must be between 0 and 100, inclusively. Both 0 and 100 means no limit. Defaults to
    * 0. Only one of rows_limit and rows_limit_percent can be specified. Cannot be used in conjunction with TimespanConfig.
    */
  var rowsLimitPercent: js.UndefOr[Double] = js.native
  
  var sampleMethod: js.UndefOr[String] = js.native
  
  /** Complete BigQuery table reference. */
  var tableReference: js.UndefOr[GooglePrivacyDlpV2BigQueryTable] = js.native
}
object GooglePrivacyDlpV2BigQueryOptions {
  
  @scala.inline
  def apply(): GooglePrivacyDlpV2BigQueryOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GooglePrivacyDlpV2BigQueryOptions]
  }
  
  @scala.inline
  implicit class GooglePrivacyDlpV2BigQueryOptionsMutableBuilder[Self <: GooglePrivacyDlpV2BigQueryOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExcludedFields(value: js.Array[GooglePrivacyDlpV2FieldId]): Self = StObject.set(x, "excludedFields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExcludedFieldsUndefined: Self = StObject.set(x, "excludedFields", js.undefined)
    
    @scala.inline
    def setExcludedFieldsVarargs(value: GooglePrivacyDlpV2FieldId*): Self = StObject.set(x, "excludedFields", js.Array(value :_*))
    
    @scala.inline
    def setIdentifyingFields(value: js.Array[GooglePrivacyDlpV2FieldId]): Self = StObject.set(x, "identifyingFields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdentifyingFieldsUndefined: Self = StObject.set(x, "identifyingFields", js.undefined)
    
    @scala.inline
    def setIdentifyingFieldsVarargs(value: GooglePrivacyDlpV2FieldId*): Self = StObject.set(x, "identifyingFields", js.Array(value :_*))
    
    @scala.inline
    def setRowsLimit(value: String): Self = StObject.set(x, "rowsLimit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRowsLimitPercent(value: Double): Self = StObject.set(x, "rowsLimitPercent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRowsLimitPercentUndefined: Self = StObject.set(x, "rowsLimitPercent", js.undefined)
    
    @scala.inline
    def setRowsLimitUndefined: Self = StObject.set(x, "rowsLimit", js.undefined)
    
    @scala.inline
    def setSampleMethod(value: String): Self = StObject.set(x, "sampleMethod", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSampleMethodUndefined: Self = StObject.set(x, "sampleMethod", js.undefined)
    
    @scala.inline
    def setTableReference(value: GooglePrivacyDlpV2BigQueryTable): Self = StObject.set(x, "tableReference", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTableReferenceUndefined: Self = StObject.set(x, "tableReference", js.undefined)
  }
}
