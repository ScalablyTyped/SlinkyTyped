package typingsSlinky.reactToastr

import slinky.core.facade.ReactElement
import typingsSlinky.react.mod.Component
import typingsSlinky.reactToastr.anon.ClassName
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("react-toastr", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  val ToastMessageAnimated: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 116 */ js.Any = js.native
  
  val ToastMessagejQuery: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 116 */ js.Any = js.native
  
  @js.native
  class ToastContainer ()
    extends Component[ClassName, js.Object, js.Any] {
    
    def clear(): Unit = js.native
    
    def error(message: ReactElement, title: ReactElement): Unit = js.native
    def error(message: ReactElement, title: ReactElement, optionsOverride: js.Object): Unit = js.native
    
    def info(message: ReactElement, title: ReactElement): Unit = js.native
    def info(message: ReactElement, title: ReactElement, optionsOverride: js.Object): Unit = js.native
    
    def success(message: ReactElement, title: ReactElement): Unit = js.native
    def success(message: ReactElement, title: ReactElement, optionsOverride: js.Object): Unit = js.native
    
    def warning(message: ReactElement, title: ReactElement): Unit = js.native
    def warning(message: ReactElement, title: ReactElement, optionsOverride: js.Object): Unit = js.native
  }
}
