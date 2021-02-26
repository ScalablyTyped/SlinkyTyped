package typingsSlinky.pulumiAws.outputMod.s3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AnalyticsConfigurationStorageClassAnalysis extends StObject {
  
  /**
    * Data export configuration (documented below).
    */
  var dataExport: AnalyticsConfigurationStorageClassAnalysisDataExport = js.native
}
object AnalyticsConfigurationStorageClassAnalysis {
  
  @scala.inline
  def apply(dataExport: AnalyticsConfigurationStorageClassAnalysisDataExport): AnalyticsConfigurationStorageClassAnalysis = {
    val __obj = js.Dynamic.literal(dataExport = dataExport.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnalyticsConfigurationStorageClassAnalysis]
  }
  
  @scala.inline
  implicit class AnalyticsConfigurationStorageClassAnalysisMutableBuilder[Self <: AnalyticsConfigurationStorageClassAnalysis] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDataExport(value: AnalyticsConfigurationStorageClassAnalysisDataExport): Self = StObject.set(x, "dataExport", value.asInstanceOf[js.Any])
  }
}
