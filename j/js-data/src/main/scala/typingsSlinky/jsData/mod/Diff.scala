package typingsSlinky.jsData.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Diff extends js.Object {
  
  var added: js.Any = js.native
  
  var changed: js.Any = js.native
  
  var removed: js.Any = js.native
}
object Diff {
  
  @scala.inline
  def apply(added: js.Any, changed: js.Any, removed: js.Any): Diff = {
    val __obj = js.Dynamic.literal(added = added.asInstanceOf[js.Any], changed = changed.asInstanceOf[js.Any], removed = removed.asInstanceOf[js.Any])
    __obj.asInstanceOf[Diff]
  }
  
  @scala.inline
  implicit class DiffOps[Self <: Diff] (val x: Self) extends AnyVal {
    
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
    def setAdded(value: js.Any): Self = this.set("added", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChanged(value: js.Any): Self = this.set("changed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRemoved(value: js.Any): Self = this.set("removed", value.asInstanceOf[js.Any])
  }
}
