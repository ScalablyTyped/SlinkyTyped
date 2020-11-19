package typingsSlinky.fastJsonPatch.moduleCoreMod

import typingsSlinky.fastJsonPatch.fastJsonPatchStrings.replace
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReplaceOperation[T] extends BaseOperation {
  
  var op: replace = js.native
  
  var value: T = js.native
}
object ReplaceOperation {
  
  @scala.inline
  def apply[T](op: replace, path: String, value: T): ReplaceOperation[T] = {
    val __obj = js.Dynamic.literal(op = op.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReplaceOperation[T]]
  }
  
  @scala.inline
  implicit class ReplaceOperationOps[Self <: ReplaceOperation[_], T] (val x: Self with ReplaceOperation[T]) extends AnyVal {
    
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
    def setOp(value: replace): Self = this.set("op", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: T): Self = this.set("value", value.asInstanceOf[js.Any])
  }
}
