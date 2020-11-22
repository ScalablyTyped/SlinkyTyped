package typingsSlinky.devextreme.mod.DevExpress.ui

import typingsSlinky.devextreme.devextremeStrings.infinite
import typingsSlinky.devextreme.devextremeStrings.standard
import typingsSlinky.devextreme.devextremeStrings.virtual
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait dxDataGridScrolling extends GridBaseScrolling {
  
  /**
    * [descr:dxDataGrid.Options.scrolling.mode]
    */
  var mode: js.UndefOr[infinite | standard | virtual] = js.native
}
object dxDataGridScrolling {
  
  @scala.inline
  def apply(): dxDataGridScrolling = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dxDataGridScrolling]
  }
  
  @scala.inline
  implicit class dxDataGridScrollingOps[Self <: dxDataGridScrolling] (val x: Self) extends AnyVal {
    
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
    def setMode(value: infinite | standard | virtual): Self = this.set("mode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMode: Self = this.set("mode", js.undefined)
  }
}
