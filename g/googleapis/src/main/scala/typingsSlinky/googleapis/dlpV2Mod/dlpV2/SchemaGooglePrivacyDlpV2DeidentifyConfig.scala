package typingsSlinky.googleapis.dlpV2Mod.dlpV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The configuration that controls how the data will change.
  */
@js.native
trait SchemaGooglePrivacyDlpV2DeidentifyConfig extends StObject {
  
  /**
    * Treat the dataset as free-form text and apply the same free text
    * transformation everywhere.
    */
  var infoTypeTransformations: js.UndefOr[SchemaGooglePrivacyDlpV2InfoTypeTransformations] = js.native
  
  /**
    * Treat the dataset as structured. Transformations can be applied to
    * specific locations within structured datasets, such as transforming a
    * column within a table.
    */
  var recordTransformations: js.UndefOr[SchemaGooglePrivacyDlpV2RecordTransformations] = js.native
}
object SchemaGooglePrivacyDlpV2DeidentifyConfig {
  
  @scala.inline
  def apply(): SchemaGooglePrivacyDlpV2DeidentifyConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGooglePrivacyDlpV2DeidentifyConfig]
  }
  
  @scala.inline
  implicit class SchemaGooglePrivacyDlpV2DeidentifyConfigMutableBuilder[Self <: SchemaGooglePrivacyDlpV2DeidentifyConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInfoTypeTransformations(value: SchemaGooglePrivacyDlpV2InfoTypeTransformations): Self = StObject.set(x, "infoTypeTransformations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInfoTypeTransformationsUndefined: Self = StObject.set(x, "infoTypeTransformations", js.undefined)
    
    @scala.inline
    def setRecordTransformations(value: SchemaGooglePrivacyDlpV2RecordTransformations): Self = StObject.set(x, "recordTransformations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRecordTransformationsUndefined: Self = StObject.set(x, "recordTransformations", js.undefined)
  }
}
