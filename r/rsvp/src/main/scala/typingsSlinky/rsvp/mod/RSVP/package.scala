package typingsSlinky.rsvp.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object RSVP {
  
  // All the Promise methods essentially flatten existing promises, so that
  // you don't end up with `Promise<Promise<Promise<string>>>` if you happen
  // to return another `Promise` from a `.then()` invocation, etc. So all of
  // them can take a type or a promise-like/then-able type.
  type Arg[T] = T | js.Thenable[T]
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.rsvp.mod.RSVP.Resolved[T]
    - typingsSlinky.rsvp.mod.RSVP.Rejected[js.Any]
    - typingsSlinky.rsvp.mod.RSVP.Pending
  */
  type PromiseState[T] = typingsSlinky.rsvp.mod.RSVP._PromiseState[T] | typingsSlinky.rsvp.mod.RSVP.Rejected[js.Any]
}
