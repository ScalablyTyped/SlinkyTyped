package typingsSlinky.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeVpcEndpointServicePermissionsResult extends StObject {
  
  /**
    * Information about one or more allowed principals.
    */
  var AllowedPrincipals: js.UndefOr[AllowedPrincipalSet] = js.native
  
  /**
    * The token to use to retrieve the next page of results. This value is null when there are no more results to return.
    */
  var NextToken: js.UndefOr[String] = js.native
}
object DescribeVpcEndpointServicePermissionsResult {
  
  @scala.inline
  def apply(): DescribeVpcEndpointServicePermissionsResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeVpcEndpointServicePermissionsResult]
  }
  
  @scala.inline
  implicit class DescribeVpcEndpointServicePermissionsResultMutableBuilder[Self <: DescribeVpcEndpointServicePermissionsResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAllowedPrincipals(value: AllowedPrincipalSet): Self = StObject.set(x, "AllowedPrincipals", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllowedPrincipalsUndefined: Self = StObject.set(x, "AllowedPrincipals", js.undefined)
    
    @scala.inline
    def setAllowedPrincipalsVarargs(value: AllowedPrincipal*): Self = StObject.set(x, "AllowedPrincipals", js.Array(value :_*))
    
    @scala.inline
    def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
