package typingsSlinky.awsSdk.batchMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeJobDefinitionsResponse extends StObject {
  
  /**
    * The list of job definitions.
    */
  var jobDefinitions: js.UndefOr[JobDefinitionList] = js.native
  
  /**
    * The nextToken value to include in a future DescribeJobDefinitions request. When the results of a DescribeJobDefinitions request exceed maxResults, this value can be used to retrieve the next page of results. This value is null when there are no more results to return.
    */
  var nextToken: js.UndefOr[String] = js.native
}
object DescribeJobDefinitionsResponse {
  
  @scala.inline
  def apply(): DescribeJobDefinitionsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeJobDefinitionsResponse]
  }
  
  @scala.inline
  implicit class DescribeJobDefinitionsResponseMutableBuilder[Self <: DescribeJobDefinitionsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setJobDefinitions(value: JobDefinitionList): Self = StObject.set(x, "jobDefinitions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJobDefinitionsUndefined: Self = StObject.set(x, "jobDefinitions", js.undefined)
    
    @scala.inline
    def setJobDefinitionsVarargs(value: JobDefinition*): Self = StObject.set(x, "jobDefinitions", js.Array(value :_*))
    
    @scala.inline
    def setNextToken(value: String): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
