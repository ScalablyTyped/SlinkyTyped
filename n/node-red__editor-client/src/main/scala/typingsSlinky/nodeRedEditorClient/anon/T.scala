package typingsSlinky.nodeRedEditorClient.anon

import typingsSlinky.nodeRedEditorClient.nodeRedEditorClientStrings.createGroup
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait T extends js.Object {
  
  var groups: js.UndefOr[js.Array[js.Object]] = js.native
  
  var t: createGroup = js.native
}
object T {
  
  @scala.inline
  def apply(t: createGroup): T = {
    val __obj = js.Dynamic.literal(t = t.asInstanceOf[js.Any])
    __obj.asInstanceOf[T]
  }
  
  @scala.inline
  implicit class TOps[Self <: T] (val x: Self) extends AnyVal {
    
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
    def setT(value: createGroup): Self = this.set("t", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroupsVarargs(value: js.Object*): Self = this.set("groups", js.Array(value :_*))
    
    @scala.inline
    def setGroups(value: js.Array[js.Object]): Self = this.set("groups", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGroups: Self = this.set("groups", js.undefined)
  }
}
