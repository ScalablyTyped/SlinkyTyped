package typingsSlinky.awsSdk.ssmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RegisterPatchBaselineForPatchGroupResult extends StObject {
  
  /**
    * The ID of the patch baseline the patch group was registered with.
    */
  var BaselineId: js.UndefOr[typingsSlinky.awsSdk.ssmMod.BaselineId] = js.native
  
  /**
    * The name of the patch group registered with the patch baseline.
    */
  var PatchGroup: js.UndefOr[typingsSlinky.awsSdk.ssmMod.PatchGroup] = js.native
}
object RegisterPatchBaselineForPatchGroupResult {
  
  @scala.inline
  def apply(): RegisterPatchBaselineForPatchGroupResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RegisterPatchBaselineForPatchGroupResult]
  }
  
  @scala.inline
  implicit class RegisterPatchBaselineForPatchGroupResultMutableBuilder[Self <: RegisterPatchBaselineForPatchGroupResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBaselineId(value: BaselineId): Self = StObject.set(x, "BaselineId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBaselineIdUndefined: Self = StObject.set(x, "BaselineId", js.undefined)
    
    @scala.inline
    def setPatchGroup(value: PatchGroup): Self = StObject.set(x, "PatchGroup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPatchGroupUndefined: Self = StObject.set(x, "PatchGroup", js.undefined)
  }
}
