package typingsSlinky.rrule

import typingsSlinky.rrule.distEsmSrcCallbackiterresultMod.CallbackIterResult
import typingsSlinky.rrule.distEsmSrcCallbackiterresultMod.Iterator
import typingsSlinky.rrule.distEsmSrcIterresultMod.IterArgs
import typingsSlinky.rrule.rruleStrings.all
import typingsSlinky.rrule.rruleStrings.between
import typingsSlinky.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rrule/dist/esm/src/callbackiterresult", JSImport.Namespace)
@js.native
object distEsmSrcCallbackiterresultMod extends js.Object {
  @js.native
  trait CallbackIterResult
    extends typingsSlinky.rrule.distEsmSrcIterresultMod.default[all | between] {
    var iterator: js.Any = js.native
  }
  
  @js.native
  class default protected () extends CallbackIterResult {
    def this(method: all, args: Partial[IterArgs], iterator: Iterator) = this()
    def this(method: between, args: Partial[IterArgs], iterator: Iterator) = this()
  }
  
  type Iterator = js.Function2[/* d */ js.Date, /* len */ Double, Boolean]
}

