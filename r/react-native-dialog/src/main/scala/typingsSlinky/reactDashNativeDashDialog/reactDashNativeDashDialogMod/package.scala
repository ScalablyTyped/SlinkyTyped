package typingsSlinky.reactDashNativeDashDialog

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object reactDashNativeDashDialogMod {
  import typingsSlinky.reactDashNativeDashDialog.reactDashNativeDashDialogStrings.isVisible
  import typingsSlinky.reactDashNativeDashModal.distModalMod.ModalProps
  import typingsSlinky.std.Exclude
  import typingsSlinky.std.Partial
  import typingsSlinky.std.Pick

  type reactNativeModalContainerProps = Partial[Pick[ModalProps, Exclude[String, isVisible]]]
}
