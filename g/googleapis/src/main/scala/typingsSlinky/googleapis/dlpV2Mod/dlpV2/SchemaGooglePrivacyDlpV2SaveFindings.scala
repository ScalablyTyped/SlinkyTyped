package typingsSlinky.googleapis.dlpV2Mod.dlpV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * If set, the detailed findings will be persisted to the specified
  * OutputStorageConfig. Only a single instance of this action can be
  * specified. Compatible with: Inspect, Risk
  */
@js.native
trait SchemaGooglePrivacyDlpV2SaveFindings extends StObject {
  
  var outputConfig: js.UndefOr[SchemaGooglePrivacyDlpV2OutputStorageConfig] = js.native
}
object SchemaGooglePrivacyDlpV2SaveFindings {
  
  @scala.inline
  def apply(): SchemaGooglePrivacyDlpV2SaveFindings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGooglePrivacyDlpV2SaveFindings]
  }
  
  @scala.inline
  implicit class SchemaGooglePrivacyDlpV2SaveFindingsMutableBuilder[Self <: SchemaGooglePrivacyDlpV2SaveFindings] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOutputConfig(value: SchemaGooglePrivacyDlpV2OutputStorageConfig): Self = StObject.set(x, "outputConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutputConfigUndefined: Self = StObject.set(x, "outputConfig", js.undefined)
  }
}
