package typingsSlinky.jointjs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CellModel extends js.Object {
  
  var cellModel: js.UndefOr[TypeofCell] = js.native
  
  var cellNamespace: js.UndefOr[js.Any] = js.native
}
object CellModel {
  
  @scala.inline
  def apply(): CellModel = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CellModel]
  }
  
  @scala.inline
  implicit class CellModelOps[Self <: CellModel] (val x: Self) extends AnyVal {
    
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
    def setCellModel(value: TypeofCell): Self = this.set("cellModel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCellModel: Self = this.set("cellModel", js.undefined)
    
    @scala.inline
    def setCellNamespace(value: js.Any): Self = this.set("cellNamespace", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCellNamespace: Self = this.set("cellNamespace", js.undefined)
  }
}
