package typingsSlinky.awsSdk.codecommitMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListBranchesOutput extends StObject {
  
  /**
    * The list of branch names.
    */
  var branches: js.UndefOr[BranchNameList] = js.native
  
  /**
    * An enumeration token that returns the batch of the results.
    */
  var nextToken: js.UndefOr[NextToken] = js.native
}
object ListBranchesOutput {
  
  @scala.inline
  def apply(): ListBranchesOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListBranchesOutput]
  }
  
  @scala.inline
  implicit class ListBranchesOutputMutableBuilder[Self <: ListBranchesOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBranches(value: BranchNameList): Self = StObject.set(x, "branches", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBranchesUndefined: Self = StObject.set(x, "branches", js.undefined)
    
    @scala.inline
    def setBranchesVarargs(value: BranchName*): Self = StObject.set(x, "branches", js.Array(value :_*))
    
    @scala.inline
    def setNextToken(value: NextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
