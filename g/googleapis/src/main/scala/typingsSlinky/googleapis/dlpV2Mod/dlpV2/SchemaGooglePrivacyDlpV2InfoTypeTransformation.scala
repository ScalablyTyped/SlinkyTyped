package typingsSlinky.googleapis.dlpV2Mod.dlpV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A transformation to apply to text that is identified as a specific
  * info_type.
  */
@js.native
trait SchemaGooglePrivacyDlpV2InfoTypeTransformation extends StObject {
  
  /**
    * InfoTypes to apply the transformation to. An empty list will cause this
    * transformation to apply to all findings that correspond to infoTypes that
    * were requested in `InspectConfig`.
    */
  var infoTypes: js.UndefOr[js.Array[SchemaGooglePrivacyDlpV2InfoType]] = js.native
  
  /**
    * Primitive transformation to apply to the infoType. [required]
    */
  var primitiveTransformation: js.UndefOr[SchemaGooglePrivacyDlpV2PrimitiveTransformation] = js.native
}
object SchemaGooglePrivacyDlpV2InfoTypeTransformation {
  
  @scala.inline
  def apply(): SchemaGooglePrivacyDlpV2InfoTypeTransformation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGooglePrivacyDlpV2InfoTypeTransformation]
  }
  
  @scala.inline
  implicit class SchemaGooglePrivacyDlpV2InfoTypeTransformationMutableBuilder[Self <: SchemaGooglePrivacyDlpV2InfoTypeTransformation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInfoTypes(value: js.Array[SchemaGooglePrivacyDlpV2InfoType]): Self = StObject.set(x, "infoTypes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInfoTypesUndefined: Self = StObject.set(x, "infoTypes", js.undefined)
    
    @scala.inline
    def setInfoTypesVarargs(value: SchemaGooglePrivacyDlpV2InfoType*): Self = StObject.set(x, "infoTypes", js.Array(value :_*))
    
    @scala.inline
    def setPrimitiveTransformation(value: SchemaGooglePrivacyDlpV2PrimitiveTransformation): Self = StObject.set(x, "primitiveTransformation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrimitiveTransformationUndefined: Self = StObject.set(x, "primitiveTransformation", js.undefined)
  }
}
