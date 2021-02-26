package typingsSlinky.awsSdk.comprehendmedicalMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeICD10CMInferenceJobResponse extends StObject {
  
  /**
    * An object that contains the properties associated with a detection job.
    */
  var ComprehendMedicalAsyncJobProperties: js.UndefOr[typingsSlinky.awsSdk.comprehendmedicalMod.ComprehendMedicalAsyncJobProperties] = js.native
}
object DescribeICD10CMInferenceJobResponse {
  
  @scala.inline
  def apply(): DescribeICD10CMInferenceJobResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeICD10CMInferenceJobResponse]
  }
  
  @scala.inline
  implicit class DescribeICD10CMInferenceJobResponseMutableBuilder[Self <: DescribeICD10CMInferenceJobResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setComprehendMedicalAsyncJobProperties(value: ComprehendMedicalAsyncJobProperties): Self = StObject.set(x, "ComprehendMedicalAsyncJobProperties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setComprehendMedicalAsyncJobPropertiesUndefined: Self = StObject.set(x, "ComprehendMedicalAsyncJobProperties", js.undefined)
  }
}
