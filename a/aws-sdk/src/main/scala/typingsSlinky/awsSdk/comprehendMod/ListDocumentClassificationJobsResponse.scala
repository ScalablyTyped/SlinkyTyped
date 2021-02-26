package typingsSlinky.awsSdk.comprehendMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListDocumentClassificationJobsResponse extends StObject {
  
  /**
    * A list containing the properties of each job returned.
    */
  var DocumentClassificationJobPropertiesList: js.UndefOr[typingsSlinky.awsSdk.comprehendMod.DocumentClassificationJobPropertiesList] = js.native
  
  /**
    * Identifies the next page of results to return.
    */
  var NextToken: js.UndefOr[String] = js.native
}
object ListDocumentClassificationJobsResponse {
  
  @scala.inline
  def apply(): ListDocumentClassificationJobsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListDocumentClassificationJobsResponse]
  }
  
  @scala.inline
  implicit class ListDocumentClassificationJobsResponseMutableBuilder[Self <: ListDocumentClassificationJobsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDocumentClassificationJobPropertiesList(value: DocumentClassificationJobPropertiesList): Self = StObject.set(x, "DocumentClassificationJobPropertiesList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDocumentClassificationJobPropertiesListUndefined: Self = StObject.set(x, "DocumentClassificationJobPropertiesList", js.undefined)
    
    @scala.inline
    def setDocumentClassificationJobPropertiesListVarargs(value: DocumentClassificationJobProperties*): Self = StObject.set(x, "DocumentClassificationJobPropertiesList", js.Array(value :_*))
    
    @scala.inline
    def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
