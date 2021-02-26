package typingsSlinky.awsSdk.s3Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StorageClassAnalysis extends StObject {
  
  /**
    * Specifies how data related to the storage class analysis for an Amazon S3 bucket should be exported.
    */
  var DataExport: js.UndefOr[StorageClassAnalysisDataExport] = js.native
}
object StorageClassAnalysis {
  
  @scala.inline
  def apply(): StorageClassAnalysis = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StorageClassAnalysis]
  }
  
  @scala.inline
  implicit class StorageClassAnalysisMutableBuilder[Self <: StorageClassAnalysis] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDataExport(value: StorageClassAnalysisDataExport): Self = StObject.set(x, "DataExport", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataExportUndefined: Self = StObject.set(x, "DataExport", js.undefined)
  }
}
