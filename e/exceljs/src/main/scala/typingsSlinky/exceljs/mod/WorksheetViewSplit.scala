package typingsSlinky.exceljs.mod

import typingsSlinky.exceljs.exceljsStrings.bottomLeft
import typingsSlinky.exceljs.exceljsStrings.bottomRight
import typingsSlinky.exceljs.exceljsStrings.pageBreakPreview
import typingsSlinky.exceljs.exceljsStrings.pageLayout
import typingsSlinky.exceljs.exceljsStrings.split
import typingsSlinky.exceljs.exceljsStrings.topLeft
import typingsSlinky.exceljs.exceljsStrings.topRight
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WorksheetViewSplit extends js.Object {
  
  /**
  	 * Which pane will be active
  	 */
  var activePane: js.UndefOr[topLeft | topRight | bottomLeft | bottomRight] = js.native
  
  /**
  	 * Where the view is split into 4 sections, each semi-independently scrollable.
  	 */
  var state: split = js.native
  
  /**
  	 * Presentation style
  	 */
  var style: js.UndefOr[pageBreakPreview | pageLayout] = js.native
  
  /**
  	 * Which cell will be top-left in the bottom-right pane
  	 */
  var topLeftCell: js.UndefOr[String] = js.native
  
  /**
  	 * How many points from the left to place the splitter.
  	 * To split vertically, set this to 0 or undefined
  	 */
  var xSplit: js.UndefOr[Double] = js.native
  
  /**
  	 * How many points from the top to place the splitter.
  	 * To split horizontally, set this to 0 or undefined
  	 */
  var ySplit: js.UndefOr[Double] = js.native
}
object WorksheetViewSplit {
  
  @scala.inline
  def apply(state: split): WorksheetViewSplit = {
    val __obj = js.Dynamic.literal(state = state.asInstanceOf[js.Any])
    __obj.asInstanceOf[WorksheetViewSplit]
  }
  
  @scala.inline
  implicit class WorksheetViewSplitOps[Self <: WorksheetViewSplit] (val x: Self) extends AnyVal {
    
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
    def setState(value: split): Self = this.set("state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActivePane(value: topLeft | topRight | bottomLeft | bottomRight): Self = this.set("activePane", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteActivePane: Self = this.set("activePane", js.undefined)
    
    @scala.inline
    def setStyle(value: pageBreakPreview | pageLayout): Self = this.set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
    
    @scala.inline
    def setTopLeftCell(value: String): Self = this.set("topLeftCell", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTopLeftCell: Self = this.set("topLeftCell", js.undefined)
    
    @scala.inline
    def setXSplit(value: Double): Self = this.set("xSplit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteXSplit: Self = this.set("xSplit", js.undefined)
    
    @scala.inline
    def setYSplit(value: Double): Self = this.set("ySplit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteYSplit: Self = this.set("ySplit", js.undefined)
  }
}
