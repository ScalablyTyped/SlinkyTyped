package typingsSlinky.bluebirdGlobal.mod.global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Promise")
@js.native
class PromiseCls[T] protected () extends Promise[T] {
  def this(callback: js.Function3[
        /* resolve */ js.Function1[/* thenableOrResult */ js.UndefOr[T | js.Thenable[T]], Unit], 
        /* reject */ js.Function1[/* error */ js.UndefOr[js.Any], Unit], 
        /* onCancel */ js.UndefOr[js.Function1[/* callback */ js.Function0[Unit], Unit]], 
        Unit
      ]) = this()
}
