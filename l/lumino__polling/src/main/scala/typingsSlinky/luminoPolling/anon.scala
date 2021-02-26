package typingsSlinky.luminoPolling

import typingsSlinky.luminoPolling.mod.IPoll.State
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Cancel[T, U, V /* <: String */] extends StObject {
    
    def cancel(last: State[T, U, V]): Boolean = js.native
  }
  object Cancel {
    
    @scala.inline
    def apply[T, U, V /* <: String */](cancel: State[T, U, V] => Boolean): Cancel[T, U, V] = {
      val __obj = js.Dynamic.literal(cancel = js.Any.fromFunction1(cancel))
      __obj.asInstanceOf[Cancel[T, U, V]]
    }
    
    @scala.inline
    implicit class CancelMutableBuilder[Self <: Cancel[_, _, _], T, U, V /* <: String */] (val x: Self with (Cancel[T, U, V])) extends AnyVal {
      
      @scala.inline
      def setCancel(value: State[T, U, V] => Boolean): Self = StObject.set(x, "cancel", js.Any.fromFunction1(value))
    }
  }
  
  /* Inlined std.Partial<@lumino/polling.@lumino/polling.IPoll.Frequency> */
  @js.native
  trait PartialFrequency extends StObject {
    
    var backoff: js.UndefOr[Boolean | Double] = js.native
    
    var interval: js.UndefOr[Double] = js.native
    
    var max: js.UndefOr[Double] = js.native
  }
  object PartialFrequency {
    
    @scala.inline
    def apply(): PartialFrequency = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialFrequency]
    }
    
    @scala.inline
    implicit class PartialFrequencyMutableBuilder[Self <: PartialFrequency] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBackoff(value: Boolean | Double): Self = StObject.set(x, "backoff", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBackoffUndefined: Self = StObject.set(x, "backoff", js.undefined)
      
      @scala.inline
      def setInterval(value: Double): Self = StObject.set(x, "interval", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIntervalUndefined: Self = StObject.set(x, "interval", js.undefined)
      
      @scala.inline
      def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
    }
  }
}
