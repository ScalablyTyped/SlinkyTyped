package typingsSlinky.awsSdk.ssmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeletePatchBaselineResult extends js.Object {
  
  /**
    * The ID of the deleted patch baseline.
    */
  var BaselineId: js.UndefOr[typingsSlinky.awsSdk.ssmMod.BaselineId] = js.native
}
object DeletePatchBaselineResult {
  
  @scala.inline
  def apply(): DeletePatchBaselineResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeletePatchBaselineResult]
  }
  
  @scala.inline
  implicit class DeletePatchBaselineResultOps[Self <: DeletePatchBaselineResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setBaselineId(value: BaselineId): Self = this.set("BaselineId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBaselineId: Self = this.set("BaselineId", js.undefined)
  }
}
