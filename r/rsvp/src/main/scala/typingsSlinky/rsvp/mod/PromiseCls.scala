package typingsSlinky.rsvp.mod

import typingsSlinky.rsvp.mod.RSVP.Arg
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("rsvp", "Promise")
@js.native
class PromiseCls[T] protected ()
  extends typingsSlinky.rsvp.mod.RSVP.Promise[T] {
  def this(executor: js.Function2[
        /* resolve */ js.Function1[
          /* value */ js.UndefOr[Arg[/* import warning: RewrittenClass.unapply cls was tparam T */ _]], 
          Unit
        ], 
        /* reject */ js.Function1[/* reason */ js.UndefOr[js.Any], Unit], 
        Unit
      ]) = this()
  def this(
    executor: js.Function2[
        /* resolve */ js.Function1[
          /* value */ js.UndefOr[Arg[/* import warning: RewrittenClass.unapply cls was tparam T */ _]], 
          Unit
        ], 
        /* reject */ js.Function1[/* reason */ js.UndefOr[js.Any], Unit], 
        Unit
      ],
    label: String
  ) = this()
}
