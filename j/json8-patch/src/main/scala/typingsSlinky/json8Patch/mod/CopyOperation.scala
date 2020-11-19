package typingsSlinky.json8Patch.mod

import typingsSlinky.json8Patch.json8PatchStrings.copy
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CopyOperation
  extends BaseOperation
     with JsonPatchOperation {
  
  var from: js.Any = js.native
  
  var op: copy = js.native
}
object CopyOperation {
  
  @scala.inline
  def apply(from: js.Any, op: copy, path: String): CopyOperation = {
    val __obj = js.Dynamic.literal(from = from.asInstanceOf[js.Any], op = op.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[CopyOperation]
  }
  
  @scala.inline
  implicit class CopyOperationOps[Self <: CopyOperation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setFrom(value: js.Any): Self = this.set("from", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOp(value: copy): Self = this.set("op", value.asInstanceOf[js.Any])
  }
}
