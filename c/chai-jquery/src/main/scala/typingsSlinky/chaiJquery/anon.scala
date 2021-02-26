package typingsSlinky.chaiJquery

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Fast extends StObject {
    
    var fast: Double = js.native
    
    var slow: Double = js.native
  }
  object Fast {
    
    @scala.inline
    def apply(fast: Double, slow: Double): Fast = {
      val __obj = js.Dynamic.literal(fast = fast.asInstanceOf[js.Any], slow = slow.asInstanceOf[js.Any])
      __obj.asInstanceOf[Fast]
    }
    
    @scala.inline
    implicit class FastMutableBuilder[Self <: Fast] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFast(value: Double): Self = StObject.set(x, "fast", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSlow(value: Double): Self = StObject.set(x, "slow", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Interval extends StObject {
    
    /**
      * The rate (in milliseconds) at which animations fire.
      */
    var interval: Double = js.native
    
    /**
      * Globally disable all animations.
      */
    var off: Boolean = js.native
    
    var speeds: Fast = js.native
    
    var step: js.Any = js.native
    
    def stop(): Unit = js.native
    
    def tick(): Unit = js.native
  }
  object Interval {
    
    @scala.inline
    def apply(interval: Double, off: Boolean, speeds: Fast, step: js.Any, stop: () => Unit, tick: () => Unit): Interval = {
      val __obj = js.Dynamic.literal(interval = interval.asInstanceOf[js.Any], off = off.asInstanceOf[js.Any], speeds = speeds.asInstanceOf[js.Any], step = step.asInstanceOf[js.Any], stop = js.Any.fromFunction0(stop), tick = js.Any.fromFunction0(tick))
      __obj.asInstanceOf[Interval]
    }
    
    @scala.inline
    implicit class IntervalMutableBuilder[Self <: Interval] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setInterval(value: Double): Self = StObject.set(x, "interval", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOff(value: Boolean): Self = StObject.set(x, "off", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSpeeds(value: Fast): Self = StObject.set(x, "speeds", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStep(value: js.Any): Self = StObject.set(x, "step", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStop(value: () => Unit): Self = StObject.set(x, "stop", js.Any.fromFunction0(value))
      
      @scala.inline
      def setTick(value: () => Unit): Self = StObject.set(x, "tick", js.Any.fromFunction0(value))
    }
  }
}
