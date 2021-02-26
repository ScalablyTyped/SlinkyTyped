package typingsSlinky.awsSdk.directoryserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeDomainControllersResult extends StObject {
  
  /**
    * List of the DomainController objects that were retrieved.
    */
  var DomainControllers: js.UndefOr[typingsSlinky.awsSdk.directoryserviceMod.DomainControllers] = js.native
  
  /**
    * If not null, more results are available. Pass this value for the NextToken parameter in a subsequent call to DescribeDomainControllers retrieve the next set of items.
    */
  var NextToken: js.UndefOr[typingsSlinky.awsSdk.directoryserviceMod.NextToken] = js.native
}
object DescribeDomainControllersResult {
  
  @scala.inline
  def apply(): DescribeDomainControllersResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeDomainControllersResult]
  }
  
  @scala.inline
  implicit class DescribeDomainControllersResultMutableBuilder[Self <: DescribeDomainControllersResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDomainControllers(value: DomainControllers): Self = StObject.set(x, "DomainControllers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDomainControllersUndefined: Self = StObject.set(x, "DomainControllers", js.undefined)
    
    @scala.inline
    def setDomainControllersVarargs(value: DomainController*): Self = StObject.set(x, "DomainControllers", js.Array(value :_*))
    
    @scala.inline
    def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
