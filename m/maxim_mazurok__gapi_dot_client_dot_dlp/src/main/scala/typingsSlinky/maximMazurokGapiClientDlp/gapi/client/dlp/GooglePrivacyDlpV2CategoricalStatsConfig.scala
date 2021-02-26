package typingsSlinky.maximMazurokGapiClientDlp.gapi.client.dlp

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GooglePrivacyDlpV2CategoricalStatsConfig extends StObject {
  
  /**
    * Field to compute categorical stats on. All column types are supported except for arrays and structs. However, it may be more informative to use NumericalStats when the field type is
    * supported, depending on the data.
    */
  var field: js.UndefOr[GooglePrivacyDlpV2FieldId] = js.native
}
object GooglePrivacyDlpV2CategoricalStatsConfig {
  
  @scala.inline
  def apply(): GooglePrivacyDlpV2CategoricalStatsConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GooglePrivacyDlpV2CategoricalStatsConfig]
  }
  
  @scala.inline
  implicit class GooglePrivacyDlpV2CategoricalStatsConfigMutableBuilder[Self <: GooglePrivacyDlpV2CategoricalStatsConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setField(value: GooglePrivacyDlpV2FieldId): Self = StObject.set(x, "field", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFieldUndefined: Self = StObject.set(x, "field", js.undefined)
  }
}
