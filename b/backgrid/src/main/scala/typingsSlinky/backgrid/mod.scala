package typingsSlinky.backgrid

import typingsSlinky.backbone.mod.Collection
import typingsSlinky.backbone.mod.CombinedModelConstructorOptions
import typingsSlinky.backbone.mod.Model
import typingsSlinky.backbone.mod.ModelSetOptions
import typingsSlinky.backbone.mod.View
import typingsSlinky.backbone.mod.ViewOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("backgrid", "Body")
  @js.native
  class Body ()
    extends View[Model[js.Any, ModelSetOptions, js.Object]] {
    def this(options: ViewOptions[Model[_, ModelSetOptions, js.Object]]) = this()
    
    def initialize(options: js.Any): Unit = js.native
    
    def insertRow(
      model: Model[_, ModelSetOptions, js.Object],
      collection: Collection[Model[_, ModelSetOptions, js.Object]],
      options: js.Any
    ): js.Any = js.native
    
    def moveToNextCell(model: Model[_, ModelSetOptions, js.Object], cell: Column, command: Command): js.Any = js.native
    
    def refresh(): Body = js.native
    
    def removeRow(
      model: Model[_, ModelSetOptions, js.Object],
      collection: Collection[Model[_, ModelSetOptions, js.Object]],
      options: js.Any
    ): js.Any = js.native
  }
  
  @JSImport("backgrid", "Cell")
  @js.native
  class Cell ()
    extends View[Model[js.Any, ModelSetOptions, js.Object]] {
    def this(options: ViewOptions[Model[_, ModelSetOptions, js.Object]]) = this()
    
    var editor: InputCellEditor = js.native
    
    def enterEditMode(): js.Any = js.native
    
    def exitEditMode(): js.Any = js.native
    
    var formatter: CellFormatter = js.native
    
    def renderError(): js.Any = js.native
  }
  
  @JSImport("backgrid", "CellEditor")
  @js.native
  class CellEditor ()
    extends View[Model[js.Any, ModelSetOptions, js.Object]] {
    def this(options: ViewOptions[Model[_, ModelSetOptions, js.Object]]) = this()
    
    def initialize(options: js.Any): Unit = js.native
    
    def postRender(model: Model[_, ModelSetOptions, js.Object], column: Model[_, ModelSetOptions, js.Object]): js.Any = js.native
  }
  
  @JSImport("backgrid", "CellFormatter")
  @js.native
  class CellFormatter () extends StObject {
    
    def fromRaw(rawData: js.Any, model: Model[_, ModelSetOptions, js.Object]): js.Any = js.native
    
    def toRaw(formattedData: js.Any, model: Model[_, ModelSetOptions, js.Object]): js.Any = js.native
  }
  
  @JSImport("backgrid", "Column")
  @js.native
  class Column ()
    extends Model[js.Any, ModelSetOptions, js.Object] {
    def this(attributes: js.Any) = this()
    def this(
      attributes: js.UndefOr[scala.Nothing],
      options: CombinedModelConstructorOptions[js.Object, Model[_, ModelSetOptions, js.Object]]
    ) = this()
    def this(
      attributes: js.Any,
      options: CombinedModelConstructorOptions[js.Object, Model[_, ModelSetOptions, js.Object]]
    ) = this()
  }
  
  @JSImport("backgrid", "Command")
  @js.native
  class Command () extends StObject {
    
    def cancel(): Boolean = js.native
    
    def moveDown(): Boolean = js.native
    
    def moveLeft(): Boolean = js.native
    
    def moveRight(): Boolean = js.native
    
    def moveUp(): Boolean = js.native
    
    def passThru(): Boolean = js.native
    
    def save(): Boolean = js.native
  }
  
  @JSImport("backgrid", "DateTimeFormatter")
  @js.native
  class DateTimeFormatter () extends CellFormatter
  
  @JSImport("backgrid", "EmailFormatter")
  @js.native
  class EmailFormatter () extends CellFormatter
  
  @JSImport("backgrid", "Footer")
  @js.native
  class Footer ()
    extends View[Model[js.Any, ModelSetOptions, js.Object]] {
    def this(options: ViewOptions[Model[_, ModelSetOptions, js.Object]]) = this()
  }
  
  @JSImport("backgrid", "Grid")
  @js.native
  class Grid protected ()
    extends View[Model[js.Any, ModelSetOptions, js.Object]] {
    def this(options: GridOptions) = this()
    
    var body: Body = js.native
    
    var footer: js.Any = js.native
    
    def getSelectedModels(): js.Array[Model[_, ModelSetOptions, js.Object]] = js.native
    
    var header: js.Any = js.native
    
    def initialize(options: js.Any): Unit = js.native
    
    def insertColumn(options: js.Any*): Grid = js.native
    
    def insertRow(
      model: Model[_, ModelSetOptions, js.Object],
      collection: Collection[Model[_, ModelSetOptions, js.Object]],
      options: js.Any
    ): js.Any = js.native
    
    def removeColumn(options: js.Any*): Grid = js.native
    
    def removeRow(
      model: Model[_, ModelSetOptions, js.Object],
      collection: Collection[Model[_, ModelSetOptions, js.Object]],
      options: js.Any
    ): js.Any = js.native
  }
  
  @JSImport("backgrid", "Header")
  @js.native
  class Header ()
    extends View[Model[js.Any, ModelSetOptions, js.Object]] {
    def this(options: ViewOptions[Model[_, ModelSetOptions, js.Object]]) = this()
  }
  
  @JSImport("backgrid", "InputCellEditor")
  @js.native
  class InputCellEditor () extends CellEditor {
    def this(options: ViewOptions[Model[_, ModelSetOptions, js.Object]]) = this()
    
    def saveOrCancel(event: js.Any): js.Any = js.native
  }
  
  @JSImport("backgrid", "NumberFormatter")
  @js.native
  class NumberFormatter () extends CellFormatter
  
  @JSImport("backgrid", "PercentFormatter")
  @js.native
  class PercentFormatter () extends NumberFormatter
  
  @JSImport("backgrid", "Row")
  @js.native
  class Row ()
    extends View[Model[js.Any, ModelSetOptions, js.Object]] {
    def this(options: ViewOptions[Model[_, ModelSetOptions, js.Object]]) = this()
  }
  
  @JSImport("backgrid", "SelectFormatter")
  @js.native
  class SelectFormatter () extends CellFormatter
  
  @JSImport("backgrid", "StringCell")
  @js.native
  class StringCell () extends Cell {
    def this(options: ViewOptions[Model[_, ModelSetOptions, js.Object]]) = this()
  }
  
  @JSImport("backgrid", "StringFormatter")
  @js.native
  class StringFormatter () extends CellFormatter
  
  @js.native
  trait ColumnAttr extends StObject {
    
    var cell: String = js.native
    
    var editable: Boolean = js.native
    
    var formater: String = js.native
    
    var headerCell: String = js.native
    
    var label: String = js.native
    
    var name: String = js.native
    
    var renderable: Boolean = js.native
    
    var sortable: Boolean = js.native
  }
  object ColumnAttr {
    
    @scala.inline
    def apply(
      cell: String,
      editable: Boolean,
      formater: String,
      headerCell: String,
      label: String,
      name: String,
      renderable: Boolean,
      sortable: Boolean
    ): ColumnAttr = {
      val __obj = js.Dynamic.literal(cell = cell.asInstanceOf[js.Any], editable = editable.asInstanceOf[js.Any], formater = formater.asInstanceOf[js.Any], headerCell = headerCell.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], renderable = renderable.asInstanceOf[js.Any], sortable = sortable.asInstanceOf[js.Any])
      __obj.asInstanceOf[ColumnAttr]
    }
    
    @scala.inline
    implicit class ColumnAttrMutableBuilder[Self <: ColumnAttr] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCell(value: String): Self = StObject.set(x, "cell", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEditable(value: Boolean): Self = StObject.set(x, "editable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFormater(value: String): Self = StObject.set(x, "formater", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeaderCell(value: String): Self = StObject.set(x, "headerCell", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRenderable(value: Boolean): Self = StObject.set(x, "renderable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSortable(value: Boolean): Self = StObject.set(x, "sortable", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait GridOptions extends StObject {
    
    var body: js.UndefOr[Body] = js.native
    
    var collection: Collection[Model[_, ModelSetOptions, js.Object]] = js.native
    
    var columns: js.Array[Column] = js.native
    
    var footer: js.UndefOr[Footer] = js.native
    
    var header: js.UndefOr[Header] = js.native
    
    var row: js.UndefOr[Row] = js.native
  }
  object GridOptions {
    
    @scala.inline
    def apply(collection: Collection[Model[_, ModelSetOptions, js.Object]], columns: js.Array[Column]): GridOptions = {
      val __obj = js.Dynamic.literal(collection = collection.asInstanceOf[js.Any], columns = columns.asInstanceOf[js.Any])
      __obj.asInstanceOf[GridOptions]
    }
    
    @scala.inline
    implicit class GridOptionsMutableBuilder[Self <: GridOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBody(value: Body): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
      
      @scala.inline
      def setCollection(value: Collection[Model[_, ModelSetOptions, js.Object]]): Self = StObject.set(x, "collection", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColumns(value: js.Array[Column]): Self = StObject.set(x, "columns", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColumnsVarargs(value: Column*): Self = StObject.set(x, "columns", js.Array(value :_*))
      
      @scala.inline
      def setFooter(value: Footer): Self = StObject.set(x, "footer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFooterUndefined: Self = StObject.set(x, "footer", js.undefined)
      
      @scala.inline
      def setHeader(value: Header): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeaderUndefined: Self = StObject.set(x, "header", js.undefined)
      
      @scala.inline
      def setRow(value: Row): Self = StObject.set(x, "row", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRowUndefined: Self = StObject.set(x, "row", js.undefined)
    }
  }
}
