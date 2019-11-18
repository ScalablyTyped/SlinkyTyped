package typingsSlinky.atMaterialDashUiCore

import slinky.core.ReactComponentClass
import typingsSlinky.atMaterialDashUiCore.modalModalMod.ModalProps
import typingsSlinky.react.reactMod.Component
import typingsSlinky.react.reactMod.ComponentState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@material-ui/core/Modal", JSImport.Namespace)
@js.native
object modalMod extends js.Object {
  @js.native
  class ModalManager ()
    extends typingsSlinky.atMaterialDashUiCore.modalModalManagerMod.default {
    def this(opts: Anon_HandleContainerOverflow) = this()
  }
  
  @js.native
  class default protected ()
    extends Component[ModalProps, ComponentState, js.Any] {
    def this(props: ModalProps) = this()
    def this(props: ModalProps, context: js.Any) = this()
  }
  
  val default: ReactComponentClass[ModalProps] = js.native
}

