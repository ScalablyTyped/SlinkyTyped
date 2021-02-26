package typingsSlinky.googleapis.dlpV2Mod.dlpV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * l-diversity metric, used for analysis of reidentification risk.
  */
@js.native
trait SchemaGooglePrivacyDlpV2LDiversityConfig extends StObject {
  
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
  implicit class SchemaGooglePrivacyDlpV2LDiversityConfigMutableBuilder[Self <: SchemaGooglePrivacyDlpV2LDiversityConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setQuasiIds(value: js.Array[SchemaGooglePrivacyDlpV2FieldId]): Self = StObject.set(x, "quasiIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQuasiIdsUndefined: Self = StObject.set(x, "quasiIds", js.undefined)
    
    @scala.inline
    def setQuasiIdsVarargs(value: SchemaGooglePrivacyDlpV2FieldId*): Self = StObject.set(x, "quasiIds", js.Array(value :_*))
    
    @scala.inline
    def setSensitiveAttribute(value: SchemaGooglePrivacyDlpV2FieldId): Self = StObject.set(x, "sensitiveAttribute", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSensitiveAttributeUndefined: Self = StObject.set(x, "sensitiveAttribute", js.undefined)
  }
}
