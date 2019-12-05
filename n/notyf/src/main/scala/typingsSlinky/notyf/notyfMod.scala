package typingsSlinky.notyf

import typingsSlinky.notyf.notyfDotOptionsMod.DeepPartial
import typingsSlinky.notyf.notyfDotOptionsMod.INotyfNotificationOptions
import typingsSlinky.notyf.notyfDotOptionsMod.INotyfOptions
import typingsSlinky.notyf.notyfNotyfMod.default
import typingsSlinky.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("notyf", JSImport.Namespace)
@js.native
object notyfMod extends js.Object {
  @js.native
  class Notyf () extends default {
    def this(opts: Partial[INotyfOptions]) = this()
  }
  
  @js.native
  class NotyfArray[T] ()
    extends typingsSlinky.notyf.notyfDotModelsMod.NotyfArray[T]
  
  @js.native
  class NotyfNotification protected ()
    extends typingsSlinky.notyf.notyfDotModelsMod.NotyfNotification {
    def this(options: DeepPartial[INotyfNotificationOptions]) = this()
  }
  
  @js.native
  class NotyfView ()
    extends typingsSlinky.notyf.notyfDotViewMod.NotyfView
  
  val DEFAULT_OPTIONS: INotyfOptions = js.native
  @js.native
  object NotyfArrayEvent extends js.Object {
    /* 0 */ val Add: typingsSlinky.notyf.notyfDotModelsMod.NotyfArrayEvent.Add with Double = js.native
    /* 1 */ val Remove: typingsSlinky.notyf.notyfDotModelsMod.NotyfArrayEvent.Remove with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.notyf.notyfDotModelsMod.NotyfArrayEvent with Double] = js.native
  }
  
}

