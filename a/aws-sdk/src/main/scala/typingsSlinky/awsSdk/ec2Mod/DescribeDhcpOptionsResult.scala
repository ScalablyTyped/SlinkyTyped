package typingsSlinky.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeDhcpOptionsResult extends StObject {
  
  /**
    * Information about one or more DHCP options sets.
    */
  var DhcpOptions: js.UndefOr[DhcpOptionsList] = js.native
  
  /**
    * The token to use to retrieve the next page of results. This value is null when there are no more results to return.
    */
  var NextToken: js.UndefOr[String] = js.native
}
object DescribeDhcpOptionsResult {
  
  @scala.inline
  def apply(): DescribeDhcpOptionsResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeDhcpOptionsResult]
  }
  
  @scala.inline
  implicit class DescribeDhcpOptionsResultMutableBuilder[Self <: DescribeDhcpOptionsResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDhcpOptions(value: DhcpOptionsList): Self = StObject.set(x, "DhcpOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDhcpOptionsUndefined: Self = StObject.set(x, "DhcpOptions", js.undefined)
    
    @scala.inline
    def setDhcpOptionsVarargs(value: DhcpOptions*): Self = StObject.set(x, "DhcpOptions", js.Array(value :_*))
    
    @scala.inline
    def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
