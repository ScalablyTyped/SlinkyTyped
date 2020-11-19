package typingsSlinky.netflixNerror

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable3
import typingsSlinky.netflixNerror.mod.VError
import typingsSlinky.netflixNerror.mod.VError.Info
import typingsSlinky.netflixNerror.mod.VError.MultiError
import typingsSlinky.netflixNerror.mod.VError.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobalScope
@js.native
object anon extends js.Object {
  
  @js.native
  trait Instantiable
    extends Instantiable3[
          (/* options */ js.Error) | (/* options */ Options), 
          /* message */ String, 
          /* params (repeated) */ js.Any, 
          VError
        ] {
    
    /*
      * Represents a collection of errors for the purpose of consumers that generally
      * only deal with one error.  Callers can extract the individual errors
      * contained in this object, but may also just treat it as a normal single
      * error, in which case a summary message will be printed.
      */
    var MultiError: Instantiable1[/* errors */ js.Array[js.Error], typingsSlinky.netflixNerror.mod.VError.MultiError] = js.native
    
    /*
      * PError is like VError, but the message is not run through printf-style
      * templating.
      */
    var PError: Instantiable0[typingsSlinky.netflixNerror.mod.VError.PError] = js.native
    
    /*
      * SError is like VError, but stricter about types.  You cannot pass "null" or
      * "undefined" as string arguments to the formatter.  Since SError is only a
      * different function, not really a different class, we don't set
      * SError.prototype.name.
      */
    var SError: Instantiable0[typingsSlinky.netflixNerror.mod.VError.SError] = js.native
    
    /*
      * Like JavaScript's built-in Error class, but supports a "cause" argument which
      * is wrapped, not "folded in" as with VError.	Accepts a printf-style message.
      * The cause argument can be null.
      */
    var WError: Instantiable0[typingsSlinky.netflixNerror.mod.VError.WError] = js.native
    
    def cause(err: js.Error): js.Error | Null = js.native
    
    def errorForEach(err: js.Error, func: js.Function1[/* err */ js.Error, Unit]): Unit = js.native
    
    def errorFromList[T /* <: js.Error */](errors: js.Array[T]): Null | T | MultiError = js.native
    
    def findCauseByName(err: js.Error, name: String): js.Error | Null = js.native
    
    def fullStack(err: js.Error): String = js.native
    
    def hasCauseWithName(err: js.Error, name: String): Boolean = js.native
    
    def info(err: js.Error): Info = js.native
  }
}
