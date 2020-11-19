package typingsSlinky.devextreme.mod.DevExpress.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait dxGanttStripLine extends js.Object {
  
  /** @name dxGanttStripLine.cssClass */
  var cssClass: js.UndefOr[String] = js.native
  
  /** @name dxGanttStripLine.end */
  var end: js.UndefOr[js.Date | Double | String | (js.Function0[js.Date | Double | String])] = js.native
  
  /** @name dxGanttStripLine.start */
  var start: js.UndefOr[js.Date | Double | String | (js.Function0[js.Date | Double | String])] = js.native
  
  /** @name dxGanttStripLine.title */
  var title: js.UndefOr[String] = js.native
}
object dxGanttStripLine {
  
  @scala.inline
  def apply(): dxGanttStripLine = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dxGanttStripLine]
  }
  
  @scala.inline
  implicit class dxGanttStripLineOps[Self <: dxGanttStripLine] (val x: Self) extends AnyVal {
    
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
    def setCssClass(value: String): Self = this.set("cssClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCssClass: Self = this.set("cssClass", js.undefined)
    
    @scala.inline
    def setEndDate(value: js.Date): Self = this.set("end", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndFunction0(value: () => js.Date | Double | String): Self = this.set("end", js.Any.fromFunction0(value))
    
    @scala.inline
    def setEnd(value: js.Date | Double | String | (js.Function0[js.Date | Double | String])): Self = this.set("end", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnd: Self = this.set("end", js.undefined)
    
    @scala.inline
    def setStartDate(value: js.Date): Self = this.set("start", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartFunction0(value: () => js.Date | Double | String): Self = this.set("start", js.Any.fromFunction0(value))
    
    @scala.inline
    def setStart(value: js.Date | Double | String | (js.Function0[js.Date | Double | String])): Self = this.set("start", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStart: Self = this.set("start", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
  }
}
