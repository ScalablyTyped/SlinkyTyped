package typingsSlinky.baseui.menuMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BaseMenuPropsT extends js.Object {
  
  var renderAll: js.UndefOr[Boolean] = js.native
}
object BaseMenuPropsT {
  
  @scala.inline
  def apply(): BaseMenuPropsT = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BaseMenuPropsT]
  }
  
  @scala.inline
  implicit class BaseMenuPropsTOps[Self <: BaseMenuPropsT] (val x: Self) extends AnyVal {
    
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
    def setRenderAll(value: Boolean): Self = this.set("renderAll", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRenderAll: Self = this.set("renderAll", js.undefined)
  }
}
