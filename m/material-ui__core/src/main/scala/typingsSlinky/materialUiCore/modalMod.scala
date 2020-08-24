package typingsSlinky.materialUiCore

import slinky.core.ReactComponentClass
import typingsSlinky.materialUiCore.anon.HandleContainerOverflow
import typingsSlinky.materialUiCore.modalModalMod.ModalProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@material-ui/core/Modal", JSImport.Namespace)
@js.native
object modalMod extends js.Object {
  @js.native
  class ModalManager ()
    extends typingsSlinky.materialUiCore.modalManagerMod.default {
    def this(opts: HandleContainerOverflow) = this()
  }
  
  val default: ReactComponentClass[ModalProps] = js.native
}

