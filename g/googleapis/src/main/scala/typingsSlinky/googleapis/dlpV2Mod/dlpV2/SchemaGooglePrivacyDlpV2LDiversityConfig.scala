package typingsSlinky.googleapis.dlpV2Mod.dlpV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * l-diversity metric, used for analysis of reidentification risk.
  */
@js.native
trait SchemaGooglePrivacyDlpV2LDiversityConfig extends js.Object {
  
  /**
    * Set of quasi-identifiers indicating how equivalence classes are defined
    * for the l-diversity computation. When multiple fields are specified, they
    * are considered a single composite key.
    */
  var quasiIds: js.UndefOr[js.Array[SchemaGooglePrivacyDlpV2FieldId]] = js.native
  
  /**
    * Sensitive field for computing the l-value.
    */
  var sensitiveAttribute: js.UndefOr[SchemaGooglePrivacyDlpV2FieldId] = js.native
}
object SchemaGooglePrivacyDlpV2LDiversityConfig {
  
  @scala.inline
  def apply(): SchemaGooglePrivacyDlpV2LDiversityConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGooglePrivacyDlpV2LDiversityConfig]
  }
  
  @scala.inline
  implicit class SchemaGooglePrivacyDlpV2LDiversityConfigOps[Self <: SchemaGooglePrivacyDlpV2LDiversityConfig] (val x: Self) extends AnyVal {
    
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
    def setQuasiIdsVarargs(value: SchemaGooglePrivacyDlpV2FieldId*): Self = this.set("quasiIds", js.Array(value :_*))
    
    @scala.inline
    def setQuasiIds(value: js.Array[SchemaGooglePrivacyDlpV2FieldId]): Self = this.set("quasiIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteQuasiIds: Self = this.set("quasiIds", js.undefined)
    
    @scala.inline
    def setSensitiveAttribute(value: SchemaGooglePrivacyDlpV2FieldId): Self = this.set("sensitiveAttribute", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSensitiveAttribute: Self = this.set("sensitiveAttribute", js.undefined)
  }
}
