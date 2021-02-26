package typingsSlinky.awsSdk.elbv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeSSLPoliciesOutput extends StObject {
  
  /**
    * If there are additional results, this is the marker for the next set of results. Otherwise, this is null.
    */
  var NextMarker: js.UndefOr[Marker] = js.native
  
  /**
    * Information about the security policies.
    */
  var SslPolicies: js.UndefOr[typingsSlinky.awsSdk.elbv2Mod.SslPolicies] = js.native
}
object DescribeSSLPoliciesOutput {
  
  @scala.inline
  def apply(): DescribeSSLPoliciesOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeSSLPoliciesOutput]
  }
  
  @scala.inline
  implicit class DescribeSSLPoliciesOutputMutableBuilder[Self <: DescribeSSLPoliciesOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNextMarker(value: Marker): Self = StObject.set(x, "NextMarker", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextMarkerUndefined: Self = StObject.set(x, "NextMarker", js.undefined)
    
    @scala.inline
    def setSslPolicies(value: SslPolicies): Self = StObject.set(x, "SslPolicies", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSslPoliciesUndefined: Self = StObject.set(x, "SslPolicies", js.undefined)
    
    @scala.inline
    def setSslPoliciesVarargs(value: SslPolicy*): Self = StObject.set(x, "SslPolicies", js.Array(value :_*))
  }
}
