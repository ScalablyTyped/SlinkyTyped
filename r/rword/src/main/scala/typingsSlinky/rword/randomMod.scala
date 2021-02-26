package typingsSlinky.rword

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object randomMod {
  
  @JSImport("rword/dist/lib/random", "Random")
  @js.native
  class Random () extends StObject
  /* static members */
  object Random {
    
    @JSImport("rword/dist/lib/random", "Random")
    @js.native
    val ^ : js.Any = js.native
    
    /** Transform an integer to a floating point number. */
    @JSImport("rword/dist/lib/random", "Random.intToFloat")
    @js.native
    def intToFloat: js.Any = js.native
    @scala.inline
    def intToFloat_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("intToFloat")(x.asInstanceOf[js.Any])
    
    /**
      * Generate a random number between `min` (inclusive) and `max` (exclusive).
      */
    @JSImport("rword/dist/lib/random", "Random.range")
    @js.native
    def range(min: Double, max: Double): Double = js.native
    
    /**
      * Generate a random number between `0` (inclusive) and `1` (exclusive). A
      *  drop in replacement for `Math.random()`
      */
    @JSImport("rword/dist/lib/random", "Random.value")
    @js.native
    def value(): Double = js.native
  }
}
