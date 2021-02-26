package typingsSlinky.linesAndColumns

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("lines-and-columns", JSImport.Default)
  @js.native
  class default protected () extends LinesAndColumns {
    def this(string: String) = this()
  }
  
  @js.native
  trait LinesAndColumns extends StObject {
    
    def indexForLocation(location: SourceLocation): Double | Null = js.native
    
    /* private */ def lengthOfLine(line: js.Any): js.Any = js.native
    
    def locationForIndex(index: Double): SourceLocation | Null = js.native
    
    var offsets: js.Any = js.native
    
    var string: js.Any = js.native
  }
  object LinesAndColumns {
    
    @scala.inline
    def apply(
      indexForLocation: SourceLocation => Double | Null,
      lengthOfLine: js.Any => js.Any,
      locationForIndex: Double => SourceLocation | Null,
      offsets: js.Any,
      string: js.Any
    ): LinesAndColumns = {
      val __obj = js.Dynamic.literal(indexForLocation = js.Any.fromFunction1(indexForLocation), lengthOfLine = js.Any.fromFunction1(lengthOfLine), locationForIndex = js.Any.fromFunction1(locationForIndex), offsets = offsets.asInstanceOf[js.Any], string = string.asInstanceOf[js.Any])
      __obj.asInstanceOf[LinesAndColumns]
    }
    
    @scala.inline
    implicit class LinesAndColumnsMutableBuilder[Self <: LinesAndColumns] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIndexForLocation(value: SourceLocation => Double | Null): Self = StObject.set(x, "indexForLocation", js.Any.fromFunction1(value))
      
      @scala.inline
      def setLengthOfLine(value: js.Any => js.Any): Self = StObject.set(x, "lengthOfLine", js.Any.fromFunction1(value))
      
      @scala.inline
      def setLocationForIndex(value: Double => SourceLocation | Null): Self = StObject.set(x, "locationForIndex", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOffsets(value: js.Any): Self = StObject.set(x, "offsets", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setString(value: js.Any): Self = StObject.set(x, "string", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait SourceLocation extends StObject {
    
    var column: Double = js.native
    
    var line: Double = js.native
  }
  object SourceLocation {
    
    @scala.inline
    def apply(column: Double, line: Double): SourceLocation = {
      val __obj = js.Dynamic.literal(column = column.asInstanceOf[js.Any], line = line.asInstanceOf[js.Any])
      __obj.asInstanceOf[SourceLocation]
    }
    
    @scala.inline
    implicit class SourceLocationMutableBuilder[Self <: SourceLocation] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setColumn(value: Double): Self = StObject.set(x, "column", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLine(value: Double): Self = StObject.set(x, "line", value.asInstanceOf[js.Any])
    }
  }
}
