package typingsSlinky.maximMazurokGapiClientDlp.gapi.client.dlp

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GooglePrivacyDlpV2EntityId extends StObject {
  
  /** Composite key indicating which field contains the entity identifier. */
  var field: js.UndefOr[GooglePrivacyDlpV2FieldId] = js.native
}
object GooglePrivacyDlpV2EntityId {
  
  @scala.inline
  def apply(): GooglePrivacyDlpV2EntityId = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GooglePrivacyDlpV2EntityId]
  }
  
  @scala.inline
  implicit class GooglePrivacyDlpV2EntityIdMutableBuilder[Self <: GooglePrivacyDlpV2EntityId] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setField(value: GooglePrivacyDlpV2FieldId): Self = StObject.set(x, "field", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFieldUndefined: Self = StObject.set(x, "field", js.undefined)
  }
}
