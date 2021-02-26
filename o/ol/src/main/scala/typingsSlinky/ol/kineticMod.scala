package typingsSlinky.ol

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object kineticMod {
  
  @JSImport("ol/Kinetic", JSImport.Default)
  @js.native
  class default protected () extends Kinetic {
    def this(decay: Double, minVelocity: Double, delay: Double) = this()
  }
  
  @js.native
  trait Kinetic extends StObject {
    
    /**
      * FIXME empty description for jsdoc
      */
    def begin(): Unit = js.native
    
    def end(): Boolean = js.native
    
    def getAngle(): Double = js.native
    
    def getDistance(): Double = js.native
    
    def update(x: Double, y: Double): Unit = js.native
  }
  object Kinetic {
    
    @scala.inline
    def apply(
      begin: () => Unit,
      end: () => Boolean,
      getAngle: () => Double,
      getDistance: () => Double,
      update: (Double, Double) => Unit
    ): Kinetic = {
      val __obj = js.Dynamic.literal(begin = js.Any.fromFunction0(begin), end = js.Any.fromFunction0(end), getAngle = js.Any.fromFunction0(getAngle), getDistance = js.Any.fromFunction0(getDistance), update = js.Any.fromFunction2(update))
      __obj.asInstanceOf[Kinetic]
    }
    
    @scala.inline
    implicit class KineticMutableBuilder[Self <: Kinetic] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBegin(value: () => Unit): Self = StObject.set(x, "begin", js.Any.fromFunction0(value))
      
      @scala.inline
      def setEnd(value: () => Boolean): Self = StObject.set(x, "end", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetAngle(value: () => Double): Self = StObject.set(x, "getAngle", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetDistance(value: () => Double): Self = StObject.set(x, "getDistance", js.Any.fromFunction0(value))
      
      @scala.inline
      def setUpdate(value: (Double, Double) => Unit): Self = StObject.set(x, "update", js.Any.fromFunction2(value))
    }
  }
}
