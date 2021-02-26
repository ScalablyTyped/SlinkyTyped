package typingsSlinky.awsSdk.appstreamMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeStacksRequest extends StObject {
  
  /**
    * The names of the stacks to describe.
    */
  var Names: js.UndefOr[StringList] = js.native
  
  /**
    * The pagination token to use to retrieve the next page of results for this operation. If this value is null, it retrieves the first page.
    */
  var NextToken: js.UndefOr[String] = js.native
}
object DescribeStacksRequest {
  
  @scala.inline
  def apply(): DescribeStacksRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeStacksRequest]
  }
  
  @scala.inline
  implicit class DescribeStacksRequestMutableBuilder[Self <: DescribeStacksRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNames(value: StringList): Self = StObject.set(x, "Names", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNamesUndefined: Self = StObject.set(x, "Names", js.undefined)
    
    @scala.inline
    def setNamesVarargs(value: String*): Self = StObject.set(x, "Names", js.Array(value :_*))
    
    @scala.inline
    def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
