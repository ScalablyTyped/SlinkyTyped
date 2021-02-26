package typingsSlinky.lineColumn

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * Returns a `LineColumnFinder` instance for given `string` str.
    * @param str the string to find the line-column info for.
    * @param options options for the finder or a number representing the 'from' index.
    * @returns a `LineColumnFinder` instance.
    */
  @JSImport("line-column", JSImport.Namespace)
  @js.native
  def apply(str: String): LineColumnFinder = js.native
  @JSImport("line-column", JSImport.Namespace)
  @js.native
  def apply(str: String, options: Double): LineColumnFinder = js.native
  @JSImport("line-column", JSImport.Namespace)
  @js.native
  def apply(str: String, options: LineColumnOptions): LineColumnFinder = js.native
  
  /**
    * Utility type for using an array as an input to the `toIndex` function.
    */
  type LineColumnArray = js.Tuple2[Double, Double]
  
  /**
    * Interface defining the return type from the main `lineColumn` function.
    */
  @js.native
  trait LineColumnFinder extends StObject {
    
    /**
      * Find line and column from index in the string.
      * @param index Index in the string. (0-origin)
      * @returns Found line number and column number or `null` if the given index is out of range.
      */
    def fromIndex(index: Double): LineColumnInfo | Null = js.native
    
    /**
      * Find index from line and column in the string.
      * @param line Line number in the string, an object containing line and column numbers or
      *              an array containing line and column numbers.
      * @param col Column number in the string.
      * @returns Found index in the string or `-1` if the given line or column is out of range.
      */
    def toIndex(line: Double): Double = js.native
    def toIndex(line: Double, col: Double): Double = js.native
    def toIndex(line: LineColumnArray): Double = js.native
    def toIndex(line: LineColumnArray, col: Double): Double = js.native
    def toIndex(line: LineColumnObject): Double = js.native
    def toIndex(line: LineColumnObject, col: Double): Double = js.native
  }
  
  @js.native
  trait LineColumnInfo extends LineColumnObject {
    
    var col: Double = js.native
    
    var line: Double = js.native
  }
  object LineColumnInfo {
    
    @scala.inline
    def apply(col: Double, line: Double): LineColumnInfo = {
      val __obj = js.Dynamic.literal(col = col.asInstanceOf[js.Any], line = line.asInstanceOf[js.Any])
      __obj.asInstanceOf[LineColumnInfo]
    }
    
    @scala.inline
    implicit class LineColumnInfoMutableBuilder[Self <: LineColumnInfo] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCol(value: Double): Self = StObject.set(x, "col", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLine(value: Double): Self = StObject.set(x, "line", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * Utility type for object structures that can be used as inputs to the `toIndex`
    * function.
    */
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.lineColumn.mod.LineColumnInfo
    - typingsSlinky.lineColumn.anon.Column
  */
  trait LineColumnObject extends StObject
  object LineColumnObject {
    
    @scala.inline
    def Column(column: Double, line: Double): typingsSlinky.lineColumn.anon.Column = {
      val __obj = js.Dynamic.literal(column = column.asInstanceOf[js.Any], line = line.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.lineColumn.anon.Column]
    }
    
    @scala.inline
    def LineColumnInfo(col: Double, line: Double): typingsSlinky.lineColumn.mod.LineColumnInfo = {
      val __obj = js.Dynamic.literal(col = col.asInstanceOf[js.Any], line = line.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.lineColumn.mod.LineColumnInfo]
    }
  }
  
  /**
    * Options for the main `lineColumn` function.
    */
  @js.native
  trait LineColumnOptions extends StObject {
    
    var origin: Double = js.native
  }
  object LineColumnOptions {
    
    @scala.inline
    def apply(origin: Double): LineColumnOptions = {
      val __obj = js.Dynamic.literal(origin = origin.asInstanceOf[js.Any])
      __obj.asInstanceOf[LineColumnOptions]
    }
    
    @scala.inline
    implicit class LineColumnOptionsMutableBuilder[Self <: LineColumnOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setOrigin(value: Double): Self = StObject.set(x, "origin", value.asInstanceOf[js.Any])
    }
  }
}
