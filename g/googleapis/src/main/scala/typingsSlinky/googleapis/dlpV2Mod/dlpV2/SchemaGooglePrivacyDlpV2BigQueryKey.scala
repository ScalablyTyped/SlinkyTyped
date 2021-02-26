package typingsSlinky.googleapis.dlpV2Mod.dlpV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Row key for identifying a record in BigQuery table.
  */
@js.native
trait SchemaGooglePrivacyDlpV2BigQueryKey extends StObject {
  
  /**
    * Absolute number of the row from the beginning of the table at the time of
    * scanning.
    */
  var rowNumber: js.UndefOr[String] = js.native
  
  /**
    * Complete BigQuery table reference.
    */
  var tableReference: js.UndefOr[SchemaGooglePrivacyDlpV2BigQueryTable] = js.native
}
object SchemaGooglePrivacyDlpV2BigQueryKey {
  
  @scala.inline
  def apply(): SchemaGooglePrivacyDlpV2BigQueryKey = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGooglePrivacyDlpV2BigQueryKey]
  }
  
  @scala.inline
  implicit class SchemaGooglePrivacyDlpV2BigQueryKeyMutableBuilder[Self <: SchemaGooglePrivacyDlpV2BigQueryKey] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRowNumber(value: String): Self = StObject.set(x, "rowNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRowNumberUndefined: Self = StObject.set(x, "rowNumber", js.undefined)
    
    @scala.inline
    def setTableReference(value: SchemaGooglePrivacyDlpV2BigQueryTable): Self = StObject.set(x, "tableReference", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTableReferenceUndefined: Self = StObject.set(x, "tableReference", js.undefined)
  }
}
