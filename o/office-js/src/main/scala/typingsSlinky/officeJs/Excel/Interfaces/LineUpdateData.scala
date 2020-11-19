package typingsSlinky.officeJs.Excel.Interfaces

import typingsSlinky.officeJs.Excel.ArrowheadLength
import typingsSlinky.officeJs.Excel.ArrowheadStyle
import typingsSlinky.officeJs.Excel.ArrowheadWidth
import typingsSlinky.officeJs.Excel.ConnectorType
import typingsSlinky.officeJs.officeJsStrings.Curve
import typingsSlinky.officeJs.officeJsStrings.Diamond
import typingsSlinky.officeJs.officeJsStrings.Elbow
import typingsSlinky.officeJs.officeJsStrings.Long
import typingsSlinky.officeJs.officeJsStrings.Medium
import typingsSlinky.officeJs.officeJsStrings.Narrow
import typingsSlinky.officeJs.officeJsStrings.None
import typingsSlinky.officeJs.officeJsStrings.Open
import typingsSlinky.officeJs.officeJsStrings.Oval
import typingsSlinky.officeJs.officeJsStrings.Short
import typingsSlinky.officeJs.officeJsStrings.Stealth
import typingsSlinky.officeJs.officeJsStrings.Straight
import typingsSlinky.officeJs.officeJsStrings.Triangle
import typingsSlinky.officeJs.officeJsStrings.Wide
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An interface for updating data on the Line object, for use in `line.set({ ... })`. */
@js.native
trait LineUpdateData extends js.Object {
  
  /**
    *
    * Represents the length of the arrowhead at the beginning of the specified line.
    *
    * [Api set: ExcelApi 1.9]
    */
  var beginArrowheadLength: js.UndefOr[ArrowheadLength | Short | Medium | Long] = js.native
  
  /**
    *
    * Represents the style of the arrowhead at the beginning of the specified line.
    *
    * [Api set: ExcelApi 1.9]
    */
  var beginArrowheadStyle: js.UndefOr[ArrowheadStyle | None | Triangle | Stealth | Diamond | Oval | Open] = js.native
  
  /**
    *
    * Represents the width of the arrowhead at the beginning of the specified line.
    *
    * [Api set: ExcelApi 1.9]
    */
  var beginArrowheadWidth: js.UndefOr[ArrowheadWidth | Narrow | Medium | Wide] = js.native
  
  /**
    *
    * Represents the connector type for the line.
    *
    * [Api set: ExcelApi 1.9]
    */
  var connectorType: js.UndefOr[ConnectorType | Straight | Elbow | Curve] = js.native
  
  /**
    *
    * Represents the length of the arrowhead at the end of the specified line.
    *
    * [Api set: ExcelApi 1.9]
    */
  var endArrowheadLength: js.UndefOr[ArrowheadLength | Short | Medium | Long] = js.native
  
  /**
    *
    * Represents the style of the arrowhead at the end of the specified line.
    *
    * [Api set: ExcelApi 1.9]
    */
  var endArrowheadStyle: js.UndefOr[ArrowheadStyle | None | Triangle | Stealth | Diamond | Oval | Open] = js.native
  
  /**
    *
    * Represents the width of the arrowhead at the end of the specified line.
    *
    * [Api set: ExcelApi 1.9]
    */
  var endArrowheadWidth: js.UndefOr[ArrowheadWidth | Narrow | Medium | Wide] = js.native
}
object LineUpdateData {
  
  @scala.inline
  def apply(): LineUpdateData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LineUpdateData]
  }
  
  @scala.inline
  implicit class LineUpdateDataOps[Self <: LineUpdateData] (val x: Self) extends AnyVal {
    
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
    def setBeginArrowheadLength(value: ArrowheadLength | Short | Medium | Long): Self = this.set("beginArrowheadLength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBeginArrowheadLength: Self = this.set("beginArrowheadLength", js.undefined)
    
    @scala.inline
    def setBeginArrowheadStyle(value: ArrowheadStyle | None | Triangle | Stealth | Diamond | Oval | Open): Self = this.set("beginArrowheadStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBeginArrowheadStyle: Self = this.set("beginArrowheadStyle", js.undefined)
    
    @scala.inline
    def setBeginArrowheadWidth(value: ArrowheadWidth | Narrow | Medium | Wide): Self = this.set("beginArrowheadWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBeginArrowheadWidth: Self = this.set("beginArrowheadWidth", js.undefined)
    
    @scala.inline
    def setConnectorType(value: ConnectorType | Straight | Elbow | Curve): Self = this.set("connectorType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConnectorType: Self = this.set("connectorType", js.undefined)
    
    @scala.inline
    def setEndArrowheadLength(value: ArrowheadLength | Short | Medium | Long): Self = this.set("endArrowheadLength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEndArrowheadLength: Self = this.set("endArrowheadLength", js.undefined)
    
    @scala.inline
    def setEndArrowheadStyle(value: ArrowheadStyle | None | Triangle | Stealth | Diamond | Oval | Open): Self = this.set("endArrowheadStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEndArrowheadStyle: Self = this.set("endArrowheadStyle", js.undefined)
    
    @scala.inline
    def setEndArrowheadWidth(value: ArrowheadWidth | Narrow | Medium | Wide): Self = this.set("endArrowheadWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEndArrowheadWidth: Self = this.set("endArrowheadWidth", js.undefined)
  }
}
