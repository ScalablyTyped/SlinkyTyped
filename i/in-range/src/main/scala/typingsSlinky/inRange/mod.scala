package typingsSlinky.inRange

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
  Check if a number is in a given range.
  @example
  ```
  import inRange = require('in-range');
  inRange(30, {end: 100}); // 0..100
  //=> true
  inRange(30, {start: 10, end: 100}); // 10..100
  //=> true
  inRange(30, {start: 100, end: 10}); // 10..100
  //=> true
  inRange(30, {end: 10}); // 0..10
  //=> false
  ```
  */
  @JSImport("in-range", JSImport.Namespace)
  @js.native
  def apply(number: Double, range: Range): Boolean = js.native
  
  @js.native
  trait Range extends StObject {
    
    /**
    		End of the range.
    		*/
    val end: Double = js.native
    
    /**
    		Start of the range.
    		@default 0
    		*/
    val start: js.UndefOr[Double] = js.native
  }
  object Range {
    
    @scala.inline
    def apply(end: Double): Range = {
      val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any])
      __obj.asInstanceOf[Range]
    }
    
    @scala.inline
    implicit class RangeMutableBuilder[Self <: Range] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEnd(value: Double): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStart(value: Double): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStartUndefined: Self = StObject.set(x, "start", js.undefined)
    }
  }
}
