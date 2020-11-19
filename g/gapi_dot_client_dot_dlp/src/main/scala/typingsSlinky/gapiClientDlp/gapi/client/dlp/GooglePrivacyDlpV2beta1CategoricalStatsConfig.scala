package typingsSlinky.gapiClientDlp.gapi.client.dlp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GooglePrivacyDlpV2beta1CategoricalStatsConfig extends js.Object {
  
  /**
    * Field to compute categorical stats on. All column types are
    * supported except for arrays and structs. However, it may be more
    * informative to use NumericalStats when the field type is supported,
    * depending on the data.
    */
  var field: js.UndefOr[GooglePrivacyDlpV2beta1FieldId] = js.native
}
object GooglePrivacyDlpV2beta1CategoricalStatsConfig {
  
  @scala.inline
  def apply(): GooglePrivacyDlpV2beta1CategoricalStatsConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GooglePrivacyDlpV2beta1CategoricalStatsConfig]
  }
  
  @scala.inline
  implicit class GooglePrivacyDlpV2beta1CategoricalStatsConfigOps[Self <: GooglePrivacyDlpV2beta1CategoricalStatsConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setField(value: GooglePrivacyDlpV2beta1FieldId): Self = this.set("field", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteField: Self = this.set("field", js.undefined)
  }
}
