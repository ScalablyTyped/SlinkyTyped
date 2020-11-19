package typingsSlinky.rxjs

import typingsSlinky.std.PromiseConstructorLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("rxjs/internal/config", JSImport.Namespace)
@js.native
object configMod extends js.Object {
  
  @js.native
  object config extends js.Object {
    
    /**
      * The promise constructor used by default for methods such as
      * {@link toPromise} and {@link forEach}
      */
    var Promise: PromiseConstructorLike = js.native
    
    /**
      * If true, turns on synchronous error rethrowing, which is a deprecated behavior
      * in v6 and higher. This behavior enables bad patterns like wrapping a subscribe
      * call in a try/catch block. It also enables producer interference, a nasty bug
      * where a multicast can be broken for all observers by a downstream consumer with
      * an unhandled error. DO NOT USE THIS FLAG UNLESS IT'S NEEDED TO BY TIME
      * FOR MIGRATION REASONS.
      */
    var useDeprecatedSynchronousErrorHandling: Boolean = js.native
  }
}
