package typingsSlinky.rrule

import typingsSlinky.rrule.rruleStrings.all
import typingsSlinky.rrule.rruleStrings.between
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rrule/dist/esm/src/callbackiterresult", JSImport.Namespace)
@js.native
object callbackiterresultMod extends js.Object {
  @js.native
  trait CallbackIterResult
    extends typingsSlinky.rrule.iterresultMod.default[all | between] {
    var iterator: js.Any = js.native
  }
  
  @js.native
  class default protected () extends CallbackIterResult {
    def this(method: all, args: PartialIterArgs, iterator: Iterator) = this()
    def this(method: between, args: PartialIterArgs, iterator: Iterator) = this()
  }
  
  type Iterator = js.Function2[/* d */ js.Date, /* len */ Double, Boolean]
}

