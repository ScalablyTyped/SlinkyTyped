package typingsSlinky.officeDashUiDashFabricDashReact

import slinky.core.ReactComponentClass
import typingsSlinky.officeDashUiDashFabricDashReact.libComponentsModalModalDotTypesMod.IModalProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("office-ui-fabric-react/lib/Modal", JSImport.Namespace)
@js.native
object libModalMod extends js.Object {
  @js.native
  class ModalBase protected ()
    extends typingsSlinky.officeDashUiDashFabricDashReact.libComponentsModalMod.ModalBase {
    def this(props: IModalProps) = this()
  }
  
  val Modal: ReactComponentClass[IModalProps] = js.native
  val default: ReactComponentClass[IModalProps] = js.native
  /* static members */
  @js.native
  object ModalBase extends js.Object {
    var defaultProps: IModalProps = js.native
  }
  
}

