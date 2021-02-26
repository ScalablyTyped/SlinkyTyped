package typingsSlinky.awsSdk.amplifyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetBranchResult extends StObject {
  
  var branch: Branch = js.native
}
object GetBranchResult {
  
  @scala.inline
  def apply(branch: Branch): GetBranchResult = {
    val __obj = js.Dynamic.literal(branch = branch.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetBranchResult]
  }
  
  @scala.inline
  implicit class GetBranchResultMutableBuilder[Self <: GetBranchResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBranch(value: Branch): Self = StObject.set(x, "branch", value.asInstanceOf[js.Any])
  }
}
