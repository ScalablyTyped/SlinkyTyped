package typingsSlinky.atReachAlertDashDialog

import org.scalajs.dom.raw.HTMLDivElement
import slinky.core.ReactComponentClass
import typingsSlinky.atReachDialog.atReachDialogMod.DialogContentProps
import typingsSlinky.atReachDialog.atReachDialogMod.DialogProps
import typingsSlinky.react.reactMod.HTMLProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@reach/alert-dialog", JSImport.Namespace)
@js.native
object atReachAlertDashDialogMod extends js.Object {
  val AlertDialog: ReactComponentClass[AlertDialogProps] = js.native
  val AlertDialogContent: ReactComponentClass[AlertDialogContentProps] = js.native
  val AlertDialogDescription: ReactComponentClass[HTMLProps[HTMLDivElement]] = js.native
  val AlertDialogLabel: ReactComponentClass[HTMLProps[HTMLDivElement]] = js.native
  val AlertDialogOverlay: ReactComponentClass[AlertDialogProps] = js.native
  type AlertDialogContentProps = Anon_ChildrenReactNode with DialogContentProps
  type AlertDialogProps = Anon_Children with DialogProps
}

