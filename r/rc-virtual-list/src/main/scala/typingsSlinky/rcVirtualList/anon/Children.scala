package typingsSlinky.rcVirtualList.anon

import slinky.core.facade.ReactElement
import slinky.core.facade.ReactRef
import typingsSlinky.rcVirtualList.listMod.ListRef
import typingsSlinky.react.mod.Ref
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Children extends js.Object {
  
  var children: js.UndefOr[ReactElement] = js.native
  
  var ref: js.UndefOr[Ref[ListRef]] = js.native
}
object Children {
  
  @scala.inline
  def apply(): Children = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Children]
  }
  
  @scala.inline
  implicit class ChildrenOps[Self <: Children] (val x: Self) extends AnyVal {
    
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
    def setChildrenReactElement(value: ReactElement): Self = this.set("children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChildren(value: ReactElement): Self = this.set("children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChildren: Self = this.set("children", js.undefined)
    
    @scala.inline
    def setRefRefObject(value: ReactRef[ListRef]): Self = this.set("ref", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRefFunction1(value: /* instance */ ListRef | Null => Unit): Self = this.set("ref", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRef(value: Ref[ListRef]): Self = this.set("ref", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRef: Self = this.set("ref", js.undefined)
    
    @scala.inline
    def setRefNull: Self = this.set("ref", null)
  }
}
