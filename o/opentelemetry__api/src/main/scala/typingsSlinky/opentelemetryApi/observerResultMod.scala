package typingsSlinky.opentelemetryApi

import typingsSlinky.opentelemetryApi.metricMod.Labels
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object observerResultMod {
  
  @js.native
  trait ObserverResult extends StObject {
    
    def observe(value: Double, labels: Labels): Unit = js.native
  }
  object ObserverResult {
    
    @scala.inline
    def apply(observe: (Double, Labels) => Unit): ObserverResult = {
      val __obj = js.Dynamic.literal(observe = js.Any.fromFunction2(observe))
      __obj.asInstanceOf[ObserverResult]
    }
    
    @scala.inline
    implicit class ObserverResultMutableBuilder[Self <: ObserverResult] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setObserve(value: (Double, Labels) => Unit): Self = StObject.set(x, "observe", js.Any.fromFunction2(value))
    }
  }
}
