package typingsSlinky.googleapis.dlpV2Mod.dlpV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The transformation to apply to the field.
  */
@js.native
trait SchemaGooglePrivacyDlpV2FieldTransformation extends StObject {
  
  /**
    * Only apply the transformation if the condition evaluates to true for the
    * given `RecordCondition`. The conditions are allowed to reference fields
    * that are not used in the actual transformation. [optional]  Example Use
    * Cases:  - Apply a different bucket transformation to an age column if the
    * zip code column for the same record is within a specific range. - Redact
    * a field if the date of birth field is greater than 85.
    */
  var condition: js.UndefOr[SchemaGooglePrivacyDlpV2RecordCondition] = js.native
  
  /**
    * Input field(s) to apply the transformation to. [required]
    */
  var fields: js.UndefOr[js.Array[SchemaGooglePrivacyDlpV2FieldId]] = js.native
  
  /**
    * Treat the contents of the field as free text, and selectively transform
    * content that matches an `InfoType`.
    */
  var infoTypeTransformations: js.UndefOr[SchemaGooglePrivacyDlpV2InfoTypeTransformations] = js.native
  
  /**
    * Apply the transformation to the entire field.
    */
  var primitiveTransformation: js.UndefOr[SchemaGooglePrivacyDlpV2PrimitiveTransformation] = js.native
}
object SchemaGooglePrivacyDlpV2FieldTransformation {
  
  @scala.inline
  def apply(): SchemaGooglePrivacyDlpV2FieldTransformation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGooglePrivacyDlpV2FieldTransformation]
  }
  
  @scala.inline
  implicit class SchemaGooglePrivacyDlpV2FieldTransformationMutableBuilder[Self <: SchemaGooglePrivacyDlpV2FieldTransformation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCondition(value: SchemaGooglePrivacyDlpV2RecordCondition): Self = StObject.set(x, "condition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConditionUndefined: Self = StObject.set(x, "condition", js.undefined)
    
    @scala.inline
    def setFields(value: js.Array[SchemaGooglePrivacyDlpV2FieldId]): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFieldsUndefined: Self = StObject.set(x, "fields", js.undefined)
    
    @scala.inline
    def setFieldsVarargs(value: SchemaGooglePrivacyDlpV2FieldId*): Self = StObject.set(x, "fields", js.Array(value :_*))
    
    @scala.inline
    def setInfoTypeTransformations(value: SchemaGooglePrivacyDlpV2InfoTypeTransformations): Self = StObject.set(x, "infoTypeTransformations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInfoTypeTransformationsUndefined: Self = StObject.set(x, "infoTypeTransformations", js.undefined)
    
    @scala.inline
    def setPrimitiveTransformation(value: SchemaGooglePrivacyDlpV2PrimitiveTransformation): Self = StObject.set(x, "primitiveTransformation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrimitiveTransformationUndefined: Self = StObject.set(x, "primitiveTransformation", js.undefined)
  }
}
