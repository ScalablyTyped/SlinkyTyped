package typingsSlinky.ejWebAll.ej.datavisualization

import typingsSlinky.ejWebAll.ej.Model
import typingsSlinky.ejWebAll.ej.Widget_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HeatMap extends Widget_ {
  
  var defaults: Model = js.native
  
  @JSName("model")
  var model_HeatMap: Model = js.native
}
object HeatMap {
  
  @js.native
  sealed trait Associate extends StObject
  @JSGlobal("ej.datavisualization.HeatMap.Associate")
  @js.native
  object Associate extends StObject {
    
    //Used to set the associate of tooltip as MouseEnter
    @js.native
    sealed trait MouseEnter extends Associate
    
    //Used to set the associate of tooltip as MouseFollow
    @js.native
    sealed trait MouseFollow extends Associate
    
    //Used to set the associate of tooltip as Target
    @js.native
    sealed trait Target extends Associate
  }
  
  @js.native
  sealed trait CellVisibility extends StObject
  @JSGlobal("ej.datavisualization.HeatMap.CellVisibility")
  @js.native
  object CellVisibility extends StObject {
    
    //Hide the content of the cell
    @js.native
    sealed trait Hidden extends CellVisibility
    
    //Display the content of the cell
    @js.native
    sealed trait Visible extends CellVisibility
  }
  
  @js.native
  sealed trait Effect extends StObject
  @JSGlobal("ej.datavisualization.HeatMap.Effect")
  @js.native
  object Effect extends StObject {
    
    //Sets tooltip animation as Fade
    @js.native
    sealed trait Fade extends Effect
    
    //Sets tooltip animation as None
    @js.native
    sealed trait None extends Effect
    
    //Sets tooltip animation as Slide
    @js.native
    sealed trait Slide extends Effect
  }
  
  @js.native
  sealed trait Horizontal extends StObject
  @JSGlobal("ej.datavisualization.HeatMap.Horizontal")
  @js.native
  object Horizontal extends StObject {
    
    //Used to display the tooltip horizontally on center side of rows/columns
    @js.native
    sealed trait Center extends Horizontal
    
    //Used to display the tooltip horizontally on left side of rows/columns
    @js.native
    sealed trait Left extends Horizontal
    
    //Used to display the tooltip horizontally on right side of rows/columns
    @js.native
    sealed trait Right extends Horizontal
  }
  
  @js.native
  sealed trait LegendMode extends StObject
  @JSGlobal("ej.datavisualization.HeatMap.LegendMode")
  @js.native
  object LegendMode extends StObject {
    
    //Scales the graphic content non-uniformly to the width and height of the diagram area
    @js.native
    sealed trait Gradient extends LegendMode
    
    //Used to align the image at the top left of diagram area
    @js.native
    sealed trait List extends LegendMode
  }
  
  @js.native
  sealed trait LegendOrientation extends StObject
  @JSGlobal("ej.datavisualization.HeatMap.LegendOrientation")
  @js.native
  object LegendOrientation extends StObject {
    
    //Scales the graphic content non-uniformly to the width and height of the diagram area
    @js.native
    sealed trait Horizontal extends LegendOrientation
    
    //Used to align the image at the top left of diagram area
    @js.native
    sealed trait Vertical extends LegendOrientation
  }
  
  @js.native
  sealed trait TextDecoration extends StObject
  @JSGlobal("ej.datavisualization.HeatMap.TextDecoration")
  @js.native
  object TextDecoration extends StObject {
    
    //Defines a line through the text
    @js.native
    sealed trait LineThrough extends TextDecoration
    
    //Defines a normal text. This is default
    @js.native
    sealed trait None extends TextDecoration
    
    //Defines a line above the text
    @js.native
    sealed trait Overline extends TextDecoration
    
    //Defines a line below the text
    @js.native
    sealed trait Underline extends TextDecoration
  }
  
  @js.native
  sealed trait Trigger extends StObject
  @JSGlobal("ej.datavisualization.HeatMap.Trigger")
  @js.native
  object Trigger extends StObject {
    
    //Tooltip can be triggered on mouse click
    @js.native
    sealed trait Click extends Trigger
    
    //Tooltip can be triggered on mouse hovers
    @js.native
    sealed trait Hover extends Trigger
  }
  
  @js.native
  sealed trait Vertical extends StObject
  @JSGlobal("ej.datavisualization.HeatMap.Vertical")
  @js.native
  object Vertical extends StObject {
    
    //Used to display the tooltip horizontally on right side of rows/columns
    @js.native
    sealed trait Bottom extends Vertical
    
