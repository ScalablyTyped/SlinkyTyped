package typingsSlinky.baseui.listMod

import slinky.core.facade.ReactElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LabelPropsT extends js.Object {
  
  var children: ReactElement = js.native
  
  var description: js.UndefOr[ReactElement] = js.native
  
  var sublist: js.UndefOr[Boolean] = js.native
}
object LabelPropsT {
  
  @scala.inline
  def apply(): LabelPropsT = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LabelPropsT]
  }
  
  @scala.inline
  implicit class LabelPropsTOps[Self <: LabelPropsT] (val x: Self) extends AnyVal {
    
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
    def setChildren(value: ReactElement): Self = this.set("children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChildren: Self = this.set("children", js.undefined)
    
    @scala.inline
    def setDescriptionReactElement(value: ReactElement): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescription(value: ReactElement): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    
    @scala.inline
    def setSublist(value: Boolean): Self = this.set("sublist", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSublist: Self = this.set("sublist", js.undefined)
  }
}
