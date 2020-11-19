package typingsSlinky.googleapis.dlpV2Mod.dlpV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Summary of a single transformation. Only one of &#39;transformation&#39;,
  * &#39;field_transformation&#39;, or &#39;record_suppress&#39; will be set.
  */
@js.native
trait SchemaGooglePrivacyDlpV2TransformationSummary extends js.Object {
  
  /**
    * Set if the transformation was limited to a specific FieldId.
    */
  var field: js.UndefOr[SchemaGooglePrivacyDlpV2FieldId] = js.native
  
  /**
    * The field transformation that was applied. If multiple field
    * transformations are requested for a single field, this list will contain
    * all of them; otherwise, only one is supplied.
    */
  var fieldTransformations: js.UndefOr[js.Array[SchemaGooglePrivacyDlpV2FieldTransformation]] = js.native
  
  /**
    * Set if the transformation was limited to a specific InfoType.
    */
  var infoType: js.UndefOr[SchemaGooglePrivacyDlpV2InfoType] = js.native
  
  /**
    * The specific suppression option these stats apply to.
    */
  var recordSuppress: js.UndefOr[SchemaGooglePrivacyDlpV2RecordSuppression] = js.native
  
  var results: js.UndefOr[js.Array[SchemaGooglePrivacyDlpV2SummaryResult]] = js.native
  
  /**
    * The specific transformation these stats apply to.
    */
  var transformation: js.UndefOr[SchemaGooglePrivacyDlpV2PrimitiveTransformation] = js.native
  
  /**
    * Total size in bytes that were transformed in some way.
    */
  var transformedBytes: js.UndefOr[String] = js.native
}
object SchemaGooglePrivacyDlpV2TransformationSummary {
  
  @scala.inline
  def apply(): SchemaGooglePrivacyDlpV2TransformationSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGooglePrivacyDlpV2TransformationSummary]
  }
  
  @scala.inline
  implicit class SchemaGooglePrivacyDlpV2TransformationSummaryOps[Self <: SchemaGooglePrivacyDlpV2TransformationSummary] (val x: Self) extends AnyVal {
    
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
    def setField(value: SchemaGooglePrivacyDlpV2FieldId): Self = this.set("field", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteField: Self = this.set("field", js.undefined)
    
    @scala.inline
    def setFieldTransformationsVarargs(value: SchemaGooglePrivacyDlpV2FieldTransformation*): Self = this.set("fieldTransformations", js.Array(value :_*))
    
    @scala.inline
    def setFieldTransformations(value: js.Array[SchemaGooglePrivacyDlpV2FieldTransformation]): Self = this.set("fieldTransformations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFieldTransformations: Self = this.set("fieldTransformations", js.undefined)
    
    @scala.inline
    def setInfoType(value: SchemaGooglePrivacyDlpV2InfoType): Self = this.set("infoType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInfoType: Self = this.set("infoType", js.undefined)
    
    @scala.inline
    def setRecordSuppress(value: SchemaGooglePrivacyDlpV2RecordSuppression): Self = this.set("recordSuppress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRecordSuppress: Self = this.set("recordSuppress", js.undefined)
    
    @scala.inline
    def setResultsVarargs(value: SchemaGooglePrivacyDlpV2SummaryResult*): Self = this.set("results", js.Array(value :_*))
    
    @scala.inline
    def setResults(value: js.Array[SchemaGooglePrivacyDlpV2SummaryResult]): Self = this.set("results", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResults: Self = this.set("results", js.undefined)
    
    @scala.inline
    def setTransformation(value: SchemaGooglePrivacyDlpV2PrimitiveTransformation): Self = this.set("transformation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTransformation: Self = this.set("transformation", js.undefined)
    
    @scala.inline
    def setTransformedBytes(value: String): Self = this.set("transformedBytes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTransformedBytes: Self = this.set("transformedBytes", js.undefined)
  }
}
