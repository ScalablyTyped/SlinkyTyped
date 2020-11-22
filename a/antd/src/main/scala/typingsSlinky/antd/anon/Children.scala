package typingsSlinky.antd.anon

import slinky.core.facade.ReactElement
import slinky.core.facade.ReactRef
import typingsSlinky.antd.useFormMod.FormInstance
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Children[Values] extends js.Object {
  
  var children: js.UndefOr[ReactElement] = js.native
  
  var ref: js.UndefOr[
    (js.Function1[/* instance */ FormInstance[Values] | Null, Unit]) | ReactRef[FormInstance[Values]] | Null
  ] = js.native
}
object Children {
  
  @scala.inline
  def apply[Values](): Children[Values] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Children[Values]]
  }
  
  @scala.inline
  implicit class ChildrenOps[Self <: Children[_], Values] (val x: Self with Children[Values]) extends AnyVal {
    
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
    def setRefRefObject(value: ReactRef[FormInstance[Values]]): Self = this.set("ref", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRefFunction1(value: /* instance */ FormInstance[Values] | Null => Unit): Self = this.set("ref", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRef(
      value: (js.Function1[/* instance */ FormInstance[Values] | Null, Unit]) | ReactRef[FormInstance[Values]]
    ): Self = this.set("ref", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRef: Self = this.set("ref", js.undefined)
    
    @scala.inline
    def setRefNull: Self = this.set("ref", null)
  }
}
