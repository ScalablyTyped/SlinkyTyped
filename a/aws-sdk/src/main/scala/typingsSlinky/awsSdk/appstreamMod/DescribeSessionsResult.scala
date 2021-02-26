package typingsSlinky.awsSdk.appstreamMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeSessionsResult extends StObject {
  
  /**
    * The pagination token to use to retrieve the next page of results for this operation. If there are no more pages, this value is null.
    */
  var NextToken: js.UndefOr[String] = js.native
  
  /**
    * Information about the streaming sessions.
    */
  var Sessions: js.UndefOr[SessionList] = js.native
}
object DescribeSessionsResult {
  
  @scala.inline
  def apply(): DescribeSessionsResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeSessionsResult]
  }
  
  @scala.inline
  implicit class DescribeSessionsResultMutableBuilder[Self <: DescribeSessionsResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    @scala.inline
    def setSessions(value: SessionList): Self = StObject.set(x, "Sessions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSessionsUndefined: Self = StObject.set(x, "Sessions", js.undefined)
    
    @scala.inline
    def setSessionsVarargs(value: Session*): Self = StObject.set(x, "Sessions", js.Array(value :_*))
  }
}
