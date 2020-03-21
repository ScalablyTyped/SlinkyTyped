package typingsSlinky.officeUiFabricReact

import slinky.core.ReactComponentClass
import typingsSlinky.officeUiFabricReact.modalTypesMod.IModalProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("office-ui-fabric-react/lib/components/Modal", JSImport.Namespace)
@js.native
object modalMod extends js.Object {
  @js.native
  class ModalBase protected ()
    extends typingsSlinky.officeUiFabricReact.modalBaseMod.ModalBase {
    def this(props: IModalProps) = this()
  }
  
  val Modal: ReactComponentClass[IModalProps] = js.native
  /* static members */
  @js.native
  object ModalBase extends js.Object {
    var defaultProps: IModalProps = js.native
  }
  
}

