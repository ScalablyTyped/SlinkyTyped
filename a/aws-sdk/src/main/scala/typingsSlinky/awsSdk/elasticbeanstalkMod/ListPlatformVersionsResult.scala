package typingsSlinky.awsSdk.elasticbeanstalkMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListPlatformVersionsResult extends StObject {
  
  /**
    * In a paginated request, if this value isn't null, it's the token that you can pass in a subsequent request to get the next response page.
    */
  var NextToken: js.UndefOr[Token] = js.native
  
  /**
    * Summary information about the platform versions.
    */
  var PlatformSummaryList: js.UndefOr[typingsSlinky.awsSdk.elasticbeanstalkMod.PlatformSummaryList] = js.native
}
object ListPlatformVersionsResult {
  
  @scala.inline
  def apply(): ListPlatformVersionsResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListPlatformVersionsResult]
  }
  
  @scala.inline
  implicit class ListPlatformVersionsResultMutableBuilder[Self <: ListPlatformVersionsResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNextToken(value: Token): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    @scala.inline
    def setPlatformSummaryList(value: PlatformSummaryList): Self = StObject.set(x, "PlatformSummaryList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlatformSummaryListUndefined: Self = StObject.set(x, "PlatformSummaryList", js.undefined)
    
    @scala.inline
    def setPlatformSummaryListVarargs(value: PlatformSummary*): Self = StObject.set(x, "PlatformSummaryList", js.Array(value :_*))
  }
}
