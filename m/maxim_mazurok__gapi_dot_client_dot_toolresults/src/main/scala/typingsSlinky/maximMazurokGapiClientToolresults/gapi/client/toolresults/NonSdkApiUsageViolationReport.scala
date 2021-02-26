package typingsSlinky.maximMazurokGapiClientToolresults.gapi.client.toolresults

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NonSdkApiUsageViolationReport extends StObject {
  
  /** Examples of the detected API usages. */
  var exampleApis: js.UndefOr[js.Array[NonSdkApi]] = js.native
  
  /** Minimum API level required for the application to run. */
  var minSdkVersion: js.UndefOr[Double] = js.native
  
  /** Specifies the API Level on which the application is designed to run. */
  var targetSdkVersion: js.UndefOr[Double] = js.native
  
  /** Total number of unique Non-SDK API's accessed. */
  var uniqueApis: js.UndefOr[Double] = js.native
}
object NonSdkApiUsageViolationReport {
  
  @scala.inline
  def apply(): NonSdkApiUsageViolationReport = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NonSdkApiUsageViolationReport]
  }
  
  @scala.inline
  implicit class NonSdkApiUsageViolationReportMutableBuilder[Self <: NonSdkApiUsageViolationReport] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExampleApis(value: js.Array[NonSdkApi]): Self = StObject.set(x, "exampleApis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExampleApisUndefined: Self = StObject.set(x, "exampleApis", js.undefined)
    
    @scala.inline
    def setExampleApisVarargs(value: NonSdkApi*): Self = StObject.set(x, "exampleApis", js.Array(value :_*))
    
    @scala.inline
    def setMinSdkVersion(value: Double): Self = StObject.set(x, "minSdkVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinSdkVersionUndefined: Self = StObject.set(x, "minSdkVersion", js.undefined)
    
    @scala.inline
    def setTargetSdkVersion(value: Double): Self = StObject.set(x, "targetSdkVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetSdkVersionUndefined: Self = StObject.set(x, "targetSdkVersion", js.undefined)
    
    @scala.inline
    def setUniqueApis(value: Double): Self = StObject.set(x, "uniqueApis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUniqueApisUndefined: Self = StObject.set(x, "uniqueApis", js.undefined)
  }
}
