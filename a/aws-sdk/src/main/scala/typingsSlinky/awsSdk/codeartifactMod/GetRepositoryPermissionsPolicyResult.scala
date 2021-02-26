package typingsSlinky.awsSdk.codeartifactMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetRepositoryPermissionsPolicyResult extends StObject {
  
  /**
    *  The returned resource policy. 
    */
  var policy: js.UndefOr[ResourcePolicy] = js.native
}
object GetRepositoryPermissionsPolicyResult {
  
  @scala.inline
  def apply(): GetRepositoryPermissionsPolicyResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetRepositoryPermissionsPolicyResult]
  }
  
  @scala.inline
  implicit class GetRepositoryPermissionsPolicyResultMutableBuilder[Self <: GetRepositoryPermissionsPolicyResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPolicy(value: ResourcePolicy): Self = StObject.set(x, "policy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPolicyUndefined: Self = StObject.set(x, "policy", js.undefined)
  }
}
