package typingsSlinky.atReachDialog

import org.scalajs.dom.raw.HTMLDivElement
import slinky.core.ReactComponentClass
import typingsSlinky.atReachDialog.atReachDialogMod.DialogContentProps
import typingsSlinky.atReachDialog.atReachDialogMod.DialogOverlayProps
import typingsSlinky.atReachDialog.atReachDialogMod.DialogProps
import typingsSlinky.react.reactMod.HTMLProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@reach/dialog", JSImport.Namespace)
@js.native
object atReachDialogMod extends js.Object {
  val Dialog: ReactComponentClass[DialogProps] = js.native
  val DialogContent: ReactComponentClass[DialogContentProps] = js.native
  val DialogOverlay: ReactComponentClass[DialogOverlayProps] = js.native
  type DialogContentProps = Anon_ChildrenReactNode with HTMLProps[HTMLDivElement]
  type DialogOverlayProps = Anon_InitialFocusRef with DialogProps
  type DialogProps = Anon_Children with HTMLProps[HTMLDivElement]
}

