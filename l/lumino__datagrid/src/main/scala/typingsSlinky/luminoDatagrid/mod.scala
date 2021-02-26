package typingsSlinky.luminoDatagrid

import org.scalajs.dom.raw.CanvasRenderingContext2D
import typingsSlinky.luminoDatagrid.cellrendererMod.CellRenderer.CellConfig
import typingsSlinky.luminoDatagrid.cellrendererMod.CellRenderer.ConfigOption
import typingsSlinky.luminoDatagrid.datagridMod.DataGrid.CopyConfig
import typingsSlinky.luminoDatagrid.datagridMod.DataGrid.CopyFormatArgs
import typingsSlinky.luminoDatagrid.datagridMod.DataGrid.DefaultSizes_
import typingsSlinky.luminoDatagrid.datagridMod.DataGrid.Style
import typingsSlinky.luminoDatagrid.datamodelMod.DataModel.Metadata
import typingsSlinky.luminoDatagrid.renderermapMod.RendererMap.Values
import typingsSlinky.luminoDatagrid.selectionmodelMod.SelectionModel.IOptions
import typingsSlinky.luminoDatagrid.textrendererMod.TextRenderer.FormatFunc
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@lumino/datagrid", "BasicKeyHandler")
  @js.native
  class BasicKeyHandler ()
    extends typingsSlinky.luminoDatagrid.basickeyhandlerMod.BasicKeyHandler
  
  @JSImport("@lumino/datagrid", "BasicMouseHandler")
  @js.native
  class BasicMouseHandler ()
    extends typingsSlinky.luminoDatagrid.basicmousehandlerMod.BasicMouseHandler
  
  @JSImport("@lumino/datagrid", "BasicSelectionModel")
  @js.native
  class BasicSelectionModel protected ()
    extends typingsSlinky.luminoDatagrid.basicselectionmodelMod.BasicSelectionModel {
    /**
      * Construct a new selection model.
      *
      * @param options - The options for initializing the model.
      */
    def this(options: IOptions) = this()
  }
  
  @JSImport("@lumino/datagrid", "BooleanCellEditor")
  @js.native
  /**
    * Construct a new cell editor.
    */
  class BooleanCellEditor ()
    extends typingsSlinky.luminoDatagrid.celleditorMod.BooleanCellEditor
  
  @JSImport("@lumino/datagrid", "CellEditor")
  @js.native
  /**
    * Construct a new cell editor.
    */
  abstract class CellEditor ()
    extends typingsSlinky.luminoDatagrid.celleditorMod.CellEditor
  
  @JSImport("@lumino/datagrid", "CellRenderer")
  @js.native
  abstract class CellRenderer ()
    extends typingsSlinky.luminoDatagrid.cellrendererMod.CellRenderer
  object CellRenderer {
    
    /**
      * Resolve a config option for a cell renderer.
      *
      * @param option - The config option to resolve.
      *
      * @param config - The cell config object.
      *
      * @returns The resolved value for the option.
      */
    @JSImport("@lumino/datagrid", "CellRenderer.resolveOption")
    @js.native
    def resolveOption[T](option: ConfigOption[T], config: CellConfig): T = js.native
  }
  
  @JSImport("@lumino/datagrid", "DataGrid")
  @js.native
  /**
    * Construct a new data grid.
    *
    * @param options - The options for initializing the data grid.
    */
  class DataGrid ()
    extends typingsSlinky.luminoDatagrid.datagridMod.DataGrid {
    def this(options: typingsSlinky.luminoDatagrid.datagridMod.DataGrid.IOptions) = this()
  }
  object DataGrid {
    
    /**
      * A generic format function for the copy handler.
      *
      * @param args - The format args for the function.
      *
      * @returns The string representation of the value.
      *
      * #### Notes
      * This function uses `String()` to coerce a value to a string.
      */
    @JSImport("@lumino/datagrid", "DataGrid.copyFormatGeneric")
    @js.native
    def copyFormatGeneric(args: CopyFormatArgs): String = js.native
    
    /**
      * The default copy config for a data grid.
      */
    @JSImport("@lumino/datagrid", "DataGrid.defaultCopyConfig")
    @js.native
    val defaultCopyConfig: CopyConfig = js.native
    
    /**
      * The default sizes for a data grid.
      */
    @JSImport("@lumino/datagrid", "DataGrid.defaultSizes")
    @js.native
    val defaultSizes: DefaultSizes_ = js.native
    
    /**
      * The default theme for a data grid.
      */
    @JSImport("@lumino/datagrid", "DataGrid.defaultStyle")
    @js.native
    val defaultStyle: Style = js.native
  }
  
  @JSImport("@lumino/datagrid", "DataModel")
  @js.native
  abstract class DataModel ()
    extends typingsSlinky.luminoDatagrid.datamodelMod.DataModel
  object DataModel {
    
    /**
      * A singleton empty metadata object.
      */
    @JSImport("@lumino/datagrid", "DataModel.emptyMetadata")
    @js.native
    val emptyMetadata: Metadata = js.native
  }
  
  @JSImport("@lumino/datagrid", "DateCellEditor")
  @js.native
  /**
    * Construct a new cell editor.
    */
  class DateCellEditor ()
    extends typingsSlinky.luminoDatagrid.celleditorMod.DateCellEditor
  
  @JSImport("@lumino/datagrid", "DynamicOptionCellEditor")
  @js.native
  /**
    * Construct a new cell editor.
    */
  class DynamicOptionCellEditor ()
    extends typingsSlinky.luminoDatagrid.celleditorMod.DynamicOptionCellEditor
  
  @JSImport("@lumino/datagrid", "GraphicsContext")
  @js.native
  class GraphicsContext protected ()
    extends typingsSlinky.luminoDatagrid.graphicscontextMod.GraphicsContext {
    /**
      * Create a new graphics context object.
      *
      * @param context - The 2D canvas rendering context to wrap.
      */
    def this(context: CanvasRenderingContext2D) = this()
  }
  
  @JSImport("@lumino/datagrid", "InputCellEditor")
  @js.native
  /**
    * Construct a new cell editor.
    */
  abstract class InputCellEditor ()
    extends typingsSlinky.luminoDatagrid.celleditorMod.InputCellEditor
  
  @JSImport("@lumino/datagrid", "IntegerCellEditor")
  @js.native
  /**
    * Construct a new cell editor.
    */
  class IntegerCellEditor ()
    extends typingsSlinky.luminoDatagrid.celleditorMod.IntegerCellEditor
  
  @JSImport("@lumino/datagrid", "IntegerInputValidator")
  @js.native
  class IntegerInputValidator ()
    extends typingsSlinky.luminoDatagrid.celleditorMod.IntegerInputValidator
  
  @JSImport("@lumino/datagrid", "JSONModel")
  @js.native
  class JSONModel protected ()
    extends typingsSlinky.luminoDatagrid.jsonmodelMod.JSONModel {
    /**
      * Create a data model with static JSON data.
      *
      * @param options - The options for initializing the data model.
      */
    def this(options: typingsSlinky.luminoDatagrid.jsonmodelMod.JSONModel.IOptions) = this()
  }
  
  @JSImport("@lumino/datagrid", "MutableDataModel")
  @js.native
  abstract class MutableDataModel ()
    extends typingsSlinky.luminoDatagrid.datamodelMod.MutableDataModel
  
  @JSImport("@lumino/datagrid", "NumberCellEditor")
  @js.native
  /**
    * Construct a new cell editor.
    */
  class NumberCellEditor ()
    extends typingsSlinky.luminoDatagrid.celleditorMod.NumberCellEditor
  
  @JSImport("@lumino/datagrid", "NumberInputValidator")
  @js.native
  class NumberInputValidator ()
    extends typingsSlinky.luminoDatagrid.celleditorMod.NumberInputValidator
  
  @JSImport("@lumino/datagrid", "OptionCellEditor")
  @js.native
  /**
    * Construct a new cell editor.
    */
  class OptionCellEditor ()
    extends typingsSlinky.luminoDatagrid.celleditorMod.OptionCellEditor
  
  @JSImport("@lumino/datagrid", "PassInputValidator")
  @js.native
  class PassInputValidator ()
    extends typingsSlinky.luminoDatagrid.celleditorMod.PassInputValidator
  
  @JSImport("@lumino/datagrid", "RendererMap")
  @js.native
  /**
    * Construct a new renderer map.
    *
    * @param values - The initial values for the map.
    *
    * @param fallback - The renderer of last resort.
    */
  class RendererMap ()
    extends typingsSlinky.luminoDatagrid.renderermapMod.RendererMap {
    def this(values: Values) = this()
    def this(
      values: js.UndefOr[scala.Nothing],
      fallback: typingsSlinky.luminoDatagrid.cellrendererMod.CellRenderer
    ) = this()
    def this(values: Values, fallback: typingsSlinky.luminoDatagrid.cellrendererMod.CellRenderer) = this()
  }
  
  @JSImport("@lumino/datagrid", "SelectionModel")
  @js.native
  abstract class SelectionModel protected ()
    extends typingsSlinky.luminoDatagrid.selectionmodelMod.SelectionModel {
    /**
      * Construct a new selection model.
      *
      * @param options - The options for initializing the model.
      */
    def this(options: IOptions) = this()
  }
  
  @JSImport("@lumino/datagrid", "TextCellEditor")
  @js.native
  /**
    * Construct a new cell editor.
    */
  class TextCellEditor ()
    extends typingsSlinky.luminoDatagrid.celleditorMod.TextCellEditor
  
  @JSImport("@lumino/datagrid", "TextInputValidator")
  @js.native
  class TextInputValidator ()
    extends typingsSlinky.luminoDatagrid.celleditorMod.TextInputValidator
  
  @JSImport("@lumino/datagrid", "TextRenderer")
  @js.native
  /**
    * Construct a new text renderer.
    *
    * @param options - The options for initializing the renderer.
    */
  class TextRenderer ()
    extends typingsSlinky.luminoDatagrid.textrendererMod.TextRenderer {
    def this(options: typingsSlinky.luminoDatagrid.textrendererMod.TextRenderer.IOptions) = this()
  }
  object TextRenderer {
    
    /**
      * The namespace for the `formatDate` function statics.
      */
    object formatDate {
      
      /**
        * Create a date format function.
        *
        * @param options - The options for creating the format function.
        *
        * @returns A new date format function.
        *
        * #### Notes
        * This formatter uses `Date.toDateString()` to format the values.
        *
        * If a value is not a `Date` object, `new Date(value)` is used to
        * coerce the value to a date.
        *
        * The `formatIntlDateTime()` formatter is more flexible, but slower.
        */
      @JSImport("@lumino/datagrid", "TextRenderer.formatDate")
      @js.native
      def apply(): FormatFunc = js.native
      @JSImport("@lumino/datagrid", "TextRenderer.formatDate")
      @js.native
      def apply(options: typingsSlinky.luminoDatagrid.textrendererMod.TextRenderer.formatDate.IOptions): FormatFunc = js.native
    }
    
    /**
      * The namespace for the `formatExponential` function statics.
      */
    object formatExponential {
      
      /**
        * Create a scientific notation format function.
        *
        * @param options - The options for creating the format function.
        *
        * @returns A new scientific notation format function.
        *
        * #### Notes
        * This formatter uses the builtin `Number()` and `toExponential()`
        * to coerce values.
        *
        * The `formatIntlNumber()` formatter is more flexible, but slower.
        */
      @JSImport("@lumino/datagrid", "TextRenderer.formatExponential")
      @js.native
      def apply(): FormatFunc = js.native
      @JSImport("@lumino/datagrid", "TextRenderer.formatExponential")
      @js.native
      def apply(options: typingsSlinky.luminoDatagrid.textrendererMod.TextRenderer.formatExponential.IOptions): FormatFunc = js.native
    }
    
    /**
      * The namespace for the `formatFixed` function statics.
      */
    object formatFixed {
      
      /**
        * Create a fixed decimal format function.
        *
        * @param options - The options for creating the format function.
        *
        * @returns A new fixed decimal format function.
        *
        * #### Notes
        * This formatter uses the builtin `Number()` and `toFixed()` to
        * coerce values.
        *
        * The `formatIntlNumber()` formatter is more flexible, but slower.
        */
      @JSImport("@lumino/datagrid", "TextRenderer.formatFixed")
      @js.native
      def apply(): FormatFunc = js.native
      @JSImport("@lumino/datagrid", "TextRenderer.formatFixed")
      @js.native
      def apply(options: typingsSlinky.luminoDatagrid.textrendererMod.TextRenderer.formatFixed.IOptions): FormatFunc = js.native
    }
    
    /**
      * The namespace for the `formatGeneric` function statics.
      */
    object formatGeneric {
      
      /**
        * Create a generic text format function.
        *
        * @param options - The options for creating the format function.
        *
        * @returns A new generic text format function.
        *
        * #### Notes
        * This formatter uses the builtin `String()` to coerce any value
        * to a string.
        */
      @JSImport("@lumino/datagrid", "TextRenderer.formatGeneric")
      @js.native
      def apply(): FormatFunc = js.native
      @JSImport("@lumino/datagrid", "TextRenderer.formatGeneric")
      @js.native
      def apply(options: typingsSlinky.luminoDatagrid.textrendererMod.TextRenderer.formatGeneric.IOptions): FormatFunc = js.native
    }
    
    /**
      * The namespace for the `formatISODateTime` function statics.
      */
    object formatISODateTime {
      
      /**
        * Create an ISO datetime format function.
        *
        * @param options - The options for creating the format function.
        *
        * @returns A new ISO datetime format function.
        *
        * #### Notes
        * This formatter uses `Date.toISOString()` to format the values.
        *
        * If a value is not a `Date` object, `new Date(value)` is used to
        * coerce the value to a date.
        *
        * The `formatIntlDateTime()` formatter is more flexible, but slower.
        */
      @JSImport("@lumino/datagrid", "TextRenderer.formatISODateTime")
      @js.native
      def apply(): FormatFunc = js.native
      @JSImport("@lumino/datagrid", "TextRenderer.formatISODateTime")
      @js.native
      def apply(options: typingsSlinky.luminoDatagrid.textrendererMod.TextRenderer.formatISODateTime.IOptions): FormatFunc = js.native
    }
    
    /**
      * The namespace for the `formatIntlDateTime` function statics.
      */
    object formatIntlDateTime {
      
      /**
        * Create an international datetime format function.
        *
        * @param options - The options for creating the format function.
        *
        * @returns A new international datetime format function.
        *
        * #### Notes
        * This formatter uses the builtin `Intl.DateTimeFormat` object to
        * coerce values.
        *
        * This is the most flexible (but slowest) datetime formatter.
        */
      @JSImport("@lumino/datagrid", "TextRenderer.formatIntlDateTime")
      @js.native
      def apply(): FormatFunc = js.native
      @JSImport("@lumino/datagrid", "TextRenderer.formatIntlDateTime")
      @js.native
      def apply(options: typingsSlinky.luminoDatagrid.textrendererMod.TextRenderer.formatIntlDateTime.IOptions): FormatFunc = js.native
    }
    
    /**
      * The namespace for the `formatIntlNumber` function statics.
      */
    object formatIntlNumber {
      
      /**
        * Create an international number format function.
        *
        * @param options - The options for creating the format function.
        *
        * @returns A new international number format function.
        *
        * #### Notes
        * This formatter uses the builtin `Intl.NumberFormat` object to
        * coerce values.
        *
        * This is the most flexible (but slowest) number formatter.
        */
      @JSImport("@lumino/datagrid", "TextRenderer.formatIntlNumber")
      @js.native
      def apply(): FormatFunc = js.native
      @JSImport("@lumino/datagrid", "TextRenderer.formatIntlNumber")
      @js.native
      def apply(options: typingsSlinky.luminoDatagrid.textrendererMod.TextRenderer.formatIntlNumber.IOptions): FormatFunc = js.native
    }
    
    /**
      * The namespace for the `formatPrecision` function statics.
      */
    object formatPrecision {
      
      /**
        * Create a significant figure format function.
        *
        * @param options - The options for creating the format function.
        *
        * @returns A new significant figure format function.
        *
        * #### Notes
        * This formatter uses the builtin `Number()` and `toPrecision()`
        * to coerce values.
        *
        * The `formatIntlNumber()` formatter is more flexible, but slower.
        */
      @JSImport("@lumino/datagrid", "TextRenderer.formatPrecision")
      @js.native
      def apply(): FormatFunc = js.native
      @JSImport("@lumino/datagrid", "TextRenderer.formatPrecision")
      @js.native
      def apply(options: typingsSlinky.luminoDatagrid.textrendererMod.TextRenderer.formatPrecision.IOptions): FormatFunc = js.native
    }
    
    /**
      * The namespace for the `formatTime` function statics.
      */
    object formatTime {
      
      /**
        * Create a time format function.
        *
        * @param options - The options for creating the format function.
        *
        * @returns A new time format function.
        *
        * #### Notes
        * This formatter uses `Date.toTimeString()` to format the values.
        *
        * If a value is not a `Date` object, `new Date(value)` is used to
        * coerce the value to a date.
        *
        * The `formatIntlDateTime()` formatter is more flexible, but slower.
        */
      @JSImport("@lumino/datagrid", "TextRenderer.formatTime")
      @js.native
      def apply(): FormatFunc = js.native
      @JSImport("@lumino/datagrid", "TextRenderer.formatTime")
      @js.native
      def apply(options: typingsSlinky.luminoDatagrid.textrendererMod.TextRenderer.formatTime.IOptions): FormatFunc = js.native
    }
    
    /**
      * The namespace for the `formatUTCDateTime` function statics.
      */
    object formatUTCDateTime {
      
      /**
        * Create a UTC datetime format function.
        *
        * @param options - The options for creating the format function.
        *
        * @returns A new UTC datetime format function.
        *
        * #### Notes
        * This formatter uses `Date.toUTCString()` to format the values.
        *
        * If a value is not a `Date` object, `new Date(value)` is used to
        * coerce the value to a date.
        *
        * The `formatIntlDateTime()` formatter is more flexible, but slower.
        */
      @JSImport("@lumino/datagrid", "TextRenderer.formatUTCDateTime")
      @js.native
      def apply(): FormatFunc = js.native
      @JSImport("@lumino/datagrid", "TextRenderer.formatUTCDateTime")
      @js.native
      def apply(options: typingsSlinky.luminoDatagrid.textrendererMod.TextRenderer.formatUTCDateTime.IOptions): FormatFunc = js.native
    }
    
    /**
      * Measure the height of a font.
      *
      * @param font - The CSS font string of interest.
      *
      * @returns The height of the font bounding box.
      *
      * #### Notes
      * This function uses a temporary DOM node to measure the text box
      * height for the specified font. The first call for a given font
      * will incur a DOM reflow, but the return value is cached, so any
      * subsequent call for the same font will return the cached value.
      */
    @JSImport("@lumino/datagrid", "TextRenderer.measureFontHeight")
    @js.native
    def measureFontHeight(font: String): Double = js.native
  }
  
  /**
    * A namespace for module-private functionality.
    */
  object Private
}
