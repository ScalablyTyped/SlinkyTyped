package typingsSlinky.gestalt.mod

import slinky.core.TagMod
import typingsSlinky.gestalt.gestaltStrings.alertdialog
import typingsSlinky.gestalt.gestaltStrings.dialog
import typingsSlinky.gestalt.gestaltStrings.lg
import typingsSlinky.gestalt.gestaltStrings.md
import typingsSlinky.gestalt.gestaltStrings.sm
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ModalProps extends js.Object {
  var accessibilityCloseLabel: String
  var accessibilityModalLabel: String
  var children: js.UndefOr[TagMod[Any]] = js.undefined
  var footer: js.UndefOr[TagMod[Any]] = js.undefined
  var heading: String
  var role: js.UndefOr[alertdialog | dialog] = js.undefined
  var size: js.UndefOr[sm | md | lg] = js.undefined
  def onDismiss(): Unit
}

object ModalProps {
  @scala.inline
  def apply(
    accessibilityCloseLabel: String,
    accessibilityModalLabel: String,
    heading: String,
    onDismiss: () => Unit,
    children: TagMod[Any] = null,
    footer: TagMod[Any] = null,
    role: alertdialog | dialog = null,
    size: sm | md | lg = null
  ): ModalProps = {
    val __obj = js.Dynamic.literal(accessibilityCloseLabel = accessibilityCloseLabel.asInstanceOf[js.Any], accessibilityModalLabel = accessibilityModalLabel.asInstanceOf[js.Any], heading = heading.asInstanceOf[js.Any], onDismiss = js.Any.fromFunction0(onDismiss))
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (footer != null) __obj.updateDynamic("footer")(footer.asInstanceOf[js.Any])
    if (role != null) __obj.updateDynamic("role")(role.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModalProps]
  }
}

