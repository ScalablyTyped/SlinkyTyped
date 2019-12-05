package typingsSlinky.rcDashResizeDashObserver.libMod

import slinky.core.TagMod
import typingsSlinky.rcDashResizeDashObserver.Anon_Height
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResizeObserverProps extends js.Object {
  var children: TagMod[Any]
  var disabled: js.UndefOr[Boolean] = js.undefined
  /** Trigger if element resized. Will always trigger when first time render. */
  var onResize: js.UndefOr[js.Function1[/* size */ Anon_Height, Unit]] = js.undefined
}

object ResizeObserverProps {
  @scala.inline
  def apply(
    children: TagMod[Any],
    disabled: js.UndefOr[Boolean] = js.undefined,
    onResize: /* size */ Anon_Height => Unit = null
  ): ResizeObserverProps = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (onResize != null) __obj.updateDynamic("onResize")(js.Any.fromFunction1(onResize))
    __obj.asInstanceOf[ResizeObserverProps]
  }
}

