package typingsSlinky.es6Promisify

import org.scalablytyped.runtime.TopLevel
import typingsSlinky.std.PromiseConstructor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("es6-promisify", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  @js.native
  object promisify extends js.Object {
    
    def apply(original: CallbackFunction): PromiseFunction = js.native
    def apply[T, U](original: js.Function2[/* param1 */ U, /* cb */ Callback[T], _]): js.Function1[/* param1 */ U, js.Promise[T]] = js.native
    def apply[T, U, V](original: js.Function3[/* param1 */ U, /* param2 */ V, /* cb */ Callback[T], _]): js.Function2[/* param1 */ U, /* param2 */ V, js.Promise[T]] = js.native
    def apply[T, U, V, W](original: js.Function4[/* param1 */ U, /* param2 */ V, /* param3 */ W, /* cb */ Callback[T], _]): js.Function3[/* param1 */ U, /* param2 */ V, /* param3 */ W, js.Promise[T]] = js.native
    
    /**
      * This symbol can be placed on the function to be promisified to
      * provide names as an array of strings for the values in a success
      * callback.
      */
    val argumentNames: js.Symbol = js.native
    
    @js.native
    class Promise[T] protected ()
      extends typingsSlinky.std.Promise[T] {
      /**
        * Creates a new Promise.
        * @param executor A callback used to initialize the promise. This callback is passed two arguments:
        * a resolve callback used to resolve the promise with a value or the result of another promise,
        * and a reject callback used to reject the promise with a provided reason or error.
        */
      def this(executor: js.Function2[
                /* resolve */ js.Function1[/* value */ T | js.Thenable[T], Unit], 
                /* reject */ js.Function1[/* reason */ js.UndefOr[js.Any], Unit], 
                Unit
              ]) = this()
    }
    /**
      * The user can supply their own Promise implementation by setting it
      * here. Otherwise, the global Promise object will be used.
      */
    @js.native
    object Promise extends TopLevel[PromiseConstructor]
  }
  
  type Callback[T] = js.Function2[/* err */ js.Any, /* arg */ js.UndefOr[T], js.Any]
  
  type CallbackFunction = js.Function1[/* repeated */ js.Any, js.Any]
  
  type PromiseFunction = js.Function1[/* repeated */ js.Any, js.Promise[js.Any]]
}
