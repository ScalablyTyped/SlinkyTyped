package typingsSlinky.easyTable

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("easy-table", JSImport.Namespace)
  @js.native
  class ^ () extends EasyTable
  @JSImport("easy-table", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Predefined helpers for totals
    */
  /* static member */
  @JSImport("easy-table", "aggr")
  @js.native
  def aggr: Aggregators = js.native
  @scala.inline
  def aggr_=(x: Aggregators): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("aggr")(x.asInstanceOf[js.Any])
  
  /**
    * Create a printer which right aligns the content by padding with `ch` on the left
    *
    * @param {String} ch
    * @returns {Function}
    */
  /* static member */
  @JSImport("easy-table", "leftPadder")
  @js.native
  def leftPadder[T](ch: String): CellPrinter[T] = js.native
  
  /**
    * Same as `Table.print()` but yields the result to `console.log()`
    */
  /* static member */
  @JSImport("easy-table", "log")
  @js.native
  def log[T](obj: T): Unit = js.native
  @JSImport("easy-table", "log")
  @js.native
  def log[T](obj: T, format: js.UndefOr[scala.Nothing], cb: TablePostProcessing): Unit = js.native
  @JSImport("easy-table", "log")
  @js.native
  def log[T](obj: T, format: FormatFunction[T]): Unit = js.native
  @JSImport("easy-table", "log")
  @js.native
  def log[T](obj: T, format: FormatFunction[T], cb: TablePostProcessing): Unit = js.native
  @JSImport("easy-table", "log")
  @js.native
  def log[T](obj: T, format: FormatObject): Unit = js.native
  @JSImport("easy-table", "log")
  @js.native
  def log[T](obj: T, format: FormatObject, cb: TablePostProcessing): Unit = js.native
  @JSImport("easy-table", "log")
  @js.native
  def log[T](obj: js.Array[T]): Unit = js.native
  @JSImport("easy-table", "log")
  @js.native
  def log[T](obj: js.Array[T], format: js.UndefOr[scala.Nothing], cb: TablePostProcessing): Unit = js.native
  @JSImport("easy-table", "log")
  @js.native
  def log[T](obj: js.Array[T], format: FormatFunction[T]): Unit = js.native
  @JSImport("easy-table", "log")
  @js.native
  def log[T](obj: js.Array[T], format: FormatFunction[T], cb: TablePostProcessing): Unit = js.native
  @JSImport("easy-table", "log")
  @js.native
  def log[T](obj: js.Array[T], format: FormatObject): Unit = js.native
  @JSImport("easy-table", "log")
  @js.native
  def log[T](obj: js.Array[T], format: FormatObject, cb: TablePostProcessing): Unit = js.native
  
  // public static padRight: CellPrinter<string>;
  /**
    * Create a printer for numbers
    *
    * Will do right alignment and optionally fix the number of digits after decimal point
    *
    * @param {Number} [digits] - Number of digits for fixpoint notation
    * @returns {Function}
    */
  /* static member */
  @JSImport("easy-table", "number")
  @js.native
  def number(): CellPrinter[Double] = js.native
  @JSImport("easy-table", "number")
  @js.native
  def number(digits: Double): CellPrinter[Double] = js.native
  
  /* static member */
  @JSImport("easy-table", "padLeft")
  @js.native
  def padLeft: CellPrinter[String] = js.native
  @scala.inline
  def padLeft_=(x: CellPrinter[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("padLeft")(x.asInstanceOf[js.Any])
  
  /**
    * Print the array or object
    *
    * @param {Array|Object} obj - Object to print
    * @param {Function|Object} [format] - Format options
    * @param {Function} [cb] - Table post processing and formating
    * @returns {String}
    */
  /* static member */
  @JSImport("easy-table", "print")
  @js.native
  def print[T](obj: T): String = js.native
  @JSImport("easy-table", "print")
  @js.native
  def print[T](obj: T, format: js.UndefOr[scala.Nothing], cb: TablePostProcessing): String = js.native
  @JSImport("easy-table", "print")
  @js.native
  def print[T](obj: T, format: FormatFunction[T]): String = js.native
  @JSImport("easy-table", "print")
  @js.native
  def print[T](obj: T, format: FormatFunction[T], cb: TablePostProcessing): String = js.native
  @JSImport("easy-table", "print")
  @js.native
  def print[T](obj: T, format: FormatObject): String = js.native
  @JSImport("easy-table", "print")
  @js.native
  def print[T](obj: T, format: FormatObject, cb: TablePostProcessing): String = js.native
  @JSImport("easy-table", "print")
  @js.native
  def print[T](obj: js.Array[T]): String = js.native
  @JSImport("easy-table", "print")
  @js.native
  def print[T](obj: js.Array[T], format: js.UndefOr[scala.Nothing], cb: TablePostProcessing): String = js.native
  @JSImport("easy-table", "print")
  @js.native
  def print[T](obj: js.Array[T], format: FormatFunction[T]): String = js.native
  @JSImport("easy-table", "print")
  @js.native
  def print[T](obj: js.Array[T], format: FormatFunction[T], cb: TablePostProcessing): String = js.native
  @JSImport("easy-table", "print")
  @js.native
  def print[T](obj: js.Array[T], format: FormatObject): String = js.native
  @JSImport("easy-table", "print")
  @js.native
  def print[T](obj: js.Array[T], format: FormatObject, cb: TablePostProcessing): String = js.native
  
  /**
    * Create a printer which pads with `ch` on the right
    *
    * @param {String} ch
    * @returns {Function}
    */
  /* static member */
  @JSImport("easy-table", "rightPadder")
  @js.native
  def rightPadder[T](ch: String): CellPrinter[T] = js.native
  
  /**
    * Default printer
    */
  /* static member */
  @JSImport("easy-table", "string")
  @js.native
  def string(value: js.Any): String = js.native
  
  @js.native
  trait Aggregators extends StObject {
    
    /**
      * Average reduction
      */
    var avg: js.Any = js.native
    
    /**
      * Create a printer which formats the value with `printer`,
      * adds the `prefix` to it and right aligns the whole thing
      *
      * @param {String} prefix
      * @param {Function} printer
      * @returns {printer}
      */
    def printer[T](prefix: String, printer: CellPrinter[T]): CellPrinter[T] = js.native
    
    /**
      * Sum reduction
      */
    var sum: js.Any = js.native
  }
  object Aggregators {
    
    @scala.inline
    def apply(avg: js.Any, printer: (String, CellPrinter[js.Any]) => CellPrinter[js.Any], sum: js.Any): Aggregators = {
      val __obj = js.Dynamic.literal(avg = avg.asInstanceOf[js.Any], printer = js.Any.fromFunction2(printer), sum = sum.asInstanceOf[js.Any])
      __obj.asInstanceOf[Aggregators]
    }
    
    @scala.inline
    implicit class AggregatorsMutableBuilder[Self <: Aggregators] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAvg(value: js.Any): Self = StObject.set(x, "avg", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrinter(value: (String, CellPrinter[js.Any]) => CellPrinter[js.Any]): Self = StObject.set(x, "printer", js.Any.fromFunction2(value))
      
      @scala.inline
      def setSum(value: js.Any): Self = StObject.set(x, "sum", value.asInstanceOf[js.Any])
    }
  }
  
  type CellPrinter[T] = js.Function2[/* val */ T, /* width */ Double, String]
  
  @js.native
  trait ColumnFormat[T] extends StObject {
    
    var name: js.UndefOr[String] = js.native
    
    var printer: js.UndefOr[CellPrinter[T]] = js.native
  }
  object ColumnFormat {
    
    @scala.inline
    def apply[T](): ColumnFormat[T] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ColumnFormat[T]]
    }
    
    @scala.inline
    implicit class ColumnFormatMutableBuilder[Self <: ColumnFormat[_], T] (val x: Self with ColumnFormat[T]) extends AnyVal {
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setPrinter(value: (T, /* width */ Double) => String): Self = StObject.set(x, "printer", js.Any.fromFunction2(value))
      
      @scala.inline
      def setPrinterUndefined: Self = StObject.set(x, "printer", js.undefined)
    }
  }
  
  type CompareFunction[T] = js.Function2[/* a */ T, /* b */ T, Double]
  
  @js.native
  trait EasyTable extends StObject {
    
    /**
      * Write cell in the current row
      *
      * @param {String} col          - Column name
      * @param {Any} val             - Cell value
      * @param {Function} [printer]  - Printer function to format the value
      * @returns {Table} `this`
      */
    def cell[T](col: String, `val`: T): this.type = js.native
    def cell[T](col: String, `val`: T, printer: CellPrinter[T]): this.type = js.native
    
    /**
      * Get list of columns in printing order
      *
      * @returns {string[]}
      */
    def columns(): js.Array[String] = js.native
    
    /**
      * Compute all totals and yield the results to `cb`
      *
      * @param {Function} cb - Callback function with signature `(column, value, printer)`
      */
    def forEachTotal[T](cb: js.Function3[/* column */ String, /* value */ T, /* printer */ CellPrinter[T], Unit]): Unit = js.native
    
    /**
      * Same as `.toString()` but yields the result to `console.log()`
      */
    def log(): Unit = js.native
    
    /**
      * Push the current row to the table and start a new one
      *
      * @returns {Table} `this`
      */
    def newRow(): this.type = js.native
    
    /**
      * Format just rows, i.e. print the table without headers and totals
      *
      * @returns {String} String representaion of the table
      */
    def print(): String = js.native
    
    /**
      * Format the table so that each row represents column and each column represents row
      *
      * @param {IPrintColumnOptions} [opts]
      * @returns {String}
      */
    def printTransposed[T](): String = js.native
    def printTransposed[T](opts: PrintColumnOptions[T]): String = js.native
    
    /**
      * Push delimeter row to the table (with each cell filled with dashs during printing)
      *
      * @param {String[]} [cols]
      * @returns {Table} `this`
      */
    def pushDelimeter(): this.type = js.native
    def pushDelimeter(cols: js.Array[String]): this.type = js.native
    
    /**
      * String to separate columns
      */
    var separator: String = js.native
    
    /**
      * Sort the table
      *
      * @param {Function|string[]} [cmp] - Either compare function or a list of columns to sort on
      * @returns {Table} `this`
      */
    def sort(): this.type = js.native
    def sort(cmp: js.Array[String]): this.type = js.native
    def sort[T](cmp: CompareFunction[T]): this.type = js.native
    /**
      * Sort the table
      *
      * @param {Function|string[]} [cmp] - Either compare function or a list of columns to sort on
      * @returns {Table} `this`
      */
    @JSName("sort")
    def sort_T[T](): this.type = js.native
    
    /**
      * Add a total for the column
      *
      * @param {String} col - column name
      * @param {Object} [opts]
      * @returns {Table} `this`
      */
    def total[T](col: String): this.type = js.native
    def total[T](col: String, opts: TotalOptions[T]): this.type = js.native
  }
  
  type FormatFunction[T] = js.Function2[
    /* obj */ T, 
    /* cell */ js.Function2[/* name */ String, /* val */ js.Any, Unit], 
    Unit
  ]
  
  type FormatObject = StringDictionary[ColumnFormat[js.Any]]
  
  @js.native
  trait PrintColumnOptions[T] extends StObject {
    
    /**
      * Printer to format column names
      */
    var namePrinter: js.UndefOr[CellPrinter[T]] = js.native
    
    /**
      * Column separation string
      */
    var separator: js.UndefOr[String] = js.native
  }
  object PrintColumnOptions {
    
    @scala.inline
    def apply[T](): PrintColumnOptions[T] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PrintColumnOptions[T]]
    }
    
    @scala.inline
    implicit class PrintColumnOptionsMutableBuilder[Self <: PrintColumnOptions[_], T] (val x: Self with PrintColumnOptions[T]) extends AnyVal {
      
      @scala.inline
      def setNamePrinter(value: (T, /* width */ Double) => String): Self = StObject.set(x, "namePrinter", js.Any.fromFunction2(value))
      
      @scala.inline
      def setNamePrinterUndefined: Self = StObject.set(x, "namePrinter", js.undefined)
      
      @scala.inline
      def setSeparator(value: String): Self = StObject.set(x, "separator", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSeparatorUndefined: Self = StObject.set(x, "separator", js.undefined)
    }
  }
  
  type ReduceFunction[T] = js.Function4[/* acc */ T, /* val */ T, /* idx */ Double, /* length */ Double, T]
  
  type TablePostProcessing = js.Function1[/* result */ EasyTable, String]
  
  @js.native
  trait TotalOptions[T] extends StObject {
    
    /**
      * Initial value for reduction
      */
    var init: js.UndefOr[T] = js.native
    
    /**
      * Printer to format the total cell
      */
    var printer: js.UndefOr[CellPrinter[T]] = js.native
    
    /**
      * reduce(acc, val, idx, length) function to compute the total value
      */
    var reduce: js.UndefOr[ReduceFunction[T]] = js.native
  }
  object TotalOptions {
    
    @scala.inline
    def apply[T](): TotalOptions[T] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TotalOptions[T]]
    }
    
    @scala.inline
    implicit class TotalOptionsMutableBuilder[Self <: TotalOptions[_], T] (val x: Self with TotalOptions[T]) extends AnyVal {
      
      @scala.inline
      def setInit(value: T): Self = StObject.set(x, "init", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInitUndefined: Self = StObject.set(x, "init", js.undefined)
      
      @scala.inline
      def setPrinter(value: (T, /* width */ Double) => String): Self = StObject.set(x, "printer", js.Any.fromFunction2(value))
      
      @scala.inline
      def setPrinterUndefined: Self = StObject.set(x, "printer", js.undefined)
      
      @scala.inline
      def setReduce(value: (T, T, /* idx */ Double, /* length */ Double) => T): Self = StObject.set(x, "reduce", js.Any.fromFunction4(value))
      
      @scala.inline
      def setReduceUndefined: Self = StObject.set(x, "reduce", js.undefined)
    }
  }
}
