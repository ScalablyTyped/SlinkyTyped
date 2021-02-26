package typingsSlinky.opentelemetryCore

import typingsSlinky.opentelemetryApi.loggerMod.Logger
import typingsSlinky.opentelemetryApi.textMapPropagatorMod.TextMapPropagator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object propagationTypesMod {
  
  @js.native
  trait CompositePropagatorConfig extends StObject {
    
    /** Instance of logger */
    var logger: js.UndefOr[Logger] = js.native
    
    /**
      * List of propagators to run. Propagators run in the
      * list order. If a propagator later in the list writes the same context
      * key as a propagator earlier in the list, the later on will "win".
      */
    var propagators: js.UndefOr[js.Array[TextMapPropagator]] = js.native
  }
  object CompositePropagatorConfig {
    
    @scala.inline
    def apply(): CompositePropagatorConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CompositePropagatorConfig]
    }
    
    @scala.inline
    implicit class CompositePropagatorConfigMutableBuilder[Self <: CompositePropagatorConfig] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLogger(value: Logger): Self = StObject.set(x, "logger", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLoggerUndefined: Self = StObject.set(x, "logger", js.undefined)
      
      @scala.inline
      def setPropagators(value: js.Array[TextMapPropagator]): Self = StObject.set(x, "propagators", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPropagatorsUndefined: Self = StObject.set(x, "propagators", js.undefined)
      
      @scala.inline
      def setPropagatorsVarargs(value: TextMapPropagator*): Self = StObject.set(x, "propagators", js.Array(value :_*))
    }
  }
}
