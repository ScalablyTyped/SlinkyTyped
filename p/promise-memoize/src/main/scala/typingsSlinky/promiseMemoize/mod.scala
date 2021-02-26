package typingsSlinky.promiseMemoize

import typingsSlinky.promiseMemoize.anon.Clear
import typingsSlinky.promiseMemoize.promiseMemoizeStrings.json
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("promise-memoize", JSImport.Namespace)
  @js.native
  def apply[T /* <: js.Function1[/* repeated */ js.Any, js.Thenable[_]] */](fn: T): T with Clear = js.native
  @JSImport("promise-memoize", JSImport.Namespace)
  @js.native
  def apply[T /* <: js.Function1[/* repeated */ js.Any, js.Thenable[_]] */](fn: T, options: Options): T with Clear = js.native
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.promiseMemoize.promiseMemoizeStrings.simple
    - typingsSlinky.promiseMemoize.promiseMemoizeStrings.json
    - js.Function1[/ * args * / js.Array[js.Any], js.Any]
    - js.Array[
  typingsSlinky.promiseMemoize.promiseMemoizeStrings.json | (js.Function1[/ * arg * / js.Any, js.Any])]
  */
  type KeyResolver = _KeyResolver | (js.Function1[/* args */ js.Array[js.Any], js.Any]) | (js.Array[json | (js.Function1[/* arg */ js.Any, js.Any])])
  
  @js.native
  trait Options extends StObject {
    
    var maxAge: js.UndefOr[Double] = js.native
    
    var maxErrorAge: js.UndefOr[Double] = js.native
    
    var resolve: js.UndefOr[KeyResolver] = js.native
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
      def setMaxAge(value: Double): Self = StObject.set(x, "maxAge", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxAgeUndefined: Self = StObject.set(x, "maxAge", js.undefined)
      
      @scala.inline
      def setMaxErrorAge(value: Double): Self = StObject.set(x, "maxErrorAge", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxErrorAgeUndefined: Self = StObject.set(x, "maxErrorAge", js.undefined)
      
      @scala.inline
      def setResolve(value: KeyResolver): Self = StObject.set(x, "resolve", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResolveFunction1(value: /* args */ js.Array[js.Any] => js.Any): Self = StObject.set(x, "resolve", js.Any.fromFunction1(value))
      
      @scala.inline
      def setResolveUndefined: Self = StObject.set(x, "resolve", js.undefined)
      
      @scala.inline
      def setResolveVarargs(value: (json | (js.Function1[/* arg */ js.Any, js.Any]))*): Self = StObject.set(x, "resolve", js.Array(value :_*))
    }
  }
  
  trait _KeyResolver extends StObject
}
