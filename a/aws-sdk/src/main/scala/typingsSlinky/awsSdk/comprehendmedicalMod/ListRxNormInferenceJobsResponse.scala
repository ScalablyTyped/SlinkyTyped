package typingsSlinky.awsSdk.comprehendmedicalMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListRxNormInferenceJobsResponse extends StObject {
  
  /**
    * The maximum number of results to return in each page. The default is 100.
    */
  var ComprehendMedicalAsyncJobPropertiesList: js.UndefOr[
    typingsSlinky.awsSdk.comprehendmedicalMod.ComprehendMedicalAsyncJobPropertiesList
  ] = js.native
  
  /**
    * Identifies the next page of results to return.
    */
  var NextToken: js.UndefOr[String] = js.native
}
object ListRxNormInferenceJobsResponse {
  
  @scala.inline
  def apply(): ListRxNormInferenceJobsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListRxNormInferenceJobsResponse]
  }
  
  @scala.inline
  implicit class ListRxNormInferenceJobsResponseMutableBuilder[Self <: ListRxNormInferenceJobsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setComprehendMedicalAsyncJobPropertiesList(value: ComprehendMedicalAsyncJobPropertiesList): Self = StObject.set(x, "ComprehendMedicalAsyncJobPropertiesList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setComprehendMedicalAsyncJobPropertiesListUndefined: Self = StObject.set(x, "ComprehendMedicalAsyncJobPropertiesList", js.undefined)
    
    @scala.inline
    def setComprehendMedicalAsyncJobPropertiesListVarargs(value: ComprehendMedicalAsyncJobProperties*): Self = StObject.set(x, "ComprehendMedicalAsyncJobPropertiesList", js.Array(value :_*))
    
    @scala.inline
    def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
