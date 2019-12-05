package typingsSlinky.atReachAlertDashDialog

import org.scalajs.dom.raw.HTMLElement
import slinky.core.TagMod
import slinky.core.facade.ReactRef
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Children extends js.Object {
  var children: TagMod[Any]
  var isOpen: js.UndefOr[Boolean] = js.undefined
  var leastDestructiveRef: ReactRef[HTMLElement]
  var onDismiss: js.UndefOr[js.Function0[Unit]] = js.undefined
}

object Anon_Children {
  @scala.inline
  def apply(
    children: TagMod[Any],
    leastDestructiveRef: ReactRef[HTMLElement],
    isOpen: js.UndefOr[Boolean] = js.undefined,
    onDismiss: () => Unit = null
  ): Anon_Children = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], leastDestructiveRef = leastDestructiveRef.asInstanceOf[js.Any])
    if (!js.isUndefined(isOpen)) __obj.updateDynamic("isOpen")(isOpen.asInstanceOf[js.Any])
    if (onDismiss != null) __obj.updateDynamic("onDismiss")(js.Any.fromFunction0(onDismiss))
    __obj.asInstanceOf[Anon_Children]
  }
}

