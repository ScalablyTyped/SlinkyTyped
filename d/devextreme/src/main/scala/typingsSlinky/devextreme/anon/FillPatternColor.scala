package typingsSlinky.devextreme.anon

import typingsSlinky.devextreme.devextremeStrings.bottom
import typingsSlinky.devextreme.devextremeStrings.center
import typingsSlinky.devextreme.devextremeStrings.centerContinuous
import typingsSlinky.devextreme.devextremeStrings.darkDown
import typingsSlinky.devextreme.devextremeStrings.darkGray
import typingsSlinky.devextreme.devextremeStrings.darkGrid
import typingsSlinky.devextreme.devextremeStrings.darkHorizontal
import typingsSlinky.devextreme.devextremeStrings.darkTrellis
import typingsSlinky.devextreme.devextremeStrings.darkUp
import typingsSlinky.devextreme.devextremeStrings.darkVertical
import typingsSlinky.devextreme.devextremeStrings.distributed
import typingsSlinky.devextreme.devextremeStrings.fill
import typingsSlinky.devextreme.devextremeStrings.general
import typingsSlinky.devextreme.devextremeStrings.gray0625
import typingsSlinky.devextreme.devextremeStrings.gray125
import typingsSlinky.devextreme.devextremeStrings.justify
import typingsSlinky.devextreme.devextremeStrings.left
import typingsSlinky.devextreme.devextremeStrings.lightDown
import typingsSlinky.devextreme.devextremeStrings.lightGray
import typingsSlinky.devextreme.devextremeStrings.lightGrid
import typingsSlinky.devextreme.devextremeStrings.lightHorizontal
import typingsSlinky.devextreme.devextremeStrings.lightTrellis
import typingsSlinky.devextreme.devextremeStrings.lightUp
import typingsSlinky.devextreme.devextremeStrings.lightVertical
import typingsSlinky.devextreme.devextremeStrings.mediumGray
import typingsSlinky.devextreme.devextremeStrings.none
import typingsSlinky.devextreme.devextremeStrings.right
import typingsSlinky.devextreme.devextremeStrings.solid
import typingsSlinky.devextreme.devextremeStrings.top
import typingsSlinky.devextreme.mod.DevExpress.excelExporter.ExcelDataGridCell
import typingsSlinky.devextreme.mod.DevExpress.exporter.ExcelFont
import typingsSlinky.devextreme.mod.DevExpress.ui.dxDataGrid
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FillPatternColor extends StObject {
  
  var backgroundColor: js.UndefOr[String] = js.native
  
  var component: js.UndefOr[dxDataGrid] = js.native
  
  var fillPatternColor: js.UndefOr[String] = js.native
  
  var fillPatternType: js.UndefOr[
    darkDown | darkGray | darkGrid | darkHorizontal | darkTrellis | darkUp | darkVertical | gray0625 | gray125 | lightDown | lightGray | lightGrid | lightHorizontal | lightTrellis | lightUp | lightVertical | mediumGray | none | solid
  ] = js.native
  
  var font: js.UndefOr[ExcelFont] = js.native
  
  var gridCell: js.UndefOr[ExcelDataGridCell] = js.native
  
  var horizontalAlignment: js.UndefOr[
    center | centerContinuous | distributed | fill | general | justify | left | right
  ] = js.native
  
  var numberFormat: js.UndefOr[String] = js.native
  
  var value: js.UndefOr[String | Double | js.Date] = js.native
  
  var verticalAlignment: js.UndefOr[bottom | center | distributed | justify | top] = js.native
  
  var wrapTextEnabled: js.UndefOr[Boolean] = js.native
}
object FillPatternColor {
  
  @scala.inline
  def apply(): FillPatternColor = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FillPatternColor]
  }
  
  @scala.inline
  implicit class FillPatternColorMutableBuilder[Self <: FillPatternColor] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBackgroundColor(value: String): Self = StObject.set(x, "backgroundColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBackgroundColorUndefined: Self = StObject.set(x, "backgroundColor", js.undefined)
    
    @scala.inline
    def setComponent(value: dxDataGrid): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setComponentUndefined: Self = StObject.set(x, "component", js.undefined)
    
    @scala.inline
    def setFillPatternColor(value: String): Self = StObject.set(x, "fillPatternColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFillPatternColorUndefined: Self = StObject.set(x, "fillPatternColor", js.undefined)
    
    @scala.inline
    def setFillPatternType(
      value: darkDown | darkGray | darkGrid | darkHorizontal | darkTrellis | darkUp | darkVertical | gray0625 | gray125 | lightDown | lightGray | lightGrid | lightHorizontal | lightTrellis | lightUp | lightVertical | mediumGray | none | solid
    ): Self = StObject.set(x, "fillPatternType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFillPatternTypeUndefined: Self = StObject.set(x, "fillPatternType", js.undefined)
    
    @scala.inline
    def setFont(value: ExcelFont): Self = StObject.set(x, "font", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFontUndefined: Self = StObject.set(x, "font", js.undefined)
    
    @scala.inline
    def setGridCell(value: ExcelDataGridCell): Self = StObject.set(x, "gridCell", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGridCellUndefined: Self = StObject.set(x, "gridCell", js.undefined)
    
    @scala.inline
    def setHorizontalAlignment(value: center | centerContinuous | distributed | fill | general | justify | left | right): Self = StObject.set(x, "horizontalAlignment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHorizontalAlignmentUndefined: Self = StObject.set(x, "horizontalAlignment", js.undefined)
    
    @scala.inline
    def setNumberFormat(value: String): Self = StObject.set(x, "numberFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNumberFormatUndefined: Self = StObject.set(x, "numberFormat", js.undefined)
    
    @scala.inline
    def setValue(value: String | Double | js.Date): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueDate(value: js.Date): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    
    @scala.inline
    def setVerticalAlignment(value: bottom | center | distributed | justify | top): Self = StObject.set(x, "verticalAlignment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVerticalAlignmentUndefined: Self = StObject.set(x, "verticalAlignment", js.undefined)
    
    @scala.inline
    def setWrapTextEnabled(value: Boolean): Self = StObject.set(x, "wrapTextEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWrapTextEnabledUndefined: Self = StObject.set(x, "wrapTextEnabled", js.undefined)
  }
}
