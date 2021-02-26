package typingsSlinky.luminoDatagrid.textrendererMod

import typingsSlinky.luminoDatagrid.cellrendererMod.CellRenderer
import typingsSlinky.luminoDatagrid.cellrendererMod.CellRenderer.CellConfig
import typingsSlinky.luminoDatagrid.cellrendererMod.CellRenderer.ConfigFunc
import typingsSlinky.luminoDatagrid.cellrendererMod.CellRenderer.ConfigOption
import typingsSlinky.luminoDatagrid.graphicscontextMod.GraphicsContext
import typingsSlinky.luminoDatagrid.textrendererMod.TextRenderer.HorizontalAlignment
import typingsSlinky.luminoDatagrid.textrendererMod.TextRenderer.IOptions
import typingsSlinky.luminoDatagrid.textrendererMod.TextRenderer.VerticalAlignment
import typingsSlinky.std.Intl.DateTimeFormatOptions
import typingsSlinky.std.Intl.NumberFormatOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@lumino/datagrid/lib/textrenderer", "TextRenderer")
@js.native
/**
  * Construct a new text renderer.
  *
  * @param options - The options for initializing the renderer.
  */
class TextRenderer () extends CellRenderer {
  def this(options: IOptions) = this()
  
  /**
    * The CSS color for the cell background.
    */
  val backgroundColor: ConfigOption[String] = js.native
  
  /**
    * Draw the background for the cell.
    *
    * @param gc - The graphics context to use for drawing.
    *
    * @param config - The configuration data for the cell.
    */
  def drawBackground(gc: GraphicsContext, config: CellConfig): Unit = js.native
  
  /**
    * Draw the text for the cell.
    *
    * @param gc - The graphics context to use for drawing.
    *
    * @param config - The configuration data for the cell.
    */
  def drawText(gc: GraphicsContext, config: CellConfig): Unit = js.native
  
  /**
    * The CSS shorthand font for drawing the text.
    */
  val font: ConfigOption[String] = js.native
  
  /**
    * The format function for the cell value.
    */
  def format(config: CellConfig): String = js.native
  
  /**
    * The horizontal alignment for the cell text.
    */
  val horizontalAlignment: ConfigOption[HorizontalAlignment] = js.native
  
  /**
    * The CSS color for drawing the text.
    */
  val textColor: ConfigOption[String] = js.native
  
  /**
    * The vertical alignment for the cell text.
    */
  val verticalAlignment: ConfigOption[VerticalAlignment] = js.native
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
    @JSImport("@lumino/datagrid/lib/textrenderer", "TextRenderer.formatDate")
    @js.native
    def apply(): FormatFunc = js.native
    @JSImport("@lumino/datagrid/lib/textrenderer", "TextRenderer.formatDate")
    @js.native
    def apply(options: typingsSlinky.luminoDatagrid.textrendererMod.TextRenderer.formatDate.IOptions): FormatFunc = js.native
    
    /**
      * The options for creating a date format function.
      */
    @js.native
    trait IOptions extends StObject {
      
      /**
        * The text to use for a `null` or `undefined` data value.
        *
        * The default is `''`.
        */
      var missing: js.UndefOr[String] = js.native
    }
    object IOptions {
      
      @scala.inline
      def apply(): typingsSlinky.luminoDatagrid.textrendererMod.TextRenderer.formatDate.IOptions = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[typingsSlinky.luminoDatagrid.textrendererMod.TextRenderer.formatDate.IOptions]
      }
      
