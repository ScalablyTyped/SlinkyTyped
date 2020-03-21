package typingsSlinky.reactToastr

import slinky.core.TagMod
import typingsSlinky.react.mod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-toastr", JSImport.Namespace)
@js.native
object mod extends js.Object {
  @js.native
  class ToastContainer ()
    extends Component[AnonClassName, js.Object, js.Any] {
    def clear(): Unit = js.native
    def error(message: TagMod[Any], title: TagMod[Any]): Unit = js.native
    def error(message: TagMod[Any], title: TagMod[Any], optionsOverride: js.Object): Unit = js.native
    def info(message: TagMod[Any], title: TagMod[Any]): Unit = js.native
    def info(message: TagMod[Any], title: TagMod[Any], optionsOverride: js.Object): Unit = js.native
    def success(message: TagMod[Any], title: TagMod[Any]): Unit = js.native
    def success(message: TagMod[Any], title: TagMod[Any], optionsOverride: js.Object): Unit = js.native
    def warning(message: TagMod[Any], title: TagMod[Any]): Unit = js.native
    def warning(message: TagMod[Any], title: TagMod[Any], optionsOverride: js.Object): Unit = js.native
  }
  
  val ToastMessageAnimated: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 115 */ js.Any = js.native
  val ToastMessagejQuery: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 115 */ js.Any = js.native
}

