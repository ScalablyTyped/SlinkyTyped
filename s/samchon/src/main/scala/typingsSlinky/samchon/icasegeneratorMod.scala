package typingsSlinky.samchon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object icasegeneratorMod {
  
  @js.native
  trait ICaseGenerator extends StObject {
    
    /**
      * Get index'th case.
      *
      * @param index Index number
      * @return The row of the index'th in combined permuation case
      */
    def at(index: Double): js.Array[Double] = js.native
    
    /**
      * Get size of all cases.
      *
      * @return Get a number of the all cases.
      */
    def size(): Double = js.native
  }
  object ICaseGenerator {
    
    @scala.inline
    def apply(at: Double => js.Array[Double], size: () => Double): ICaseGenerator = {
      val __obj = js.Dynamic.literal(at = js.Any.fromFunction1(at), size = js.Any.fromFunction0(size))
      __obj.asInstanceOf[ICaseGenerator]
    }
    
    @scala.inline
    implicit class ICaseGeneratorMutableBuilder[Self <: ICaseGenerator] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAt(value: Double => js.Array[Double]): Self = StObject.set(x, "at", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSize(value: () => Double): Self = StObject.set(x, "size", js.Any.fromFunction0(value))
    }
  }
}