    //Used to display the tooltip horizontally on center side of rows/columns
    @js.native
    sealed trait Center extends Vertical
    
    //Used to display the tooltip horizontally on left side of rows/columns
    @js.native
    sealed trait Top extends Vertical
  }
  
  @js.native
  trait CellMouseEnterEventArgs extends StObject {
    
    /** Returns the specific HeatMap cell
      */
    var cell: js.UndefOr[js.Any] = js.native
    
    /** Value displayed on the cell
      */
    var cellValue: js.UndefOr[String] = js.native
    
    /** Returns the HeatMap cell data
      */
    var source: js.UndefOr[js.Any] = js.native
  }
  object CellMouseEnterEventArgs {
    
    @scala.inline
    def apply(): CellMouseEnterEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CellMouseEnterEventArgs]
    }
    
    @scala.inline
    implicit class CellMouseEnterEventArgsMutableBuilder[Self <: CellMouseEnterEventArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCell(value: js.Any): Self = StObject.set(x, "cell", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCellUndefined: Self = StObject.set(x, "cell", js.undefined)
      
      @scala.inline
      def setCellValue(value: String): Self = StObject.set(x, "cellValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCellValueUndefined: Self = StObject.set(x, "cellValue", js.undefined)
      
      @scala.inline
      def setSource(value: js.Any): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
    }
  }
  
  @js.native
  trait CellMouseLeaveEventArgs extends StObject {
    
    /** Returns the specific HeatMap cell
      */
    var cell: js.UndefOr[js.Any] = js.native
    
    /** Value displayed on the cell
      */
    var cellValue: js.UndefOr[String] = js.native
    
    /** Returns the HeatMap cell data
      */
    var source: js.UndefOr[js.Any] = js.native
  }
  object CellMouseLeaveEventArgs {
    
    @scala.inline
    def apply(): CellMouseLeaveEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CellMouseLeaveEventArgs]
    }
    
    @scala.inline
    implicit class CellMouseLeaveEventArgsMutableBuilder[Self <: CellMouseLeaveEventArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCell(value: js.Any): Self = StObject.set(x, "cell", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCellUndefined: Self = StObject.set(x, "cell", js.undefined)
      
      @scala.inline
      def setCellValue(value: String): Self = StObject.set(x, "cellValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCellValueUndefined: Self = StObject.set(x, "cellValue", js.undefined)
      
      @scala.inline
      def setSource(value: js.Any): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
    }
  }
  
  @js.native
  trait CellMouseOverEventArgs extends StObject {
    
    /** Returns the specific HeatMap cell
      */
    var cell: js.UndefOr[js.Any] = js.native
    
    /** Value displayed on the cell
      */
    var cellValue: js.UndefOr[String] = js.native
    
    /** Returns the HeatMap cell data
      */
    var source: js.UndefOr[js.Any] = js.native
  }
  object CellMouseOverEventArgs {
    
    @scala.inline
    def apply(): CellMouseOverEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CellMouseOverEventArgs]
    }
    
    @scala.inline
    implicit class CellMouseOverEventArgsMutableBuilder[Self <: CellMouseOverEventArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCell(value: js.Any): Self = StObject.set(x, "cell", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCellUndefined: Self = StObject.set(x, "cell", js.undefined)
      
      @scala.inline
      def setCellValue(value: String): Self = StObject.set(x, "cellValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCellValueUndefined: Self = StObject.set(x, "cellValue", js.undefined)
      
      @scala.inline
      def setSource(value: js.Any): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
    }
  }
  
  @js.native
  trait CellSelectedEventArgs extends StObject {
    
    /** Returns the specific HeatMap cell
      */
    var cell: js.UndefOr[js.Any] = js.native
    
    /** Value displayed on the cell
      */
    var cellValue: js.UndefOr[String] = js.native
    
    /** Returns the HeatMap cell data
      */
    var source: js.UndefOr[js.Any] = js.native
  }
  object CellSelectedEventArgs {
    
    @scala.inline
    def apply(): CellSelectedEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CellSelectedEventArgs]
    }
    
    @scala.inline
    implicit class CellSelectedEventArgsMutableBuilder[Self <: CellSelectedEventArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCell(value: js.Any): Self = StObject.set(x, "cell", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCellUndefined: Self = StObject.set(x, "cell", js.undefined)
      
      @scala.inline
      def setCellValue(value: String): Self = StObject.set(x, "cellValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCellValueUndefined: Self = StObject.set(x, "cellValue", js.undefined)
      
      @scala.inline
      def setSource(value: js.Any): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
    }
  }
  
  @js.native
  trait ColorMappingCollection extends StObject {
    
    /** Specifies the color of the heat map column data.
      * @Default {white}
      */
    var color: js.UndefOr[String] = js.native
    
    /** Specifies the label properties of the heat map color.
      * @Default {null}
      */
    var label: js.UndefOr[ColorMappingCollectionLabel] = js.native
    
    /** Specifies the color values of the heat map column data.
      * @Default {0}
      */
    var value: js.UndefOr[Double] = js.native
  }
  object ColorMappingCollection {
    
    @scala.inline
    def apply(): ColorMappingCollection = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ColorMappingCollection]
    }
    
    @scala.inline
    implicit class ColorMappingCollectionMutableBuilder[Self <: ColorMappingCollection] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      @scala.inline
      def setLabel(value: ColorMappingCollectionLabel): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
      
      @scala.inline
      def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  @js.native
  trait ColorMappingCollectionLabel extends StObject {
    
    /** Enables/disables the bold style of the heat map label.
      * @Default {false}
      */
    var bold: js.UndefOr[Boolean] = js.native
    
    /** Specifies the font color of the heat map label.
      * @Default {black}
      */
    var fontColor: js.UndefOr[String] = js.native
    
    /** Specifies the font family of the heat map label.
      * @Default {Arial}
      */
    var fontFamily: js.UndefOr[String] = js.native
    
    /** Specifies the font size of the heat map label.
      * @Default {10}
      */
    var fontSize: js.UndefOr[Double] = js.native
    
    /** Enables/disables the italic style of the heat map label.
      * @Default {false}
      */
    var italic: js.UndefOr[Boolean] = js.native
    
    /** specifies the text value of the heat map label.
      */
    var text: js.UndefOr[String] = js.native
    
    /** Specifies the text style of the heat map label.
      * @Default {ej.HeatMap.TextDecoration.None}
      */
    var textDecoration: js.UndefOr[TextDecoration | String] = js.native
  }
  object ColorMappingCollectionLabel {
    
    @scala.inline
    def apply(): ColorMappingCollectionLabel = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ColorMappingCollectionLabel]
    }
    
    @scala.inline
    implicit class ColorMappingCollectionLabelMutableBuilder[Self <: ColorMappingCollectionLabel] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBold(value: Boolean): Self = StObject.set(x, "bold", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBoldUndefined: Self = StObject.set(x, "bold", js.undefined)
      
      @scala.inline
      def setFontColor(value: String): Self = StObject.set(x, "fontColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFontColorUndefined: Self = StObject.set(x, "fontColor", js.undefined)
      
      @scala.inline
      def setFontFamily(value: String): Self = StObject.set(x, "fontFamily", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFontFamilyUndefined: Self = StObject.set(x, "fontFamily", js.undefined)
      
      @scala.inline
      def setFontSize(value: Double): Self = StObject.set(x, "fontSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFontSizeUndefined: Self = StObject.set(x, "fontSize", js.undefined)
      
      @scala.inline
      def setItalic(value: Boolean): Self = StObject.set(x, "italic", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItalicUndefined: Self = StObject.set(x, "italic", js.undefined)
      
      @scala.inline
      def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTextDecoration(value: TextDecoration | String): Self = StObject.set(x, "textDecoration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTextDecorationUndefined: Self = StObject.set(x, "textDecoration", js.undefined)
      
      @scala.inline
      def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
    }
  }
  
  @js.native
  trait DefaultColumnStyle extends StObject {
    
    /** Specifies the template id of the heat map column header.
      */
    var headerTemplateID: js.UndefOr[String] = js.native
    
    /** Specifies the template id of all individual cell data of the heat map.
      */
    var templateID: js.UndefOr[String] = js.native
    
    /** Specifies the alignment mode of the heat map column.
      * @Default {ej.HeatMap.TextAlign.Center}
      */
    var textAlign: js.UndefOr[js.Any] = js.native
  }
  object DefaultColumnStyle {
    
    @scala.inline
    def apply(): DefaultColumnStyle = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DefaultColumnStyle]
    }
    
    @scala.inline
    implicit class DefaultColumnStyleMutableBuilder[Self <: DefaultColumnStyle] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHeaderTemplateID(value: String): Self = StObject.set(x, "headerTemplateID", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeaderTemplateIDUndefined: Self = StObject.set(x, "headerTemplateID", js.undefined)
      
      @scala.inline
      def setTemplateID(value: String): Self = StObject.set(x, "templateID", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTemplateIDUndefined: Self = StObject.set(x, "templateID", js.undefined)
      
      @scala.inline
      def setTextAlign(value: js.Any): Self = StObject.set(x, "textAlign", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTextAlignUndefined: Self = StObject.set(x, "textAlign", js.undefined)
    }
  }
  
  @js.native
  trait HeatMapCell extends StObject {
    
    /** Specifies whether the cell color can be visible or not.
      * @Default {true}
      */
    var showColor: js.UndefOr[Boolean] = js.native
    
    /** Specifies whether the cell content can be visible or not.
      * @Default {ej.HeatMap.CellVisibility.Visible}
      */
    var showContent: js.UndefOr[CellVisibility | String] = js.native
  }
  object HeatMapCell {
    
    @scala.inline
    def apply(): HeatMapCell = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[HeatMapCell]
    }
    
    @scala.inline
    implicit class HeatMapCellMutableBuilder[Self <: HeatMapCell] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setShowColor(value: Boolean): Self = StObject.set(x, "showColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowColorUndefined: Self = StObject.set(x, "showColor", js.undefined)
      
      @scala.inline
      def setShowContent(value: CellVisibility | String): Self = StObject.set(x, "showContent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowContentUndefined: Self = StObject.set(x, "showContent", js.undefined)
    }
  }
  
  @js.native
  trait ItemsMapping extends StObject {
    
    /** Specifies the property and display value of the column.
      * @Default {null}
      */
    var column: js.UndefOr[ItemsMappingColumn] = js.native
    
    /** Specifies the property and display value of the collection of column.
      * @Default {[]}
      */
    var columnMapping: js.UndefOr[js.Array[_]] = js.native
    
    /** Column settings for the individual heat map column.
      * @Default {null}
      */
    var columnStyle: js.UndefOr[ItemsMappingColumnStyle] = js.native
    
    /** Specifies the property and display value of the header.
      * @Default {null}
      */
    var headerMapping: js.UndefOr[ItemsMappingHeaderMapping] = js.native
    
    /** Specifies the row property and display value of the heat map.
      * @Default {null}
      */
    var row: js.UndefOr[ItemsMappingRow] = js.native
    
    /** Specifies the property and display value of the column value.
      * @Default {null}
      */
    var value: js.UndefOr[ItemsMappingValue] = js.native
  }
  object ItemsMapping {
    
    @scala.inline
    def apply(): ItemsMapping = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ItemsMapping]
    }
    
    @scala.inline
    implicit class ItemsMappingMutableBuilder[Self <: ItemsMapping] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setColumn(value: ItemsMappingColumn): Self = StObject.set(x, "column", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColumnMapping(value: js.Array[_]): Self = StObject.set(x, "columnMapping", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColumnMappingUndefined: Self = StObject.set(x, "columnMapping", js.undefined)
      
      @scala.inline
      def setColumnMappingVarargs(value: js.Any*): Self = StObject.set(x, "columnMapping", js.Array(value :_*))
      
      @scala.inline
      def setColumnStyle(value: ItemsMappingColumnStyle): Self = StObject.set(x, "columnStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColumnStyleUndefined: Self = StObject.set(x, "columnStyle", js.undefined)
      
      @scala.inline
      def setColumnUndefined: Self = StObject.set(x, "column", js.undefined)
      
      @scala.inline
      def setHeaderMapping(value: ItemsMappingHeaderMapping): Self = StObject.set(x, "headerMapping", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeaderMappingUndefined: Self = StObject.set(x, "headerMapping", js.undefined)
      
      @scala.inline
      def setRow(value: ItemsMappingRow): Self = StObject.set(x, "row", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRowUndefined: Self = StObject.set(x, "row", js.undefined)
      
      @scala.inline
      def setValue(value: ItemsMappingValue): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  @js.native
  trait ItemsMappingColumn extends StObject {
    
    /** Specifies the value of the column or row.
      */
    var displayName: js.UndefOr[String] = js.native
    
    /** Specifies the name of the column or row.
      */
    var propertyName: js.UndefOr[String] = js.native
  }
  object ItemsMappingColumn {
    
    @scala.inline
    def apply(): ItemsMappingColumn = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ItemsMappingColumn]
    }
    
    @scala.inline
    implicit class ItemsMappingColumnMutableBuilder[Self <: ItemsMappingColumn] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
      
      @scala.inline
      def setPropertyName(value: String): Self = StObject.set(x, "propertyName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPropertyNameUndefined: Self = StObject.set(x, "propertyName", js.undefined)
    }
  }
  
  @js.native
  trait ItemsMappingColumnStyle extends StObject {
    
    /** Specifies the template id of the column header.
      */
    var headerTemplateID: js.UndefOr[String] = js.native
    
    /** Specifies the template id of all individual cell data.
      */
    var templateID: js.UndefOr[String] = js.native
    
    /** Specifies the text align mode of the heat map column.
      * @Default {ej.HeatMap.TextAlign.Center}
      */
    var textAlign: js.UndefOr[String] = js.native
    
    /** Specifies the width of the heat map column.
      * @Default {0}
      */
    var width: js.UndefOr[Double] = js.native
  }
  object ItemsMappingColumnStyle {
    
    @scala.inline
    def apply(): ItemsMappingColumnStyle = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ItemsMappingColumnStyle]
    }
    
    @scala.inline
    implicit class ItemsMappingColumnStyleMutableBuilder[Self <: ItemsMappingColumnStyle] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHeaderTemplateID(value: String): Self = StObject.set(x, "headerTemplateID", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeaderTemplateIDUndefined: Self = StObject.set(x, "headerTemplateID", js.undefined)
      
      @scala.inline
      def setTemplateID(value: String): Self = StObject.set(x, "templateID", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTemplateIDUndefined: Self = StObject.set(x, "templateID", js.undefined)
      
      @scala.inline
      def setTextAlign(value: String): Self = StObject.set(x, "textAlign", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTextAlignUndefined: Self = StObject.set(x, "textAlign", js.undefined)
      
      @scala.inline
      def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  @js.native
  trait ItemsMappingHeaderMapping extends StObject {
    
    /** Specifies the property and display value of the header.
      * @Default {null}
      */
    var columnStyle: js.UndefOr[js.Any] = js.native
    
    /** Specifies the value of the column or row.
      */
    var displayName: js.UndefOr[String] = js.native
    
    /** Specifies the name of the column or row.
      */
    var propertyName: js.UndefOr[String] = js.native
  }
  object ItemsMappingHeaderMapping {
    
    @scala.inline
    def apply(): ItemsMappingHeaderMapping = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ItemsMappingHeaderMapping]
    }
    
    @scala.inline
    implicit class ItemsMappingHeaderMappingMutableBuilder[Self <: ItemsMappingHeaderMapping] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setColumnStyle(value: js.Any): Self = StObject.set(x, "columnStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColumnStyleUndefined: Self = StObject.set(x, "columnStyle", js.undefined)
      
      @scala.inline
      def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
      
      @scala.inline
      def setPropertyName(value: String): Self = StObject.set(x, "propertyName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPropertyNameUndefined: Self = StObject.set(x, "propertyName", js.undefined)
    }
  }
  
  @js.native
  trait ItemsMappingRow extends StObject {
    
    /** Specifies the value of the column or row.
      */
    var displayName: js.UndefOr[String] = js.native
    
    /** Specifies the name of the column or row.
      */
    var propertyName: js.UndefOr[String] = js.native
  }
  object ItemsMappingRow {
    
    @scala.inline
    def apply(): ItemsMappingRow = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ItemsMappingRow]
    }
    
    @scala.inline
    implicit class ItemsMappingRowMutableBuilder[Self <: ItemsMappingRow] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
      
      @scala.inline
      def setPropertyName(value: String): Self = StObject.set(x, "propertyName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPropertyNameUndefined: Self = StObject.set(x, "propertyName", js.undefined)
    }
  }
  
  @js.native
  trait ItemsMappingValue extends StObject {
    
    /** Specifies the value of the column or row.
      */
    var displayName: js.UndefOr[String] = js.native
    
    /** Specifies the name of the column or row.
      */
    var propertyName: js.UndefOr[String] = js.native
  }
  object ItemsMappingValue {
    
    @scala.inline
    def apply(): ItemsMappingValue = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ItemsMappingValue]
    }
    
    @scala.inline
    implicit class ItemsMappingValueMutableBuilder[Self <: ItemsMappingValue] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
      
      @scala.inline
      def setPropertyName(value: String): Self = StObject.set(x, "propertyName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPropertyNameUndefined: Self = StObject.set(x, "propertyName", js.undefined)
    }
  }
  
  @js.native
  trait Model extends StObject {
    
    /** Triggered when the mouse over on the cell.
      */
    var cellMouseEnter: js.UndefOr[js.Function1[/* e */ CellMouseEnterEventArgs, Unit]] = js.native
    
    /** Triggered when the mouse over on the cell.
      */
    var cellMouseLeave: js.UndefOr[js.Function1[/* e */ CellMouseLeaveEventArgs, Unit]] = js.native
    
    /** Triggered when the mouse over on the cell.
      */
    var cellMouseOver: js.UndefOr[js.Function1[/* e */ CellMouseOverEventArgs, Unit]] = js.native
    
    /** Triggered when the mouse over on the cell.
      */
    var cellSelected: js.UndefOr[js.Function1[/* e */ CellSelectedEventArgs, Unit]] = js.native
    
    /** Specifies the color values of the heat map column data.
      * @Default {[]}
      */
    var colorMappingCollection: js.UndefOr[js.Array[ColorMappingCollection]] = js.native
    
    /** Specifies the default column properties for all the column style not specified in column properties.
      * @Default {[]}
      */
    var defaultColumnStyle: js.UndefOr[DefaultColumnStyle] = js.native
    
    /** Specifies whether the virtualization can be enable or not.
      * @Default {false}
      */
    var enableVirtualization: js.UndefOr[Boolean] = js.native
    
    /** Specifies the property of the heat map cell.
      * @Default {Null}
      */
    var heatMapCell: js.UndefOr[HeatMapCell] = js.native
    
    /** Specifies the width of the heat map.
      * @Default {null}
      */
    var height: js.UndefOr[js.Any] = js.native
    
    /** Specifies the name of the heat map.
      * @Default {null}
      */
    var id: js.UndefOr[Double] = js.native
    
    /** Specifies can enable responsive mode or not for heat map.
      * @Default {false}
      */
    var isResponsive: js.UndefOr[Boolean] = js.native
    
    /** Specifies the property and display value of the heat map column.
      * @Default {[]}
      */
    var itemsMapping: js.UndefOr[ItemsMapping] = js.native
    
    /** Specifies the source data of the heat map.
      * @Default {[]}
      */
    var itemsSource: js.UndefOr[js.Any] = js.native
    
    /** Specifies the no of legends can sync with heat map.
      * @Default {[]}
      */
    var legendCollection: js.UndefOr[js.Array[_]] = js.native
    
    /** Enables or disables tooltip of heatmap
      * @Default {true}
      */
    var showTooltip: js.UndefOr[Boolean] = js.native
    
    /** Defines the tooltip that should be shown when the mouse hovers over rows/columns.
      */
    var tooltipSettings: js.UndefOr[TooltipSettings] = js.native
    
    /** Specifies the width of the heat map.
      * @Default {null}
      */
    var width: js.UndefOr[js.Any] = js.native
  }
  object Model {
    
    @scala.inline
    def apply(): typingsSlinky.ejWebAll.ej.datavisualization.HeatMap.Model = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typingsSlinky.ejWebAll.ej.datavisualization.HeatMap.Model]
    }
    
    @scala.inline
    implicit class ModelMutableBuilder[Self <: typingsSlinky.ejWebAll.ej.datavisualization.HeatMap.Model] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCellMouseEnter(value: /* e */ CellMouseEnterEventArgs => Unit): Self = StObject.set(x, "cellMouseEnter", js.Any.fromFunction1(value))
      
      @scala.inline
      def setCellMouseEnterUndefined: Self = StObject.set(x, "cellMouseEnter", js.undefined)
      
      @scala.inline
      def setCellMouseLeave(value: /* e */ CellMouseLeaveEventArgs => Unit): Self = StObject.set(x, "cellMouseLeave", js.Any.fromFunction1(value))
      
      @scala.inline
      def setCellMouseLeaveUndefined: Self = StObject.set(x, "cellMouseLeave", js.undefined)
      
      @scala.inline
      def setCellMouseOver(value: /* e */ CellMouseOverEventArgs => Unit): Self = StObject.set(x, "cellMouseOver", js.Any.fromFunction1(value))
      
      @scala.inline
      def setCellMouseOverUndefined: Self = StObject.set(x, "cellMouseOver", js.undefined)
      
      @scala.inline
      def setCellSelected(value: /* e */ CellSelectedEventArgs => Unit): Self = StObject.set(x, "cellSelected", js.Any.fromFunction1(value))
      
      @scala.inline
      def setCellSelectedUndefined: Self = StObject.set(x, "cellSelected", js.undefined)
      
      @scala.inline
      def setColorMappingCollection(value: js.Array[ColorMappingCollection]): Self = StObject.set(x, "colorMappingCollection", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorMappingCollectionUndefined: Self = StObject.set(x, "colorMappingCollection", js.undefined)
      
      @scala.inline
      def setColorMappingCollectionVarargs(value: ColorMappingCollection*): Self = StObject.set(x, "colorMappingCollection", js.Array(value :_*))
      
      @scala.inline
      def setDefaultColumnStyle(value: DefaultColumnStyle): Self = StObject.set(x, "defaultColumnStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultColumnStyleUndefined: Self = StObject.set(x, "defaultColumnStyle", js.undefined)
      
      @scala.inline
      def setEnableVirtualization(value: Boolean): Self = StObject.set(x, "enableVirtualization", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnableVirtualizationUndefined: Self = StObject.set(x, "enableVirtualization", js.undefined)
      
      @scala.inline
      def setHeatMapCell(value: HeatMapCell): Self = StObject.set(x, "heatMapCell", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeatMapCellUndefined: Self = StObject.set(x, "heatMapCell", js.undefined)
      
      @scala.inline
      def setHeight(value: js.Any): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      @scala.inline
      def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      @scala.inline
      def setIsResponsive(value: Boolean): Self = StObject.set(x, "isResponsive", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsResponsiveUndefined: Self = StObject.set(x, "isResponsive", js.undefined)
      
      @scala.inline
      def setItemsMapping(value: ItemsMapping): Self = StObject.set(x, "itemsMapping", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItemsMappingUndefined: Self = StObject.set(x, "itemsMapping", js.undefined)
      
      @scala.inline
      def setItemsSource(value: js.Any): Self = StObject.set(x, "itemsSource", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItemsSourceUndefined: Self = StObject.set(x, "itemsSource", js.undefined)
      
      @scala.inline
      def setLegendCollection(value: js.Array[_]): Self = StObject.set(x, "legendCollection", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLegendCollectionUndefined: Self = StObject.set(x, "legendCollection", js.undefined)
      
      @scala.inline
      def setLegendCollectionVarargs(value: js.Any*): Self = StObject.set(x, "legendCollection", js.Array(value :_*))
      
      @scala.inline
      def setShowTooltip(value: Boolean): Self = StObject.set(x, "showTooltip", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowTooltipUndefined: Self = StObject.set(x, "showTooltip", js.undefined)
      
      @scala.inline
      def setTooltipSettings(value: TooltipSettings): Self = StObject.set(x, "tooltipSettings", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTooltipSettingsUndefined: Self = StObject.set(x, "tooltipSettings", js.undefined)
      
      @scala.inline
      def setWidth(value: js.Any): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  @js.native
  trait TooltipSettings extends StObject {
    
    /** Defines the animation for the tooltip that should be shown when the mouse hovers over rows/columns.
      */
    var animation: js.UndefOr[TooltipSettingsAnimation] = js.native
    
    /** Defines the tooltip of associate that should be shown when the mouse hovers over rows/columns.
      * @Default {mouseFollow}
      */
    var associate: js.UndefOr[Associate | String] = js.native
    
    /** Enables/ disables the balloon for the tooltip to be shown
      * @Default {true}
      */
    var isBalloon: js.UndefOr[Boolean] = js.native
    
    /** Defines various attributes of the Tooltip position
      */
    var position: js.UndefOr[TooltipSettingsPosition] = js.native
    
    /** Defines the tooltip that should be shown when the mouse hovers over rows/columns.
      * @Default {null}
      */
    var templateId: js.UndefOr[String] = js.native
    
    /** Defines the tooltip to be triggered.
      * @Default {hover}
      */
    var trigger: js.UndefOr[Trigger | String] = js.native
  }
  object TooltipSettings {
    
    @scala.inline
    def apply(): TooltipSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TooltipSettings]
    }
    
    @scala.inline
    implicit class TooltipSettingsMutableBuilder[Self <: TooltipSettings] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAnimation(value: TooltipSettingsAnimation): Self = StObject.set(x, "animation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAnimationUndefined: Self = StObject.set(x, "animation", js.undefined)
      
      @scala.inline
      def setAssociate(value: Associate | String): Self = StObject.set(x, "associate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAssociateUndefined: Self = StObject.set(x, "associate", js.undefined)
      
      @scala.inline
      def setIsBalloon(value: Boolean): Self = StObject.set(x, "isBalloon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsBalloonUndefined: Self = StObject.set(x, "isBalloon", js.undefined)
      
      @scala.inline
      def setPosition(value: TooltipSettingsPosition): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
      
      @scala.inline
      def setTemplateId(value: String): Self = StObject.set(x, "templateId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTemplateIdUndefined: Self = StObject.set(x, "templateId", js.undefined)
      
      @scala.inline
      def setTrigger(value: Trigger | String): Self = StObject.set(x, "trigger", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTriggerUndefined: Self = StObject.set(x, "trigger", js.undefined)
    }
  }
  
  @js.native
  trait TooltipSettingsAnimation extends StObject {
    
    /** Defines the animation effect for the tooltip that should be shown when the mouse hovers over rows/columns.
      * @Default {none}
      */
    var effect: js.UndefOr[Effect | String] = js.native
    
    /** Defines the animation speed for the tooltip that should be shown when the mouse hovers over rows/columns.
      * @Default {0}
      */
    var speed: js.UndefOr[Double] = js.native
  }
  object TooltipSettingsAnimation {
    
    @scala.inline
    def apply(): TooltipSettingsAnimation = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TooltipSettingsAnimation]
    }
    
    @scala.inline
    implicit class TooltipSettingsAnimationMutableBuilder[Self <: TooltipSettingsAnimation] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEffect(value: Effect | String): Self = StObject.set(x, "effect", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEffectUndefined: Self = StObject.set(x, "effect", js.undefined)
      
      @scala.inline
      def setSpeed(value: Double): Self = StObject.set(x, "speed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSpeedUndefined: Self = StObject.set(x, "speed", js.undefined)
    }
  }
  
  @js.native
  trait TooltipSettingsPosition extends StObject {
    
    /** Sets the arrow position again popup.
      */
    var stem: js.UndefOr[TooltipSettingsPositionStem] = js.native
    
    /** Sets the Tooltip position against target.
      */
    var target: js.UndefOr[TooltipSettingsPositionTarget] = js.native
  }
  object TooltipSettingsPosition {
    
    @scala.inline
    def apply(): TooltipSettingsPosition = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TooltipSettingsPosition]
    }
    
    @scala.inline
    implicit class TooltipSettingsPositionMutableBuilder[Self <: TooltipSettingsPosition] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setStem(value: TooltipSettingsPositionStem): Self = StObject.set(x, "stem", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStemUndefined: Self = StObject.set(x, "stem", js.undefined)
      
      @scala.inline
      def setTarget(value: TooltipSettingsPositionTarget): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
    }
  }
  
  @js.native
  trait TooltipSettingsPositionStem extends StObject {
    
    /** Sets the arrow position again popup based on horizontal(x) value
      * @Default {center}
      */
    var horizontal: js.UndefOr[Horizontal | String] = js.native
    
    /** Sets the arrow position again popup based on vertical(y) value
      * @Default {bottom}
      */
    var vertical: js.UndefOr[Vertical | String] = js.native
  }
  object TooltipSettingsPositionStem {
    
    @scala.inline
    def apply(): TooltipSettingsPositionStem = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TooltipSettingsPositionStem]
    }
    
    @scala.inline
    implicit class TooltipSettingsPositionStemMutableBuilder[Self <: TooltipSettingsPositionStem] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHorizontal(value: Horizontal | String): Self = StObject.set(x, "horizontal", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHorizontalUndefined: Self = StObject.set(x, "horizontal", js.undefined)
      
      @scala.inline
      def setVertical(value: Vertical | String): Self = StObject.set(x, "vertical", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVerticalUndefined: Self = StObject.set(x, "vertical", js.undefined)
    }
  }
  
  @js.native
  trait TooltipSettingsPositionTarget extends StObject {
    
    /** Sets the arrow position again popup based on horizontal(x) value
      * @Default {center}
      */
    var horizontal: js.UndefOr[Horizontal | String] = js.native
    
    /** Sets the arrow position again popup based on vertical(y) value
      * @Default {top}
      */
    var vertical: js.UndefOr[Vertical | String] = js.native
  }
  object TooltipSettingsPositionTarget {
    
    @scala.inline
    def apply(): TooltipSettingsPositionTarget = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TooltipSettingsPositionTarget]
    }
    
    @scala.inline
    implicit class TooltipSettingsPositionTargetMutableBuilder[Self <: TooltipSettingsPositionTarget] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHorizontal(value: Horizontal | String): Self = StObject.set(x, "horizontal", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHorizontalUndefined: Self = StObject.set(x, "horizontal", js.undefined)
      
      @scala.inline
      def setVertical(value: Vertical | String): Self = StObject.set(x, "vertical", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVerticalUndefined: Self = StObject.set(x, "vertical", js.undefined)
    }
  }
}