      @scala.inline
      implicit class IOptionsMutableBuilder[Self <: typingsSlinky.luminoDatagrid.textrendererMod.TextRenderer.formatDate.IOptions] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setMissing(value: String): Self = StObject.set(x, "missing", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setMissingUndefined: Self = StObject.set(x, "missing", js.undefined)
      }
    }
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
    @JSImport("@lumino/datagrid/lib/textrenderer", "TextRenderer.formatExponential")
    @js.native
    def apply(): FormatFunc = js.native
    @JSImport("@lumino/datagrid/lib/textrenderer", "TextRenderer.formatExponential")
    @js.native
    def apply(options: typingsSlinky.luminoDatagrid.textrendererMod.TextRenderer.formatExponential.IOptions): FormatFunc = js.native
    
    /**
      * The options for creating an exponential format function.
      */
    @js.native
    trait IOptions extends StObject {
      
      /**
        * The number of digits to include after the decimal point.
        *
        * The default is determined by the user agent.
        */
      var digits: js.UndefOr[Double] = js.native
      
      /**
        * The text to use for a `null` or `undefined` data value.
        *
        * The default is `''`.
        */
      var missing: js.UndefOr[String] = js.native
    }
    object IOptions {
      
      @scala.inline
      def apply(): typingsSlinky.luminoDatagrid.textrendererMod.TextRenderer.formatExponential.IOptions = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[typingsSlinky.luminoDatagrid.textrendererMod.TextRenderer.formatExponential.IOptions]
      }
      
      @scala.inline
      implicit class IOptionsMutableBuilder[Self <: typingsSlinky.luminoDatagrid.textrendererMod.TextRenderer.formatExponential.IOptions] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setDigits(value: Double): Self = StObject.set(x, "digits", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setDigitsUndefined: Self = StObject.set(x, "digits", js.undefined)
        
        @scala.inline
        def setMissing(value: String): Self = StObject.set(x, "missing", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setMissingUndefined: Self = StObject.set(x, "missing", js.undefined)
      }
    }
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
    @JSImport("@lumino/datagrid/lib/textrenderer", "TextRenderer.formatFixed")
    @js.native
    def apply(): FormatFunc = js.native
    @JSImport("@lumino/datagrid/lib/textrenderer", "TextRenderer.formatFixed")
    @js.native
    def apply(options: typingsSlinky.luminoDatagrid.textrendererMod.TextRenderer.formatFixed.IOptions): FormatFunc = js.native
    
    /**
      * The options for creating a fixed format function.
      */
    @js.native
    trait IOptions extends StObject {
      
      /**
        * The number of digits to include after the decimal point.
        *
        * The default is determined by the user agent.
        */
      var digits: js.UndefOr[Double] = js.native
      
      /**
        * The text to use for a `null` or `undefined` data value.
        *
        * The default is `''`.
        */
      var missing: js.UndefOr[String] = js.native
    }
    object IOptions {
      
      @scala.inline
      def apply(): typingsSlinky.luminoDatagrid.textrendererMod.TextRenderer.formatFixed.IOptions = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[typingsSlinky.luminoDatagrid.textrendererMod.TextRenderer.formatFixed.IOptions]
      }
      
      @scala.inline
      implicit class IOptionsMutableBuilder[Self <: typingsSlinky.luminoDatagrid.textrendererMod.TextRenderer.formatFixed.IOptions] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setDigits(value: Double): Self = StObject.set(x, "digits", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setDigitsUndefined: Self = StObject.set(x, "digits", js.undefined)
        
        @scala.inline
        def setMissing(value: String): Self = StObject.set(x, "missing", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setMissingUndefined: Self = StObject.set(x, "missing", js.undefined)
      }
    }
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
    @JSImport("@lumino/datagrid/lib/textrenderer", "TextRenderer.formatGeneric")
    @js.native
    def apply(): FormatFunc = js.native
    @JSImport("@lumino/datagrid/lib/textrenderer", "TextRenderer.formatGeneric")
    @js.native
    def apply(options: typingsSlinky.luminoDatagrid.textrendererMod.TextRenderer.formatGeneric.IOptions): FormatFunc = js.native
    
    /**
      * The options for creating a generic format function.
      */
    @js.native
    trait IOptions extends StObject {
      
      /**
        * The text to use for a `null` or `undefined` data value.
        *
        * The default is `''`.
        */
      var missing: js.UndefOr[String] = js.native
    }
    object IOptions {
      
      @scala.inline
      def apply(): typingsSlinky.luminoDatagrid.textrendererMod.TextRenderer.formatGeneric.IOptions = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[typingsSlinky.luminoDatagrid.textrendererMod.TextRenderer.formatGeneric.IOptions]
      }
      
      @scala.inline
      implicit class IOptionsMutableBuilder[Self <: typingsSlinky.luminoDatagrid.textrendererMod.TextRenderer.formatGeneric.IOptions] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setMissing(value: String): Self = StObject.set(x, "missing", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setMissingUndefined: Self = StObject.set(x, "missing", js.undefined)
      }
    }
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
    @JSImport("@lumino/datagrid/lib/textrenderer", "TextRenderer.formatISODateTime")
    @js.native
    def apply(): FormatFunc = js.native
    @JSImport("@lumino/datagrid/lib/textrenderer", "TextRenderer.formatISODateTime")
    @js.native
    def apply(options: typingsSlinky.luminoDatagrid.textrendererMod.TextRenderer.formatISODateTime.IOptions): FormatFunc = js.native
    
    /**
      * The options for creating an ISO datetime format function.
      */
    @js.native
    trait IOptions extends StObject {
      
      /**
        * The text to use for a `null` or `undefined` data value.
        *
        * The default is `''`.
        */
      var missing: js.UndefOr[String] = js.native
    }
    object IOptions {
      
      @scala.inline
      def apply(): typingsSlinky.luminoDatagrid.textrendererMod.TextRenderer.formatISODateTime.IOptions = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[typingsSlinky.luminoDatagrid.textrendererMod.TextRenderer.formatISODateTime.IOptions]
      }
      
      @scala.inline
      implicit class IOptionsMutableBuilder[Self <: typingsSlinky.luminoDatagrid.textrendererMod.TextRenderer.formatISODateTime.IOptions] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setMissing(value: String): Self = StObject.set(x, "missing", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setMissingUndefined: Self = StObject.set(x, "missing", js.undefined)
      }
    }
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
    @JSImport("@lumino/datagrid/lib/textrenderer", "TextRenderer.formatIntlDateTime")
    @js.native
    def apply(): FormatFunc = js.native
    @JSImport("@lumino/datagrid/lib/textrenderer", "TextRenderer.formatIntlDateTime")
    @js.native
    def apply(options: typingsSlinky.luminoDatagrid.textrendererMod.TextRenderer.formatIntlDateTime.IOptions): FormatFunc = js.native
    
    /**
      * The options for creating an intl datetime format function.
      */
    @js.native
    trait IOptions extends StObject {
      
      /**
        * The locales to pass to the `Intl.DateTimeFormat` constructor.
        *
        * The default is determined by the user agent.
        */
      var locales: js.UndefOr[String | js.Array[String]] = js.native
      
      /**
        * The text to use for a `null` or `undefined` data value.
        *
        * The default is `''`.
        */
      var missing: js.UndefOr[String] = js.native
      
      /**
        * The options to pass to the `Intl.DateTimeFormat` constructor.
        *
        * The default is determined by the user agent.
        */
      var options: js.UndefOr[DateTimeFormatOptions] = js.native
    }
    object IOptions {
      
      @scala.inline
      def apply(): typingsSlinky.luminoDatagrid.textrendererMod.TextRenderer.formatIntlDateTime.IOptions = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[typingsSlinky.luminoDatagrid.textrendererMod.TextRenderer.formatIntlDateTime.IOptions]
      }
      
      @scala.inline
      implicit class IOptionsMutableBuilder[Self <: typingsSlinky.luminoDatagrid.textrendererMod.TextRenderer.formatIntlDateTime.IOptions] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setLocales(value: String | js.Array[String]): Self = StObject.set(x, "locales", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setLocalesUndefined: Self = StObject.set(x, "locales", js.undefined)
        
        @scala.inline
        def setLocalesVarargs(value: String*): Self = StObject.set(x, "locales", js.Array(value :_*))
        
        @scala.inline
        def setMissing(value: String): Self = StObject.set(x, "missing", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setMissingUndefined: Self = StObject.set(x, "missing", js.undefined)
        
        @scala.inline
        def setOptions(value: DateTimeFormatOptions): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
      }
    }
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
    @JSImport("@lumino/datagrid/lib/textrenderer", "TextRenderer.formatIntlNumber")
    @js.native
    def apply(): FormatFunc = js.native
    @JSImport("@lumino/datagrid/lib/textrenderer", "TextRenderer.formatIntlNumber")
    @js.native
    def apply(options: typingsSlinky.luminoDatagrid.textrendererMod.TextRenderer.formatIntlNumber.IOptions): FormatFunc = js.native
    
    /**
      * The options for creating an intl number format function.
      */
    @js.native
    trait IOptions extends StObject {
      
      /**
        * The locales to pass to the `Intl.NumberFormat` constructor.
        *
        * The default is determined by the user agent.
        */
      var locales: js.UndefOr[String | js.Array[String]] = js.native
      
      /**
        * The text to use for a `null` or `undefined` data value.
        *
        * The default is `''`.
        */
      var missing: js.UndefOr[String] = js.native
      
      /**
        * The options to pass to the `Intl.NumberFormat` constructor.
        *
        * The default is determined by the user agent.
        */
      var options: js.UndefOr[NumberFormatOptions] = js.native
    }
    object IOptions {
      
      @scala.inline
      def apply(): typingsSlinky.luminoDatagrid.textrendererMod.TextRenderer.formatIntlNumber.IOptions = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[typingsSlinky.luminoDatagrid.textrendererMod.TextRenderer.formatIntlNumber.IOptions]
      }
      
      @scala.inline
      implicit class IOptionsMutableBuilder[Self <: typingsSlinky.luminoDatagrid.textrendererMod.TextRenderer.formatIntlNumber.IOptions] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setLocales(value: String | js.Array[String]): Self = StObject.set(x, "locales", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setLocalesUndefined: Self = StObject.set(x, "locales", js.undefined)
        
        @scala.inline
        def setLocalesVarargs(value: String*): Self = StObject.set(x, "locales", js.Array(value :_*))
        
        @scala.inline
        def setMissing(value: String): Self = StObject.set(x, "missing", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setMissingUndefined: Self = StObject.set(x, "missing", js.undefined)
        
        @scala.inline
        def setOptions(value: NumberFormatOptions): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
      }
    }
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
    @JSImport("@lumino/datagrid/lib/textrenderer", "TextRenderer.formatPrecision")
    @js.native
    def apply(): FormatFunc = js.native
    @JSImport("@lumino/datagrid/lib/textrenderer", "TextRenderer.formatPrecision")
    @js.native
    def apply(options: typingsSlinky.luminoDatagrid.textrendererMod.TextRenderer.formatPrecision.IOptions): FormatFunc = js.native
    
    /**
      * The options for creating a precision format function.
      */
    @js.native
    trait IOptions extends StObject {
      
      /**
        * The number of significant figures to include in the value.
        *
        * The default is determined by the user agent.
        */
      var digits: js.UndefOr[Double] = js.native
      
      /**
        * The text to use for a `null` or `undefined` data value.
        *
        * The default is `''`.
        */
      var missing: js.UndefOr[String] = js.native
    }
    object IOptions {
      
      @scala.inline
      def apply(): typingsSlinky.luminoDatagrid.textrendererMod.TextRenderer.formatPrecision.IOptions = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[typingsSlinky.luminoDatagrid.textrendererMod.TextRenderer.formatPrecision.IOptions]
      }
      
      @scala.inline
      implicit class IOptionsMutableBuilder[Self <: typingsSlinky.luminoDatagrid.textrendererMod.TextRenderer.formatPrecision.IOptions] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setDigits(value: Double): Self = StObject.set(x, "digits", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setDigitsUndefined: Self = StObject.set(x, "digits", js.undefined)
        
        @scala.inline
        def setMissing(value: String): Self = StObject.set(x, "missing", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setMissingUndefined: Self = StObject.set(x, "missing", js.undefined)
      }
    }
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
    @JSImport("@lumino/datagrid/lib/textrenderer", "TextRenderer.formatTime")
    @js.native
    def apply(): FormatFunc = js.native
    @JSImport("@lumino/datagrid/lib/textrenderer", "TextRenderer.formatTime")
    @js.native
    def apply(options: typingsSlinky.luminoDatagrid.textrendererMod.TextRenderer.formatTime.IOptions): FormatFunc = js.native
    
    /**
      * The options for creating a time format function.
      */
    @js.native
    trait IOptions extends StObject {
      
      /**
        * The text to use for a `null` or `undefined` data value.
        *
        * The default is `''`.
        */
      var missing: js.UndefOr[String] = js.native
    }
    object IOptions {
      
      @scala.inline
      def apply(): typingsSlinky.luminoDatagrid.textrendererMod.TextRenderer.formatTime.IOptions = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[typingsSlinky.luminoDatagrid.textrendererMod.TextRenderer.formatTime.IOptions]
      }
      
      @scala.inline
      implicit class IOptionsMutableBuilder[Self <: typingsSlinky.luminoDatagrid.textrendererMod.TextRenderer.formatTime.IOptions] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setMissing(value: String): Self = StObject.set(x, "missing", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setMissingUndefined: Self = StObject.set(x, "missing", js.undefined)
      }
    }
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
    @JSImport("@lumino/datagrid/lib/textrenderer", "TextRenderer.formatUTCDateTime")
    @js.native
    def apply(): FormatFunc = js.native
    @JSImport("@lumino/datagrid/lib/textrenderer", "TextRenderer.formatUTCDateTime")
    @js.native
    def apply(options: typingsSlinky.luminoDatagrid.textrendererMod.TextRenderer.formatUTCDateTime.IOptions): FormatFunc = js.native
    
    /**
      * The options for creating a UTC datetime format function.
      */
    @js.native
    trait IOptions extends StObject {
      
      /**
        * The text to use for a `null` or `undefined` data value.
        *
        * The default is `''`.
        */
      var missing: js.UndefOr[String] = js.native
    }
    object IOptions {
      
      @scala.inline
      def apply(): typingsSlinky.luminoDatagrid.textrendererMod.TextRenderer.formatUTCDateTime.IOptions = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[typingsSlinky.luminoDatagrid.textrendererMod.TextRenderer.formatUTCDateTime.IOptions]
      }
      
      @scala.inline
      implicit class IOptionsMutableBuilder[Self <: typingsSlinky.luminoDatagrid.textrendererMod.TextRenderer.formatUTCDateTime.IOptions] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setMissing(value: String): Self = StObject.set(x, "missing", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setMissingUndefined: Self = StObject.set(x, "missing", js.undefined)
      }
    }
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
  @JSImport("@lumino/datagrid/lib/textrenderer", "TextRenderer.measureFontHeight")
  @js.native
  def measureFontHeight(font: String): Double = js.native
  
  /**
    * A type alias for a format function.
    */
  type FormatFunc = ConfigFunc[String]
  
  /**
    * A type alias for the supported horizontal alignment modes.
    */
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.luminoDatagrid.luminoDatagridStrings.left
    - typingsSlinky.luminoDatagrid.luminoDatagridStrings.center
    - typingsSlinky.luminoDatagrid.luminoDatagridStrings.right
  */
  trait HorizontalAlignment extends StObject
  object HorizontalAlignment {
    
    @scala.inline
    def center: typingsSlinky.luminoDatagrid.luminoDatagridStrings.center = "center".asInstanceOf[typingsSlinky.luminoDatagrid.luminoDatagridStrings.center]
    
    @scala.inline
    def left: typingsSlinky.luminoDatagrid.luminoDatagridStrings.left = "left".asInstanceOf[typingsSlinky.luminoDatagrid.luminoDatagridStrings.left]
    
    @scala.inline
    def right: typingsSlinky.luminoDatagrid.luminoDatagridStrings.right = "right".asInstanceOf[typingsSlinky.luminoDatagrid.luminoDatagridStrings.right]
  }
  
  /**
    * An options object for initializing a text renderer.
    */
  @js.native
  trait IOptions extends StObject {
    
    /**
      * The background color for the cells.
      *
      * The default is `''`.
      */
    var backgroundColor: js.UndefOr[ConfigOption[String]] = js.native
    
    /**
      * The font for drawing the cell text.
      *
      * The default is `'12px sans-serif'`.
      */
    var font: js.UndefOr[ConfigOption[String]] = js.native
    
    /**
      * The format function for the renderer.
      *
      * The default is `TextRenderer.formatGeneric()`.
      */
    var format: js.UndefOr[FormatFunc] = js.native
    
    /**
      * The horizontal alignment for the cell text.
      *
      * The default is `'left'`.
      */
    var horizontalAlignment: js.UndefOr[ConfigOption[HorizontalAlignment]] = js.native
    
    /**
      * The color for the drawing the cell text.
      *
      * The default `'#000000'`.
      */
    var textColor: js.UndefOr[ConfigOption[String]] = js.native
    
    /**
      * The vertical alignment for the cell text.
      *
      * The default is `'center'`.
      */
    var verticalAlignment: js.UndefOr[ConfigOption[VerticalAlignment]] = js.native
  }
  object IOptions {
    
    @scala.inline
    def apply(): IOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IOptions]
    }
    
    @scala.inline
    implicit class IOptionsMutableBuilder[Self <: IOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBackgroundColor(value: ConfigOption[String]): Self = StObject.set(x, "backgroundColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBackgroundColorFunction1(value: /* config */ CellConfig => String): Self = StObject.set(x, "backgroundColor", js.Any.fromFunction1(value))
      
      @scala.inline
      def setBackgroundColorUndefined: Self = StObject.set(x, "backgroundColor", js.undefined)
      
      @scala.inline
      def setFont(value: ConfigOption[String]): Self = StObject.set(x, "font", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFontFunction1(value: /* config */ CellConfig => String): Self = StObject.set(x, "font", js.Any.fromFunction1(value))
      
      @scala.inline
      def setFontUndefined: Self = StObject.set(x, "font", js.undefined)
      
      @scala.inline
      def setFormat(value: /* config */ CellConfig => String): Self = StObject.set(x, "format", js.Any.fromFunction1(value))
      
      @scala.inline
      def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
      
      @scala.inline
      def setHorizontalAlignment(value: ConfigOption[HorizontalAlignment]): Self = StObject.set(x, "horizontalAlignment", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHorizontalAlignmentFunction1(value: /* config */ CellConfig => HorizontalAlignment): Self = StObject.set(x, "horizontalAlignment", js.Any.fromFunction1(value))
      
      @scala.inline
      def setHorizontalAlignmentUndefined: Self = StObject.set(x, "horizontalAlignment", js.undefined)
      
      @scala.inline
      def setTextColor(value: ConfigOption[String]): Self = StObject.set(x, "textColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTextColorFunction1(value: /* config */ CellConfig => String): Self = StObject.set(x, "textColor", js.Any.fromFunction1(value))
      
      @scala.inline
      def setTextColorUndefined: Self = StObject.set(x, "textColor", js.undefined)
      
      @scala.inline
      def setVerticalAlignment(value: ConfigOption[VerticalAlignment]): Self = StObject.set(x, "verticalAlignment", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVerticalAlignmentFunction1(value: /* config */ CellConfig => VerticalAlignment): Self = StObject.set(x, "verticalAlignment", js.Any.fromFunction1(value))
      
      @scala.inline
      def setVerticalAlignmentUndefined: Self = StObject.set(x, "verticalAlignment", js.undefined)
    }
  }
  
  /**
    * A type alias for the supported vertical alignment modes.
    */
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.luminoDatagrid.luminoDatagridStrings.top
    - typingsSlinky.luminoDatagrid.luminoDatagridStrings.center
    - typingsSlinky.luminoDatagrid.luminoDatagridStrings.bottom
  */
  trait VerticalAlignment extends StObject
  object VerticalAlignment {
    
    @scala.inline
    def bottom: typingsSlinky.luminoDatagrid.luminoDatagridStrings.bottom = "bottom".asInstanceOf[typingsSlinky.luminoDatagrid.luminoDatagridStrings.bottom]
    
    @scala.inline
    def center: typingsSlinky.luminoDatagrid.luminoDatagridStrings.center = "center".asInstanceOf[typingsSlinky.luminoDatagrid.luminoDatagridStrings.center]
    
    @scala.inline
    def top: typingsSlinky.luminoDatagrid.luminoDatagridStrings.top = "top".asInstanceOf[typingsSlinky.luminoDatagrid.luminoDatagridStrings.top]
  }
}
