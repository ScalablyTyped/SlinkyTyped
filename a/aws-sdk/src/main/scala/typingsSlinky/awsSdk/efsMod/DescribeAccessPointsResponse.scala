package typingsSlinky.awsSdk.efsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeAccessPointsResponse extends StObject {
  
  /**
    * An array of access point descriptions.
    */
  var AccessPoints: js.UndefOr[AccessPointDescriptions] = js.native
  
  /**
    * Present if there are more access points than returned in the response. You can use the NextMarker in the subsequent request to fetch the additional descriptions.
    */
  var NextToken: js.UndefOr[Token] = js.native
}
object DescribeAccessPointsResponse {
  
  @scala.inline
  def apply(): DescribeAccessPointsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeAccessPointsResponse]
  }
  
  @scala.inline
  implicit class DescribeAccessPointsResponseMutableBuilder[Self <: DescribeAccessPointsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccessPoints(value: AccessPointDescriptions): Self = StObject.set(x, "AccessPoints", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccessPointsUndefined: Self = StObject.set(x, "AccessPoints", js.undefined)
    
    @scala.inline
    def setAccessPointsVarargs(value: AccessPointDescription*): Self = StObject.set(x, "AccessPoints", js.Array(value :_*))
    
    @scala.inline
    def setNextToken(value: Token): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
