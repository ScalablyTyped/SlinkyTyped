package typingsSlinky.officeJsPreview.Excel.Interfaces

import typingsSlinky.officeJsPreview.Excel.ChartColorScheme
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.ColorfulPalette1
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.ColorfulPalette2
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.ColorfulPalette3
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.ColorfulPalette4
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.MonochromaticPalette1
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.MonochromaticPalette10
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.MonochromaticPalette11
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.MonochromaticPalette12
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.MonochromaticPalette13
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.MonochromaticPalette2
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.MonochromaticPalette3
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.MonochromaticPalette4
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.MonochromaticPalette5
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.MonochromaticPalette6
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.MonochromaticPalette7
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.MonochromaticPalette8
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.MonochromaticPalette9
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An interface for updating data on the ChartAreaFormat object, for use in `chartAreaFormat.set({ ... })`. */
@js.native
trait ChartAreaFormatUpdateData extends StObject {
  
  /**
    *
    * Represents the border format of chart area, which includes color, linestyle, and weight.
    *
    * [Api set: ExcelApi 1.7]
    */
  var border: js.UndefOr[ChartBorderUpdateData] = js.native
  
  /**
    *
    * Specifies the color scheme of the chart.
    *
    * [Api set: ExcelApi 1.9]
    */
  var colorScheme: js.UndefOr[
    ChartColorScheme | ColorfulPalette1 | ColorfulPalette2 | ColorfulPalette3 | ColorfulPalette4 | MonochromaticPalette1 | MonochromaticPalette2 | MonochromaticPalette3 | MonochromaticPalette4 | MonochromaticPalette5 | MonochromaticPalette6 | MonochromaticPalette7 | MonochromaticPalette8 | MonochromaticPalette9 | MonochromaticPalette10 | MonochromaticPalette11 | MonochromaticPalette12 | MonochromaticPalette13
  ] = js.native
  
  /**
    *
    * Represents the font attributes (font name, font size, color, etc.) for the current object.
    *
    * [Api set: ExcelApi 1.1]
    */
  var font: js.UndefOr[ChartFontUpdateData] = js.native
  
  /**
    *
    * Specifies if the chart area of the chart has rounded corners.
    *
    * [Api set: ExcelApi 1.9]
    */
  var roundedCorners: js.UndefOr[Boolean] = js.native
}
object ChartAreaFormatUpdateData {
  
  @scala.inline
  def apply(): ChartAreaFormatUpdateData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChartAreaFormatUpdateData]
  }
  
  @scala.inline
  implicit class ChartAreaFormatUpdateDataMutableBuilder[Self <: ChartAreaFormatUpdateData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBorder(value: ChartBorderUpdateData): Self = StObject.set(x, "border", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBorderUndefined: Self = StObject.set(x, "border", js.undefined)
    
    @scala.inline
    def setColorScheme(
      value: ChartColorScheme | ColorfulPalette1 | ColorfulPalette2 | ColorfulPalette3 | ColorfulPalette4 | MonochromaticPalette1 | MonochromaticPalette2 | MonochromaticPalette3 | MonochromaticPalette4 | MonochromaticPalette5 | MonochromaticPalette6 | MonochromaticPalette7 | MonochromaticPalette8 | MonochromaticPalette9 | MonochromaticPalette10 | MonochromaticPalette11 | MonochromaticPalette12 | MonochromaticPalette13
    ): Self = StObject.set(x, "colorScheme", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorSchemeUndefined: Self = StObject.set(x, "colorScheme", js.undefined)
    
    @scala.inline
    def setFont(value: ChartFontUpdateData): Self = StObject.set(x, "font", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFontUndefined: Self = StObject.set(x, "font", js.undefined)
    
    @scala.inline
    def setRoundedCorners(value: Boolean): Self = StObject.set(x, "roundedCorners", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoundedCornersUndefined: Self = StObject.set(x, "roundedCorners", js.undefined)
  }
}
