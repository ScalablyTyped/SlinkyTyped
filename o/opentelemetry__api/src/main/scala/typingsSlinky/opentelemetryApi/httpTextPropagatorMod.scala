package typingsSlinky.opentelemetryApi

import typingsSlinky.opentelemetryApi.getterMod.GetterFunction
import typingsSlinky.opentelemetryApi.setterMod.SetterFunction
import typingsSlinky.opentelemetryContextBase.mod.Context
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object httpTextPropagatorMod {
  
  @js.native
  trait HttpTextPropagator extends StObject {
    
    /**
      * Given a `Context` and a carrier, extract context values from a
      * carrier and return a new context, created from the old context, with the
      * extracted values.
      *
      * @param context the Context from which to extract values to transmit over
      *     the wire.
      * @param carrier the carrier of propagation fields, such as http request
      *     headers.
      * @param getter a function which accepts a carrier and a key, and returns
      *     the value from the carrier identified by the key.
      */
    def extract(context: Context, carrier: js.Any, getter: GetterFunction[_]): Context = js.native
    
    /**
      * Injects values from a given `Context` into a carrier.
      *
      * OpenTelemetry defines a common set of format values (HttpTextPropagator),
      * and each has an expected `carrier` type.
      *
      * @param context the Context from which to extract values to transmit over
      *     the wire.
      * @param carrier the carrier of propagation fields, such as http request
      *     headers.
      * @param setter a function which accepts a carrier, key, and value, which
      *     sets the key on the carrier to the value.
      */
    def inject(context: Context, carrier: js.Any, setter: SetterFunction[_]): Unit = js.native
  }
  object HttpTextPropagator {
    
    @scala.inline
    def apply(
      extract: (Context, js.Any, GetterFunction[_]) => Context,
      inject: (Context, js.Any, SetterFunction[_]) => Unit
    ): HttpTextPropagator = {
      val __obj = js.Dynamic.literal(extract = js.Any.fromFunction3(extract), inject = js.Any.fromFunction3(inject))
      __obj.asInstanceOf[HttpTextPropagator]
    }
    
    @scala.inline
    implicit class HttpTextPropagatorMutableBuilder[Self <: HttpTextPropagator] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setExtract(value: (Context, js.Any, GetterFunction[_]) => Context): Self = StObject.set(x, "extract", js.Any.fromFunction3(value))
      
      @scala.inline
      def setInject(value: (Context, js.Any, SetterFunction[_]) => Unit): Self = StObject.set(x, "inject", js.Any.fromFunction3(value))
    }
  }
}
