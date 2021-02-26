package typingsSlinky.awsSdk.clouddirectoryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PolicyToPath extends StObject {
  
  /**
    * The path that is referenced from the root.
    */
  var Path: js.UndefOr[PathString] = js.native
  
  /**
    * List of policy objects.
    */
  var Policies: js.UndefOr[PolicyAttachmentList] = js.native
}
object PolicyToPath {
  
  @scala.inline
  def apply(): PolicyToPath = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PolicyToPath]
  }
  
  @scala.inline
  implicit class PolicyToPathMutableBuilder[Self <: PolicyToPath] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPath(value: PathString): Self = StObject.set(x, "Path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPathUndefined: Self = StObject.set(x, "Path", js.undefined)
    
    @scala.inline
    def setPolicies(value: PolicyAttachmentList): Self = StObject.set(x, "Policies", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPoliciesUndefined: Self = StObject.set(x, "Policies", js.undefined)
    
    @scala.inline
    def setPoliciesVarargs(value: PolicyAttachment*): Self = StObject.set(x, "Policies", js.Array(value :_*))
  }
}
