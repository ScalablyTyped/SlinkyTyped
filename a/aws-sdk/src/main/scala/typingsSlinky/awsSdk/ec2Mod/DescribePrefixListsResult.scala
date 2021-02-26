package typingsSlinky.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribePrefixListsResult extends StObject {
  
  /**
    * The token to use to retrieve the next page of results. This value is null when there are no more results to return.
    */
  var NextToken: js.UndefOr[String] = js.native
  
  /**
    * All available prefix lists.
    */
  var PrefixLists: js.UndefOr[PrefixListSet] = js.native
}
object DescribePrefixListsResult {
  
  @scala.inline
  def apply(): DescribePrefixListsResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribePrefixListsResult]
  }
  
  @scala.inline
  implicit class DescribePrefixListsResultMutableBuilder[Self <: DescribePrefixListsResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    @scala.inline
    def setPrefixLists(value: PrefixListSet): Self = StObject.set(x, "PrefixLists", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrefixListsUndefined: Self = StObject.set(x, "PrefixLists", js.undefined)
    
    @scala.inline
    def setPrefixListsVarargs(value: PrefixList*): Self = StObject.set(x, "PrefixLists", js.Array(value :_*))
  }
}
