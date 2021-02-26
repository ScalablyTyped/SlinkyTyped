package typingsSlinky.materialUiCore

import org.scalablytyped.runtime.Shortcut
import slinky.core.ReactComponentClass
import typingsSlinky.materialUiCore.anon.HandleContainerOverflow
import typingsSlinky.materialUiCore.modalModalMod.ModalProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object modalMod extends Shortcut {
  
  @JSImport("@material-ui/core/Modal", JSImport.Default)
  @js.native
  val default: ReactComponentClass[ModalProps] = js.native
  
  @JSImport("@material-ui/core/Modal", "ModalManager")
  @js.native
  class ModalManager ()
    extends typingsSlinky.materialUiCore.modalManagerMod.default {
    def this(opts: HandleContainerOverflow) = this()
  }
  
  type _To = ReactComponentClass[ModalProps]
  
  /* This means you don't have to write `default`, but can instead just say `modalMod.foo` */
  override def _to: ReactComponentClass[ModalProps] = default
}
