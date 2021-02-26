package typingsSlinky.awsSdk.directoryserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeTrustsResult extends StObject {
  
  /**
    * If not null, more results are available. Pass this value for the NextToken parameter in a subsequent call to DescribeTrusts to retrieve the next set of items.
    */
  var NextToken: js.UndefOr[typingsSlinky.awsSdk.directoryserviceMod.NextToken] = js.native
  
  /**
    * The list of Trust objects that were retrieved. It is possible that this list contains less than the number of items specified in the Limit member of the request. This occurs if there are less than the requested number of items left to retrieve, or if the limitations of the operation have been exceeded.
    */
  var Trusts: js.UndefOr[typingsSlinky.awsSdk.directoryserviceMod.Trusts] = js.native
}
object DescribeTrustsResult {
  
  @scala.inline
  def apply(): DescribeTrustsResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeTrustsResult]
  }
  
  @scala.inline
  implicit class DescribeTrustsResultMutableBuilder[Self <: DescribeTrustsResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    @scala.inline
    def setTrusts(value: Trusts): Self = StObject.set(x, "Trusts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTrustsUndefined: Self = StObject.set(x, "Trusts", js.undefined)
    
    @scala.inline
    def setTrustsVarargs(value: Trust*): Self = StObject.set(x, "Trusts", js.Array(value :_*))
  }
}
