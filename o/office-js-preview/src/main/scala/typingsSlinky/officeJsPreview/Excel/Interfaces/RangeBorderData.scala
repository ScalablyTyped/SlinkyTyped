package typingsSlinky.officeJsPreview.Excel.Interfaces

import typingsSlinky.officeJsPreview.Excel.BorderIndex
import typingsSlinky.officeJsPreview.Excel.BorderLineStyle
import typingsSlinky.officeJsPreview.Excel.BorderWeight
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.Continuous
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.Dash
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.DashDot
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.DashDotDot
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.DiagonalDown
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.DiagonalUp
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.Dot
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.Double
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.EdgeBottom
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.EdgeLeft
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.EdgeRight
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.EdgeTop
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.Hairline
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.InsideHorizontal
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.InsideVertical
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.Medium
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.None
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.SlantDashDot
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.Thick
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.Thin
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An interface describing the data returned by calling `rangeBorder.toJSON()`. */
@js.native
trait RangeBorderData extends js.Object {
  
  /**
    *
    * HTML color code representing the color of the border line, of the form #RRGGBB (e.g., "FFA500") or as a named HTML color (e.g., "orange").
    *
    * [Api set: ExcelApi 1.1]
    */
  var color: js.UndefOr[String] = js.native
  
  /**
    *
    * Constant value that indicates the specific side of the border. See Excel.BorderIndex for details.
    *
    * [Api set: ExcelApi 1.1]
    */
  var sideIndex: js.UndefOr[
    BorderIndex | EdgeTop | EdgeBottom | EdgeLeft | EdgeRight | InsideVertical | InsideHorizontal | DiagonalDown | DiagonalUp
  ] = js.native
  
  /**
    *
    * One of the constants of line style specifying the line style for the border. See Excel.BorderLineStyle for details.
    *
    * [Api set: ExcelApi 1.1]
    */
  var style: js.UndefOr[
    BorderLineStyle | None | Continuous | Dash | DashDot | DashDotDot | Dot | Double | SlantDashDot
  ] = js.native
  
  /**
    *
    * Specifies a double that lightens or darkens a color for Range Border, the value is between -1 (darkest) and 1 (brightest), with 0 for the original color.
    A null value indicates that the border doesn't have uniform tintAndShade setting.
    *
    * [Api set: ExcelApi 1.9]
    */
  var tintAndShade: js.UndefOr[scala.Double] = js.native
  
  /**
    *
    * Specifies the weight of the border around a range. See Excel.BorderWeight for details.
    *
    * [Api set: ExcelApi 1.1]
    */
  var weight: js.UndefOr[BorderWeight | Hairline | Thin | Medium | Thick] = js.native
}
object RangeBorderData {
  
  @scala.inline
  def apply(): RangeBorderData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RangeBorderData]
  }
  
  @scala.inline
  implicit class RangeBorderDataOps[Self <: RangeBorderData] (val x: Self) extends AnyVal {
    
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
    def setColor(value: String): Self = this.set("color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColor: Self = this.set("color", js.undefined)
    
    @scala.inline
    def setSideIndex(
      value: BorderIndex | EdgeTop | EdgeBottom | EdgeLeft | EdgeRight | InsideVertical | InsideHorizontal | DiagonalDown | DiagonalUp
    ): Self = this.set("sideIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSideIndex: Self = this.set("sideIndex", js.undefined)
    
    @scala.inline
    def setStyle(
      value: BorderLineStyle | None | Continuous | Dash | DashDot | DashDotDot | Dot | Double | SlantDashDot
    ): Self = this.set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
    
    @scala.inline
    def setTintAndShade(value: scala.Double): Self = this.set("tintAndShade", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTintAndShade: Self = this.set("tintAndShade", js.undefined)
    
    @scala.inline
    def setWeight(value: BorderWeight | Hairline | Thin | Medium | Thick): Self = this.set("weight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWeight: Self = this.set("weight", js.undefined)
  }
}
