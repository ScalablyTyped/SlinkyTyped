package typingsSlinky.googleapis.dlpV2Mod.dlpV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The results of an inspect DataSource job.
  */
@js.native
trait SchemaGooglePrivacyDlpV2InspectDataSourceDetails extends StObject {
  
  /**
    * The configuration used for this job.
    */
  var requestedOptions: js.UndefOr[SchemaGooglePrivacyDlpV2RequestedOptions] = js.native
  
  /**
    * A summary of the outcome of this inspect job.
    */
  var result: js.UndefOr[SchemaGooglePrivacyDlpV2Result] = js.native
}
object SchemaGooglePrivacyDlpV2InspectDataSourceDetails {
  
  @scala.inline
  def apply(): SchemaGooglePrivacyDlpV2InspectDataSourceDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGooglePrivacyDlpV2InspectDataSourceDetails]
  }
  
  @scala.inline
  implicit class SchemaGooglePrivacyDlpV2InspectDataSourceDetailsMutableBuilder[Self <: SchemaGooglePrivacyDlpV2InspectDataSourceDetails] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRequestedOptions(value: SchemaGooglePrivacyDlpV2RequestedOptions): Self = StObject.set(x, "requestedOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequestedOptionsUndefined: Self = StObject.set(x, "requestedOptions", js.undefined)
    
    @scala.inline
    def setResult(value: SchemaGooglePrivacyDlpV2Result): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResultUndefined: Self = StObject.set(x, "result", js.undefined)
  }
}
