package typingsSlinky.officeJsPreview.Excel.Interfaces

import typingsSlinky.officeJsPreview.Excel.ArrowheadLength
import typingsSlinky.officeJsPreview.Excel.ArrowheadStyle
import typingsSlinky.officeJsPreview.Excel.ArrowheadWidth
import typingsSlinky.officeJsPreview.Excel.ConnectorType
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.Curve
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.Diamond
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.Elbow
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.Long
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.Medium
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.Narrow
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.None
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.Open
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.Oval
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.Short
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.Stealth
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.Straight
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.Triangle
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.Wide
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An interface describing the data returned by calling `line.toJSON()`. */
@js.native
trait LineData extends js.Object {
  
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
    * Represents the connection site to which the beginning of a connector is connected. Returns null when the beginning of the line is not attached to any shape.
    *
    * [Api set: ExcelApi 1.9]
    */
  var beginConnectedSite: js.UndefOr[Double] = js.native
  
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
  
  /**
    *
    * Represents the connection site to which the end of a connector is connected. Returns null when the end of the line is not attached to any shape.
    *
    * [Api set: ExcelApi 1.9]
    */
  var endConnectedSite: js.UndefOr[Double] = js.native
  
  /**
    *
    * Specifies the shape identifier.
    *
    * [Api set: ExcelApi 1.9]
    */
  var id: js.UndefOr[String] = js.native
  
  /**
    *
    * Specifies if the beginning of the specified line is connected to a shape.
    *
    * [Api set: ExcelApi 1.9]
    */
  var isBeginConnected: js.UndefOr[Boolean] = js.native
  
  /**
    *
    * Specifies if the end of the specified line is connected to a shape.
    *
    * [Api set: ExcelApi 1.9]
    */
  var isEndConnected: js.UndefOr[Boolean] = js.native
}
object LineData {
  
  @scala.inline
  def apply(): LineData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LineData]
  }
  
  @scala.inline
  implicit class LineDataOps[Self <: LineData] (val x: Self) extends AnyVal {
    
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
    def setBeginConnectedSite(value: Double): Self = this.set("beginConnectedSite", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBeginConnectedSite: Self = this.set("beginConnectedSite", js.undefined)
    
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
    
    @scala.inline
    def setEndConnectedSite(value: Double): Self = this.set("endConnectedSite", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEndConnectedSite: Self = this.set("endConnectedSite", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    
    @scala.inline
    def setIsBeginConnected(value: Boolean): Self = this.set("isBeginConnected", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsBeginConnected: Self = this.set("isBeginConnected", js.undefined)
    
    @scala.inline
    def setIsEndConnected(value: Boolean): Self = this.set("isEndConnected", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsEndConnected: Self = this.set("isEndConnected", js.undefined)
  }
}
