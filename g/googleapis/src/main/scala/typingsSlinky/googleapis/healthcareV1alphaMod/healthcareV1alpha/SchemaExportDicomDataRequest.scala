package typingsSlinky.googleapis.healthcareV1alphaMod.healthcareV1alpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Exports data from the specified DICOM store. If a given resource (e.g., a
  * DICOM object with the same SOPInstance UID) already exists in the output,
  * it is overwritten with the version in the source dataset. Exported DICOM
  * data will persist when the DICOM store from which it was exported is
  * deleted.
  */
@js.native
trait SchemaExportDicomDataRequest extends StObject {
  
  /**
    * Specifies where the exported data should be placed.
    */
  var outputConfig: js.UndefOr[SchemaOutputConfig] = js.native
}
object SchemaExportDicomDataRequest {
  
  @scala.inline
  def apply(): SchemaExportDicomDataRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaExportDicomDataRequest]
  }
  
  @scala.inline
  implicit class SchemaExportDicomDataRequestMutableBuilder[Self <: SchemaExportDicomDataRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOutputConfig(value: SchemaOutputConfig): Self = StObject.set(x, "outputConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutputConfigUndefined: Self = StObject.set(x, "outputConfig", js.undefined)
  }
}
