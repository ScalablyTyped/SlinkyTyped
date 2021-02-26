package typingsSlinky.maximMazurokGapiClientDlp.gapi.client.dlp

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GooglePrivacyDlpV2QuasiIdField extends StObject {
  
  /** A auxiliary field. */
  var customTag: js.UndefOr[String] = js.native
  
  /** Identifies the column. */
  var field: js.UndefOr[GooglePrivacyDlpV2FieldId] = js.native
}
object GooglePrivacyDlpV2QuasiIdField {
  
  @scala.inline
  def apply(): GooglePrivacyDlpV2QuasiIdField = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GooglePrivacyDlpV2QuasiIdField]
  }
  
  @scala.inline
  implicit class GooglePrivacyDlpV2QuasiIdFieldMutableBuilder[Self <: GooglePrivacyDlpV2QuasiIdField] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCustomTag(value: String): Self = StObject.set(x, "customTag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCustomTagUndefined: Self = StObject.set(x, "customTag", js.undefined)
    
    @scala.inline
    def setField(value: GooglePrivacyDlpV2FieldId): Self = StObject.set(x, "field", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFieldUndefined: Self = StObject.set(x, "field", js.undefined)
  }
}
