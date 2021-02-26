package typingsSlinky.onoff

import typingsSlinky.onoff.onoffNumbers.`0`
import typingsSlinky.onoff.onoffNumbers.`1`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("onoff", "Gpio")
  @js.native
  class Gpio protected () extends StObject {
    def this(gpio: Double, direction: Direction) = this()
    def this(gpio: Double, direction: Direction, edge: Edge) = this()
    def this(gpio: Double, direction: Direction, edge: js.UndefOr[scala.Nothing], options: Options) = this()
    def this(gpio: Double, direction: Direction, edge: Edge, options: Options) = this()
    
    def activeLow(): Boolean = js.native
    
    def direction(): Direction = js.native
    
    def edge(): Edge = js.native
    
    def read(): js.Promise[BinaryValue] = js.native
    def read(callback: ValueCallback): Unit = js.native
    
    def readSync(): BinaryValue = js.native
    
    def setActiveLow(invert: Boolean): Unit = js.native
    
    def setDirection(direction: Direction): Unit = js.native
    
    def setEdge(edge: Edge): Unit = js.native
    
    def unexport(): Unit = js.native
    
    def unwatch(): Unit = js.native
    def unwatch(callback: ValueCallback): Unit = js.native
    
    def unwatchAll(): Unit = js.native
    
    def watch(callback: ValueCallback): Unit = js.native
    
    def write(value: BinaryValue): js.Promise[Unit] = js.native
    def write(value: BinaryValue, callback: js.Function1[/* err */ js.UndefOr[js.Error | Null], Unit]): Unit = js.native
    
    def writeSync(value: BinaryValue): Unit = js.native
  }
  /* static members */
  object Gpio {
    
    @JSImport("onoff", "Gpio")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("onoff", "Gpio.HIGH")
    @js.native
    def HIGH: High = js.native
    @scala.inline
    def HIGH_=(x: High): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("HIGH")(x.asInstanceOf[js.Any])
    
    @JSImport("onoff", "Gpio.LOW")
    @js.native
    def LOW: Low = js.native
    @scala.inline
    def LOW_=(x: Low): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("LOW")(x.asInstanceOf[js.Any])
    
    @JSImport("onoff", "Gpio.accessible")
    @js.native
    def accessible: Boolean = js.native
    @scala.inline
    def accessible_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("accessible")(x.asInstanceOf[js.Any])
  }
  
  type BinaryValue = High | Low
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.onoff.onoffStrings.in
    - typingsSlinky.onoff.onoffStrings.out
    - typingsSlinky.onoff.onoffStrings.high
    - typingsSlinky.onoff.onoffStrings.low
  */
  trait Direction extends StObject
  object Direction {
    
    @scala.inline
    def high: typingsSlinky.onoff.onoffStrings.high = "high".asInstanceOf[typingsSlinky.onoff.onoffStrings.high]
    
    @scala.inline
    def in: typingsSlinky.onoff.onoffStrings.in = "in".asInstanceOf[typingsSlinky.onoff.onoffStrings.in]
    
    @scala.inline
    def low: typingsSlinky.onoff.onoffStrings.low = "low".asInstanceOf[typingsSlinky.onoff.onoffStrings.low]
    
    @scala.inline
    def out: typingsSlinky.onoff.onoffStrings.out = "out".asInstanceOf[typingsSlinky.onoff.onoffStrings.out]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.onoff.onoffStrings.none
    - typingsSlinky.onoff.onoffStrings.rising
    - typingsSlinky.onoff.onoffStrings.falling
    - typingsSlinky.onoff.onoffStrings.both
  */
  trait Edge extends StObject
  object Edge {
    
    @scala.inline
    def both: typingsSlinky.onoff.onoffStrings.both = "both".asInstanceOf[typingsSlinky.onoff.onoffStrings.both]
    
    @scala.inline
    def falling: typingsSlinky.onoff.onoffStrings.falling = "falling".asInstanceOf[typingsSlinky.onoff.onoffStrings.falling]
    
    @scala.inline
    def none: typingsSlinky.onoff.onoffStrings.none = "none".asInstanceOf[typingsSlinky.onoff.onoffStrings.none]
    
    @scala.inline
    def rising: typingsSlinky.onoff.onoffStrings.rising = "rising".asInstanceOf[typingsSlinky.onoff.onoffStrings.rising]
  }
  
  type High = `1`
  
  type Low = `0`
  
  @js.native
  trait Options extends StObject {
    
    var activeLow: js.UndefOr[Boolean] = js.native
    
    var debounceTimeout: js.UndefOr[Double] = js.native
    
    var reconfigureDirection: js.UndefOr[Boolean] = js.native
  }
  object Options {
    
    @scala.inline
    def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setActiveLow(value: Boolean): Self = StObject.set(x, "activeLow", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setActiveLowUndefined: Self = StObject.set(x, "activeLow", js.undefined)
      
      @scala.inline
      def setDebounceTimeout(value: Double): Self = StObject.set(x, "debounceTimeout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDebounceTimeoutUndefined: Self = StObject.set(x, "debounceTimeout", js.undefined)
      
      @scala.inline
      def setReconfigureDirection(value: Boolean): Self = StObject.set(x, "reconfigureDirection", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReconfigureDirectionUndefined: Self = StObject.set(x, "reconfigureDirection", js.undefined)
    }
  }
  
  type ValueCallback = js.Function2[/* err */ js.UndefOr[js.Error | Null], /* value */ BinaryValue, Unit]
}
