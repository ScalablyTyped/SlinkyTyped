package typingsSlinky.rcPicker

import slinky.core.facade.ReactElement
import typingsSlinky.rcPicker.generateMod.GenerateConfig
import typingsSlinky.rcPicker.interfaceMod.PanelMode
import typingsSlinky.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object panelBodyMod {
  
  @JSImport("rc-picker/es/panels/PanelBody", JSImport.Default)
  @js.native
  def default[DateType](
    hasPrefixClsDisabledDateOnSelectPickerRowNumColNumPrefixColumnRowClassNameBaseDateGetCellClassNameGetCellTextGetCellNodeGetCellDateGenerateConfigTitleCellHeaderCells: PanelBodyProps[DateType]
  ): ReactElement = js.native
  
  @js.native
  trait PanelBodyProps[DateType] extends StObject {
    
    var baseDate: DateType = js.native
    
    var colNum: Double = js.native
    
    var disabledDate: js.UndefOr[js.Function1[/* date */ DateType, Boolean]] = js.native
    
    var generateConfig: GenerateConfig[DateType] = js.native
    
    def getCellClassName(date: DateType): Record[String, js.UndefOr[Boolean]] = js.native
    
    def getCellDate(date: DateType, offset: Double): DateType = js.native
    
    var getCellNode: js.UndefOr[js.Function1[/* date */ DateType, ReactElement]] = js.native
    
    def getCellText(date: DateType): ReactElement = js.native
    
    var headerCells: js.UndefOr[ReactElement] = js.native
    
    def onSelect(value: DateType): Unit = js.native
    
    var picker: js.UndefOr[PanelMode] = js.native
    
    var prefixCls: String = js.native
    
    var prefixColumn: js.UndefOr[js.Function1[/* date */ DateType, ReactElement]] = js.native
    
    var rowClassName: js.UndefOr[js.Function1[/* date */ DateType, String]] = js.native
    
    var rowNum: Double = js.native
    
    var titleCell: js.UndefOr[js.Function1[/* date */ DateType, String]] = js.native
  }
  object PanelBodyProps {
    
    @scala.inline
    def apply[DateType](
      baseDate: DateType,
      colNum: Double,
      generateConfig: GenerateConfig[DateType],
      getCellClassName: DateType => Record[String, js.UndefOr[Boolean]],
      getCellDate: (DateType, Double) => DateType,
      getCellText: DateType => ReactElement,
      onSelect: DateType => Unit,
      prefixCls: String,
      rowNum: Double
    ): PanelBodyProps[DateType] = {
      val __obj = js.Dynamic.literal(baseDate = baseDate.asInstanceOf[js.Any], colNum = colNum.asInstanceOf[js.Any], generateConfig = generateConfig.asInstanceOf[js.Any], getCellClassName = js.Any.fromFunction1(getCellClassName), getCellDate = js.Any.fromFunction2(getCellDate), getCellText = js.Any.fromFunction1(getCellText), onSelect = js.Any.fromFunction1(onSelect), prefixCls = prefixCls.asInstanceOf[js.Any], rowNum = rowNum.asInstanceOf[js.Any])
      __obj.asInstanceOf[PanelBodyProps[DateType]]
    }
    
    @scala.inline
    implicit class PanelBodyPropsMutableBuilder[Self <: PanelBodyProps[_], DateType] (val x: Self with PanelBodyProps[DateType]) extends AnyVal {
      
      @scala.inline
      def setBaseDate(value: DateType): Self = StObject.set(x, "baseDate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColNum(value: Double): Self = StObject.set(x, "colNum", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisabledDate(value: /* date */ DateType => Boolean): Self = StObject.set(x, "disabledDate", js.Any.fromFunction1(value))
      
      @scala.inline
      def setDisabledDateUndefined: Self = StObject.set(x, "disabledDate", js.undefined)
      
      @scala.inline
      def setGenerateConfig(value: GenerateConfig[DateType]): Self = StObject.set(x, "generateConfig", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGetCellClassName(value: DateType => Record[String, js.UndefOr[Boolean]]): Self = StObject.set(x, "getCellClassName", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGetCellDate(value: (DateType, Double) => DateType): Self = StObject.set(x, "getCellDate", js.Any.fromFunction2(value))
      
      @scala.inline
      def setGetCellNode(value: /* date */ DateType => ReactElement): Self = StObject.set(x, "getCellNode", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGetCellNodeUndefined: Self = StObject.set(x, "getCellNode", js.undefined)
      
      @scala.inline
      def setGetCellText(value: DateType => ReactElement): Self = StObject.set(x, "getCellText", js.Any.fromFunction1(value))
      
      @scala.inline
      def setHeaderCells(value: ReactElement): Self = StObject.set(x, "headerCells", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeaderCellsReactElement(value: ReactElement): Self = StObject.set(x, "headerCells", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeaderCellsUndefined: Self = StObject.set(x, "headerCells", js.undefined)
      
      @scala.inline
      def setOnSelect(value: DateType => Unit): Self = StObject.set(x, "onSelect", js.Any.fromFunction1(value))
      
      @scala.inline
      def setPicker(value: PanelMode): Self = StObject.set(x, "picker", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPickerUndefined: Self = StObject.set(x, "picker", js.undefined)
      
      @scala.inline
      def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrefixColumn(value: /* date */ DateType => ReactElement): Self = StObject.set(x, "prefixColumn", js.Any.fromFunction1(value))
      
      @scala.inline
      def setPrefixColumnUndefined: Self = StObject.set(x, "prefixColumn", js.undefined)
      
      @scala.inline
      def setRowClassName(value: /* date */ DateType => String): Self = StObject.set(x, "rowClassName", js.Any.fromFunction1(value))
      
      @scala.inline
      def setRowClassNameUndefined: Self = StObject.set(x, "rowClassName", js.undefined)
      
      @scala.inline
      def setRowNum(value: Double): Self = StObject.set(x, "rowNum", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleCell(value: /* date */ DateType => String): Self = StObject.set(x, "titleCell", js.Any.fromFunction1(value))
      
      @scala.inline
      def setTitleCellUndefined: Self = StObject.set(x, "titleCell", js.undefined)
    }
  }
}
