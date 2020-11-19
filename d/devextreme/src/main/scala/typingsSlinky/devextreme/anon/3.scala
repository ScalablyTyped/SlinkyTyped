package typingsSlinky.devextreme.anon

import typingsSlinky.devextreme.mod.DevExpress.ui.dxFileManagerDetailsColumn
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `3` extends js.Object {
  
  var columns: js.UndefOr[js.Array[dxFileManagerDetailsColumn | String]] = js.native
}
object `3` {
  
  @scala.inline
  def apply(): `3` = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`3`]
  }
  
  @scala.inline
  implicit class `3Ops`[Self <: `3`] (val x: Self) extends AnyVal {
    
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
    def setColumnsVarargs(value: (dxFileManagerDetailsColumn | String)*): Self = this.set("columns", js.Array(value :_*))
    
    @scala.inline
    def setColumns(value: js.Array[dxFileManagerDetailsColumn | String]): Self = this.set("columns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColumns: Self = this.set("columns", js.undefined)
  }
}
