package typingsSlinky.devexpressUtils

import typingsSlinky.devexpressUtils.constMod.ConstInterval
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object reproducibleMod {
  
  @js.native
  trait IReproducibleInterval[T /* <: ConstInterval */] extends StObject {
    
    def makeByLengthEnd(length: Double, end: Double): T = js.native
    
    def makeByStartEnd(start: Double, end: Double): T = js.native
    
    def makeByStartLength(start: Double, length: Double): T = js.native
  }
  object IReproducibleInterval {
    
    @scala.inline
    def apply[T /* <: ConstInterval */](
      makeByLengthEnd: (Double, Double) => T,
      makeByStartEnd: (Double, Double) => T,
      makeByStartLength: (Double, Double) => T
    ): IReproducibleInterval[T] = {
      val __obj = js.Dynamic.literal(makeByLengthEnd = js.Any.fromFunction2(makeByLengthEnd), makeByStartEnd = js.Any.fromFunction2(makeByStartEnd), makeByStartLength = js.Any.fromFunction2(makeByStartLength))
      __obj.asInstanceOf[IReproducibleInterval[T]]
    }
    
    @scala.inline
    implicit class IReproducibleIntervalMutableBuilder[Self <: IReproducibleInterval[_], T /* <: ConstInterval */] (val x: Self with IReproducibleInterval[T]) extends AnyVal {
      
      @scala.inline
      def setMakeByLengthEnd(value: (Double, Double) => T): Self = StObject.set(x, "makeByLengthEnd", js.Any.fromFunction2(value))
      
      @scala.inline
      def setMakeByStartEnd(value: (Double, Double) => T): Self = StObject.set(x, "makeByStartEnd", js.Any.fromFunction2(value))
      
      @scala.inline
      def setMakeByStartLength(value: (Double, Double) => T): Self = StObject.set(x, "makeByStartLength", js.Any.fromFunction2(value))
    }
  }
}
