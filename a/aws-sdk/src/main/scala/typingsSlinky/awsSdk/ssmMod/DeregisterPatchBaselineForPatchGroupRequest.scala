package typingsSlinky.awsSdk.ssmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeregisterPatchBaselineForPatchGroupRequest extends StObject {
  
  /**
    * The ID of the patch baseline to deregister the patch group from.
    */
  var BaselineId: typingsSlinky.awsSdk.ssmMod.BaselineId = js.native
  
  /**
    * The name of the patch group that should be deregistered from the patch baseline.
    */
  var PatchGroup: typingsSlinky.awsSdk.ssmMod.PatchGroup = js.native
}
object DeregisterPatchBaselineForPatchGroupRequest {
  
  @scala.inline
  def apply(BaselineId: BaselineId, PatchGroup: PatchGroup): DeregisterPatchBaselineForPatchGroupRequest = {
    val __obj = js.Dynamic.literal(BaselineId = BaselineId.asInstanceOf[js.Any], PatchGroup = PatchGroup.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeregisterPatchBaselineForPatchGroupRequest]
  }
  
  @scala.inline
  implicit class DeregisterPatchBaselineForPatchGroupRequestMutableBuilder[Self <: DeregisterPatchBaselineForPatchGroupRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBaselineId(value: BaselineId): Self = StObject.set(x, "BaselineId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPatchGroup(value: PatchGroup): Self = StObject.set(x, "PatchGroup", value.asInstanceOf[js.Any])
  }
}
