package typingsSlinky.angularCore

import typingsSlinky.angularCore.queryDefinitionMod.NgQueryDefinition
import typingsSlinky.angularCore.queryDefinitionMod.QueryTiming
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object timingStrategyMod {
  
  @js.native
  trait TimingResult extends StObject {
    
    var message: js.UndefOr[String] = js.native
    
    var timing: QueryTiming | Null = js.native
  }
  object TimingResult {
    
    @scala.inline
    def apply(): TimingResult = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TimingResult]
    }
    
    @scala.inline
    implicit class TimingResultMutableBuilder[Self <: TimingResult] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
      
      @scala.inline
      def setTiming(value: QueryTiming): Self = StObject.set(x, "timing", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimingNull: Self = StObject.set(x, "timing", null)
    }
  }
  
  @js.native
  trait TimingStrategy extends StObject {
    
    /** Detects the timing result for a given query. */
    def detectTiming(query: NgQueryDefinition): TimingResult = js.native
    
    /** Sets up the given strategy. Throws if the strategy could not be set up. */
    def setup(): Unit = js.native
  }
  object TimingStrategy {
    
    @scala.inline
    def apply(detectTiming: NgQueryDefinition => TimingResult, setup: () => Unit): TimingStrategy = {
      val __obj = js.Dynamic.literal(detectTiming = js.Any.fromFunction1(detectTiming), setup = js.Any.fromFunction0(setup))
      __obj.asInstanceOf[TimingStrategy]
    }
    
    @scala.inline
    implicit class TimingStrategyMutableBuilder[Self <: TimingStrategy] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDetectTiming(value: NgQueryDefinition => TimingResult): Self = StObject.set(x, "detectTiming", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSetup(value: () => Unit): Self = StObject.set(x, "setup", js.Any.fromFunction0(value))
    }
  }
}
