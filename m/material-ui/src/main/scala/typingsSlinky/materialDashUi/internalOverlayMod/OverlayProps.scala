package typingsSlinky.materialDashUi.internalOverlayMod

import slinky.core.TagMod
import slinky.web.SyntheticMouseEvent
import typingsSlinky.react.reactMod.CSSProperties
import typingsSlinky.react.reactMod.Key
import typingsSlinky.react.reactMod.LegacyRef
import typingsSlinky.react.reactMod.MouseEventHandler
import typingsSlinky.react.reactMod.Props
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OverlayProps extends Props[Overlay] {
  var autoLockScrolling: js.UndefOr[Boolean] = js.undefined
  var onClick: js.UndefOr[MouseEventHandler[js.Object]] = js.undefined
  var show: Boolean
  var style: js.UndefOr[CSSProperties] = js.undefined
  var transitionEnabled: js.UndefOr[Boolean] = js.undefined
}

object OverlayProps {
  @scala.inline
  def apply(
    show: Boolean,
    autoLockScrolling: js.UndefOr[Boolean] = js.undefined,
    children: TagMod[Any] = null,
    key: Key = null,
    onClick: SyntheticMouseEvent[js.Object] => Unit = null,
    ref: LegacyRef[Overlay] = null,
    style: CSSProperties = null,
    transitionEnabled: js.UndefOr[Boolean] = js.undefined
  ): OverlayProps = {
    val __obj = js.Dynamic.literal(show = show.asInstanceOf[js.Any])
    if (!js.isUndefined(autoLockScrolling)) __obj.updateDynamic("autoLockScrolling")(autoLockScrolling.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (onClick != null) __obj.updateDynamic("onClick")(js.Any.fromFunction1(onClick))
    if (ref != null) __obj.updateDynamic("ref")(ref.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (!js.isUndefined(transitionEnabled)) __obj.updateDynamic("transitionEnabled")(transitionEnabled.asInstanceOf[js.Any])
    __obj.asInstanceOf[OverlayProps]
  }
}

