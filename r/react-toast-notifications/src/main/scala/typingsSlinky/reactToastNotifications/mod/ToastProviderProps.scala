package typingsSlinky.reactToastNotifications.mod

import slinky.core.TagMod
import typingsSlinky.reactToastNotifications.AnonToast
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ToastProviderProps extends js.Object {
  var autoDismiss: js.UndefOr[Boolean | Double] = js.undefined
  var autoDismissTimeout: js.UndefOr[Double] = js.undefined
  var children: TagMod[Any]
  var components: js.UndefOr[AnonToast] = js.undefined
  var placement: js.UndefOr[Placement] = js.undefined
  var transitionDuration: js.UndefOr[Double] = js.undefined
}

object ToastProviderProps {
  @scala.inline
  def apply(
    children: TagMod[Any],
    autoDismiss: Boolean | Double = null,
    autoDismissTimeout: Int | Double = null,
    components: AnonToast = null,
    placement: Placement = null,
    transitionDuration: Int | Double = null
  ): ToastProviderProps = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
    if (autoDismiss != null) __obj.updateDynamic("autoDismiss")(autoDismiss.asInstanceOf[js.Any])
    if (autoDismissTimeout != null) __obj.updateDynamic("autoDismissTimeout")(autoDismissTimeout.asInstanceOf[js.Any])
    if (components != null) __obj.updateDynamic("components")(components.asInstanceOf[js.Any])
    if (placement != null) __obj.updateDynamic("placement")(placement.asInstanceOf[js.Any])
    if (transitionDuration != null) __obj.updateDynamic("transitionDuration")(transitionDuration.asInstanceOf[js.Any])
    __obj.asInstanceOf[ToastProviderProps]
  }
}

